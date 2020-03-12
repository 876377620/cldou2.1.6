package com.yang.cloudprovider.protocol;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yang.cloudapi.model.PageBean;
import com.yang.cloudapi.model.Role;
import com.yang.cloudapi.protocol.IRoleService;
import com.yang.cloudprovider.util.MybatisPlusTools;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class RoleService implements IRoleService {
    @Autowired
    com.yang.cloudprovider.service.IRoleService roleService;
    @Override
    public Role findRoleById(@Param(value = "id") Integer id) {
        Role role = roleService.getById(id);
        return role;
    }

    @Override
    public List<Role> getRoleList(@RequestBody PageBean pageBean) {
        return roleService.page(new Page<Role>(pageBean.getPageSize(), pageBean.getPageNumber()),new MybatisPlusTools<Role>().getEwByList(pageBean.getQueryParams()))
                .getRecords();
    }
}
