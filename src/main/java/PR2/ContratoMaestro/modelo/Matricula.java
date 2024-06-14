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
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idMatricula;

    @ManyToOne
    Alumno alumno;

    @ManyToOne
    Responsable responsable;

    LocalDate fecha;
    Double monto;
    Double descuento;

    public void setId(Long id) {
    }
}
