package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	//metodo auxiliar que vai ordenar por nome 
	//o Query Creation do Spring permite customizar uma consulta somente pelo nome do método 
	List<Product> findAllByOrderByNameAsc();
}
