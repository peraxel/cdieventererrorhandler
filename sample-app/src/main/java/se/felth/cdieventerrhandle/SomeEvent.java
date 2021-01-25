package se.felth.cdieventerrhandle;

import javax.enterprise.context.Dependent;

/**
 *
 * @author pa
 */
public class SomeEvent {
	String text;

	public SomeEvent() {
	}

	public SomeEvent(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	
	
}
