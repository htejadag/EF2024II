package main.java.MsSecurity.producto.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.MsSecurity.producto.endpoints.apiRoutes;
import main.java.MsSecurity.producto.model.productoModel;
import main.java.MsSecurity.producto.service.ProductoService;
@RestController
@RequestMapping(apiRoutes.productoBasic)
public class productoController {
    @Autowired
    private ProductoService productoServi;
    @GetMapping()
    public List<productoModel> get() {
        return productoServi.getAll();
    }
    @PostMapping(apiRoutes.productoCreate)
    public productoModel create(@RequestBody productoModel model){
        return productoServi.add(model);
    }
    @GetMapping(apiRoutes.productoBuscarID)
    public productoModel getById(@PathVariable("id_producto") int id){
        return productoServi.getById(id);
    }

    @PutMapping(apiRoutes.productoUpdate)
    public productoModel update(@RequestBody productoModel model){
        return productoServi.update(model);
    }

    @DeleteMapping(apiRoutes.productoDelete)
    public boolean delete(@PathVariable("id_producto") int id){
        return productoServi.delete(id);
    }
}
