package com.calazans_shop.CalazansShop.main.Controllers;

import com.calazans_shop.CalazansShop.main.Models.Usuarios;
import com.calazans_shop.CalazansShop.main.Services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calazans_shop")
public class LoginController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/login")
    public String login(@RequestParam String mail, @RequestParam String password) {
        return usuariosService.autenticarUsuario(mail, password);
    }

    @PostMapping("/signup")
    public String signUp(@RequestBody Usuarios usuarios) {
        return usuariosService.registrarUsuario(usuarios);
    }

    @PutMapping("/update_user/{mail}")
    public String updateUser(@PathVariable String mail, @RequestBody Usuarios updatedUser) {
        return usuariosService.actualizarPerfil(mail, updatedUser);
    }
}

