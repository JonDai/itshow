package cn.jondai.itshow.service.base;

import cn.jondai.itshow.ItshowApplication;
import cn.jondai.itshow.dao.UserDao;
import cn.jondai.itshow.entity.account.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.*;

/**
 * Created by JonDai on 2016/6/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ItshowApplication.class)
public class UserManagerTest {
    @Autowired
    private UserManager userManager;

    private final User user = new User();

    @Before
    public void getUser(){
        user.setNickName("jondai");
        user.setPassword("dpw123");
        user.setEmail("jondai.aliyun.com");
        user.setHeight(172.0);
        user.setWeight(65.0);
    }

    @Test
    public void testSave() throws Exception {
        userManager.save(user);
        System.out.println(userManager.findUser(Long.parseLong("1")).getNickName());
    }
}