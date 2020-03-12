package com.yang.cloudconsumer.conrtoller;

import com.yang.cloudapi.model.PageBean;
import com.yang.cloudapi.model.Role;
import com.yang.cloudapi.protocol.IRoleService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@Controller
public class RoleController {
    @Autowired
    IRoleService roleService;
    @RequestMapping("getRole")
    @ResponseBody
    public Role getRole(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Role role = roleService.findRoleById(Integer.valueOf(id));
        return role;
    }
    @RequestMapping("getRoleList")
    @ResponseBody
    public List<Role> getRoleList(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pageSize = request.getParameter("pageSize");
        String pageNum = request.getParameter("pageNum");
        System.out.println(pageSize);
        System.out.println(pageNum);
        HashMap<String, Object> query = new HashMap<>();
        if (StringUtils.isNotBlank(id)) {
            query.put("=,id", id);
        }
        PageBean pageBean = new PageBean();
        pageBean.setPageNumber(Integer.valueOf(pageNum));
        pageBean.setPageSize(Integer.valueOf(pageSize));
        pageBean.setQueryParams(query);
        List<Role> role = roleService.getRoleList(pageBean);
        return role;
    }
}
