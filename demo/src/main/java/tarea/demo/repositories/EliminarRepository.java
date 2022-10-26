package tarea.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tarea.demo.models.projections.EliminarProjections;

import java.util.List;

public interface EliminarRepository extends JpaRepository<Eliminar, Long> {

    @Query(value = "SELECT * FROM Eliminar where idfichero = ?1", nativeQuery = true)
    List<EliminarProjections> deleteById(int Id);


}
