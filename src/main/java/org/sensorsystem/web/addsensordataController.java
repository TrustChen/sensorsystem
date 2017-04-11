package org.sensorsystem.web;




import net.sf.json.JSONObject;
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
import java.sql.Date;
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

        //TODO
        //接收post过来的数据
        request.setCharacterEncoding("UTF-8");

        //post方式传递读取字符流
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
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

        // 取一个json转换为对象
        JSONObject jsonObject = JSONObject.fromObject(result);

        String name = jsonObject.getString("name");
        Date date=new Date(jsonObject.getLong("date"));
        Time time = new Time(jsonObject.getLong("time"));
        int data = jsonObject.getInt("data");
        String unit = jsonObject.getString("unit");
        int sid = jsonObject.getInt("sid");

        addSensordataService.addSensordata(name,date,time,data,unit,sid);
    }

}
