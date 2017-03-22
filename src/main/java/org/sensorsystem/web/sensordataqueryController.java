package org.sensorsystem.web;

import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.sensordataqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by chen on 2017/3/22.
 */

@Controller
@RequestMapping("/sensor")
public class sensordataqueryController {

    @Autowired
    sensordataqueryService sensordataqueryService;

    @RequestMapping(value = "/dataquery", method = RequestMethod.GET)
    public String querydata(@RequestParam("id") int id){

        List<sensordata> sensordata = sensordataqueryService.sensordataquery(id);
        return "success";

    }

}
