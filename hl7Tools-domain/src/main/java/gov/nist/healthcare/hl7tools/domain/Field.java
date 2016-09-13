package gov.nist.healthcare.hl7tools.domain;

import java.io.Serializable;
import java.util.List;

public class Field implements Serializable {

	private static final long serialVersionUID = 3482665145778036038L;
	private String id;
	private String itemNo;
	private int position;
	private String description;
	private Usage usage;
	private int minLength = -1;
	private String maxLength;
	private int confLength = -1;
	private EBoolean truncationAllowed = EBoolean.NA;
	private int min;
	private String max;
	private Datatype datatype;
	private CodeTable codeTable;
	private String comment;
	private Predicate predicate;
	private List<ConformanceStatement> conformanceStatementList;

	/**
	 * @return the itemNo
	 */
	public String getItemNo() {
		return itemNo;
	}

	/**
	 * @param itemNo
	 *            the itemNo to set
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
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
	 * @return the minLength
	 */
	public int getMinLength() {
		return minLength;
	}

	/**
	 * @param minLength
	 *            the minLength to set
	 */
	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	/**
	 * @return the maxLength
	 */
	public String getMaxLength() {
		return maxLength;
	}

	/**
	 * @param maxLength
	 *            the maxLength to set
	 */
	public void setMaxLength(String maxLength) {
		this.maxLength = maxLength;
	}

	/**
	 * @return the confLength
	 */
	public int getConfLength() {
		return confLength;
	}

	/**
	 * @param confLength
	 *            the confLength to set
	 */
	public void setConfLength(int confLength) {
		this.confLength = confLength;
	}

	/**
	 * @return the truncationAllowed
	 */
	public EBoolean getTruncationAllowed() {
		return truncationAllowed;
	}

	/**
	 * @param truncationAllowed
	 *            the truncationAllowed to set
	 */
	public void setTruncationAllowed(EBoolean truncationAllowed) {
		this.truncationAllowed = truncationAllowed;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min
	 *            the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public String getMax() {
		return max;
	}

	/**
	 * @param max
	 *            the max to set
	 */
	public void setMax(String max) {
		this.max = max;
	}

	/**
	 * @return the datatype
	 */
	public Datatype getDatatype() {
		return datatype;
	}

	/**
	 * @param datatype
	 *            the datatype to set
	 */
	public void setDatatype(Datatype datatype) {
		this.datatype = datatype;
	}

	/**
	 * @return the codeTable
	 */
	public CodeTable getCodeTable() {
		return codeTable;
	}

	/**
	 * @param codeTable
	 *            the codeTable to set
	 */
	public void setCodeTable(CodeTable codeTable) {
		this.codeTable = codeTable;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the predicate
	 */
	public Predicate getPredicate() {
		return predicate;
	}

	/**
	 * @param predicate
	 *            the predicate to set
	 */
	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}

	/**
	 * @return the conformanceStatementList
	 */
	public List<ConformanceStatement> getConformanceStatementList() {
		return conformanceStatementList;
	}

	/**
	 * @param conformanceStatementList
	 *            the conformanceStatementList to set
	 */
	public void setConformanceStatementList(
			List<ConformanceStatement> conformanceStatementList) {
		this.conformanceStatementList = conformanceStatementList;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("Field [itemNo=%s, position=%s, description=%s, usage=%s, minLength=%s, maxLength=%s, "
						+ "confLength=%s, truncationAllowed=%s, min=%s, max=%s, datatype=%s, codeTable=%s, comment=%s]",
						itemNo, position, description, usage, minLength,
						maxLength, confLength, truncationAllowed, min, max,
						datatype, codeTable, comment);
	}
}
