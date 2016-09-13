package gov.nist.healthcare.hl7tools.domain;

public class MetaData extends Model {

	public static final int STRICT_ADHERANCE = 0;
	public static final int RELAXED_ADHERANCE = 1;
	public static final String IMPLEMENTATION_PROFILE = "implementation";
	public static final String CONSTRAINABLE_PROFILE = "constrainable";

	/**
	 * 
	 */
	private static final long serialVersionUID = -5736690965234283318L;
	private String hl7Version;
	private String hl7RulesSchema;
	private String hl7Event;
	private String conformanceType;
	private int adheranceType; // default is strict

	public MetaData() {
		this.hl7Version = "";
		this.hl7RulesSchema = "";
		this.hl7Event = "";
		this.conformanceType = "";
		this.setAdheranceType(STRICT_ADHERANCE);
	}

	public MetaData(MetaData meta) {
		this.hl7Version = meta.getHl7Version();
		this.hl7RulesSchema = meta.getHl7RulesSchema();
		this.hl7Event = meta.getHl7Event();
		this.conformanceType = meta.getConformanceType();
		this.setAdheranceType(meta.getAdheranceType());
	}

	public String getHl7Version() {
		return hl7Version;
	}

	public void setHl7Version(String hl7Version) {
		this.hl7Version = hl7Version;
	}

	public String getHl7RulesSchema() {
		return hl7RulesSchema;
	}

	public void setHl7RulesSchema(String hl7RulesSchema) {
		this.hl7RulesSchema = hl7RulesSchema;
	}

	public String getHl7Event() {
		return hl7Event;
	}

	public void setHl7Event(String hl7Event) {
		this.hl7Event = hl7Event;
	}

	public String getConformanceType() {
		return conformanceType;
	}

	public void setConformanceType(String conformanceType) {
		this.conformanceType = conformanceType;
	}

	public int getAdheranceType() {
		return adheranceType;
	}

	public void setAdheranceType(int adheranceType) {
		this.adheranceType = adheranceType;
	}

	public boolean isNotSet() {
		return "".equals(hl7Version) || "".equals(hl7RulesSchema)
				|| "".equals(conformanceType);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((conformanceType == null) ? 0 : conformanceType.hashCode());
		result = prime * result
				+ ((hl7Event == null) ? 0 : hl7Event.hashCode());
		result = prime * result
				+ ((hl7RulesSchema == null) ? 0 : hl7RulesSchema.hashCode());
		result = prime * result
				+ ((hl7Version == null) ? 0 : hl7Version.hashCode());
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
		MetaData other = (MetaData) obj;
		if (conformanceType == null) {
			if (other.conformanceType != null)
				return false;
		} else if (!conformanceType.equals(other.conformanceType))
			return false;
		if (hl7Event == null) {
			if (other.hl7Event != null)
				return false;
		} else if (!hl7Event.equals(other.hl7Event))
			return false;
		if (hl7RulesSchema == null) {
			if (other.hl7RulesSchema != null)
				return false;
		} else if (!hl7RulesSchema.equals(other.hl7RulesSchema))
			return false;
		if (hl7Version == null) {
			if (other.hl7Version != null)
				return false;
		} else if (!hl7Version.equals(other.hl7Version))
			return false;
		return true;
	}

}
