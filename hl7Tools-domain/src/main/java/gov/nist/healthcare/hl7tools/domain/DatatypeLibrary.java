package gov.nist.healthcare.hl7tools.domain;

import java.util.HashMap;

public class DatatypeLibrary extends HashMap<String, Datatype> {

	private static final long serialVersionUID = -5081330131872363623L;

	private String id;

	public DatatypeLibrary() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 */
	/*
	 * @Override public Datatype put(String key, Datatype value) { throw new
	 * UnsupportedOperationException( "This method is not supported. " +
	 * "You can instead use DatatypeLibrary.put( Datatype datatype )"); }
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.HashMap#putAll(java.util.Map)
	 */
	/*
	 * @Override public void putAll(Map<? extends String, ? extends Datatype> m)
	 * { throw new UnsupportedOperationException(
	 * "This method is not supported. " +
	 * "You can instead use DatatypeLibrary.put( Datatype datatype )"); }
	 */
	/**
	 * Add the data type to this library
	 * 
	 * @param datatype
	 *            - the data type to be added
	 * @throws Exception
	 *             if the library already contains a data type with the same
	 *             key.
	 */
	public void put(Datatype datatype) throws Exception {
		if (datatype == null)
			throw new IllegalArgumentException("The datatype is null.");
		if (datatype.getName() == null || datatype.getName().isEmpty())
			throw new IllegalArgumentException(
					"The datatype key is null or empty.");
		if (this.containsKey(datatype.getName()))
			throw new Exception(
					"The datatype key must be unique within the datatype library."
							+ "This library already contains a datatype with this key '"
							+ datatype.getName() + "'");
		super.put(datatype.getName(), datatype);
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

}
