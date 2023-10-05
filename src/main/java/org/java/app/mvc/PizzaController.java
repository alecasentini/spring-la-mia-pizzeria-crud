package org.java.app.mvc;

import java.util.List;

import org.java.app.db.pojo.Pizza;
import org.java.app.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping
	public String getIndex(@RequestParam(value = "nome", required = false) String nome, Model model) {
	    List<Pizza> pizzas;
	    if (nome != null) {
	        pizzas = pizzaService.findByNomeContaining(nome);
	    } else {
	        pizzas = pizzaService.findAll();
	    }

	    if (pizzas.isEmpty()) {
	        model.addAttribute("noPizzas", true);
	    } else {
	        model.addAttribute("pizzas", pizzas);
	    }

	    return "pizza-index";
	}


	
	@GetMapping("/{id}")
	public String getPizzaDetails(@PathVariable int id, Model model) {
	    Pizza pizza = pizzaService.findById(id);
	    model.addAttribute("pizza", pizza);
	    return "pizza-show";
	}


}
