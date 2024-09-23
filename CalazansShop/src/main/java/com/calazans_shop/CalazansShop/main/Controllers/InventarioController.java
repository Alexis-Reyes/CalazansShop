package com.calazans_shop.CalazansShop.main.Controllers;

import com.calazans_shop.CalazansShop.main.Models.Productos;
import com.calazans_shop.CalazansShop.main.Services.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calazans_shop")
public class InventarioController {

    @Autowired
    private ProductosService productosService;

    @PostMapping("/add_product")
    public Productos addNewProducto(@RequestBody Productos product){
        return productosService.addProduct(product);
    }

    @GetMapping("/product_list")
    public List<String> getAllProductos(){
        return productosService.mostrarCatalogo();
    }

    @GetMapping("/search_product/{id}")
    public Productos getProductById(@PathVariable Integer id) {
        return productosService.consultarInventario(id);
    }
    @PutMapping("/update_product/{id}")
    public Productos updateProduct(@PathVariable Integer id, @RequestBody Productos updatedProduct) {
        return productosService.actualizarInventario(id, updatedProduct);
    }
}
