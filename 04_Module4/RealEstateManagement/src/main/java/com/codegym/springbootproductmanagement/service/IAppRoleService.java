package com.codegym.springbootproductmanagement.service;

import com.codegym.springbootproductmanagement.model.AppRole;

public interface IAppRoleService extends IGenerateService<AppRole> {
    AppRole findByName(String name);
}
