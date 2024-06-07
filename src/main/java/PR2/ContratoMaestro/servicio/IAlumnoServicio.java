package PR2.ContratoMaestro.servicio;

import PR2.ContratoMaestro.modelo.Alumno;

import java.util.List;

public interface IAlumnoServicio {
    public List<Alumno> listarAlumnos();

    public Alumno buscarAlumnoPorId(Integer idAlumno);

    public Alumno guardarAlumno(Alumno alumno);

    public void eliminarAlumno(Alumno alumno);

}
