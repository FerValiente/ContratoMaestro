package PR2.ContratoMaestro.servicio;

import PR2.ContratoMaestro.modelo.Inscripcion;
import PR2.ContratoMaestro.repositorio.InscripcionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscripcionServicio {

    @Autowired
    private InscripcionRepositorio inscripcionRepositorio;

    public Inscripcion crearInscripcion(Inscripcion inscripcion) {
        return inscripcionRepositorio.save(inscripcion);
    }

    public Optional<Inscripcion> obtenerInscripcionPorId(Long id) {
        return inscripcionRepositorio.findById(id);
    }

    public List<Inscripcion> obtenerTodasLasInscripciones() {
        return inscripcionRepositorio.findAll();
    }

    public Inscripcion actualizarInscripcion(Inscripcion inscripcion) {
        return inscripcionRepositorio.save(inscripcion);
    }

    public void eliminarInscripcion(Long id) {
        inscripcionRepositorio.deleteById(id);
    }

    public void marcarPagada(Long id) {
        Optional<Inscripcion> inscripcion = inscripcionRepositorio.findById(id);
        if (inscripcion.isPresent()) {
            Inscripcion i = inscripcion.get();
            i.setEstado("Pagado");
            inscripcionRepositorio.save(i);
        }
    }

    public void marcarInscrita(Long id) {
        Optional<Inscripcion> inscripcion = inscripcionRepositorio.findById(id);
        if (inscripcion.isPresent()) {
            Inscripcion i = inscripcion.get();
            i.setEstado("Inscripto");
            inscripcionRepositorio.save(i);
        }
    }
}

