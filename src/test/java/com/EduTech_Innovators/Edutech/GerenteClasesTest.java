package com.EduTech_Innovators.Edutech;

import com.EduTech_Innovators.Edutech.model.GerenteClases;
import com.EduTech_Innovators.Edutech.repository.GerenteClasesRepository;
import com.EduTech_Innovators.Edutech.service.GerenteClasesService;
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
public class GerenteClasesTest {
    @MockBean
    GerenteClasesRepository gerenteClasesRepository;
    @Autowired
    GerenteClasesService gerenteClasesService;
    @Test
    public void testFindAll(){
        when(gerenteClasesRepository.findAll()).thenReturn(List.of(new GerenteClases(1,12345678,6,"Jorge","Alvarez","Gonzales","Jorg_@gmail.cl",null,"Jorg",3)));
        List<GerenteClases>gerenteClases=gerenteClasesService.obtenerGerentes();
        assertNotNull(gerenteClases);
        assertEquals(1, gerenteClases.size());
    }
}
