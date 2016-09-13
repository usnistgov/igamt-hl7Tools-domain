package gov.nist.healthcare.hl7tools.domain;

import gov.nist.healthcare.hl7tools.domain.util.IdHelper;
import java.io.Serializable;
import java.util.List;

public class Segment implements Serializable {

    private static final long serialVersionUID = 9039668939371323018L;
    private String key;
    private String root;
    private String name;
    private String description;
    private String section;
    private List<Field> fields;
    private String id;
    private String comment;

    public Segment() {
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

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
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
     * @return the fields
     */
    public List<Field> getFields() {
        return fields;
    }

    /**
     * @param fields
     *        the fields to set
     */
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Segment [key=%s, name=%s, description=%s, section=%s]", key,
                name, description, section);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id == null ? name : id;
    }

    /**
     * @param id
     *        the id to set <br>
     *        This setter will be removed.
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        Segment other = (Segment) obj;
        if (getId() == null) {
            if (other.getId() != null)
                return false;
        } else if (!getId().equals(other.getId()))
            return false;
        return true;
    }

    /**
     * create the id
     */
    public void createId() {
        id = IdHelper.createId();
    }

}
