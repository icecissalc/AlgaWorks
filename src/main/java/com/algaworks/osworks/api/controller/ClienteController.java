package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController	
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Gandalf Cinzento");
		cliente1.setEmail("gandalf@gmail.com");
		cliente1.setTelefone("21 99999-9999");
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Bilbo");
		cliente2.setEmail("bilbo@gmail.com");
		cliente2.setTelefone("21 66666-6666");
		

		
		return Arrays.asList(cliente1,cliente2);
	}
}
