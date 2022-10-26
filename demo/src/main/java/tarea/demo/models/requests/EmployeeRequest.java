package tarea.demo.models.requests;

import lombok.Data;

@Data
public class EmployeeRequest {
    private int Id;
    private String Nombre;
    private int Cant_lect;
    private int Pfactura;
    private int Estado;
    private int Empresa;
    private int Usuario_id;
    private int Idsuministro;
}
