package org.mariqzw.repositories;

import org.mariqzw.enums.RoleEnum;
import org.mariqzw.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {

    Role findByRoleName(RoleEnum name);
}
