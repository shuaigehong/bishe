package com.bishe.service;

import com.bishe.domain.User;
import com.feinno.framework.common.service.EntityService;

/**
 * Created by shuaigehong on 2015/12/20.
 */
public interface LoginService extends EntityService<User> {
    public void userTest(String string) throws Exception;
}
