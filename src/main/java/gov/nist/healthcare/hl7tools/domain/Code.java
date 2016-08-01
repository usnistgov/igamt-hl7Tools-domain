package gov.nist.healthcare.hl7tools.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Code implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 351991331663539227L;
	private String value;
	private String description;
	private Usage usage; // FIXME We will need to review allowed usage value in
							// this case
	private String comment;

	private CodeSystem codeSystem;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the usage
	 */
	public Usage getUsage() {
		return usage;
	}

	/**
	 * @param usage
	 *            the usage to set
	 */
	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the codeSystem
	 */
	public CodeSystem getCodeSystem() {
		return codeSystem;
	}

	/**
	 * @param codeSystem
	 *            the codeSystem to set
	 */
	public void setCodeSystem(CodeSystem codeSystem) {
		this.codeSystem = codeSystem;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("Code [value=%s, description=%s, usage=%s, comment=%s, codeSystem=%s]",
						value, description, usage, comment,
						codeSystem != null ? codeSystem.getName() : "");
	}
}
