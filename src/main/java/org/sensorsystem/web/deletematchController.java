package org.sensorsystem.web;

import org.sensorsystem.service.deletematchService;
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
public class deletematchController {

    @Autowired
    private deletematchService deletematchService;

    @RequestMapping(value = "/deletematch", method = RequestMethod.POST)
    public String deletematch(@RequestParam("uid")int uid,@RequestParam("sid")int sid){

        deletematchService.deletematch(uid,sid);

        return "success";

    }
}
