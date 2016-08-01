package gov.nist.healthcare.hl7tools.domain;

import gov.nist.healthcare.hl7tools.domain.util.IdHelper;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class ConformanceStatement extends Model implements Cloneable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 757947710666156450L;
    private String id;
    private String name;
    private String description;
    private Object statementDetails;

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
        return String.format("ConformanceStatement [id=%s, description=%s]",
                id, description);
    }

    public Object getStatementDetails() {
        return statementDetails;
    }

    public void setStatementDetails(Object statementDetails) {
        this.statementDetails = statementDetails;
    }

    @Override
    public ConformanceStatement clone() throws CloneNotSupportedException {
        ConformanceStatement clonedConformanceStatement = (ConformanceStatement) super.clone();
        clonedConformanceStatement.setId(IdHelper.createId());
        clonedConformanceStatement.setStatementDetails(((StatementDetails) this.statementDetails).clone());
        return clonedConformanceStatement;
    }

    public String getName() {
    	if(this.name == null || this.name.equals("NONAME")) {
    		if(((StatementDetails)this.statementDetails).getName() == null){
    			this.name = "NONAME";
    		}else {
    			this.name = ((StatementDetails)this.statementDetails).getName();
    		}
    	}
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
