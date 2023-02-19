package es.hitoindividualadt2marioluquero.servicios;

import es.hitoindividualadt2marioluquero.jpa.Role;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class RoleService {
    private RoleRepositorio roles;

    public RoleService(RoleRepositorio roles) {
        this.roles = roles;
    }

    public void guardarRole(Role rol) {
        roles.save(rol);
    }

    public void eliminarRolById(int id) {
        roles.deleteById(id);
    }

    public void eliminarRolByNif(String nif) {
        roles.deleteByNif(nif);
    }
}
