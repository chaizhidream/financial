package com.neuq.bean;     
/**    
* 发送邮件需要使用的基本信息  
 根据需要修改
*/      
import java.util.Properties;      
public class MailSenderInfo {      
    // 发送邮件的服务器的IP和端口      
    private String mailServerHost;      
    private String mailServerPort = "25";      
    // 邮件发送者的地址      
    private String fromAddress;      
    // 邮件接收者的地址      
    private String toAddress;      
    // 登陆邮件发送服务器的用户名和密码      
    private String userName;      
    private String password;      
    // 是否需要身份验证      
    private boolean validate = false;      
    // 邮件主题      
    private String subject;      
    // 邮件的文本内容      
    private String content;      
    // 邮件附件的文件名      
    private String[] attachFileNames;        
    /**    
      * 获得邮件会话属性    
      */      
    public Properties getProperties(){      
      Properties p = new Properties();      
      p.put("mail.smtp.host", this.mailServerHost);      
      p.put("mail.smtp.port", this.mailServerPort);      
      p.put("mail.smtp.auth", validate ? "true" : "false");      
      return p;      
    }      
    
    /**
     * @param toAddress 
     * @param mailServerHost 邮箱服务器
     * @param mailServerPort 端口号
     * @param fromAddress 发件邮箱
     * @param toAddress 收件邮箱
     * @param content 
     * @param userName 用户名
     * @param password 邮箱授SMTP权码
     * @param validate 是否开启身份验证
     * @param subject 邮件标题
     * @param content 邮件内容
     * @param attachFileNames  邮件附件名
     */
    public MailSenderInfo(){
    	this.mailServerHost = "smtp.163.com";
		this.mailServerPort ="25";
		this.fromAddress ="chaizhi_dream@163.com";
	//	this.toAddress = toAddress;
		this.userName = "chaizhi_dream@163.com";
		this.password = "*********";
	    //这里填自己的授权码
		this.validate = true;
		this.subject = "重置密码申请";
	//	this.content = content;
		//this.attachFileNames = attachFileNames;
    
    }
    
    
    
    
    /**
 	 * @param toAddress 收件邮
 	 * @param content 邮件内容
 	 */
	public MailSenderInfo(String toAddress, String content) {
		super();
		this.mailServerHost = "smtp.163.com";
		this.mailServerPort ="25";
		this.fromAddress ="chaizhi_dream@163.com";
		this.toAddress = toAddress;
		this.userName = "chaizhi_dream@163.com";
		this.password = "*********";
	    //这里填自己的授权码
		this.validate = true;
		this.subject = "重置密码申请";
		this.content = content;
		//this.attachFileNames = attachFileNames;
	}





	public String getMailServerHost() {      
      return mailServerHost;      
    }      
    public void setMailServerHost(String mailServerHost) {      
      this.mailServerHost = mailServerHost;      
    }     
    public String getMailServerPort() {      
      return mailServerPort;      
    }     
    public void setMailServerPort(String mailServerPort) {      
      this.mailServerPort = mailServerPort;      
    }     
    public boolean isValidate() {      
      return validate;      
    }     
    public void setValidate(boolean validate) {      
      this.validate = validate;      
    }     
    public String[] getAttachFileNames() {      
      return attachFileNames;      
    }     
    public void setAttachFileNames(String[] fileNames) {      
      this.attachFileNames = fileNames;      
    }     
    public String getFromAddress() {      
      return fromAddress;      
    }      
    public void setFromAddress(String fromAddress) {      
      this.fromAddress = fromAddress;      
    }     
    public String getPassword() {      
      return password;      
    }     
    public void setPassword(String password) {      
      this.password = password;      
    }     
    public String getToAddress() {      
      return toAddress;      
    }      
    public void setToAddress(String toAddress) {      
      this.toAddress = toAddress;      
    }      
    public String getUserName() {      
      return userName;      
    }     
    public void setUserName(String userName) {      
      this.userName = userName;      
    }     
    public String getSubject() {      
      return subject;      
    }     
    public void setSubject(String subject) {      
      this.subject = subject;      
    }     
    public String getContent() {      
      return content;      
    }     
    public void setContent(String textContent) {      
      this.content = textContent;      
    }      
}   
