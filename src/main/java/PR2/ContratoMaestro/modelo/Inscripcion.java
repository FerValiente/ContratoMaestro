package PR2.ContratoMaestro.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idInscripcion;

    @ManyToOne
    Alumno alumno;

    @ManyToOne
    Responsable responsable;

    String numeroCuenta;
    String estado;
    LocalDate fechaPago;
    LocalDate fechaInscripcion;

    public void setId(Long id) {
    }
}
