package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired //faz a resolução da dependência de forma transparente 
	//mais corretor do que colocar como new aqui abaixo 
	private ProductRepository repository;
	
	//Função para retornar uma lista de produtos
	@Transactional(readOnly = true)
	public List <ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		//o service(que é um componente) na verdade vai retornar um DTO 
		//o DTO é um objeto enxuto que carrega apenas os dados que especificarmos 
		
		//criamos o Product DTO: que é um objeto para carregar
		//os dados correspondentes a um produto
		
		//o service chama o repository
		//nesse caso vamos fazer uma injeção de dependência de componentes
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}

//com essa notação a nossa classe vai ser um componente registrado que vai poder ser injetada 
//em outros componentes

//o ProductService é um componente que depende de um outro componente que é o ProductRepository
//para ter uma instancia do ProductRepository disponível dentro do ProductService