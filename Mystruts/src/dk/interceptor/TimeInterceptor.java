package dk.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimeInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long start = System.currentTimeMillis();
		String result = invocation.invoke();
		long end  = System.currentTimeMillis();
		long time = end -start;
		System.out.println("Action excute time is :"+time+"ms");
		return result;
	}

}
