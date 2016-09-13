package gov.nist.healthcare.hl7tools.domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Datatype implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -5882882670235723175L;
    @Deprecated
    private String key;
    private String root;
    private String name;
    private String description;
    private String section;
    private List<Component> components;
    private String comment;
    private String usageNotes;
    private String id;

    public Datatype() {
        // createId();
    }

    /**
     * @return the key
     */
    @Deprecated
    public String getKey() {
        return key;
    }

    /**
     * @param key
     *        the key to set
     */
    @Deprecated
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *        the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *        the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section
     *        the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the components
     */
    public List<Component> getComponents() {
        return components;
    }

    /**
     * @param components
     *        the components to set
     */
    public void setComponents(List<Component> components) {
        this.components = components;
    }

    /**
     * @return the root
     */
    public String getRoot() {
        return root;
    }

    /**
     * @param root
     *        the root to set
     */
    public void setRoot(String root) {
        this.root = root;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     *        the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the id
     */
    public String getId() {
        /*
         * // FIXME: remove when id is set for HL7 DT // Set id for HL7 base DT
         * if (id == null && getRoot() == null && getName() != null &&
         * !getName().contains("_")) { createId(); }
         */
        return id == null ? name : id;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Datatype [key=%s, name=%s, description=%s, section=%s, comment=%s]",
                key, name, description, section, comment);
    }

    /**
     * create the temporar id
     */
    public void createId() {
        id = UUID.randomUUID().toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Datatype other = (Datatype) obj;
        if (getId() == null) {
            if (other.getId() != null)
                return false;
        } else if (!getId().equals(other.getId()))
            return false;
        return true;
    }

    /**
     * FIXME:Remove this method when id are set on HL7 base <br />
     * Use this method to set the id of only HL7 base datatype
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getUsageNotes() {
        return usageNotes;
    }

    public void setUsageNotes(String usageNotes) {
        this.usageNotes = usageNotes;
    }

}
