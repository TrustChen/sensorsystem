package org.sensorsystem.web;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.sensorsystem.entity.sensordata;

import java.sql.Time;
import java.util.Date;

/**
 * Created by chen on 2017/4/11.
 */
public class postdata {

    public void postdataToServer(){

        try{

            String url = "http://localhost:8080/sensor/sensordata/addsensordata";
            sensordata sensordata = new sensordata();
            sensordata.setName("传感器1");
            sensordata.setSid(1001);
            sensordata.setUnit("摄氏度");
            sensordata.setData(6.666);

            sensordata.setDate(new Date(20170412));

            sensordata.setTime(new Time(104415));


            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);

            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");

            String jsonstr = JSON.toJSONString(sensordata);

            StringEntity se = new StringEntity(jsonstr);
            se.setContentType("text/json");
            se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
            httpPost.setEntity(se);
            HttpResponse response=httpClient.execute(httpPost);

            //输出调用结果
            if(response != null && response.getStatusLine().getStatusCode() == 200) {
                String result= EntityUtils.toString(response.getEntity());
                // 生成 JSON 对象
                JSONObject obj = JSONObject.parseObject(result);

                String errorcode = obj.getString("errorcode");

                if("000".equals(errorcode)) {
                    System.out.println("addHkfishOrder_request_success");
                }
            }


        }catch (Exception e){
            System.out.println("gg");
        }

    }

}
