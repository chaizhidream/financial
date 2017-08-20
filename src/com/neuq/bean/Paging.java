package com.neuq.bean;

public class Paging {        //页数类   
	//属性
		private int totalRow;//数据库中一共有多少行 
		//private int totalRow1;
		private int showNum;//每页显示的数量 
		//private int showNum1;
		private int totalPage;//一共有多少页
		//private int totalPage1;
		private int reqPage;//当前请求的页 
		//private int reqPage1;
		private int start;//每页开始的位置
		//private int start1;
		private int end;//每页结束的位置
		//private int end1;
		private int next;//下一页
		//private int next1;
		private int previous;//上一页
		//private int previous1;
		
		public Paging(){
			
		}
		
		public Paging(int totalRow,int showNum){   //计算总页数
			this.totalRow=totalRow;
			this.showNum=showNum;
			if(this.totalRow%this.showNum==0)
				this.totalPage=this.totalRow/this.showNum;
			else
				this.totalPage=this.totalRow/this.showNum+1;
		}
		
		//进行分页
		public void doPaging(int reqP){        //dopaging方法 计算start和end的值
			this.reqPage=reqP;
			this.start=(this.reqPage-1)*this.showNum+1;
			this.end=this.reqPage*this.showNum;
		}
		     
		
		/**
				public void doPaging1(int reqP){
					this.reqPage=reqP;
					this.start1=(this.reqPage-1)*this.showNum+1;
					this.end1=this.reqPage*this.showNum;
				}
				*/
		

		public int getTotalRow() {
			return totalRow;
		}

		public int getShowNum() {
			return showNum;
		}

		public int getTotalPage() {
			return totalPage;
		}

		public int getReqPage() {
			return reqPage;
		}

		public int getStart() {
			return start;
		}

		public int getEnd() {
			return end;
		}
		
		/**
		public int getStart1() {
			return start1;
		}

		public int getEnd1() {
			return end1;
		}
		*/

		//获取下一页
		public int getNext() {
			if(this.reqPage==this.totalPage)
				this.next=this.totalPage;
			else
				this.next=this.reqPage+1;
			return next;
		}

		//获取上一页
		public int getPrevious() {
			if(this.reqPage==1)
				this.previous=1;
			else
				this.previous=this.reqPage-1;
			return previous;
		}
		
		

	}

