package org.sensorsystem.web;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.sensorsystem.entity.sensordata;

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

            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);

            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");

            JSONObject jsonObject = JSONObject.fromJSONObject(sensordata);


        }catch (Exception e){
            System.out.println("gg");
        }

    }

}
