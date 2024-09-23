package com.calazans_shop.CalazansShop.main.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calazans_shop")
public class PruebaServer {

    @GetMapping("/test")
    public String estaArriba(){
        return "El servidor está activo";
    }
}
