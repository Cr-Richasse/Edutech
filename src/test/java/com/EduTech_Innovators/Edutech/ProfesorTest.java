package com.EduTech_Innovators.Edutech;

import com.EduTech_Innovators.Edutech.model.Profesor;
import com.EduTech_Innovators.Edutech.repository.ProfesorRepository;
import com.EduTech_Innovators.Edutech.service.ProfesorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class ProfesorTest {
    @MockBean
    ProfesorRepository profesorRepository;

    @Autowired
    ProfesorService profesorService;

    @Test
    public void testFindAll(){
        when(profesorRepository.findAll()).thenReturn(List.of(new Profesor(1,12345678,6,"Miguel","Alvarez","Gonzales","MiguelAlvGon88_@gmail.cl",null,"Miguel",2)));
        List<Profesor>profesores = profesorService.getProfesores();
        assertNotNull(profesores);
        assertEquals(1, profesores.size());
    }
}
