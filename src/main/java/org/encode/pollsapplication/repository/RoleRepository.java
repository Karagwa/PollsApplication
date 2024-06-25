package org.encode.pollsapplication.repository;

import org.encode.pollsapplication.model.Role;
import org.encode.pollsapplication.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(RoleName roleName);
}
