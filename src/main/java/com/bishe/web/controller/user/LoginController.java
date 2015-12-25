package com.bishe.web.controller.user;

import com.bishe.service.LoginService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by shuaigehong on 2015/12/20.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "login")
    public String login(String userName){
        System.out.println("接收到的参数:"+userName);
//       JSONObject jsonpObject = new JSONObject();
//        try {
////            loginService.login(userName);
//            jsonpObject.put("msg","welcome！");
//        }catch (Exception e){
//            System.out.println("error");
//        }
//        return jsonpObject;
        return "test";
    }
}
