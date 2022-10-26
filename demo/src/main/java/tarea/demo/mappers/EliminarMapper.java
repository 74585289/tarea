package tarea.demo.mappers;

import tarea.demo.models.projections.EliminarProjections;
import tarea.demo.models.responses.EmployeeResponse;

public class EliminarMapper {

    public static EmployeeResponse getEmployeeResponse(EliminarProjections eliminarProjections) {
        return EmployeeResponse
                .builder()
                .Id(eliminarProjections.getUsuario_id())
                .Nombre(eliminarProjections.getNombre())
                .build();
    }




}
