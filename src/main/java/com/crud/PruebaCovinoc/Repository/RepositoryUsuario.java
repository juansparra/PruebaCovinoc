package com.crud.PruebaCovinoc.Repository;

import com.crud.PruebaCovinoc.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryUsuario extends JpaRepository<Usuario,Long>, CrudRepository<Usuario,Long> {
}