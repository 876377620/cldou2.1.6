package com.yang.cloudprovider.service.impl;

import com.yang.cloudapi.model.Role;
import com.yang.cloudprovider.mapper.RoleMapper;
import com.yang.cloudprovider.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author djy
 * @since 2020-03-12
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
