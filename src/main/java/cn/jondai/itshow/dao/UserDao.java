package cn.jondai.itshow.dao;

import cn.jondai.itshow.entity.account.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JonDai on 2016/6/1.
 */
@Repository
public interface UserDao extends CrudRepository<User , Long>{

}
