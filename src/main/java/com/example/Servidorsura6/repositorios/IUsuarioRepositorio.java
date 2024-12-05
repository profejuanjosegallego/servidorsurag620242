package com.example.Servidorsura6.repositorios;

import com.example.Servidorsura6.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario,Long> {
}
