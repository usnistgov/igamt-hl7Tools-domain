package gov.nist.healthcare.hl7tools.domain;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
property = "@id")
public class Section extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4398153822463201127L;
	private String id;
	private String title;
	private String description;
	private String recommendation; 
	private String sectionType; //is this a sub-section or root-level section
	private boolean editable; //whether section is user-editable or not
	private boolean showMessageEditButton;
	private boolean showSegmentEditButton;
	private boolean showDatatypeEditButton;
	private boolean showCodeTableEditButton;
	private boolean showPCEditButton;
	private boolean showFieldEditButton;
	private boolean showSequenceDiagramEditButton;
	private boolean showUseCaseDiagramEditButton;
	private String strContent;
	private String strExamples;
	private List<Section> subSections;
	private int level;
	private Section parent;
	private boolean print;
	
	public Section() {
		this.title = "";
		this.description = "";
		this.recommendation = null;
		this.level = 0;
		this.sectionType = "";
		this.strContent = " ";
		this.strExamples = " ";
		this.editable = false;
		this.showDatatypeEditButton = false;
		this.showFieldEditButton = false;
		this.showMessageEditButton = false;
		this.showSegmentEditButton = false;
		this.showSequenceDiagramEditButton = false;
		this.showUseCaseDiagramEditButton = false;
		this.showPCEditButton = false;
		subSections = new ArrayList<Section>();
		this.print = true;
	}

	public Section(String pId, String pTitle, String pDescription, String pRecommendation, String pSectionType, boolean pEditable, String pStrContent, String pStrExamples, List<Section> pSubSections, int pLevel, Section pParent) {		
		this.id = pId;
		this.title = pTitle;
		this.description = pDescription;
		this.recommendation = pRecommendation;
		this.sectionType = pSectionType;
		this.editable = pEditable;
		this.strContent = pStrContent;
		this.strExamples = pStrExamples;
		this.subSections = pSubSections;
		this.level = pLevel;
		this.parent = pParent;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public String getSectionType() {
		return sectionType;
	}

	public void setSectionType(String sectionType) {
		this.sectionType = sectionType;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean pEditable) {
		this.editable = pEditable;
	}

	public List<Section> getSubSections() {
		return subSections;
	}

	public void setSubSections(List<Section> subSections) {
		this.subSections = subSections;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Section getParent() {
		return parent;
	}

	public void setParent(Section parent) {
		this.parent = parent;
	}

	public String getStrContent() {
		return strContent;
	}

	public void setStrContent(String strContent) {
		this.strContent = strContent;
	}

	public String getStrExamples() {
		return strExamples;
	}

	public void setStrExamples(String strExamples) {
		this.strExamples = strExamples;
	}

	public boolean isShowMessageEditButton() {
		return showMessageEditButton;
	}

	public void setShowMessageEditButton(boolean showMessageEditButton) {
		this.showMessageEditButton = showMessageEditButton;
	}

	public boolean isShowSegmentEditButton() {
		return showSegmentEditButton;
	}

	public void setShowSegmentEditButton(boolean showSegmentEditButton) {
		this.showSegmentEditButton = showSegmentEditButton;
	}

	public boolean isShowDatatypeEditButton() {
		return showDatatypeEditButton;
	}

	public void setShowDatatypeEditButton(boolean showDatatypeEditButton) {
		this.showDatatypeEditButton = showDatatypeEditButton;
	}

	public boolean isShowFieldEditButton() {
		return showFieldEditButton;
	}

	public void setShowFieldEditButton(boolean showFieldEditButton) {
		this.showFieldEditButton = showFieldEditButton;
	}

	public boolean isShowSequenceDiagramEditButton() {
		return showSequenceDiagramEditButton;
	}

	public void setShowSequenceDiagramEditButton(
			boolean showSequenceDiagramEditButton) {
		this.showSequenceDiagramEditButton = showSequenceDiagramEditButton;
	}

	public boolean isShowUseCaseDiagramEditButton() {
		return showUseCaseDiagramEditButton;
	}

	public void setShowUseCaseDiagramEditButton(boolean showUseCaseDiagramEditButton) {
		this.showUseCaseDiagramEditButton = showUseCaseDiagramEditButton;
	}
	
	public boolean isShowCodeTableEditButton() {
		return showCodeTableEditButton;
	}

	public void setShowCodeTableEditButton(boolean showCodeTableEditButton) {
		this.showCodeTableEditButton = showCodeTableEditButton;
	}

	public boolean isShowPCEditButton() {
		return showPCEditButton;
	}

	public void setShowPCEditButton(boolean showPCEditButton) {
		this.showPCEditButton = showPCEditButton;
	}

	public boolean isPrint() {
		return print;
	}

	public void setPrint(boolean print) {
		this.print = print;
	}
}
