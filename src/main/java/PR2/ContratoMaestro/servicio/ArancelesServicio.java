package PR2.ContratoMaestro.servicio;

import PR2.ContratoMaestro.modelo.Aranceles;
import PR2.ContratoMaestro.repositorio.ArancelesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArancelesServicio {

    @Autowired
    private ArancelesRepositorio arancelesRepositorio;

    public Aranceles crearArancel(Aranceles aranceles) {
        return arancelesRepositorio.save(aranceles);
    }

    public Optional<Aranceles> obtenerArancelPorId(Long id) {
        return arancelesRepositorio.findById(id);
    }

    public List<Aranceles> obtenerTodosLosAranceles() {
        return arancelesRepositorio.findAll();
    }

    public Aranceles actualizarArancel(Aranceles aranceles) {
        return arancelesRepositorio.save(aranceles);
    }

    public void eliminarArancel(Long id) {
        arancelesRepositorio.deleteById(id);
    }
}
