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

import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class CursoTest {
    @Autowired
    CursoRepository cursoRepository;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    CursoService cursoService;

    @Test
    @DisplayName("")
    public void testFindAll(){
        when(cursoRepository.findAll()).thenReturn(List.of(new Curso()));
        /**List<Curso>cursos= cursoService
         *
         */
    }
}
