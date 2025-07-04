package com.EduTech_Innovators.Edutech;

import com.EduTech_Innovators.Edutech.model.Curso;
import com.EduTech_Innovators.Edutech.repository.CursoRepository;
import com.EduTech_Innovators.Edutech.service.CursoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
@AutoConfigureMockMvc
public class CursoTest {
    @MockBean
    CursoRepository cursoRepository;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    CursoService cursoService;

    @Test
    public void testFindAll(){
        when(cursoRepository.findAll()).thenReturn(List.of(new Curso(1,"Lenguaje","008D",19000,20)));
        List<Curso>cursos= cursoService.obtenerCursos();
        assertNotNull(cursos);
        assertEquals(1,cursos.size());
    }
    @Test
    void testFindCurso(){
        Curso prueba = cursoRepository.findById(1).get();
        assertNotNull(prueba);
        assertEquals(19000,prueba.getPrecioCurso());
    }
}
