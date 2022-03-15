package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	
	
}
