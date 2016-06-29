package dk.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dk.entity.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>,SessionAware{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private Map<String,Object> session;
	
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}


	public String login(){
		session.put("test", "test");
		if(user.getUsername()==null||" ".equals(user.getUsername())){
			this.addFieldError("username", "UserName can not be null!!");
			return INPUT;
		}else{
			System.out.println(user.getUsername());

			if(user.getUsername().equals("admin")){
				session.put("logininfo", true);
			}else{
				session.put("loginError", "username is not right!");
				this.addFieldError("username", "username is not right!");
				return ERROR;
			}
		}
		System.out.println(user.getUsername());
		/*System.out.println(user.getBooklist().get(0));
		System.out.println(user.getBooklist().get(1));*/
		return SUCCESS;
	}


	@Override
	public User getModel() {
		return user;
	}


	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	/*@Override
	public void validate() {
		if(user.getUsername()==null||" ".equals(user.getUsername())){
			this.addFieldError("username", "UserName can not be null!!");
		}
	}*/


	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	
	

}
