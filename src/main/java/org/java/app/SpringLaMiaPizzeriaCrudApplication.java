package org.java.app;

import org.java.app.db.pojo.Pizza;
import org.java.app.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {

	@Autowired
	private PizzaService pizzaService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Pizza pizza1 = new Pizza("Margherita", "Pomodoro, mozzarella, basilico, olio", "url_foto1", 5.00);
//		Pizza pizza2 = new Pizza("Diavola", "Pomodoro, mozzarella, salame piccante", "url_foto2", 6.00);
//		Pizza pizza3 = new Pizza("Capricciosa", "Pomodoro, mozzarella, funghi, prosciutto cotto, olive, carciofini", "url_foto3", 7.00);
//		Pizza pizza4 = new Pizza("Quattro Stagioni", "Pomodoro, mozzarella, funghi, prosciutto cotto, olive nere, carciofini", "url_foto4", 7.50);
//		Pizza pizza5 = new Pizza("Quattro Formaggi", "Mozzarella, gorgonzola, fontina, parmigiano", "url_foto6", 6.50);
//		
//		pizzaService.save(pizza1);
//		pizzaService.save(pizza2);
//		pizzaService.save(pizza3);
//		pizzaService.save(pizza4);
//		pizzaService.save(pizza5);
		
		System.out.println("Inserimento OK!");
	}
}


