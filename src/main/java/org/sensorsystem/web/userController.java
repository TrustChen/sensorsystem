package org.sensorsystem.web;

import org.sensorsystem.dao.userdao.loggindao;
import org.sensorsystem.entity.users;
import org.sensorsystem.service.logginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chen on 2017/3/20.
 */

@Controller   //目的是放入spring容器中
@RequestMapping("/users")  //
public class userController {

    loggindao mapper;

    private static Logger logger = LoggerFactory.getLogger(userController.class);

    @Autowired
    private logginService logginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("id") int id,@RequestParam("password") String password){

        System.out.println(id + ":" + password);
        boolean loginType = logginService.logginexecute(id,password);
        if (loginType){
            //并跳转到success.jsp页面
            return "success";
        }else{
            return "error";
        }

    }





}
