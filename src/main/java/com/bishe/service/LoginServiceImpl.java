package com.bishe.service;

import com.bishe.dao.UserDao;
import com.bishe.domain.User;
import com.feinno.framework.common.service.EntityServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by shuaigehong on 2015/12/20.
 */
@Service("loginService")
public class LoginServiceImpl extends EntityServiceImpl<User,UserDao> implements LoginService{
    public void userTest(String string) throws Exception {
        System.out.println("接受到的内容:"+string);
    }
}
