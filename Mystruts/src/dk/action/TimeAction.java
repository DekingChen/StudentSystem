package dk.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		for(int i=0;i<10000;i++){
			System.out.println(i);
		}
		return SUCCESS;
	}

}
