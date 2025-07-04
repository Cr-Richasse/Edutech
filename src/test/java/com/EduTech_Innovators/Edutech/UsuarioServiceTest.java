package com.EduTech_Innovators.Edutech;

import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.repository.UsuarioRepository;
import com.EduTech_Innovators.Edutech.service.UsuarioService;
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
public class UsuarioServiceTest {
    @MockBean
    UsuarioRepository usuarioRepository;
    @Autowired
    UsuarioService usuarioService;
    @Test
    public void testFindAll() {
        when(usuarioRepository.findAll()).thenReturn(List.of(new Usuario(1,12345678,6,"Benja","Musk","Gutierrez","Ben889_@gmail.cl",null,"BenMuGut",true)));
        List<Usuario>usuarios=usuarioService.obtenerUsuarios();
        assertNotNull(usuarios);
        assertEquals(1,usuarios.size());
    }

}
