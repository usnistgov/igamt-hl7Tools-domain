package gov.nist.healthcare.hl7tools.domain;

import java.util.HashMap;

public class SegmentLibrary extends HashMap<String, Segment> {

	private static final long serialVersionUID = -3216900240325423925L;

	private String id;

	public SegmentLibrary() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 * 
	 * @Override public Segment put(String key, Segment value) { throw new
	 * UnsupportedOperationException("This method is not supported. " +
	 * "You can instead use SegmentLibrary.put( Segment segment )"); }
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.HashMap#putAll(java.util.Map)
	 * 
	 * @Override public void putAll(Map<? extends String, ? extends Segment> m)
	 * { throw new
	 * UnsupportedOperationException("This method is not supported. " +
	 * "You can instead use SegmentLibrary.put( Segment segment )"); }
	 */

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
	 * Add the segment to this library
	 * 
	 * @param segment
	 *            - the segment to be added
	 * @throws Exception
	 *             if the library already contains a segment with the same key.
	 */
	public void put(Segment segment) throws Exception {
		if (segment == null)
			throw new IllegalArgumentException("The segment is null.");
		if (segment.getKey() == null || segment.getKey().isEmpty())
			throw new IllegalArgumentException(
					"The segment key is null or empty.");
		if (this.containsKey(segment.getKey()))
			throw new Exception(
					"The segment key must be unique within the segment library."
							+ "This library already contains a segment with this key '"
							+ segment.getKey() + "'");
		super.put(segment.getKey(), segment);
	}

}
