//controlador REST para trabalhar com o produto 
package com.devsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.services.ProductService;

@RestController
@RequestMapping(value= "/products") //definir o caminho do seu recurso

public class ProductController {
	//temos que injetar uma dependencia do productservices
	//o controller depende do service e este do repository
	
	@Autowired
	private ProductService service;
	
	@GetMapping 
	public ResponseEntity<List<ProductDTO>> findAll() { //vai encapsular para nós uma resposta de uma requisição HTTP
		List<ProductDTO> list = service.findAll();
		return ResponseEntity.ok().body(list); //metodo que vai criar uma resposta se foi um caso de sucesso 
	}
}
