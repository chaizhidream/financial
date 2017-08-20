package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;  
import java.net.URLConnection;  
 
/**
 * Servlet implementation class JsonDate
 */

public class JsonDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//外接口路径  
		
		String number=request.getParameter("stock");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
        String urlStr="http://hq.sinajs.cn/list=sh"+number;                          
        //链接URL  
        URL url=new URL(urlStr);  
        //返回结果集  
        StringBuffer document = new StringBuffer();  
        //创建链接  
       URLConnection conn = url.openConnection();  
       //读取返回结果集  
       BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));  
       String line = null;  
       while ((line = reader.readLine()) != null){  
             document.append(line);  
       }     
           reader.close();  
       System.out.println(document);    
       String docu=document.toString().substring(29);
       System.out.println(docu);
       
       
       OutputStream os=response.getOutputStream();  
           os.write(docu.getBytes());  
     
       os.flush();
       os.close();
       String s[]=docu.split(",");
       int i=0;
       System.out.println("今日开盘价"+s[i++]);
       System.out.println("昨日收盘价"+s[i++]);
       System.out.println("当前价格"+s[i++]);
       System.out.println("今日最高价"+s[i++]);
       System.out.println("今日最低价"+s[i++]);
       System.out.println("竞买价，即“买一”报价"+s[i++]);
       System.out.println("竞卖价，即“卖一”报价"+s[i++]);
       System.out.println("成交的股票数"+s[i++]);
       System.out.println("成交金额，单位为“元”"+s[i++]);
       
       System.out.println("“买一”申请股票数量"+s[i++]);
       System.out.println("“买一”报价"+s[i++]);
    
       
       System.out.println("“买二”申请股票数量"+s[i++]);
       System.out.println("“买二”报价"+s[i++]);
       
       System.out.println("“买三”申请股票数量"+s[i++]);
       System.out.println("“买三”报价"+s[i++]);
       
       System.out.println("“买四”申请股票数量"+s[i++]);
       System.out.println("“买四”报价"+s[i++]);
       
       System.out.println("“买五”申请股票数量"+s[i++]);
       System.out.println("“买五”报价"+s[i++]);
       
       System.out.println("“卖一”申请股票数量"+s[i++]);
       System.out.println("“卖一”报价"+s[i++]);
    
       
       System.out.println("“卖二”申请股票数量"+s[i++]);
       System.out.println("“卖二”报价"+s[i++]);
       
       System.out.println("“卖三”申请股票数量"+s[i++]);
       System.out.println("“卖三”报价"+s[i++]);
       
       System.out.println("“卖四”申请股票数量"+s[i++]);
       System.out.println("“卖四”报价"+s[i++]);
       
       System.out.println("“卖五”申请股票数量"+s[i++]);
       System.out.println("“卖五”报价"+s[i++]);
       
       System.out.println("日期"+s[i++]);
       System.out.println("时间"+s[i++]);
       
     //  JSONObject json =JSONObject.fromObject(document.toString().substring(19));  
       //查看json格式  
      // System.out.println(json.toString());  
       //获取json中某个对象  
   //    JSONObject obj = (JSONObject) json.get("weatherinfo");  
   //    System.out.println(obj.toString());  
       //获取对象中某个属性的值  
      // String val = obj.getString("city");  
    //   System.out.println(val);  
     //  request.getSession().setAttribute("test",json.toString());
       
    //   JSONObject object=new JSONObject();
      // object.put(key, value)
       
      // request.getRequestDispatcher("index.jsp").forward(request, response);
   }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
