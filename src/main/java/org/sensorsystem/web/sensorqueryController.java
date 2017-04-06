package org.sensorsystem.web;


import org.sensorsystem.entity.sensors;
import org.sensorsystem.service.sensorqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by chen on 2017/3/27.
 */
@Controller
@RequestMapping("/sensor")
public class sensorqueryController {

    @Autowired
    private sensorqueryService sensorqueryService;

    @RequestMapping(value = "/sensorquery", method = RequestMethod.GET)
    public String querysensor(HttpSession session, Model model, HttpServletRequest request){

        int uid = (Integer) session.getAttribute("uid");
        List<sensors> sensors = sensorqueryService.sensorquery(uid);
        model.addAttribute("sensors",sensors);
        System.out.println(sensors);
        return "sensor";
    }

}
