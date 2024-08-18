package com.ejemplo_uno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ejemplo_uno.entity.Ejemplo;
import com.ejemplo_uno.logic.EjemploLogic;
import com.ejemplo_uno.repository.EjemploRepository;

import net.bytebuddy.asm.Advice.Local;

@RunWith(SpringRunner.class)
@SpringBootTest
class EjemploUnoApplicationTests {

	@MockBean
	Ejemplo respuesta;

	@Mock
	EjemploRepository repo;

	@InjectMocks
	EjemploLogic logic;

	@Test
	public void guardarTest() {
		// Configuración
		Ejemplo ejemplo = new Ejemplo();
		ejemplo.setNombre("test");

		// Establecer una fecha válida
		ejemplo.setFecha(LocalDate.now()); // Usando la fecha actual

		// Definir comportamiento esperado
		when(repo.save(any(Ejemplo.class))).thenReturn(ejemplo);

		// Ejecución del método a probar
		Ejemplo result = logic.guardar(ejemplo);

		// Verificación de resultados
		assertEquals("test", result.getNombre());
		assertNotNull(result.getFecha()); // Verifica que la fecha no es null
		assertEquals(LocalDate.now(), result.getFecha()); // Verifica que la fecha es la esperada

		// Verificación de que el repositorio fue llamado correctamente
		verify(repo).save(ejemplo);
	}
//
//	@Test
//	public void buscar() {
//		Ejemplo ejemplo = new Ejemplo();
//
//		ejemplo.setEjemploId(1);
//		ejemplo.setNombre("nombre");
//		ejemplo.setFecha(LocalDate.now());
//
//		when(repo.findById(1)).thenReturn(Optional.of(ejemplo));
//
//		Ejemplo result = logic.buscar(1);
//
//		assertEquals(1, result.getEjemploId());
//		assertEquals("nombre", result.getNombre());
//		assertEquals(LocalDate.now(), result.getFecha());
//
//	}
//
//	@Test
//	public void testEliminar() {
//
//		Ejemplo ejemplo = new Ejemplo();
//
//		ejemplo.setEjemploId(1);
//		when(repo.findById(1)).thenReturn(Optional.of(ejemplo));
//		doNothing().when(repo).deleteById(1);;
//
//		logic.eliminar(1);
//		
//		verify(repo, times(1)).deleteById(1);
//		
//	}
//
//	@Test
//	public void actualizar() {
//
//		Ejemplo ejemplo = new Ejemplo();
//
//		ejemplo.setEjemploId(1);
//		ejemplo.setNombre("paco");
//
//		when(repo.findById(1)).thenReturn(Optional.of(ejemplo));
//		when(repo.save(any(Ejemplo.class))).thenReturn(ejemplo);
//
//		Ejemplo act = new Ejemplo();
//
//		act.setNombre("paco");
//
//		Ejemplo result = logic.actualizar(1, ejemplo);
//
//		assertNotNull(ejemplo);
//		assertEquals(1, result.getEjemploId());
//		assertEquals("paco", result.getNombre());
//
//	}
//
//	@Test
//	public void testMostrar() {
//
//		Ejemplo ejemplo = new Ejemplo();
//
//		ejemplo.setEjemploId(1);
//		ejemplo.setNombre("pepe");
//
//		Ejemplo ejemplo2 = new Ejemplo();
//
//		ejemplo2.setEjemploId(2);
//		ejemplo2.setNombre("memo");
//		
//		List<Ejemplo> juntar = Arrays.asList(ejemplo, ejemplo2);
//		
//		when(repo.findAll()).thenReturn(juntar);
//		
//		List<Ejemplo> result = logic.mostrar();
//		
//		assertEquals(2, result.size());
//		assertEquals("pepe", result.get(0).getNombre());
//		assertEquals("pepe", result.get(1).getNombre());
//				
//	}

}
