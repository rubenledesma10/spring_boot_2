package com.example.estudianteprogramacion.controller;

import com.example.estudianteprogramacion.dto.CursoTemaDTO;
import com.example.estudianteprogramacion.model.Curso;
import com.example.estudianteprogramacion.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    private ICursoService cursoServ;
    
    //para traer los cursos
    @GetMapping("/cursos/traer")
    public List<Curso> traerCursos(){
        return cursoServ.getCursos();
    }
    
    //crear curso
    @PostMapping("/cursos/crear")
    public String crearCurso (@RequestBody Curso cur){
        cursoServ.saveCurso(cur);
        return "Curso creado";
    }
    
    //obtener los temas de un curso
    @GetMapping("/cursos/tema/{id_curso}") //vamos a obtener los temas del curso a traves del id del curso
    public CursoTemaDTO temasPorCurso (@PathVariable Long id_curso) {
        return cursoServ.temasPorCurso(id_curso);
    
    }
    
    //obtener los cursos sobre java
    @GetMapping("/cursos/java")
    public List<Curso> traerCursosJava(){
        return cursoServ.getCursosJava();
    }
    
    //modificar datos de los cursos
    @PutMapping("/cursos/editar")
    public String editCurso (Curso cur){
        cursoServ.editCurso(cur);
        return "Curso editado correctamente";
    }
    
}

