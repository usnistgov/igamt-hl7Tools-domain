package gov.nist.healthcare.hl7tools.domain;

import java.util.ArrayList;
import java.util.List;

public class Document extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7510913788545794967L;
	
	protected MetaData metaData;
	private List<Section> sections;
	private List<Author> authors;
	protected String authorName;
	protected String title; 
	protected String description; 
	
	public Document() {
		setMetaData(new MetaData());
		setSections(new ArrayList<Section>());
		setAuthors(new ArrayList<Author>());
		setAuthorName("");
		setTitle("Document");
		setDescription("This is a document.");
	}

	public Document(MetaData metaData) {
		setMetaData(metaData);
		setSections(new ArrayList<Section>());
		setAuthors(new ArrayList<Author>());
		setAuthorName("");
		setTitle("Document");
		setDescription("This is a document.");
	}
	
	public Document(MetaData metaData, List<Section> sections, List<Author> authors) {
		setMetaData(metaData);
		setSections(sections);
		setAuthors(authors);
		setAuthorName("");
		setTitle("Document");
		setDescription("This is a document.");
	}
	
	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}
