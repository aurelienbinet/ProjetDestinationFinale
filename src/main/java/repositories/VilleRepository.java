package repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Aeroport;
import model.Ville;

public interface VilleRepository extends JpaRepository<Ville, Long> {
	@Query("select v from Ville v left join fetch v.AeroportVille av left join fetch av.key.aeroport where v.id=id_ville")
	Optional<Ville> findAeroportByIdWithVille(@Param("id_ville") Long id); //custom quand tu cherches un de tes propres objets
}
