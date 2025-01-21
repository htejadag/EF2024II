package MsSecurity.producto.service;

import java.util.List;

import MsSecurity.producto.model.productoModel;

public interface IProductoService {
    public productoModel add (productoModel model);
    public productoModel update (productoModel model);
    public boolean delete (int id);
    public productoModel getById (int id);
    public List<productoModel> getAll ();
}
