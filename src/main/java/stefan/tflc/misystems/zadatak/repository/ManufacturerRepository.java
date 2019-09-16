package stefan.tflc.misystems.zadatak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stefan.tflc.misystems.zadatak.entity.Manufacturer;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{

}