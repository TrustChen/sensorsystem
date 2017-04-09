package org.sensorsystem.web;

import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.sensordataqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by chen on 2017/4/9.
 */
@Controller
@RequestMapping("/sensor")
public class sensordataquerychartController {

    @Autowired
    private org.sensorsystem.service.sensordataqueryService sensordataqueryService;

    @RequestMapping(value = "/dataquerychart", method = RequestMethod.GET)
    public String querydata(@RequestParam("sid") int sid, HttpSession session, Model model, HttpServletRequest request){
        List<sensordata> sensordata = sensordataqueryService.sensordataquery((Integer)session.getAttribute("uid"),sid);
        model.addAttribute("sensordata",sensordata);

        return "chart";
    }

}
