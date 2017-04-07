package org.sensorsystem.web;

import org.sensorsystem.entity.sensors;
import org.sensorsystem.service.sensorqueryByGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by chen on 2017/4/7.
 */
@Controller
@RequestMapping("/sensor")
public class sensorqueryByGroupController {

    @Autowired
    private sensorqueryByGroupService sensorqueryByGroupService;

    @RequestMapping(value = "/sensorquerybygroup", method = RequestMethod.POST)
    public String querySensorByGroup(HttpSession session, Model model, String groupname){

        int uid = (Integer) session.getAttribute("uid");

        List<sensors> sensorsbygroup = sensorqueryByGroupService.sensorqueryByGroup(groupname,uid);

        model.addAttribute("sensorsbygroup",sensorsbygroup);

        return "sensorbygroup";
    }

}
