package PR2.ContratoMaestro.controlador;

import PR2.ContratoMaestro.modelo.Alumno;
import PR2.ContratoMaestro.servicio.IAlumnoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8080/cepb-app/
@RequestMapping("cepb-app")
@CrossOrigin(value = "http://localhost:3000")

public class AlumnoControlador {
    private static final Logger logger =
        LoggerFactory.getLogger(AlumnoControlador.class);
    @Autowired
    private IAlumnoServicio alumnoServicio;

    //http://localhost:8080/cepb-app/alumnos
    @GetMapping("/alumnos")
    public List<Alumno> obtenerAlumnos(){
        var alumnos = alumnoServicio.listarAlumnos();
        alumnos.forEach((alumno -> logger.info(alumno.toString())));
        return alumnos;
    }
}
