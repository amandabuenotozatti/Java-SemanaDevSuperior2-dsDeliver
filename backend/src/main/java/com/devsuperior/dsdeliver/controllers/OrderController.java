//controlador REST para trabalhar com o produto 
package com.devsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.services.OrderService;

@RestController
@RequestMapping(value= "/orders") //definir o caminho do seu recurso

public class OrderController {
	//temos que injetar uma dependencia do productservices
	//o controller depende do service e este do repository
	
	@Autowired
	private OrderService service;
	
	@GetMapping 
	public ResponseEntity<List<OrderDTO>> findAll() { //vai encapsular para nós uma resposta de uma requisição HTTP
		List<OrderDTO> list = service.findAll();
		return ResponseEntity.ok().body(list); //metodo que vai criar uma resposta se foi um caso de sucesso 
	}
}
