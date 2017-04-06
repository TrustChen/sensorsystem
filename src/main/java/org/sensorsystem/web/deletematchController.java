package org.sensorsystem.web;

import org.sensorsystem.service.deletematchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by chen on 2017/3/29.
 */
@Controller
@RequestMapping("/match")
public class deletematchController {

    @Autowired
    private deletematchService deletematchService;

    @RequestMapping(value = "/deletematch", method = RequestMethod.GET)
    public String deletematch(@RequestParam("sid")int sid, HttpSession session){

        int uid = (Integer)session.getAttribute("uid");
        deletematchService.deletematch(uid,sid);

        return "success";

    }
}
