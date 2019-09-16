package stefan.tflc.misystems.zadatak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stefan.tflc.misystems.zadatak.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>{

}