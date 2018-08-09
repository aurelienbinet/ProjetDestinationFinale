package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Reservation;

public interface ReservationRepositories extends JpaRepository<Reservation, Integer> {

}
