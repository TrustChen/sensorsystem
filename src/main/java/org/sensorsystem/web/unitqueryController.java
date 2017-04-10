package org.sensorsystem.web;

import org.sensorsystem.entity.unitconversion;
import org.sensorsystem.service.unitqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by chen on 2017/4/10.
 */
@Controller
@RequestMapping("/unit")
public class unitqueryController {

    @Autowired
    private unitqueryService unitqueryService;

    @RequestMapping(value = "/unitquery", method = RequestMethod.GET)
    public String queryunit(Model model){

        List<unitconversion> unit = unitqueryService.unitquery();
        model.addAttribute("unit",unit);
        return "queryunit";
    }

}
