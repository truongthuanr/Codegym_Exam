package com.codegym.realestatemanagement.repository;

import com.codegym.realestatemanagement.model.AppRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepo extends CrudRepository<AppRole, Long> {
    AppRole findByName(String name);
}
