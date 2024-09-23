package com.calazans_shop.CalazansShop.main.Controllers;

import com.calazans_shop.CalazansShop.main.Models.Productos;
import com.calazans_shop.CalazansShop.main.Services.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calazans_shop")
public class CatalogoProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping("/product_catalog")
    public List<String> getAllProducts(){
        return productosService.mostrarCatalogo();
    }
    @GetMapping("/search_product/name")
    public List<String> searchProductNames(@RequestParam String name) {
        return productosService.buscarProducto(name);
    }

}
