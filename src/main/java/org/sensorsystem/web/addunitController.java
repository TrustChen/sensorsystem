package org.sensorsystem.web;

import org.sensorsystem.service.addunitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chen on 2017/3/29.
 */
@Controller
@RequestMapping("/unit")
public class addunitController {

    @Autowired
    private addunitService addunitService;

    @RequestMapping(value = "/addunit", method = RequestMethod.POST)
    public String addunit(@RequestParam("unit") String unit,
                          @RequestParam("rate") float rate,
                          @RequestParam("m") int m,
                          @RequestParam("kg") int kg,
                          @RequestParam("s") int s,
                          @RequestParam("a") int a,
                          @RequestParam("k") int k,
                          @RequestParam("mol") int mol,
                          @RequestParam("cd") int cd){

        addunitService.addunit(unit,rate,m,kg,s,a,k,mol,cd);

        return "addunit";

    }

}
