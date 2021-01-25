package se.felth.cdieventerrorhandler;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@LogCdiEventExceptions
@Interceptor
@Priority(Interceptor.Priority.LIBRARY_BEFORE)
public class CdiEventExceptionLogger {

	private static final Logger log = Logger.getLogger(CdiEventExceptionLogger.class.getName());
	
	@AroundInvoke 
	public Object handle(InvocationContext ctx) throws Exception {
		try {
			return ctx.proceed();
		} catch(Exception e) {
			log.log(Level.SEVERE, "Exception thrown, caught by interceptor", e);
			throw e;
		}
	}
}
