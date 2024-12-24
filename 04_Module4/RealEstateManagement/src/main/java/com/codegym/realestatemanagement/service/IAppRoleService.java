package com.codegym.realestatemanagement.service;

import com.codegym.realestatemanagement.model.AppRole;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
