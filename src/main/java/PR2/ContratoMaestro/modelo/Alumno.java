package PR2.ContratoMaestro.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alumno {
    @Id
    Integer idAlumno;

    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    String direccion;
    String ciudad;
    String telefono;
    String email;

    @OneToMany(mappedBy = "alumno")
    List<Matricula> matriculas;

    @OneToMany(mappedBy = "alumno")
    List<Inscripcion> inscripciones;
}
