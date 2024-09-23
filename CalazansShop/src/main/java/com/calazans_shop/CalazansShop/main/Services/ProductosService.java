package com.calazans_shop.CalazansShop.main.Services;

import com.calazans_shop.CalazansShop.main.Models.Productos;
import com.calazans_shop.CalazansShop.main.Repositories.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepository;

    public Productos addProduct(Productos producto) {
        return productosRepository.save(producto);
    }

    public List<String> mostrarCatalogo() {
        return productosRepository.findAllName();
    }

    public Productos consultarInventario(Integer id) {
        return productosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public Productos actualizarInventario(Integer id, Productos updatedProduct) {
        return productosRepository.findById(id).map(product -> {
            //product.setName(updatedProduct.getName());
            product.setStock(updatedProduct.getStock());
            //product.setDescription(updatedProduct.getDescription());
            //product.setPhoto(updatedProduct.getPhoto());
            //product.setPrice(updatedProduct.getPrice());
            return productosRepository.save(product);
        }).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public List<String> buscarProducto(String name) {
        List<Productos> productos = productosRepository.findByNameContaining(name);
        return productos.stream()
                .map(Productos::getName)
                .collect(Collectors.toList());
    }
}
