package com.mercadopago.web;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class IndexController {

	@Get("/index")
	public void index() {
		System.out.println("Its working");
	}
	
}
