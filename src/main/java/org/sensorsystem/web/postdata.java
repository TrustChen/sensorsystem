package org.sensorsystem.web;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.sensorsystem.entity.sensordata;


import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by chen on 2017/4/11.
 */
public class postdata {

    public void postdataToServer(){

        Thread th = new Thread(new Runnable() {
            public void run() {

                try{
                    for(int i = 0; i < 11;i++) {

                        Thread.sleep(2000);

                        String url = "http://localhost:8080/sensor/sensordata/addsensordata";
                        sensordata sensordata = new sensordata();
                        sensordata.setName("传感器1");
                        sensordata.setSid(1001);
                        sensordata.setUnit("摄氏度");

                        //生成随机数
                        double max = 30.0;
                        double min = 10.0;
                        double num = min + ((max - min) * new Random().nextDouble());

                        sensordata.setData(num);

                        //获得当前系统时间
                        Calendar c = Calendar.getInstance();
                        Date nowTime = c.getTime();
                        sensordata.setDate(nowTime);

                        Date date = new Date();
                        DateFormat format = new SimpleDateFormat("HH:mm:ss");
                        String time = format.format(date);
                        sensordata.setTime(Time.valueOf(time));

                        HttpParams httpParams = new BasicHttpParams();
                        httpParams.setParameter("charset", "UTF-8");
                        DefaultHttpClient httpClient = new DefaultHttpClient(httpParams);


                        HttpPost httpPost = new HttpPost(url);

                        httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json;charset=utf-8");

                        String jsonstr = JSON.toJSONString(sensordata);

                        System.out.println(jsonstr);

                        StringEntity se = new StringEntity(jsonstr, "UTF-8");
                        se.setContentType("text/json;charset=UTF-8");
                        se.setContentEncoding("UTF-8");
                        //se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
                        httpPost.setEntity(se);

                        HttpResponse response = httpClient.execute(httpPost);


//                        //输出调用结果
//                        if (response != null && response.getStatusLine().getStatusCode() == 200) {
//                            String result = EntityUtils.toString(response.getEntity());
//                            // 生成 JSON 对象
//                            JSONObject obj = JSONObject.parseObject(result);
//
//                            String errorcode = obj.getString("errorcode");
//
//                            if ("000".equals(errorcode)) {
//                                System.out.println("addHkfishOrder_request_success");
//                            }
//                        }
                    }

                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }

            }
        });

        th.start();


    }

}
