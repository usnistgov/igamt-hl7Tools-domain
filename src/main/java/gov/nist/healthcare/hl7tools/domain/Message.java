package gov.nist.healthcare.hl7tools.domain;

import gov.nist.healthcare.hl7tools.domain.util.CachedValueIntializor;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Message implements Serializable {
    private String id;
    private static final long serialVersionUID = -2831717304586139080L;
    @Deprecated
    private String key;
    private String name;
    private String description;
    private String eventDescription;
    private String section;
    private List<Element> children;

    // Cached values, the caches will need to be invalidated whenever the
    // message is modified
    @JsonIgnore
    private Set<CodeTable> cachedCodeTableSet;
    @JsonIgnore
    private Set<Datatype> cachedDatatypeSet;
    @JsonIgnore
    private Set<Segment> cachedSegmentSet;

    public Message() {
        super();
    }

    /**
     * @return the event code for the message
     */
    public String getEvent() {
        return name != null && name.contains("_") ? name.substring(name.indexOf("_") + 1)
                : "";
    }

    /**
     * @return the message type
     */
    public String getMessageType() {
        return name != null && name.contains("_") ? name.substring(0,
                name.indexOf("_")) : name;
    }

    /**
     * @return the cachedCodeTableSet
     */
    public Set<CodeTable> getCodeTableSet() {
        if (cachedCodeTableSet == null)
            computeCachedValue();
        return cachedCodeTableSet;
    }

    /**
     * @return the cachedDatatypeSet
     */
    public Set<Datatype> getDatatypeSet() {
        if (cachedCodeTableSet == null)
            computeCachedValue();
        return cachedDatatypeSet;
    }

    /**
     * @return the cachedSegmentSet
     */
    public Set<Segment> getSegmentSet() {
        if (cachedCodeTableSet == null)
            computeCachedValue();
        return cachedSegmentSet;
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
     * @return the eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * @param eventDescription
     *        the eventDescription to set
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
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
     * @return the children
     */
    public List<Element> getChildren() {
        return children;
    }

    /**
     * @param children
     *        the children to set
     */
    public void setChildren(List<Element> children) {
        this.children = children;
        this.invalidateCache();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *        the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Message [key=%s, name=%s, description=%s, eventDescription=%s, section=%s]",
                key, name, description, eventDescription, section);
    }

    public void invalidateCache() {
        this.cachedCodeTableSet = null;
        this.cachedDatatypeSet = null;
        this.cachedSegmentSet = null;
    }

    private void computeCachedValue() {
        this.cachedCodeTableSet = new LinkedHashSet<CodeTable>();
        this.cachedDatatypeSet = new LinkedHashSet<Datatype>();
        this.cachedSegmentSet = new LinkedHashSet<Segment>();
        CachedValueIntializor.init(this, cachedCodeTableSet, cachedDatatypeSet,
                cachedSegmentSet);
    }

}
