package org.opendatakit.submit.exceptions;

/**
 * MessageException
 * Thrown when destination URI
 * or phone number is not accessible or
 * message String is too long. 
 * @author mvigil
 *
 */
public class MessageException extends Exception{
	public MessageException() { super(); }
	public MessageException(String message) { super(message); }
	public MessageException(Throwable cause) { super(cause); }
	public MessageException(String message, Throwable cause) { super(message, cause); }
}
