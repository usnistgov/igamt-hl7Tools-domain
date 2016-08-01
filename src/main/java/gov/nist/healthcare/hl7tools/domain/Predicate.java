package gov.nist.healthcare.hl7tools.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Predicate extends Model implements Cloneable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 2044821112738899446L;
    private Usage trueUsage;
    private Usage falseUsage;
    private String description;
    private Object predicateDetails;

    /**
     * @return the trueUsage
     */
    public Usage getTrueUsage() {
        return trueUsage;
    }

    /**
     * @param trueUsage
     *        the trueUsage to set
     */
    public void setTrueUsage(Usage trueUsage) {
        this.trueUsage = trueUsage;
    }

    /**
     * @return the falseUsage
     */
    public Usage getFalseUsage() {
        return falseUsage;
    }

    /**
     * @param falseUsage
     *        the falseUsage to set
     */
    public void setFalseUsage(Usage falseUsage) {
        this.falseUsage = falseUsage;
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

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Predicate [trueUsage=%s, falseUsage=%s, description=%s]",
                trueUsage, falseUsage, description);
    }

    public Object getPredicateDetails() {
        return predicateDetails;
    }

    public void setPredicateDetails(Object predicateDetails) {
        this.predicateDetails = predicateDetails;
    }

    @Override
    public Predicate clone() throws CloneNotSupportedException {
        Predicate clonedPredicate = (Predicate) super.clone();
        clonedPredicate.setPredicateDetails(((StatementDetails) this.predicateDetails).clone());
        return clonedPredicate;
    }

    /**
     * Set the TrueUsage and FalseUsage of the predicate
     * 
     * @param usage
     */
    public void setTrueFalseUsages(Usage usage) {
        if (usage != null) {
            if (usage.name().startsWith("C_")) {
                String[] val = usage.name().split("_");
                setTrueUsage(Usage.valueOf(val[1]));
                setFalseUsage(Usage.valueOf(val[2]));
            } else {
                setFalseUsage(usage);
                setTrueUsage(usage);
            }
        }
    }

}
