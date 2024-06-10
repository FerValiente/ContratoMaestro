package PR2.ContratoMaestro.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Aranceles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idArancel;

    String nivel;
    String ciclo;
    String especializacion;
    String grado_curso;
    String turno;
    Integer matricula;
    Integer cuota;

    public void setId(Long id) {
    }
}