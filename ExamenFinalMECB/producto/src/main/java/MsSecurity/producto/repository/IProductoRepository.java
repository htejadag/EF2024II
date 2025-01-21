package MsSecurity.producto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MsSecurity.producto.model.productoModel;
@Repository
public interface IProductoRepository extends CrudRepository<productoModel, Integer>{

}
