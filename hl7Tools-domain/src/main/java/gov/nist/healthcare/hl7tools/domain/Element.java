package gov.nist.healthcare.hl7tools.domain;

import java.io.Serializable;
import java.util.List;

public class Element implements Serializable {

	private static final long serialVersionUID = -4200366860544915503L;
	private String id;
	private int position;
	private String name;
	private Usage usage;
	private int min;
	private String max;
	private ElementType type;
	private Segment segment;
	private String comment;

	private List<Element> children;

	private Predicate predicate;
	private List<ConformanceStatement> conformanceStatementList;

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
	 * @return the name
	 * 
	 */
	public String getName() {
		return name;
	}

	public String getShortName() {
		// FIXME: Update the Json from DB
		return type == ElementType.SEGEMENT ? name : name.substring(name
				.lastIndexOf(".") + 1);
	}

	public String getLongName() {
		// FIXME: Update the Json from DB
		return type == ElementType.SEGEMENT ? name : name.substring(name
				.indexOf(".") + 1);
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the type
	 */
	public ElementType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(ElementType type) {
		this.type = type;
	}

	/**
	 * @return the segment
	 */
	public Segment getSegment() {
		return segment;
	}

	/**
	 * @param segment
	 *            the segment to set
	 */
	public void setSegment(Segment segment) {
		this.segment = segment;
		this.children = null;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the children
	 */
	public List<Element> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(List<Element> children) {
		this.children = children;
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
				.format("Element [position=%s, name=%s, usage=%s, min=%s, max=%s, type=%s, comment=%s]",
						position, name, usage, min, max, type, comment);
	}

}
