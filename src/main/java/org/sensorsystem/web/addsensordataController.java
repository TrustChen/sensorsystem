package org.sensorsystem.web;





import com.alibaba.fastjson.JSONObject;
import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.addSensordataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.sql.Time;

/**
 * Created by chen on 2017/4/11.
 */
@Controller
@RequestMapping("/sensordata")
public class addsensordataController {

    @Autowired
    private addSensordataService addSensordataService;

    @Transactional
    @RequestMapping(value = "/addsensordata")
    public void acceptData(HttpServletResponse response, HttpServletRequest request) throws IOException{


        //post方式传递读取字符流
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
        String jsonStr = null;
        StringBuilder result = new StringBuilder();

        try{
            //读取所有的字符流
            while ((jsonStr = reader.readLine()) != null) {
                result.append(jsonStr);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        reader.close();// 关闭输入流

        System.out.println(result.toString());
        // 取一个json转换为对象
        JSONObject jsonObject = JSONObject.parseObject(result.toString());


        //通过键取到值，再将值封装到类里面
        sensordata sensordata = new sensordata();
        sensordata.setName(jsonObject.getString("name"));
        sensordata.setDate(new Date(jsonObject.getLong("date")));
        //sensordata.setTime(new Time(Integer.parseInt(jsonObject.getString("time"))));
        sensordata.setTime(new Time(jsonObject.getLong("time")));
        sensordata.setData(Double.valueOf(jsonObject.getString("data")));
        sensordata.setUnit(jsonObject.getString("unit"));
        sensordata.setSid(Integer.parseInt(jsonObject.getString("sid")));

        System.out.println(sensordata.getName());
        addSensordataService.addSensordata(sensordata.getName(),
                sensordata.getDate(),
                sensordata.getTime(),
                sensordata.getData(),
                sensordata.getUnit(),
                sensordata.getSid());
    }

}
