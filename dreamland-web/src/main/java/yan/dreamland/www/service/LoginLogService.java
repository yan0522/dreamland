package yan.dreamland.www.service;


import yan.dreamland.www.entity.LoginLog;

import java.util.List;

/**
 * TODO
 *
 * @InterfaceName: LoginLogService
 * @author: yan
 * @since: 2019/6/14 14:21
 */
public interface LoginLogService {
    /**
     * 添加登录日志
     * @param loginLog
     * @return
     */
    int add(LoginLog loginLog);

    /**
     * 查询所有日志
     * @return
     */
    List<LoginLog> findAll();

    /**
     * 根据用户id查询日志集合
     * @param uid
     * @return
     */
    List<LoginLog> findByUid(Long uid);
}
