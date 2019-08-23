package yan.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yan.dreamland.www.dao.RoleMapper;
import yan.dreamland.www.entity.Role;
import yan.dreamland.www.service.RoleService;

/**
 * TODO
 *
 * @ClassName: RoleServiceImpl
 * @author: yan
 * @since: 2019/6/21 14:09
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role findById(long id) {
        Role role = new Role();
        role.setId( id );
        return roleMapper.selectOne( role );
    }

    @Override
    public int add(Role role) {
        return roleMapper.insert(role);
    }
}
