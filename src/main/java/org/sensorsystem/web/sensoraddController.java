package org.sensorsystem.web;

import org.sensorsystem.entity.unitconversion;
import org.sensorsystem.service.addsensorService;
import org.sensorsystem.service.unitqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by chen on 2017/3/27.
 */
@Controller
@RequestMapping("/sensor")
public class sensoraddController {

    @Autowired
    private addsensorService addsensorService;


    @Autowired
    private org.sensorsystem.service.unitqueryService unitqueryService;

    @RequestMapping(value = "/addsensor", method = RequestMethod.POST)
    public String addsensor(@RequestParam("sid") int sid,
                            @RequestParam("sname") String sname,
                          @RequestParam("nickname") String nickname,
                          @RequestParam("manufacturer") String manufacturer,
                          @RequestParam("area") String area,
                          @RequestParam("partnumber") String partnumber,
                            @RequestParam("groupname") String groupname,
                            @RequestParam("unit") String unit,
                            HttpSession session){

        System.out.println(sname + " " + nickname);
        int userId = (Integer)session.getAttribute("uid");
        addsensorService.addsensor(sid,userId,sname,nickname,manufacturer,area,partnumber,groupname,unit);

        return "redirect:/sensor/sensorquery";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String queryunit(Model model){

        List<unitconversion> unit = unitqueryService.unitquery();
        model.addAttribute("unit",unit);
        return "addsensor";
    }


}
