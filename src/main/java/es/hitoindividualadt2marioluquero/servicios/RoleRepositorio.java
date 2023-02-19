package es.hitoindividualadt2marioluquero.servicios;

import es.hitoindividualadt2marioluquero.jpa.Role;
import es.hitoindividualadt2marioluquero.jpa.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface RoleRepositorio extends JpaRepository<Role, Integer> {

    @Modifying
    @Transactional
    @Query("delete from Role r where r.usuario.nif=:nif")

    void deleteByNif(@Param("nif") String nif);

}
