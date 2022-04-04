import com.ctbu.controller.UserController;
import com.ctbu.entity.User;
import com.ctbu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : TangHao
 * @description :
 * @ClassName :UserTest2
 * @createTime : 2022/3/16 16:05
 * @updateTime : 2022/3/16 16:05
 * @updateRemark : [说明本次修改内容]
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest2 {
        @Autowired
        private UserService userService;
        @Test
        public void test1(){
            User user=userService.loginService(new User(1,"汤浩","123456",1));
            System.out.println(user);
        }
}
