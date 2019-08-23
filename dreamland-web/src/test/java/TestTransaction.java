import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import yan.dreamland.www.entity.User;
import yan.dreamland.www.service.UserService;

/**
 * TODO
 *
 * @ClassName: TestTransaction
 * @author: yan
 * @since: 2019/6/14 21:10
 */
@ContextConfiguration(locations = {"classpath:applicationContext-redis.xml","classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class TestTransaction extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserService userService;
    @Test
    public void test01(){
        User user = new User();
        user.setNickName("拉布兰德");
        user.setEmail("1234567@qq.com");
        userService.regist(user);
    }
}
