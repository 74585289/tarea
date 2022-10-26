package tarea.demo.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class EmployeeResponse {
    private int Id;
    private String Nombre;
    private int Cant_lect;
    private int Pfactura;
    private int Estado;
    private int Empresa;
    private int Usuario_id;
    private int Idsuministro;
}
