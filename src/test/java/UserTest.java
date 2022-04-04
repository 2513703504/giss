import com.ctbu.controller.UserController;
import com.ctbu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : TangHao
 * @description :
 * @ClassName :UserTest
 * @createTime : 2022/3/14 15:11
 * @updateTime : 2022/3/14 15:11
 * @updateRemark : [说明本次修改内容]
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {
    @Autowired
    private UserController userController;
    @Test
    public void test2(){
        userController.getUserList();
    }
}
