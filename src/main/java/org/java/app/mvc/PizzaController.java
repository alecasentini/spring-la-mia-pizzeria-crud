package org.java.app.mvc;

import java.util.List;

import org.java.app.db.pojo.Pizza;
import org.java.app.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping
	public String getIndex(Model model) {
		
		List<Pizza> pizzas = pizzaService.findAll();
		
		if (pizzas.isEmpty()) {
			model.addAttribute("noPizzas", true);
		} else {
			model.addAttribute("pizzas", pizzas);
		}
		
		return "pizza-index";
	}
}
