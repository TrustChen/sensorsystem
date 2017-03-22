package org.sensorsystem.web;

import org.sensorsystem.service.logginService;
import org.sensorsystem.service.registerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by chen on 2017/3/20.
 */

@Controller   //目的是放入spring容器中
@RequestMapping("/users")  //
public class userController {

    private static Logger logger = LoggerFactory.getLogger(userController.class);

    @Autowired
    private logginService logginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("id") int id, @RequestParam("password") String password, HttpSession session){

        System.out.println(id + ":" + password);
        boolean loginType = logginService.logginexecute(id,password);
        if (loginType){
            //并跳转到success.jsp页面
            session.setAttribute("uid",id);
            return "redirect:/sensor/dataquery";
        }else{
            return "error";
        }

    }



    @Autowired
    private registerService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("id") int id,@RequestParam("name") String name, @RequestParam("password") String password){

        System.out.println(id + ":" + name +":"+ password);
        registerService.insertUsers(id,name,password);
        return "login";

    }





}
