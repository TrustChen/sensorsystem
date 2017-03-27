package org.sensorsystem.web;

import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.sensordataqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by chen on 2017/3/22.
 */

@Controller
@RequestMapping("/sensor")
public class sensordataqueryController {

    @Autowired
    private sensordataqueryService sensordataqueryService;

    @RequestMapping(value = "/dataquery", method = RequestMethod.GET)
    public String querydata(HttpSession session, Model model, HttpServletRequest request){
        List<sensordata> sensordata = sensordataqueryService.sensordataquery((Integer)session.getAttribute("uid"));
        model.addAttribute("sensordata",sensordata);

        return "success";
    }

}
