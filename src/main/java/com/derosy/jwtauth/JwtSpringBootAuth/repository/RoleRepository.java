package com.derosy.jwtauth.JwtSpringBootAuth.repository;

import com.derosy.jwtauth.JwtSpringBootAuth.model.Role;
import com.derosy.jwtauth.JwtSpringBootAuth.utils.Constans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(Constans.RoleName roleName);
}
