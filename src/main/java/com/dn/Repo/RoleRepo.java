package com.dn.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dn.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
