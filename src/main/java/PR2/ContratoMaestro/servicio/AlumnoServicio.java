package PR2.ContratoMaestro.servicio;

import PR2.ContratoMaestro.modelo.Alumno;
import PR2.ContratoMaestro.repositorio.AlumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AlumnoServicio implements IAlumnoServicio{

    @Autowired
    private AlumnoRepositorio alumnoRepositorio;

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepositorio.findAll();
    }

    @Override
    public Alumno buscarAlumnoPorId(Integer idAlumno) {
        Alumno alumno = alumnoRepositorio.findById(idAlumno).orElse(null);
        return alumno;
    }

    @Override
    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepositorio.save(alumno);
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
        alumnoRepositorio.delete(alumno);
    }
}
