package org.sensorsystem.web;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import net.sf.json.JSONArray;
import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.sensordataqueryChartService;
import org.sensorsystem.service.sensordataqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Created by chen on 2017/4/9.
 */
@Controller
@RequestMapping("/sensor")
public class sensordataquerychartController {

    @Autowired
    private sensordataqueryService sensordataqueryService;

    @RequestMapping(value = "/dataquerychart", method = RequestMethod.GET)
    public String querydata(@RequestParam("sid") int sid, HttpSession session, Model model, HttpServletRequest request){
        /*List<sensordata> sensordata = sensordataqueryService.sensordataquery((Integer)session.getAttribute("uid"),sid);
        model.addAttribute("sensordatachart",sensordata);*/

        List<sensordata> sensordatas = sensordataqueryService.sensordataquery((Integer)session.getAttribute("uid"),sid);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyMMdd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
        Collections.sort(sensordatas, new Comparator<sensordata>(){
            public int compare(sensordata o1, sensordata o2) {
                if(o1.getTime().after(o2.getTime())){
                    return 1;
                }
                if(o1.getTime().equals(o2.getTime())){
                    return 0;
                }
                return -1;
            }
        });

        StringBuilder sb = new StringBuilder("[{temps:[");
        for(sensordata data : sensordatas){
            sb.append("['"
                    //+dateFormat.format(data.getDate())
                    +timeFormat.format(data.getTime())
                    +"',"
                    +data.getData()
                    +"],");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]}]");
        System.out.println(sb.toString());
        model.addAttribute("sensordatachart",sb.toString());
//        JSONArray jsonArray = JSONArray.fromObject( sensordatas );

        return "chart";
    }

}
