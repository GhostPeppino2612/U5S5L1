package giuseppeacquaviva.U5S5L1;

import giuseppeacquaviva.U5S5L1.entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5S5L1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5S5L1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5S5L1Application.class);

		Menu menu = (Menu) ctx.getBean("menu");

		menu.stampaMenu();

		ctx.close();

    }

}
