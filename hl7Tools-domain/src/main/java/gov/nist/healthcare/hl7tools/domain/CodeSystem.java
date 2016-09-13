package gov.nist.healthcare.hl7tools.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class CodeSystem extends CodeTable {

	private static final long serialVersionUID = -7966993710754021716L;
	private List<Code> codes;
	private String comment;

	/**
	 * @return the codes
	 */
	@Override
	public List<Code> getCodes() {
		return codes;
	}

	/**
	 * @param codes
	 *            the codes to set
	 */
	public void setCodes(List<Code> codes) {
		this.codes = codes;
	}

	@Override
	public String getComment() {
		return comment;
	}

	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("CodeSystem [name=%s, description=%s, oid=%s, version=%s, comment=%s]",
						getName(), getDescription(), getOid(), getVersion(),
						comment);
	}
}
