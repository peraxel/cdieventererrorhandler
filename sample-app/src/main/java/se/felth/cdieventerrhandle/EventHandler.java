package se.felth.cdieventerrhandle;

import se.felth.cdieventerrorhandler.LogCdiEventExceptions;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.ObservesAsync;

@ApplicationScoped
public class EventHandler {
	private static final Logger log = Logger.getLogger(EventHandler.class.getName());
	
	@LogCdiEventExceptions
	public void handle(@ObservesAsync SomeEvent evt) {
		log.info(evt.getText());
		
		throw new RuntimeException("test");
	}

}
