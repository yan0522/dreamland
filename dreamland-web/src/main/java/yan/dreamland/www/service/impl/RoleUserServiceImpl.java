package yan.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yan.dreamland.www.dao.RoleUserMapper;
import yan.dreamland.www.entity.RoleUser;
import yan.dreamland.www.entity.User;
import yan.dreamland.www.service.RoleUserService;

import java.util.List;

/**
 * Created by wly on 2017/12/15.
 */
@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserMapper roleUserMapper;

    @Override
    public List<RoleUser> findByUser(User user) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( user.getId() );
        return roleUserMapper.select( roleUser );
    }

    @Override
    public int add(RoleUser roleUser) {
        return roleUserMapper.insert( roleUser );
    }

    @Override
    public void deleteByUid(Long uid) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( uid );
        roleUserMapper.delete( roleUser );
    }
}
