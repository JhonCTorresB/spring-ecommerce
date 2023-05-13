package com.curso.ecommerce.service;

import java.util.Optional;

import com.curso.ecommerce.model.Producto;

//EN UNA INTERFAZ SOLO SE DEFINE LOS METODOS
public interface ProductoService {
	
	public Producto save(Producto producto); /* esun metodo llamado save que retornara un producto, que recibe 
												un objeto de tipo producto llamado producto*/
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
}
