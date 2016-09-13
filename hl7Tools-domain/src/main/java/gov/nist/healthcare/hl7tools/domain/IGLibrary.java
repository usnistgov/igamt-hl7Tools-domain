package gov.nist.healthcare.hl7tools.domain;

import java.io.Serializable;

public class IGLibrary implements Serializable {

	private static final long serialVersionUID = -1952721972788899557L;
	private final CodeTableLibrary codeTableLibrary;
	private final DatatypeLibrary datatypeLibrary;
	private final SegmentLibrary segmentLibrary;
	private final MessageLibrary messageLibrary;

	public IGLibrary(CodeTableLibrary codeTableLibrary,
			DatatypeLibrary datatypeLibrary, SegmentLibrary segmentLibrary,
			MessageLibrary messLibrary) {
		this.codeTableLibrary = codeTableLibrary;
		this.datatypeLibrary = datatypeLibrary;
		this.segmentLibrary = segmentLibrary;
		this.messageLibrary = messLibrary;
	}

	/**
	 * @return the codeTableLibrary
	 */
	public CodeTableLibrary getCodeTableLibrary() {
		return codeTableLibrary;
	}

	/**
	 * @return the datatypeLibrary
	 */
	public DatatypeLibrary getDatatypeLibrary() {
		return datatypeLibrary;
	}

	/**
	 * @return the segmentLibrary
	 */
	public SegmentLibrary getSegmentLibrary() {
		return segmentLibrary;
	}

	/**
	 * @return the messageLibrary
	 */
	public MessageLibrary getMessageLibrary() {
		return messageLibrary;
	}
}
