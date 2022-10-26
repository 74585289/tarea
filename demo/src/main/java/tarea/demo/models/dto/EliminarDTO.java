package tarea.demo.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tarea.demo.models.responses.EmployeeResponse;

import java.io.Serializable;
import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class EliminarDTO implements Serializable {
    private static final long serialVersionUID = 8799656478674716638L;
    private List<EmployeeResponse> employeeResponse;
}
