package stefan.tflc.misystems.zadatak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stefan.tflc.misystems.zadatak.entity.Rent;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long>{

}