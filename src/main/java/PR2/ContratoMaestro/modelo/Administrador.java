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
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idAdmin;

    String usuario;
    String pass;
}