package org.sensorsystem.web;

import org.sensorsystem.service.addsensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chen on 2017/3/27.
 */
@Controller
@RequestMapping("/sensor")
public class sensoraddController {

    @Autowired
    private addsensorService addsensorService;


    @RequestMapping(value = "/addsensor", method = RequestMethod.POST)
    public String addsensor(@RequestParam("sname") String sname,
                          @RequestParam("nickname") String nickname,
                          @RequestParam("manufacturer") String manufacturer,
                          @RequestParam("area") String area,
                          @RequestParam("partnumber") String partnumber){

        System.out.println(sname + " " + nickname);
        addsensorService.addsensor(sname,nickname,manufacturer,area,partnumber);
        return "redirect:/sensor/sensorquery";
    }


}
