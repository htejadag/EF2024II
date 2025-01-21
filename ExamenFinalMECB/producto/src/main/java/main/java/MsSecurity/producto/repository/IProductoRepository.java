package main.java.MsSecurity.producto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.java.MsSecurity.producto.model.productoModel;

@Repository
public interface IProductoRepository extends CrudRepository<productoModel, Integer> {
}
