package MsSecurity.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MsSecurity.producto.model.productoModel;
import MsSecurity.producto.repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    IProductoRepository repository;
    @Override
    public productoModel add(productoModel model) {
        try {return repository.save(model);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    @Override
    public productoModel update(productoModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public productoModel getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<productoModel> getAll() {
        return (List<productoModel>) repository.findAll();
    }

}
