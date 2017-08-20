package com.neuq.util.mail;

import com.neuq.bean.MailSenderInfo;

public class SendMail {
    public static void sendMail(String username,String mail,String url){
    	  StringBuilder sb=new StringBuilder();
    	  sb.append(" <!DOCTYPE html>");
    	  sb.append(" <html>"); 
    	  sb.append(" <head>");
    	  sb.append(" <title>找回密码</title>");
    	  sb.append("  </head>");
    	  sb.append("<body>");
    	  sb.append("亲爱的用户"+username+"："+"</br>");
    	  sb.append("您在家庭理财管理系统上发起了重置密码请求"+"</br>");
    	  sb.append("请点击<a href="+'"'+url+'"'+"+>此处</a>重置密码");   	
    	  sb.append("或将以下链接复制到地址栏："+"</br>"); 
    	  sb.append(url);
    	  sb.append("</br>");
    	  sb.append("本邮件由系统自动发出，请勿回复本邮件。若非本人操作请忽略邮件内容。");
    	  sb.append("  </body>");
    	  sb.append(" </html> ");
    	 
        //这个类主要是设置邮件     
        MailSenderInfo mailInfo = new MailSenderInfo(mail, sb.toString());      
        
     //   mailInfo.setToAddress("liangjing_2018@163.com");      
    //    mailInfo.setSubject("这是一封来自系统的测试邮件");  
        
      
   //     sb.append("请点击<a href='www.baidu.com'>此处</a>重置密码");
       // mailInfo.setContent("设置邮箱内容");   
        mailInfo.setContent(sb.toString());   
        System.out.println(sb.toString());
           //这个类主要来发送邮件     
        SimpleMailSender sms = new SimpleMailSender();     
          //  sms.sendTextMail(mailInfo);//发送文体格式      
            sms.sendHtmlMail(mailInfo);//发送html格式     
    	
    	
    }
    
	
	
}
