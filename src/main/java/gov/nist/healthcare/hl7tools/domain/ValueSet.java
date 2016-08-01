package gov.nist.healthcare.hl7tools.domain;

import java.util.List;

public class ValueSet extends CodeTable {

	private static final long serialVersionUID = -847471711493464163L;
	private List<Code> codes;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"ValueSet [name=%s, description=%s, oid=%s, version=%s]",
				getName(), getDescription(), getOid(), getVersion());
	}
}
