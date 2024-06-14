package PR2.ContratoMaestro.servicio;

import PR2.ContratoMaestro.modelo.Responsable;
import PR2.ContratoMaestro.repositorio.ResponsableRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsableServicio {

    @Autowired
    private ResponsableRepositorio responsableRepositorio;

    public Responsable crearResponsable(Responsable responsable) {
        return responsableRepositorio.save(responsable);
    }

    public Optional<Responsable> obtenerResponsablePorId(Long id) {
        return responsableRepositorio.findById(id);
    }

    public List<Responsable> obtenerTodosLosResponsables() {
        return responsableRepositorio.findAll();
    }

    public Responsable actualizarResponsable(Responsable responsable) {
        return responsableRepositorio.save(responsable);
    }

    public void eliminarResponsable(Long id) {
        responsableRepositorio.deleteById(id);
    }
}
