package com.productoCRUD.demo.repository;

import com.productoCRUD.demo.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    @Query("SELECT DISTINCT p.nameprd FROM Producto p")
    List<String> findDistinctnameprd();

    @Query("SELECT p FROM Producto p WHERE p.nameprd = :name")
    List<Producto> findAllSearchProductos(@Param("name") String name);

}
