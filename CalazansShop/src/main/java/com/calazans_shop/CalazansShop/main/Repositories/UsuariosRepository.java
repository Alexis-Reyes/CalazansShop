package com.calazans_shop.CalazansShop.main.Repositories;

import com.calazans_shop.CalazansShop.main.Models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

    Optional<Usuarios> findByMailAndPassword(String mail, String password);

    Optional<Usuarios> findByMail(String mail);
}
