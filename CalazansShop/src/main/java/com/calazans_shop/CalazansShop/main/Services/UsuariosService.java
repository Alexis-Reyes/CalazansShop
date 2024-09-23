package com.calazans_shop.CalazansShop.main.Services;

import com.calazans_shop.CalazansShop.main.Models.Usuarios;
import com.calazans_shop.CalazansShop.main.Repositories.UsuariosRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public String autenticarUsuario(String mail, String password) {
        Optional<Usuarios> usuariosOptional = usuariosRepository.findByMailAndPassword(mail, password);
        if (usuariosOptional.isPresent()) {
            Usuarios users = usuariosOptional.get();
            if ("cliente".equalsIgnoreCase(users.getRole())) {
                return "Inicio de sesión como Cliente";
            } else if ("administrador".equalsIgnoreCase(users.getRole())) {
                return "Inicio de sesión como Administrador";
            } else {
                return "Usuario sin rol";
            }
        } else {
            return "Credenciales Incorrectas";
        }
    }

    public String registrarUsuario(Usuarios usuarios) {
        Optional<Usuarios> existingUser = usuariosRepository.findByMail(usuarios.getMail());
        if (existingUser.isPresent()) {
            return "Correo electrónico ya está registrado";
        }
        usuariosRepository.save(usuarios);
        return "Usuario registrado correctamente";
    }

    public String actualizarPerfil(String mail, Usuarios updatedUser){
        Optional<Usuarios> existingUsers = usuariosRepository.findByMail(mail);
        if (existingUsers.isPresent()){
            Usuarios existingUser = existingUsers.get();

            existingUser.setName(updatedUser.getName());
            existingUser.setLastName(updatedUser.getLastName());
            existingUser.setAddress(updatedUser.getAddress());
            existingUser.setPostalCode(updatedUser.getPostalCode());
            existingUser.setPassword(updatedUser.getPassword());

            usuariosRepository.save(existingUser);
            return "Usuario actualizado correctamente";
        }else {
            return "Usuario no encontrado";
        }
    }
}
