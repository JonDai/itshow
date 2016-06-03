package cn.jondai.itshow.service.base;

import cn.jondai.itshow.dao.UserDao;
import cn.jondai.itshow.entity.account.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by JonDai on 2016/6/1.
 */
@Service
@Transactional(readOnly = true)
public class UserManager {
    @Autowired
    private UserDao dao;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void save(User user){
        dao.save(user);
    }

    public User findUser(Long id){
        return dao.findOne(id);
    }
}
