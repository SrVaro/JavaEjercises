package pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.varo.spring.App;
import com.varo.spring.model.Kitty;
import com.varo.spring.service.KittyService;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * The @SpringBootTest annotation tells Spring Boot to go and look 
 * for a main configuration class (one with @SpringBootApplication 
 * for instance), and use that to start a Spring application context
 * 
 */

/*
 * @RunWith(SpringRunner.class) tells JUnit to run using Spring’s 
 * testing support. SpringRunner is the new name for 
 * SpringJUnit4ClassRunner. Por ejemplo, en vez de esa clase, podriamos
 * pasar un objeto Mockito
 * 
 */
 
/*
 * http://www.baeldung.com/junit-5-runwith
 * In JUnit 5, the @RunWith annotation has been replaced by the more powerful @ExtendWith annotation
 *
 */

/*
 * Con @SpringBootTest levantamos el contexto de Spring al completo. 
 * Se utiliza la configuración de la clase anotada con @SpringBootApplication pero podemos 
 * especificar otra con el atributo classes, o bien utilizar la anotación 
 * @ContextConfiguration genérica de Spring
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class ApplicationTest01_CRUDKittys {
	
	@Autowired
	private KittyService kittyService;
	
	@Test
    public void databaseCleanUp() {
		
		//kittyService.dele
    	
    }

    @Test
    public void addKittyTest() {

    	Kitty k1 = new Kitty();
		k1.setName("Ola");
		k1.setUrl("agljaflñ");
		
		Kitty k2 = new Kitty();
		k2.setName("K ase");
		k2.setUrl("jkggjjjk");
		
		int preSize = kittyService.list().size();
		
		kittyService.add(k1);
		kittyService.add(k2);
		
		assertEquals(preSize + 2, kittyService.list().size());
		assertEquals(k1.getName(), kittyService.list().get(kittyService.list().size() - 2));
		assertEquals(k1.getName(), kittyService.list().get(kittyService.list().size() - 1));
    }
    
    @Test
    public void listKittys() {

		
		int preSize = kittyService.list().size();

		
//		assertEquals(preSize + 2, kittyService.list().size());
//		assertEquals(k1.getName(), kittyService.list().get(kittyService.list().size() - 2));
//		assertEquals(k1.getName(), kittyService.list().get(kittyService.list().size() - 1));
    }

}