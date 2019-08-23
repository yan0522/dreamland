package yan.dreamland.www.service;

import yan.dreamland.www.entity.UserInfo;

/**
 * TODO
 *
 * @InterfaceName: UserInfoService
 * @author: yan
 * @since: 2019/6/14 14:24
 */
public interface UserInfoService {
    /**
     * 根据用户id查找用户详细信息
     * @param id
     * @return
     */
    UserInfo findByUid(Long id);

    /**
     * 更新用户详细信息
     * @param userInfo
     */
    void update(UserInfo userInfo);

    /**
     * 添加用户详细新
     * @param userInfo
     */
    void add(UserInfo userInfo);
}
