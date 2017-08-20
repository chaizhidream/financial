package com.neuq.bean;

public class Paging2 {
	
	//属性
	private int totalRow2;//数据库中一共有多少行
	

	private int showNum2;//每页显示的数量
	private int totalPage2;//一共有多少页
	private int reqPage2;//当前请求的页
	private int start2;//每页开始的位置
	private int end2;//每页结束的位置
	private int next2;//下一页
	private int previous2;//上一页
	
	public Paging2()
	{
		
	}
	
	public Paging2(int totalRow2,int showNum2)
	{
		this.totalRow2=totalRow2;
		this.showNum2=showNum2;
		if(this.totalRow2%this.showNum2==0)
		  this.totalPage2=this.totalRow2/this.showNum2;
		else
		  this.totalPage2=this.totalRow2/this.showNum2+1;
	}
	
	//进行分页
	public void doPaging2(int reqP2)  //reqp是传进来的值
	{
	  this.reqPage2=reqP2;
	  this.start2=(this.reqPage2-1)*this.showNum2+1;
	  this.end2=this.start2*this.showNum2;
	}
	
	
	public int getTotalRow2() {
		return totalRow2;
	}

	public int getShowNum2() {
		return showNum2;
	}

	public int getTotalPage2() {
		return totalPage2;
	}

	public int getReqPage2() {
		return reqPage2;
	}

	public int getStart2() {
		return start2;
	}

	public int getEnd2() {
		return end2;
	}

	//获取下一页
	public int getNext2() {
		if(this.reqPage2==this.totalPage2)
			this.next2=this.totalPage2;
		else
			this.next2=this.reqPage2+1;
		return next2;
	}
    //获取上一页
	public int getPrevious2() {
		if(this.reqPage2==1)
			this.previous2=1;
		else
			this.previous2=this.reqPage2-1;
		return previous2;
	}
	
	

}
