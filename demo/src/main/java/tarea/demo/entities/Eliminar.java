package tarea.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "clientes_libres.fichero", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Eliminar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "fecha_importacion", nullable = false, length = 255)
    private String fecha_importacion;
    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;
    @Column(name = "cant_lect", nullable = false, length = 255)
    private String cant_lect;
    @Column(name = "pfactura", nullable = false, length = 255)
    private String pfactura;
    @Column(name = "estado", nullable = false, length = 255)
    private String estado;
    @Column(name = "empresa", nullable = false, length = 255)
    private String empresa;
    @Column(name = "usuario_id", nullable = false, length = 255)
    private String usuario_id;
    @Column(name = "idsuministro", nullable = false, length = 255)
    private String idsuministro;
}
