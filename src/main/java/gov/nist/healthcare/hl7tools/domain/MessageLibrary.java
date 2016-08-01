package gov.nist.healthcare.hl7tools.domain;

import java.util.HashMap;

public class MessageLibrary extends HashMap<String, Message> {

	private String id;

	private static final long serialVersionUID = 1501440922010121746L;

	public MessageLibrary() {
		super();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Add the message to this library
	 * 
	 * @param message
	 *            - the message to be added
	 * @throws Exception
	 *             if the library already contains a message with the same key.
	 */
	public void put(Message message) throws Exception {
		if (message == null)
			throw new IllegalArgumentException("The message is null.");
		if (message.getKey() == null || message.getKey().isEmpty())
			throw new IllegalArgumentException(
					"The message key is null or empty.");
		if (this.containsKey(message.getKey()))
			throw new Exception(
					"The message key must be unique within the message library."
							+ "This library already contains a message with this key '"
							+ message.getKey() + "'");
		super.put(message.getKey(), message);
	}

}
