package org.sensorsystem.web;

import org.sensorsystem.service.addmatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chen on 2017/3/29.
 */
@Controller
@RequestMapping("/match")
public class addmatchController {

    @Autowired
    private addmatchService addmatchService;

    @Transactional
    @RequestMapping(value = "/addmatch",method = RequestMethod.POST)
    public String addmatch(@RequestParam("uid")int uid, @RequestParam("sid")int sid){

        addmatchService.insertmatch(uid,sid);

        return "sensor";
    }

}
