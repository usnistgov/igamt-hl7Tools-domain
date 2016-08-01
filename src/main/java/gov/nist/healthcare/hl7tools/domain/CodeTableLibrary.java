package gov.nist.healthcare.hl7tools.domain;

import java.util.HashMap;
import java.util.Map;

public class CodeTableLibrary extends HashMap<String, CodeTable> {

	private String id;

	private static final long serialVersionUID = -8213576608898397926L;

	public CodeTableLibrary() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public CodeTable put(String key, CodeTable value) {
		super.put(value.getKey(), value);
		return value;
//		throw new UnsupportedOperationException(
//				"This method is not supported. "
//						+ "You can instead use CodeTableLibrary.put( CodeTable codeTable )");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.HashMap#putAll(java.util.Map)
	 */
	@Override
	public void putAll(Map<? extends String, ? extends CodeTable> m) {
		throw new UnsupportedOperationException(
				"This method is not supported. "
						+ "You can instead use CodeTableLibrary.put( CodeTable codeTable )");
	}

	/**
	 * Add the code table to this library
	 * 
	 * @param codeTable
	 *            - the code table to be added
	 * @throws Exception
	 *             if the library already contains a code table with the same
	 *             key.
	 */
	public void put(CodeTable codeTable) throws Exception {
		if (codeTable == null)
			throw new IllegalArgumentException("The code table is null.");
		if (codeTable.getKey() == null || codeTable.getKey().isEmpty())
			throw new IllegalArgumentException(
					"The code table key is null or empty.");
		if (this.containsKey(codeTable.getKey()))
			throw new Exception(
					"The code table key must be unique within the code table library."
							+ "This library already contains a code table with this key '"
							+ codeTable.getKey() + "'");
		super.put(codeTable.getKey(), codeTable);
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
