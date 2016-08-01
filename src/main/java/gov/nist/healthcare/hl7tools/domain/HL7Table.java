package gov.nist.healthcare.hl7tools.domain;

public class HL7Table extends CodeSystem {

	private static final long serialVersionUID = 7541913675642240052L;
	private String type;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HL7Table [type=" + type + ", getComment()=" + getComment()  + ", getKey()=" + getKey() + ", getName()="
				+ getName() + ", getDescription()=" + getDescription()
				+ ", getOid()=" + getOid() + ", getVersion()=" + getVersion()
				+ ", getId()=" + getId() + "]";
	}
}
