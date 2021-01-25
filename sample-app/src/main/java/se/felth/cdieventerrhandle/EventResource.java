package se.felth.cdieventerrhandle;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author pa
 */
@Path("event")
public class EventResource {
	@Inject
	Event<SomeEvent> evt;
	
	@POST
    @Consumes(MediaType.TEXT_PLAIN)
	public void putText(String content) {
		evt.fireAsync(new SomeEvent(content));
	}
}
