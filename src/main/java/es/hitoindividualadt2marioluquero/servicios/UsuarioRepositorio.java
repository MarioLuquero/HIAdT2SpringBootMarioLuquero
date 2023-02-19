package es.hitoindividualadt2marioluquero.servicios;

import es.hitoindividualadt2marioluquero.jpa.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
    List<Usuario> findByNombre(String nombre);


}
