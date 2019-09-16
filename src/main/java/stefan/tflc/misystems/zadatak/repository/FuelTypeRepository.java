package stefan.tflc.misystems.zadatak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stefan.tflc.misystems.zadatak.entity.FuelType;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelType, Long>{

}