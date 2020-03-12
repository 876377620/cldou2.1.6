package com.yang.cloudapi.protocol;

import com.yang.cloudapi.model.PageBean;
import com.yang.cloudapi.model.Role;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@FeignClient(value = "service-docmg")
public interface IRoleService {
    /* 角色管理 start */
    @RequestMapping(value = "/findRoleById")
    Role findRoleById(@RequestParam(value = "id") Integer id);

    @RequestMapping(value = "/getRoleList")
    List<Role> getRoleList(@RequestBody PageBean pageBean);
}
