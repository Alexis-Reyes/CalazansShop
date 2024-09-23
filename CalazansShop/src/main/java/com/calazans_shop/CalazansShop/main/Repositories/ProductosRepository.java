package com.calazans_shop.CalazansShop.main.Repositories;

import com.calazans_shop.CalazansShop.main.Models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    @Query(value = "SELECT p.nombre FROM productos p", nativeQuery = true)
    List<String> findAllName();

    List<Productos> findByNameContaining(String name);

}
