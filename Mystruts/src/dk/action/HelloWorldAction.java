package dk.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public  static int count = 0;
	@Override
	public String execute() throws Exception {
		System.out.println("执行开始！！！");
		count++;
		System.out.println("This is "+count+" time action request!!!");
		return SUCCESS;
	}
	
	public String add(){
		System.out.println("执行开始！！！");
		count++;
		System.out.println("This is "+count+" time action request!!!");
		return SUCCESS;
	}
	public String update(){
		System.out.println("执行开始！！！");
		count++;
		System.out.println("This is "+count+" time action request!!!");
		return SUCCESS;
	}

}
