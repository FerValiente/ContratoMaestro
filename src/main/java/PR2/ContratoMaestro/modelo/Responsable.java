package PR2.ContratoMaestro.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Responsable {
    @Id
    Integer idResponsable;

    String nombre;
    String apellido;
    String tipo;
    String direccion;
    String telefono;

    @OneToMany(mappedBy = "responsable")
    List<Matricula> matriculas;

    @OneToMany(mappedBy = "responsable")
    List<Inscripcion> inscripciones;

    public void setId(Long id) {
    }
}
