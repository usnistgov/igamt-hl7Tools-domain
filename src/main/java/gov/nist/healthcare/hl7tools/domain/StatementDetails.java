package gov.nist.healthcare.hl7tools.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nu.xom.Attribute;
import nu.xom.Element;

import org.apache.commons.lang3.StringUtils;

public class StatementDetails implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String level;
	private String location;
	private String constructionType;
	private String pattern;
	private String subPattern;
	private String statementText;
	private String targetObjectName;
	private String targetName;
	private String path;
	private String rootPath;

	protected boolean isPredicate;
	protected String trueUsage;
	protected String falseUsage;

	protected String literalValue;
	protected String nonliteralValue;
	protected CodeTable valueSet;
	protected String newValueInList;
	public List<String> literalValues = new ArrayList<String>();
	protected String number;
	protected String sign;
	protected String targetNodeLocation;
	protected String targetNodeName;
	protected String anotherNodeLocation;
	protected String anotherNodeName;
	protected String relationshipName;
	protected String formatDef;
	protected String freetext;
	protected String verb;

	public StatementDetails ifStatement;
	public StatementDetails thenStatement;

	public List<StatementDetails> multiStatements;
	protected int numStatements;
	protected String logicalConjunction = "AND";
	protected String complexlogicalConjunction;

	private List<String> multiSubPatterns = new ArrayList<String>();

	public StatementDetails(String id, String name, String level,
			String location, String constructionType, String pattern,
			String subPattern, String statementText, String targetObjectName,
			String targetName, int numStatements, boolean isPredicate,
			String trueUsage, String falseUsage, String literalValue,
			String nonliteralValue, ValueSet valueSet, String newValueInList,
			List<String> literalValues, String number, String sign,
			String targetNodeLocation, String targetNodeName,
			String anotherNodeLocation, String anotherNodeName,
			String relationshipName, String formatDef, String freetext,
			String verb, StatementDetails ifStatement,
			StatementDetails thenStatement,
			List<StatementDetails> multiStatements, String logicalConjunction,
			String complexlogicalConjunction, List<String> multiSubPatterns) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.location = location;
		this.constructionType = constructionType;
		this.pattern = pattern;
		this.subPattern = subPattern;
		this.statementText = statementText;
		this.targetObjectName = targetObjectName;
		this.targetName = targetName;
		this.numStatements = numStatements;
		this.isPredicate = isPredicate;
		this.trueUsage = trueUsage;
		this.falseUsage = falseUsage;
		this.literalValue = literalValue;
		this.valueSet = valueSet;
		this.newValueInList = newValueInList;
		this.literalValues = literalValues;
		this.nonliteralValue = nonliteralValue;
		this.number = number;
		this.sign = sign;
		this.targetNodeLocation = targetNodeLocation;
		this.targetNodeName = targetNodeName;
		this.anotherNodeLocation = anotherNodeLocation;
		this.anotherNodeName = anotherNodeName;
		this.relationshipName = relationshipName;
		this.formatDef = formatDef;
		this.freetext = freetext;
		this.verb = verb;
		this.ifStatement = ifStatement;
		this.thenStatement = thenStatement;
		this.multiStatements = multiStatements;
		this.logicalConjunction = logicalConjunction;
		this.complexlogicalConjunction = complexlogicalConjunction;
		this.multiSubPatterns = multiSubPatterns;
	}

	public StatementDetails() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getConstructionType() {
		return constructionType;
	}

	public void setConstructionType(String constructionType) {
		this.constructionType = constructionType;
	}

	public String getPattern() {
		if (this.pattern == null)
			return "";
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getSubPattern() {
		return subPattern;
	}

	public void setSubPattern(String subPattern) {
		this.subPattern = subPattern;
	}

	public String getStatementText() {
		return statementText;
	}

	public void setStatementText(String statementText) {
		this.statementText = statementText;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public String getKey() {
		return this.id;
	}

	public String getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(String literalValue) {
		this.literalValue = literalValue;
	}

	public CodeTable getValueSet() {
		return valueSet;
	}

	public void setValueSet(CodeTable valueSet) {
		this.valueSet = valueSet;
	}

	public String getNewValueInList() {
		return newValueInList;
	}

	public void setNewValueInList(String newValueInList) {
		this.newValueInList = newValueInList;
	}

	public List<String> getLiteralValues() {
		return literalValues;
	}

	public void setLiteralValues(List<String> literalValues) {
		this.literalValues = literalValues;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getAnotherNodeLocation() {
		return anotherNodeLocation;
	}

	public void setAnotherNodeLocation(String anotherNodeLocation) {
		this.anotherNodeLocation = anotherNodeLocation;
	}
	
	public void setAnotherNodeLoaction(String anotherNodeLocation) {
		this.anotherNodeLocation = anotherNodeLocation;
	}

	public String getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

	public String getFormatDef() {
		return formatDef;
	}

	public void setFormatDef(String formatDef) {
		this.formatDef = formatDef;
	}

	public String getFreetext() {
		return freetext;
	}

	public void setFreetext(String freetext) {
		this.freetext = freetext;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public boolean isPredicate() {
		return isPredicate;
	}

	public void setPredicate(boolean isPredicate) {
		this.isPredicate = isPredicate;
	}

	public String getTrueUsage() {
		return trueUsage;
	}

	public void setTrueUsage(String trueUsage) {
		this.trueUsage = trueUsage;
	}

	public String getFalseUsage() {
		return falseUsage;
	}

	public void setFalseUsage(String falseUsage) {
		this.falseUsage = falseUsage;
	}

	public String getTargetObjectName() {
		return targetObjectName;
	}

	public void setTargetObjectName(String targetObjectName) {
		this.targetObjectName = targetObjectName;
	}

	public StatementDetails getIfStatement() {
		return ifStatement;
	}

	public void setIfStatement(StatementDetails ifStatement) {
		this.ifStatement = ifStatement;
	}

	public StatementDetails getThenStatement() {
		return thenStatement;
	}

	public void setThenStatement(StatementDetails thenStatement) {
		this.thenStatement = thenStatement;
	}

	public String getTargetNodeLocation() {
		return targetNodeLocation;
	}

	public void setTargetNodeLocation(String targetNodeLocation) {
		this.targetNodeLocation = targetNodeLocation;
	}
	
	public void setTargetNodeLoaction(String targetNodeLocation) {
		this.targetNodeLocation = targetNodeLocation;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getTargetNodeName() {
		return targetNodeName;
	}

	public void setTargetNodeName(String targetNodeName) {
		this.targetNodeName = targetNodeName;
	}

	public String getAnotherNodeName() {
		return anotherNodeName;
	}

	public void setAnotherNodeName(String anotherNodeName) {
		this.anotherNodeName = anotherNodeName;
	}

	public int getNumStatements() {
		return numStatements;
	}

	public List<StatementDetails> getMultiStatements() {
		return multiStatements;
	}

	public void setMultiStatements(List<StatementDetails> multiStatements) {
		this.multiStatements = multiStatements;
	}

	public List<String> getMultiSubPatterns() {
		return this.multiSubPatterns;
	}

	public void setMultiSubPatterns(List<String> multiSubPatterns) {
		this.multiSubPatterns = multiSubPatterns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMultiPattern() {
		Map<String, List<String>> subPatternsData = new HashMap<String, List<String>>();
		List<String> subpatternsConstant = new ArrayList<String>();
		subpatternsConstant.add("Single Value");
		subpatternsConstant.add("Non-Literal Value");
		subpatternsConstant.add("List Values");
		subpatternsConstant.add("Value Set");
		subPatternsData.put("Constant Value Check", subpatternsConstant);

		List<String> subpatternsCorrelation = new ArrayList<String>();
		subpatternsCorrelation.add("Identical Nodes");
		subpatternsCorrelation.add("Comparison Nodes");
		subpatternsCorrelation.add("Linked Values");
		subPatternsData.put("Correlation Check", subpatternsCorrelation);

		this.multiSubPatterns = subPatternsData.get(this.pattern);
		if (this.multiSubPatterns == null)
			this.multiSubPatterns = new ArrayList<String>();

	}

	public String getLogicalConjunction() {
		return this.logicalConjunction;
	}

	public void setLogicalConjunction(String logicalConjunction) {
		this.logicalConjunction = logicalConjunction;
	}

	public String getComplexlogicalConjunction() {
		return complexlogicalConjunction;
	}

	public void setComplexlogicalConjunction(String complexlogicalConjunction) {
		this.complexlogicalConjunction = complexlogicalConjunction;
	}

	public String getNonliteralValue() {
		return nonliteralValue;
	}

	public void setNonliteralValue(String nonliteralValue) {
		this.nonliteralValue = nonliteralValue;
	}

	public void addLiteralValueInList() {
		literalValues.add(this.newValueInList);
		this.newValueInList = null;
	}

	public void updateComplexlogicalConjunction() {
		if (this.logicalConjunction.equals("AND")) {
			this.complexlogicalConjunction = "Statement_#0";
			for (int i = 1; i < this.multiStatements.size(); i++) {
				this.complexlogicalConjunction += " AND Statement_#"
						+ this.multiStatements.get(i).getId();
			}
		} else if (this.logicalConjunction.equals("OR")) {
			this.complexlogicalConjunction = "Statement #0";
			for (int i = 1; i < this.multiStatements.size(); i++) {
				this.complexlogicalConjunction += " OR Statement_#"
						+ this.multiStatements.get(i).getId();
			}
		} else {
			this.complexlogicalConjunction = "";
		}
	}

	public void setNumStatements(int numStatements) {
		this.numStatements = numStatements;
	}
	
	public void updateNumStatements(){
		this.multiStatements = new ArrayList<StatementDetails>();
		this.complexlogicalConjunction = "";
		this.logicalConjunction = null;
		for (int i = 1; i < this.numStatements + 1; i++) {
			StatementDetails statementDetails = new StatementDetails();
			statementDetails.setId("" + i);

			statementDetails.setLevel(this.level);
			statementDetails.setLocation(this.location);
			statementDetails.setPredicate(this.isPredicate);
			statementDetails.setConstructionType("Single");
			statementDetails.setTargetObjectName(this.targetObjectName);
			statementDetails.setTargetName(this.targetName);
			statementDetails.setRootPath(this.rootPath);

			this.multiStatements.add(statementDetails);
		}	
	}

	public void generateStatementText(boolean isFinal, boolean isFirst) {
		if (this.getConstructionType().equals("IfThen")) {
			this.ifStatement.generateStatementText(false, true);
			this.thenStatement.generateStatementText(false, false);

			this.statementText = this.ifStatement.getStatementText()
					+ ", then " + this.thenStatement.getStatementText();

		} else if (this.getConstructionType().equals("Multi")) {
			List<StatementDetails> adjustedStatements = new ArrayList<StatementDetails>();
			for (StatementDetails s : this.multiStatements) {
				if (s == this.multiStatements.get(0)) {
					s.generateStatementText(false, true);
				} else {
					s.generateStatementText(false, false);
				}
				adjustedStatements.add(s);
			}
			this.multiStatements = adjustedStatements;

			String multiText = "";

			if (!this.logicalConjunction.equals("Complex")) {
				multiText = this.multiStatements.get(0).getStatementText();
				for (int i = 1; i < this.multiStatements.size(); i++) {
					multiText += " " + this.logicalConjunction + " "
							+ multiStatements.get(i).getStatementText();
				}
			} else {
				multiText = this.complexlogicalConjunction;
				
				for (int i = 0; i < this.multiStatements.size(); i++) {
					
					multiText = multiText.replace("Statement_#" + (i + 1) , multiStatements.get(i).getStatementText());
				}
			}
			this.setStatementText(multiText);

		} else if (this.getPattern().equals("Comparison Value Check")) {
			generateStatementTextForComparisonValueCheck(isFirst);
		} else if (this.getPattern().equals("Constant Value Check")) {
			generateStatementTextForConstantValueCheck(isFirst);
		} else if (this.getPattern().equals("Correlation Check")) {
			generateStatementTextForCorrelationCheck(isFirst);
		} else if (this.getPattern().equals("FreeText")) {
			generateStatementTextForFreeText(isFirst);
		} else if (this.getPattern().equals("Presence Check")) {
			generateStatementTextForPresenceCheck(isFirst);
		} else if (this.getPattern().equals("Uniqueness Check")) {
			generateStatementTextForUniquenessCheck(isFirst);
		} else if (this.getPattern().equals("Value Format Check")) {
			generateStatementTextForValueFormatCheck(isFirst);
		}

		if (isFinal) {
			this.setStatementText(this.getStatementText() + ".");
		}

	}
	
	private String removePostFix(String s){
		if(s.contains("_")){
			return s.substring(0, s.indexOf("_"));
		}else return s;
	}
	
	private String updateLocation(String in){
		if(in.contains(".")){
			String[] ss = in.split("\\.");
			ss[0] = this.removePostFix(ss[0]);
			String out = "";
			for(String s:ss){
				out = out + "." + s;
			}
			
			return out.substring(1);
		}else {
			return this.removePostFix(in);
		}
	}

	private void generateStatementTextForComparisonValueCheck(boolean isFirst) {
		String firstWord;

		if (isFirst) {
			if (this.isPredicate) {
				firstWord = "If the";
			} else {
				firstWord = "The";
			}
		} else {
			if (this.isPredicate) {
				firstWord = "if the";
			} else {
				firstWord = "the";
			}
		}
		
		if(this.getTargetNodeLocation() == null){
			this.setTargetNodeLocation(this.getTargetObjectName() + "." + this.getLocation());
			this.setTargetNodeName(this.getTargetName());
		}

		if (this.getLevel().equals("Message") || this.isPredicate) {
			this.setStatementText(firstWord + " value of "
					+ this.updateLocation(this.getTargetNodeLocation()) + " ("
					+ this.getTargetNodeName() + ")" + " " + this.verb + " "
					+ this.sign + " than '" + this.number + "'");
		} else {
			this.setStatementText(firstWord + " value of "
					+ this.updateLocation(this.getTargetObjectName()) + "." + this.getLocation()
					+ " (" + this.getTargetName() + ")" + " " + this.verb + " "
					+ this.sign + " than '" + this.number + "'");
		}

	}

	private void generateStatementTextForConstantValueCheck(boolean isFirst) {
		String firstWord;

		if (isFirst) {
			if (this.isPredicate) {
				firstWord = "If the";
			} else {
				firstWord = "The";
			}
		} else {
			if (this.isPredicate) {
				firstWord = "if the";
			} else {
				firstWord = "the";
			}
		}
		
		if(this.getTargetNodeLocation() == null){
			this.setTargetNodeLocation(this.getTargetObjectName() + "." + this.getLocation());
			this.setTargetNodeName(this.getTargetName());
		}

		if (this.getLevel().equals("Message") || this.getLevel().equals("Segment") || this.getLevel().equals("Interaction") || this.getLevel().equals("TestStep") || this.getLevel().equals("Transaction") || this.getLevel().equals("TestCase") || this.getLevel().equals("Profile Fixed") || this.isPredicate) {
			if (this.getSubPattern().equals("Single Value")) {
				this.setStatementText(firstWord + " value of "
						+ this.updateLocation(this.getTargetNodeLocation()) + " ("
						+ this.getTargetNodeName() + ")" + " " + this.verb
						+ " '" + this.literalValue + "'");
			} else if (this.getSubPattern().equals("Non-Literal Value")) {
				this.setStatementText(firstWord + " value of "
						+ this.updateLocation(this.getTargetNodeLocation()) + " ("
						+ this.getTargetNodeName() + ")" + " " + this.verb
						+ " " + this.nonliteralValue);
			} else if (this.getSubPattern().equals("List Values")) {
				String statementText = firstWord + " value of "
						+ this.updateLocation(this.getTargetNodeLocation()) + " ("
						+ this.getTargetNodeName() + ")" + " " + this.verb
						+ " one of List Values: ";
				for (int i = 0; i < literalValues.size(); i++) {
					statementText += "'" + literalValues.get(i) + "'";
					if (i == literalValues.size() - 1)
						statementText += "";
					else
						statementText += ",";
				}
				this.setStatementText(statementText);
			} else if (this.getSubPattern().equals("Value Set")) {
				String statementText = firstWord + " value of "
						+ this.updateLocation(this.getTargetNodeLocation()) + " ("
						+ this.getTargetNodeName() + ")" + " " + this.verb
						+ " one of codes listed in the Value Set: " + this.valueSet.getName();
				this.setStatementText(statementText);
			}
		} else {
			if (this.getSubPattern().equals("Single Value")) {
				this.setStatementText(firstWord + " value of "
						+ this.updateLocation(this.getTargetObjectName()) + "." + this.getLocation()
						+ " (" + this.getTargetName() + ")" + " " + this.verb
						+ " '" + this.literalValue + "'");
			} else if (this.getSubPattern().equals("Non-Literal Value")) {
				this.setStatementText(firstWord + " value of "
						+ this.updateLocation(this.getTargetObjectName()) + "." + this.getLocation()
						+ " (" + this.getTargetName() + ")" + " " + this.verb
						+ " " + this.nonliteralValue);
			} else if (this.getSubPattern().equals("List Values")) {
				String statementText = firstWord + " value of "
						+ this.updateLocation(this.getTargetObjectName()) + "." + this.getLocation()
						+ " (" + this.getTargetName() + ")" + " " + this.verb
						+ " one of List Values: ";
				for (int i = 0; i < literalValues.size(); i++) {
					statementText += "'" + literalValues.get(i) + "'";
					if (i == literalValues.size() - 1)
						statementText += "";
					else
						statementText += ",";
				}

				this.setStatementText(statementText);
			} else if (this.getSubPattern().equals("Value Set")) {
				String statementText = firstWord + " value of "
						+ this.updateLocation(this.getTargetNodeLocation()) + " ("
						+ this.getTargetNodeName() + ")" + " " + this.verb
						+ " one of codes in the Value Set: " + this.valueSet.getName();
				this.setStatementText(statementText);
			}
		}
	}

	private void generateStatementTextForCorrelationCheck(boolean isFirst) {
		String firstWord;

		if (isFirst) {
			if (this.isPredicate) {
				firstWord = "If ";
			} else {
				firstWord = "";
			}
		} else {
			if (this.isPredicate) {
				firstWord = "if ";
			} else {
				firstWord = "";
			}
		}
		
		if(this.getTargetNodeLocation() == null){
			this.setTargetNodeLocation(this.getTargetObjectName() + "." + this.getLocation());
			this.setTargetNodeName(this.getTargetName());
		}

		if (this.getLevel().equals("Message") || this.getLevel().equals("Segment") || this.getLevel().equals("Interaction") || this.getLevel().equals("TestStep") || this.getLevel().equals("Transaction") || this.getLevel().equals("TestCase") || this.getLevel().equals("Profile Fixed") || this.isPredicate) {
			if (this.getSubPattern().equals("Identical Nodes")) {
				this.setStatementText(firstWord + this.updateLocation(this.getTargetNodeLocation())
						+ " (" + this.getTargetNodeName() + ")" + " "
						+ this.verb + " identical to the "
						+ this.updateLocation(this.anotherNodeLocation) + " ("
						+ this.getAnotherNodeName() + ")");
			} else if (this.getSubPattern().equals("Comparison Nodes")) {
				this.setStatementText(firstWord + this.updateLocation(this.getTargetNodeLocation())
						+ " (" + this.getTargetNodeName() + ")" + " "
						+ this.verb + " " + this.sign + " than "
						+ this.updateLocation(this.anotherNodeLocation) + " ("
						+ this.getAnotherNodeName() + ")");
			} else if (this.getSubPattern().equals("Linked Values")) {
				this.setStatementText(firstWord + this.updateLocation(this.getTargetNodeLocation())
						+ " (" + this.getTargetNodeName() + ")" + " "
						+ this.verb + " related with "
						+ this.updateLocation(this.anotherNodeLocation) + " ("
						+ this.getAnotherNodeName() + ") by the "
						+ this.relationshipName);
			}
		} else {
			if (this.getSubPattern().equals("Identical Nodes")) {
				this.setStatementText(firstWord + this.updateLocation(this.getTargetObjectName())
						+ "." + this.getLocation() + " ("
						+ this.getTargetName() + ")" + " " + this.verb
						+ " identical to the " + this.updateLocation(this.anotherNodeLocation)
						+ " (" + this.getAnotherNodeName() + ")");
			} else if (this.getSubPattern().equals("Comparison Nodes")) {
				this.setStatementText(firstWord + this.updateLocation(this.getTargetObjectName())
						+ "." + this.getLocation() + " ("
						+ this.getTargetName() + ")" + " " + this.verb + " "
						+ this.sign + " than " + this.updateLocation(this.anotherNodeLocation)
						+ " (" + this.getAnotherNodeName() + ")");
			} else if (this.getSubPattern().equals("Linked Values")) {
				this.setStatementText(firstWord + this.updateLocation(this.getTargetObjectName())
						+ "." + this.getLocation() + " ("
						+ this.getTargetName() + ")" + " " + this.verb
						+ " related with " + this.updateLocation(this.anotherNodeLocation) + " ("
						+ this.getAnotherNodeName() + ") by the "
						+ this.relationshipName);
			}
		}
	}

	private void generateStatementTextForFreeText(boolean isFirst) {
		String firstWord;

		if (isFirst) {
			if (this.isPredicate) {
				firstWord = "If ";
			} else {
				firstWord = "";
			}
		} else {
			if (this.isPredicate) {
				firstWord = "if ";
			} else {
				firstWord = "";
			}
		}

		this.setStatementText(firstWord + this.freetext);
	}

	private void generateStatementTextForPresenceCheck(boolean isFirst) {
		String firstWord;

		if (isFirst) {
			if (this.isPredicate) {
				firstWord = "If ";
			} else {
				firstWord = "";
			}
		} else {
			if (this.isPredicate) {
				firstWord = "if ";
			} else {
				firstWord = "";
			}
		}

		this.setStatementText(firstWord + this.updateLocation(this.anotherNodeLocation) + " ("
				+ this.anotherNodeName + ")" + " " + this.verb + " valued");
	}

	private void generateStatementTextForUniquenessCheck(boolean isFirst) {
		String firstWord;

		if (isFirst) {
			if (this.isPredicate) {
				firstWord = "If the";
			} else {
				firstWord = "The";
			}
		} else {
			if (this.isPredicate) {
				firstWord = "if the";
			} else {
				firstWord = "the";
			}
		}
		
		if(this.getTargetNodeLocation() == null){
			this.setTargetNodeLocation(this.getTargetObjectName() + "." + this.getLocation());
			this.setTargetNodeName(this.getTargetName());
		}

		if (this.getLevel().equals("Message") || this.getLevel().equals("Segment") || this.getLevel().equals("Interaction") || this.getLevel().equals("TestStep") || this.getLevel().equals("Transaction") || this.getLevel().equals("TestCase") || this.getLevel().equals("Profile Fixed") || this.isPredicate) {
			this.setStatementText(firstWord + " value of "
					+ this.updateLocation(this.getTargetNodeLocation()) + " ("
					+ this.getTargetNodeName() + ")" + " " + this.verb
					+ " unique in the message");
		} else {
			this.setStatementText(firstWord + " value of "
					+ this.updateLocation(this.getTargetObjectName()) + "." + this.getLocation()
					+ " (" + this.getTargetName() + ")" + " " + this.verb
					+ " unique in the message");
		}
	}

	private void generateStatementTextForValueFormatCheck(boolean isFirst) {
		String firstWord;

		if (isFirst) {
			if (this.isPredicate) {
				firstWord = "If the";
			} else {
				firstWord = "The";
			}
		} else {
			if (this.isPredicate) {
				firstWord = "if the";
			} else {
				firstWord = "the";
			}
		}
		
		if(this.getTargetNodeLocation() == null){
			this.setTargetNodeLocation(this.getTargetObjectName() + "." + this.getLocation());
			this.setTargetNodeName(this.getTargetName());
		}

		if (this.getLevel().equals("Message") || this.getLevel().equals("Segment") || this.getLevel().equals("Interaction") || this.getLevel().equals("TestStep") || this.getLevel().equals("Transaction") || this.getLevel().equals("TestCase") || this.getLevel().equals("Profile Fixed") || this.isPredicate) {
			this.setStatementText(firstWord + " value of "
					+ this.updateLocation(this.getTargetNodeLocation()) + " ("
					+ this.getTargetNodeName() + ")" + " " + this.verb
					+ " formatted with " + this.formatDef);
		} else {
			this.setStatementText(firstWord + " value of "
					+ this.updateLocation(this.getTargetObjectName()) + "." + this.getLocation()
					+ " (" + this.getTargetName() + ")" + " " + this.verb
					+ " formatted with " + this.formatDef);
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Element generateAssertionElm(Element cscpElm, String type) {
		if (this.constructionType.equals("Single")) {
			if (this.getPattern().equals("Constant Value Check") && this.getSubPattern().equals("Single Value") && this.literalValue.contains("^") && !this.targetName.equals("Encoding Characters")) {
				this.handleSingleSpecitialCase(cscpElm);
			}else {
				
				if(type.equals("cs")){
					Element assertion = this.createAssertionElm(this.createAssertionElmForSingle(type));
				
					if(assertion == null){
						cscpElm = null;
					}else {
						cscpElm.appendChild(assertion);
					}
				}else if(type.equals("cp")){
					Element assertion = this.createConditionElm(this.createAssertionElmForSingle(type));
					
					if(assertion == null){
						cscpElm = null;
					}else {
						cscpElm.appendChild(assertion);
					}
				}
				
			}
			
		} else if (this.constructionType.equals("IfThen")) {
			
			if(type.equals("cs")){
				Element assertion = this.createAssertionElm(this.createORElm(this.createNotElm(this.ifStatement.createAssertionElmForSingle(type)), this.thenStatement.createAssertionElmForSingle(type)));
				
				if(assertion == null){
					cscpElm = null;
				}else {
					cscpElm.appendChild(assertion);
				}
			}else if(type.equals("cp")){
				Element assertion = this.createConditionElm(this.createORElm(this.createNotElm(this.ifStatement.createAssertionElmForSingle(type)), this.thenStatement.createAssertionElmForSingle(type)));
				
				if(assertion == null){
					cscpElm = null;
				}else {
					cscpElm.appendChild(assertion);
				}
			}
			
		} else if (this.constructionType.equals("Multi")) {
			boolean checkNull = false;
			
			for(StatementDetails s: this.multiStatements){
				if(s.createAssertionElmForSingle(type) == null){
					checkNull = true;
				}
			}
			
			if(!checkNull){
				if(this.logicalConjunction.equals("AND")){
					boolean vaildAssertion = true;
					Element andElm = new Element("AND");
					
					
					if(this.multiStatements.get(0).createAssertionElmForSingle(type) == null) vaildAssertion = false;
					andElm.appendChild(this.multiStatements.get(0).createAssertionElmForSingle(type));
					Element currentElm = andElm;
					for(int i=1; i<this.multiStatements.size();i++){
						if(i == this.multiStatements.size()-1){
							if(this.multiStatements.get(i).createAssertionElmForSingle(type) == null) vaildAssertion = false;
							currentElm.appendChild(this.multiStatements.get(i).createAssertionElmForSingle(type));
						}else {
							Element subAndElm = new Element("AND");
							if(this.multiStatements.get(i).createAssertionElmForSingle(type) == null) vaildAssertion = false;
							subAndElm.appendChild(this.multiStatements.get(i).createAssertionElmForSingle(type));
							currentElm.appendChild(subAndElm);
							currentElm = subAndElm;
						}
						
					}
					
					
					if(type.equals("cs")){
						Element assertion = this.createAssertionElm(andElm);
						
						if(assertion == null && !vaildAssertion){
							cscpElm = null;
						}else {
							cscpElm.appendChild(assertion);
						}
					}else if(type.equals("cp")){
						Element assertion = this.createConditionElm(andElm);
						
						if(assertion == null && !vaildAssertion){
							cscpElm = null;
						}else {
							cscpElm.appendChild(assertion);
						}
					}
					
					
				}else if(this.logicalConjunction.equals("OR")){
					boolean vaildAssertion = true;
					Element orElm = new Element("OR");
					if(this.multiStatements.get(0).createAssertionElmForSingle(type) == null) vaildAssertion = false;
					orElm.appendChild(this.multiStatements.get(0).createAssertionElmForSingle(type));
					Element currentElm = orElm;
					for(int i=1; i<this.multiStatements.size();i++){
						if(i == this.multiStatements.size()-1){
							if(this.multiStatements.get(i).createAssertionElmForSingle(type) == null) vaildAssertion = false;
							currentElm.appendChild(this.multiStatements.get(i).createAssertionElmForSingle(type));
						}else {
							Element subOrElm = new Element("OR");
							if(this.multiStatements.get(i).createAssertionElmForSingle(type) == null) vaildAssertion = false;
							subOrElm.appendChild(this.multiStatements.get(i).createAssertionElmForSingle(type));
							currentElm.appendChild(subOrElm);
							currentElm = subOrElm;
						}
						
					}

					
					if(type.equals("cs")){
						Element assertion = this.createAssertionElm(orElm);
						
						if(assertion == null && !vaildAssertion){
							cscpElm = null;
						}else {
							cscpElm.appendChild(assertion);
						}
					}else if(type.equals("cp")){
						Element assertion = this.createConditionElm(orElm);
						
						if(assertion == null && !vaildAssertion){
							cscpElm = null;
						}else {
							cscpElm.appendChild(assertion);
						}
					}
					
					
				}else if(this.logicalConjunction.equals("Complex")){
					if(this.numStatements == 3){
						String simpleForm = this.complexlogicalConjunction.replace("Statement_#1", "").replace("Statement_#2", "").replace("Statement_#3", "").replace(" ", "");
						if(simpleForm.equalsIgnoreCase("ifandthen")){
							Element andElm = new Element("AND");
							andElm.appendChild(this.multiStatements.get(0).createAssertionElmForSingle(type));
							andElm.appendChild(this.multiStatements.get(1).createAssertionElmForSingle(type));
							
							if(type.equals("cs")){
								Element assertion = this.createAssertionElm(this.createORElm(this.createNotElm(andElm), this.multiStatements.get(2).createAssertionElmForSingle(type)));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}else if(type.equals("cp")){
								Element assertion = this.createConditionElm(this.createORElm(this.createNotElm(andElm), this.multiStatements.get(2).createAssertionElmForSingle(type)));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}
							
							
						}else if(simpleForm.equalsIgnoreCase("iforthen")){
							Element orElm = this.createORElm(this.multiStatements.get(0).createAssertionElmForSingle(type), this.multiStatements.get(1).createAssertionElmForSingle(type));
							
							if(type.equals("cs")){
								Element assertion = this.createAssertionElm(this.createORElm(this.createNotElm(orElm), this.multiStatements.get(2).createAssertionElmForSingle(type)));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}else if(type.equals("cp")){
								Element assertion = this.createConditionElm(this.createORElm(this.createNotElm(orElm), this.multiStatements.get(2).createAssertionElmForSingle(type)));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}
						}
						
					}else if(this.numStatements == 4){
						String simpleForm = this.complexlogicalConjunction.replace("Statement_#1", "").replace("Statement_#2", "").replace("Statement_#3", "").replace("Statement_#4", "").replace(" ", "");
						if(simpleForm.equalsIgnoreCase("ifandthenand")){
							Element andElm1 = new Element("AND");
							andElm1.appendChild(this.multiStatements.get(0).createAssertionElmForSingle(type));
							andElm1.appendChild(this.multiStatements.get(1).createAssertionElmForSingle(type));
							Element andElm2 = new Element("AND");
							andElm2.appendChild(this.multiStatements.get(2).createAssertionElmForSingle(type));
							andElm2.appendChild(this.multiStatements.get(3).createAssertionElmForSingle(type));
							
							if(type.equals("cs")){
								Element assertion = this.createAssertionElm(this.createORElm(this.createNotElm(andElm1), andElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}else if(type.equals("cp")){
								Element assertion = this.createConditionElm(this.createORElm(this.createNotElm(andElm1), andElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}
							
						}if(simpleForm.equalsIgnoreCase("ifandthenor")){
							Element andElm1 = new Element("AND");
							andElm1.appendChild(this.multiStatements.get(0).createAssertionElmForSingle(type));
							andElm1.appendChild(this.multiStatements.get(1).createAssertionElmForSingle(type));
							Element orElm2 = this.createORElm(this.multiStatements.get(2).createAssertionElmForSingle(type), this.multiStatements.get(3).createAssertionElmForSingle(type));
							
							
							if(type.equals("cs")){
								Element assertion = this.createAssertionElm(this.createORElm(this.createNotElm(andElm1), orElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}else if(type.equals("cp")){
								Element assertion = this.createConditionElm(this.createORElm(this.createNotElm(andElm1), orElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}
							
						}if(simpleForm.equalsIgnoreCase("iforthenand")){
							Element orElm1 = this.createORElm(this.multiStatements.get(0).createAssertionElmForSingle(type), this.multiStatements.get(1).createAssertionElmForSingle(type));
							Element andElm2 = new Element("AND");
							andElm2.appendChild(this.multiStatements.get(2).createAssertionElmForSingle(type));
							andElm2.appendChild(this.multiStatements.get(3).createAssertionElmForSingle(type));
							
							if(type.equals("cs")){
								Element assertion = this.createAssertionElm(this.createORElm(this.createNotElm(orElm1), andElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}else if(type.equals("cp")){
								Element assertion = this.createConditionElm(this.createORElm(this.createNotElm(orElm1), andElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}
						}if(simpleForm.equalsIgnoreCase("iforthenor")){
							Element orElm1 = this.createORElm(this.multiStatements.get(0).createAssertionElmForSingle(type), this.multiStatements.get(1).createAssertionElmForSingle(type));
							Element orElm2 = this.createORElm(this.multiStatements.get(2).createAssertionElmForSingle(type), this.multiStatements.get(3).createAssertionElmForSingle(type));
							
							if(type.equals("cs")){
								Element assertion = this.createAssertionElm(this.createORElm(this.createNotElm(orElm1), orElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}else if(type.equals("cp")){
								Element assertion = this.createConditionElm(this.createORElm(this.createNotElm(orElm1), orElm2));
								
								if(assertion == null){
									cscpElm = null;
								}else {
									cscpElm.appendChild(assertion);
								}
							}
						}
					}
					
				}
			}else {
				return null;
			}
			
		}
		
		return cscpElm;
	}
	
	private void handleSingleSpecitialCase(Element parent){
		String[] splitedComponents = this.literalValue.split("\\^");
		for (int i = 0; i < splitedComponents.length; i++) {
			if (this.verb.contains("NOT") || this.verb.contains("not")) {
				Element assertionElm = new Element("Assertion");
				assertionElm.addAttribute(new Attribute("description", "./" + (i + 1) + " " + this.verb + " a '" + splitedComponents[i] + "'"));
				assertionElm.appendChild(this.createNotElm(this.createSingleValueElm("./" + (i + 1), splitedComponents[i])));
				parent.appendChild(assertionElm);
			} else {
				Element assertionElm = new Element("Assertion");
				assertionElm.addAttribute(new Attribute("description", "./" + (i + 1) + " " + this.verb + " a '" + splitedComponents[i] + "'"));
				
				if(splitedComponents[i] == null || splitedComponents[i].equals("")){
					assertionElm.appendChild(this.createNotElm(this.createValuedElm("./" + (i + 1))));
				}else {
					assertionElm.appendChild(this.createSingleValueElm("./" + (i + 1), splitedComponents[i]));
				}
				parent.appendChild(assertionElm);
			}
		}
	}
	
	private Element createORElm(Element child1, Element child2){		
		if(child1 != null && child2 != null){
			Element andElm = new Element("OR");
			andElm.appendChild(child1);
			andElm.appendChild(child2);
			return andElm;
		}
		
		return null;
	}
	
//	private Element checkNOAssertion(String errorCode){
//		Element noAssertion = new Element("NOASSERTION");
//		noAssertion.addAttribute(new Attribute("error", errorCode));
//		return noAssertion;
//		
//	}
	
	private Element createAssertionElm(Element child){
		Element assertion = new Element("Assertion");
		
		if(child != null){
			assertion.appendChild(child);
			return assertion;
		}
		
		return null;
	}
	
	
	private Element createConditionElm(Element child){
		Element assertion = new Element("Condition");
		
		if(child != null){
			assertion.appendChild(child);
			return assertion;
		}
		
		return null;
	}
	
	
	
	private Element createNotElm(Element child){
		if(child != null){
			Element notElm = new Element("NOT");
			notElm.appendChild(child);
			return notElm;
		}
		
		
		return null;
	}
	
	private Element createSingleValueElm(String locationStr, String literalValue){
		Element plainTextElm = new Element("PlainText");
		plainTextElm.addAttribute(new Attribute("location", locationStr));
		plainTextElm.addAttribute(new Attribute("value", literalValue));
		return plainTextElm;
	}
	
	private Element createCorrelationCheckElm(String locationStr1, String locationStr2){
		Element plainTextElm = new Element("PlainText");
		plainTextElm.addAttribute(new Attribute("location", locationStr1));
		plainTextElm.addAttribute(new Attribute("locationContent", locationStr2));
		return plainTextElm;
	}
	
	private Element createPresenceElm(String locationStr){
		Element presenceElm = new Element("Presence");
		presenceElm.addAttribute(new Attribute("location", locationStr));
		return presenceElm;
	}
	
	private Element createValuedElm(String locationStr){
		Element valuedElm = new Element("Valued");
		valuedElm.addAttribute(new Attribute("location", locationStr));
		return valuedElm;
	}
	
	private Element createValueFormatCheckElm(String locationStr, String formatDef){
		Element regexElm = new Element("Regex");
		regexElm.addAttribute(new Attribute("location", locationStr));
		regexElm.addAttribute(new Attribute("regex", this.genRegex(formatDef)));
		return regexElm;
	}
	
	private Element createListValuesElm(String locationStr, List<String> literalValues){
		String listValuesString = "";
		for (int i = 0; i < literalValues.size(); i++) {
			if (i == 0)
				listValuesString += literalValues.get(i);
			else
				listValuesString += "," + literalValues.get(i);
		}
		
		Element ListElm = new Element("List");
		ListElm.addAttribute(new Attribute("location", locationStr));
		ListElm.addAttribute(new Attribute("csv", listValuesString));
		
		return ListElm;
		
	}
	
	private Element createValueSetElm(String locationStr, CodeTable valueSet){
		String listValuesString = "";
		for (int i = 0; i < valueSet.getCodes().size(); i++) {
			if (i == 0)
				listValuesString += valueSet.getCodes().get(i).getValue();
			else
				listValuesString += "," + valueSet.getCodes().get(i).getValue();
		}
		
		Element ListElm = new Element("List");
		ListElm.addAttribute(new Attribute("location", locationStr));
		ListElm.addAttribute(new Attribute("csv", listValuesString));
		
		return ListElm;
		
	}
	
	private Element createAssertionElmForSingle(String type) {
		String parentLocation = "";
		
		if(type.equals("cs")){
			parentLocation = "../";
		}else if(type.equals("cp")){
			parentLocation = "./";
		}
		
		
		if (this.getPattern().equals("Constant Value Check")) {
			if (this.getLevel().equals("Message")) {
				int count = StringUtils.countMatches(this.location, ".") + 1;				
				String rootLocation = "";
				
				if(type.equals("cs")){
					for(int i=0; i<count; i++){
						rootLocation = rootLocation + "../";
					}
				}else if(type.equals("cp")){
					for(int i=0; i<count-1; i++){
						rootLocation = rootLocation + "../";
					}
				}
				
				String locationStr = rootLocation + this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.getSubPattern().equals("Single Value")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createSingleValueElm(locationStr, this.literalValue));
					} else {
						return this.createSingleValueElm(locationStr, this.literalValue);
					}
				} else if (this.getSubPattern().equals("List Values")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createListValuesElm(locationStr, this.literalValues));
					} else {
						return this.createListValuesElm(locationStr, this.literalValues);
					}
				} else if (this.getSubPattern().equals("Value Set")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createValueSetElm(locationStr, this.valueSet));
					} else {
						return this.createValueSetElm(locationStr, this.valueSet);
					}
				}
			}else if (this.isPredicate == true) {
				String locationStr = parentLocation +  this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.getSubPattern().equals("Single Value")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createSingleValueElm(locationStr, this.literalValue));
					} else {
						return this.createSingleValueElm(locationStr, this.literalValue);
					}
				} else if (this.getSubPattern().equals("List Values")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createListValuesElm(locationStr, this.literalValues));
					} else {
						return this.createListValuesElm(locationStr, this.literalValues);
					}
				} else if (this.getSubPattern().equals("Value Set")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createValueSetElm(locationStr, this.valueSet));
					} else {
						return this.createValueSetElm(locationStr, this.valueSet);
					}
				}
			}else if (this.getLevel().equals("DataType")) {
				String locationStr = ".";
				
				if(type.equals("cp")){
					locationStr = parentLocation +  this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				}
				
				if (this.getSubPattern().equals("Single Value")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createSingleValueElm(locationStr, this.literalValue));
					} else {
						return this.createSingleValueElm(locationStr, this.literalValue);
					}
				} else if (this.getSubPattern().equals("List Values")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createListValuesElm(locationStr, this.literalValues));
					} else {
						return this.createListValuesElm(locationStr, this.literalValues);
					}
				} else if (this.getSubPattern().equals("Value Set")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createValueSetElm(locationStr, this.valueSet));
					} else {
						return this.createValueSetElm(locationStr, this.valueSet);
					}
				}
			}else if (this.getLevel().equals("Segment")) {
				String locationStr = ".";
				
				if(this.targetNodeLocation != null){
					locationStr = parentLocation +  this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				}
				
				if (this.getSubPattern().equals("Single Value")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createSingleValueElm(locationStr, this.literalValue));
					} else {
						return this.createSingleValueElm(locationStr, this.literalValue);
					}
				} else if (this.getSubPattern().equals("List Values")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createListValuesElm(locationStr, this.literalValues));
					} else {
						return this.createListValuesElm(locationStr, this.literalValues);
					}
				} else if (this.getSubPattern().equals("Value Set")) {
					if (this.verb.contains("NOT") || this.verb.contains("not")) {
						return this.createNotElm(this.createValueSetElm(locationStr, this.valueSet));
					} else {
						return this.createValueSetElm(locationStr, this.valueSet);
					}
				}
			}
		} else if (this.getPattern().equals("Correlation Check")) {
			if (this.getLevel().equals("Message")) {
				int count = StringUtils.countMatches(this.location, ".") + 1;				
				String rootLocation = "";
				
				if(type.equals("cs")){
					for(int i=0; i<count; i++){
						rootLocation = rootLocation + "../";
					}
				}else if(type.equals("cp")){
					for(int i=0; i<count-1; i++){
						rootLocation = rootLocation + "../";
					}
				}
				
				String locationStr1 = rootLocation + this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				String locationStr2 = rootLocation + this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.verb.contains("NOT") || this.verb.contains("not")) {
					return this.createNotElm(this.createCorrelationCheckElm(locationStr1, locationStr2));
				} else {
					return this.createCorrelationCheckElm(locationStr1, locationStr2);
				}
			}else if (this.isPredicate == true) {
				String locationStr1 = parentLocation + this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				String locationStr2 = parentLocation + this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.verb.contains("NOT") || this.verb.contains("not")) {
					return this.createNotElm(this.createCorrelationCheckElm(locationStr1, locationStr2));
				} else {
					return this.createCorrelationCheckElm(locationStr1, locationStr2);
				}
			}else if (this.getLevel().equals("DataType")) {
				String locationStr1 = ".";
				if(type.equals("cp")){
					locationStr1 = parentLocation +  this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				}
				String locationStr2 = parentLocation + this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.verb.contains("NOT") || this.verb.contains("not")) {
					return this.createNotElm(this.createCorrelationCheckElm(locationStr1, locationStr2));
				} else {
					return this.createCorrelationCheckElm(locationStr1, locationStr2);
				}
			}else if (this.getLevel().equals("Segment")) {
				String locationStr1 = ".";
				
				if(this.targetNodeLocation != null){
					locationStr1 = parentLocation +  this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				}
				
				String locationStr2 = parentLocation + this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.verb.contains("NOT") || this.verb.contains("not")) {
					return this.createNotElm(this.createCorrelationCheckElm(locationStr1, locationStr2));
				} else {
					return this.createCorrelationCheckElm(locationStr1, locationStr2);
				}
			} 
		} else if (this.getPattern().equals("Presence Check")) {
			if (this.getLevel().equals("Message")) {
				int count = StringUtils.countMatches(this.location, ".") + 1;				
				String rootLocation = "";
				
				if(type.equals("cs")){
					for(int i=0; i<count; i++){
						rootLocation = rootLocation + "../";
					}
				}else if(type.equals("cp")){
					for(int i=0; i<count-1; i++){
						rootLocation = rootLocation + "../";
					}
				}
				
				String locationStr = rootLocation + this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.verb.contains("NOT") || this.verb.contains("not")) {
					return this.createNotElm(this.createPresenceElm(locationStr));
				} else {
					return this.createPresenceElm(locationStr);
				}
			}else{
				String locationStr = parentLocation + this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if (this.verb.contains("NOT") || this.verb.contains("not")) {
					return this.createNotElm(this.createPresenceElm(locationStr));
				} else {
					return this.createPresenceElm(locationStr);
				}
			}
		} else if (this.getPattern().equals("Value Format Check")) {
			if (this.getLevel().equals("Message")) {
				int count = StringUtils.countMatches(this.location, ".") + 1;				
				String rootLocation = "";
				
				if(type.equals("cs")){
					for(int i=0; i<count; i++){
						rootLocation = rootLocation + "../";
					}
				}else if(type.equals("cp")){
					for(int i=0; i<count-1; i++){
						rootLocation = rootLocation + "../";
					}
				}
				
				String locationStr = rootLocation + this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if(this.verb.contains("NOT") || this.verb.contains("not")){
					return this.createNotElm(this.createValueFormatCheckElm(locationStr, this.formatDef));
				} else {
					return this.createValueFormatCheckElm(locationStr, this.formatDef);
				}
			}else if (this.isPredicate == true) {
				String locationStr = parentLocation + this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				
				if(this.verb.contains("NOT") || this.verb.contains("not")){
					return this.createNotElm(this.createValueFormatCheckElm(locationStr, this.formatDef));
				} else {
					return this.createValueFormatCheckElm(locationStr, this.formatDef);
				}
			}else if (this.getLevel().equals("DataType")) {
				String locationStr = ".";
				if(type.equals("cp")){
					locationStr = parentLocation +  this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				}
				
				if(this.verb.contains("NOT") || this.verb.contains("not")){
					return this.createNotElm(this.createValueFormatCheckElm(locationStr, this.formatDef));
				} else {
					return this.createValueFormatCheckElm(locationStr, this.formatDef);
				}
			}else if (this.getLevel().equals("Segment")) {
				String locationStr = ".";
				
				if(this.targetNodeLocation != null){
					locationStr = parentLocation +  this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1).replace(".", "/");
				}
				
				if(this.verb.contains("NOT") || this.verb.contains("not")){
					return this.createNotElm(this.createValueFormatCheckElm(locationStr, this.formatDef));
				} else {
					return this.createValueFormatCheckElm(locationStr, this.formatDef);
				}
			}
		}
		return	null;
	}
//Tempolary just Check the format
	private String genRegex(String format){		
		if(format.equals("YYYY")){
			return "(([0-9]{4})|(([0-9]{4})((0[1-9])|(1[0-2])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]))";
		} else if(format.equals("YYYYMM")){
			return "((([0-9]{4})((0[1-9])|(1[0-2])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]))";
		} else if(format.equals("YYYYMMDD")){
			return "((([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]))";
		} else if(format.equals("YYYYMMDDHH")){
			return "((([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3])))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]))";
		} else if(format.equals("YYYYMMDDHHMM")){
			return "((([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]))";
		} else if(format.equals("YYYYMMDDHHMMSS")){
			return "((([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]))|(([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]))";
		} else if(format.equals("YYYYMMDDHHMMSS.ssss")){
			return "((([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]))";
		} else if(format.equals("YYYY+-ZZZZ")){
			return "([0-9]{4}).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("YYYYMM+-ZZZZ")){
			return "([0-9]{4})((0[1-9])|(1[0-2])).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("YYYYMMDD+-ZZZZ")){
			return "([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1])).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("YYYYMMDDHH+-ZZZZ")){
			return "([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3])).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("YYYYMMDDHHMM+-ZZZZ")){
			return "([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9]).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("YYYYMMDDHHMMSS+-ZZZZ")){
			return "([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("YYYYMMDDHHMMSS.ssss+-ZZZZ")){
			return "([0-9]{4})((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]((\\+|\\-)[0-9]{4})";
		} else if(format.equals("HH")){
			return "(([0-1][0-9])|(2[0-3])).*";
		} else if(format.equals("HHMM")){
			return "(([0-1][0-9])|(2[0-3]))([0-5][0-9]).*";
		} else if(format.equals("HHMMSS")){
			return "(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]).*";
		} else if(format.equals("HHMMSS.ssss")){
			return "(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9].*";
		} else if(format.equals("HH+-ZZZZ")){
			return "(([0-1][0-9])|(2[0-3])).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("HHMM+-ZZZZ")){
			return "(([0-1][0-9])|(2[0-3]))([0-5][0-9]).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("HHMMSS+-ZZZZ")){
			return "(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9]).*((\\+|\\-)[0-9]{4})";
		} else if(format.equals("HHMMSS.ssss+-ZZZZ")){
			return "(([0-1][0-9])|(2[0-3]))([0-5][0-9])([0-5][0-9])\\.[0-9][0-9][0-9][0-9]((\\+|\\-)[0-9]{4})";
		} else if(format.equals("ISO-compliant OID")){
			return "[0-2](\\.(0|[1-9][0-9]*))*";
		}
		
		System.out.println("[Warning]Not installed Regexp");
		return format;
	}
	
	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}
	
	public boolean isMultiOccurenceForAnotherNodeLocation(){
		if(this.anotherNodeLocation == null){
			return false;
		}else {
			if(this.anotherNodeLocation.contains("*")) return true;
			else if(this.anotherNodeLocation.contains("OBX.5")) return true;
			return false;
		}
	}
	
	public boolean isMultiOccurenceForTargetNodeLocation(){
		if(this.targetNodeLocation == null){
			return false;
		}else {
			if(this.targetNodeLocation.contains("*")) return true;
			else if(this.targetNodeLocation.contains("OBX.5")) return true;
			return false;
		}
	}

	@Override
	public String toString() {
		return "StatementDetails [id=" + id + ", name=" + name + ", level="
				+ level + ", location=" + location + ", constructionType="
				+ constructionType + ", pattern=" + pattern + ", subPattern="
				+ subPattern + ", statementText=" + statementText
				+ ", targetObjectName=" + targetObjectName + ", targetName="
				+ targetName + ", path=" + path + ", rootPath=" + rootPath
				+ ", isPredicate=" + isPredicate + ", trueUsage=" + trueUsage
				+ ", falseUsage=" + falseUsage + ", literalValue="
				+ literalValue + ", nonliteralValue=" + nonliteralValue
				+ ", valueSet=" + valueSet + ", newValueInList="
				+ newValueInList + ", literalValues=" + literalValues
				+ ", number=" + number + ", sign=" + sign
				+ ", targetNodeLocation=" + targetNodeLocation
				+ ", targetNodeName=" + targetNodeName
				+ ", anotherNodeLocation=" + anotherNodeLocation
				+ ", anotherNodeName=" + anotherNodeName
				+ ", relationshipName=" + relationshipName + ", formatDef="
				+ formatDef + ", freetext=" + freetext + ", verb=" + verb
				+ ", ifStatement=" + ifStatement + ", thenStatement="
				+ thenStatement + ", multiStatements=" + multiStatements
				+ ", numStatements=" + numStatements + ", logicalConjunction="
				+ logicalConjunction + ", complexlogicalConjunction="
				+ complexlogicalConjunction + ", multiSubPatterns="
				+ multiSubPatterns + "]";
	}
	
	//NEW Constraints
	private String genLocation(String type){
		String targetLocation = "NOLOCATION.";
		if (this.getLevel().equals("DataType")) {
			if(type.equals("cp")){
				if(targetNodeLocation != null) {						
					targetLocation = addInstanceNum(this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1));
				}
			}else{
				targetLocation = this.location + "[1]";
			}
		}else if (this.getLevel().equals("Segment")) {
			if(targetNodeLocation != null) {						
				targetLocation = addInstanceNum(this.targetNodeLocation.substring(this.targetNodeLocation.indexOf(".") + 1));
			}
		}
		
		return targetLocation;
	}
	
	private String addInstanceNum(String location){
		String [] ss = location.split("\\.");
		String result = "";
		for(int i=0; i<ss.length; i++){
			if(!ss[i].contains("[") || !ss[i].contains("]")) result = result + ss[i] + "[1].";
			else result = result + ss[i] + ".";
		}
			
		result = result.substring(0, result.length() -1 );
		
		return result;
	}
	
	public Element serializeConstraints(String type){		
		if(type.equals("cs")){
			Element elmAssertion = new Element("Assertion");
			Element elm = this.assertionElm(type);
			if(elm != null){
				elmAssertion.appendChild(elm);
				return elmAssertion;
			}
		}else if(type.equals("cp")){
			Element elmCondition = new Element("Condition");
			Element elm = this.assertionElm(type);
			if(elm != null){
				elmCondition.appendChild(elm);
				return elmCondition;
			}
		}
		
		return null;
	}
	
	private Element assertionElm(String type){
		if (this.getConstructionType().equals("Single")) {
			if(this.verb != null){
				if (this.verb.contains("NOT") || this.verb.contains("not")){
					Element elmNOT = new Element("NOT");
					Element elm = this.singleAssertionElm(type);
					if(elm != null){
						elmNOT.appendChild(elm);
						return elmNOT;
					}
				}else{
					Element elm = this.singleAssertionElm(type);
					
					if(elm != null){
						return elm;
					}
				}
			}
		} else if (this.constructionType.equals("IfThen")) {
			Element elmOR = new Element("OR");
			Element ifElm = this.ifStatement.assertionElm("CS");
			Element notIfElm = new Element("NOT");
			notIfElm.appendChild(ifElm);
			Element thenElm = this.thenStatement.assertionElm("CS");
			
			if(ifElm != null && thenElm != null){
				elmOR.appendChild(notIfElm);
				elmOR.appendChild(thenElm);
				return elmOR;
			}
			
			
		} else if (this.constructionType.equals("Multi")) {
			boolean checkNull = false;
			
			for(StatementDetails s: this.multiStatements){
				if(s.assertionElm(type) == null){
					checkNull = true;
				}
			}
			
			if(!checkNull){
				if(this.logicalConjunction.equals("AND")){
					Element andElm = new Element("AND");
					andElm.appendChild(this.multiStatements.get(0).assertionElm(type));
					Element currentElm = andElm;
					for(int i=1; i<this.multiStatements.size();i++){
						if(i == this.multiStatements.size()-1){
							currentElm.appendChild(this.multiStatements.get(i).assertionElm(type));
						}else {
							Element subANDElm = new Element("AND");
							subANDElm.appendChild(this.multiStatements.get(i).assertionElm(type));
							currentElm.appendChild(subANDElm);
							currentElm = subANDElm;
						}
						
					}
					return andElm;
					
				}else if(this.logicalConjunction.equals("OR")){
					Element orElm = new Element("OR");
					orElm.appendChild(this.multiStatements.get(0).assertionElm(type));
					Element currentElm = orElm;
					for(int i=1; i<this.multiStatements.size();i++){
						if(i == this.multiStatements.size()-1){
							currentElm.appendChild(this.multiStatements.get(i).assertionElm(type));
						}else {
							Element subOrElm = new Element("OR");
							subOrElm.appendChild(this.multiStatements.get(i).assertionElm(type));
							currentElm.appendChild(subOrElm);
							currentElm = subOrElm;
						}
						
					}
					return orElm;

				}else if(this.logicalConjunction.equals("Complex")){
					if(this.numStatements == 3){
						String simpleForm = this.complexlogicalConjunction.replace("Statement_#1", "").replace("Statement_#2", "").replace("Statement_#3", "").replace(" ", "");
						if(simpleForm.equalsIgnoreCase("ifandthen")){
							Element elmOR = new Element("OR");
							Element andElm = new Element("AND");
							andElm.appendChild(this.multiStatements.get(0).assertionElm(type));
							andElm.appendChild(this.multiStatements.get(1).assertionElm(type));
							Element notAndElm = new Element("NOT");
							notAndElm.appendChild(andElm);
							
							elmOR.appendChild(notAndElm);
							elmOR.appendChild(this.multiStatements.get(2).assertionElm(type));
							return elmOR;
						}else if(simpleForm.equalsIgnoreCase("iforthen")){
							Element elmOR = new Element("OR");
							Element orElm = new Element("OR");
							orElm.appendChild(this.multiStatements.get(0).assertionElm(type));
							orElm.appendChild(this.multiStatements.get(1).assertionElm(type));
							Element notOrElm = new Element("NOT");
							notOrElm.appendChild(orElm);
							
							elmOR.appendChild(notOrElm);
							elmOR.appendChild(this.multiStatements.get(2).assertionElm(type));
							return elmOR;
						}else if(simpleForm.equalsIgnoreCase("ifthenor")){
							Element elmOR = new Element("OR");
							Element bORc = new Element("OR");
							bORc.appendChild(this.multiStatements.get(1).assertionElm(type));
							bORc.appendChild(this.multiStatements.get(2).assertionElm(type));
							Element notA = new Element("NOT");
							notA.appendChild(this.multiStatements.get(0).assertionElm(type));
							
							elmOR.appendChild(notA);
							elmOR.appendChild(bORc);
							return elmOR;
						}else if(simpleForm.equalsIgnoreCase("ifthenand")){
							Element elmOR = new Element("OR");
							Element bAndC = new Element("AND");
							bAndC.appendChild(this.multiStatements.get(1).assertionElm(type));
							bAndC.appendChild(this.multiStatements.get(2).assertionElm(type));
							Element notA = new Element("NOT");
							notA.appendChild(this.multiStatements.get(0).assertionElm(type));
							elmOR.appendChild(notA);
							elmOR.appendChild(bAndC);
							return elmOR;
						}
						
					}else if(this.numStatements == 4){
						String simpleForm = this.complexlogicalConjunction.replace("Statement_#1", "").replace("Statement_#2", "").replace("Statement_#3", "").replace("Statement_#4", "").replace(" ", "");
						if(simpleForm.equalsIgnoreCase("ifandthenand")){
							Element elmOR = new Element("OR");
							Element aANDb = new Element("AND");
							aANDb.appendChild(this.multiStatements.get(0).assertionElm(type));
							aANDb.appendChild(this.multiStatements.get(1).assertionElm(type));
							Element cANDd = new Element("AND");
							cANDd.appendChild(this.multiStatements.get(2).assertionElm(type));
							cANDd.appendChild(this.multiStatements.get(3).assertionElm(type));
							Element notAandB = new Element("NOT");
							notAandB.appendChild(aANDb);
							elmOR.appendChild(notAandB);
							elmOR.appendChild(cANDd);
							return elmOR;
							
						}if(simpleForm.equalsIgnoreCase("ifandthenor")){
							Element elmOR = new Element("OR");
							Element aANDb = new Element("AND");
							aANDb.appendChild(this.multiStatements.get(0).assertionElm(type));
							aANDb.appendChild(this.multiStatements.get(1).assertionElm(type));
							Element cORd = new Element("OR");
							cORd.appendChild(this.multiStatements.get(2).assertionElm(type));
							cORd.appendChild(this.multiStatements.get(3).assertionElm(type));
							Element notAandB = new Element("NOT");
							notAandB.appendChild(aANDb);
							elmOR.appendChild(notAandB);
							elmOR.appendChild(cORd);
							return elmOR;
							
						}if(simpleForm.equalsIgnoreCase("iforthenand")){
							Element elmOR = new Element("OR");
							Element aORb = new Element("OR");
							aORb.appendChild(this.multiStatements.get(0).assertionElm(type));
							aORb.appendChild(this.multiStatements.get(1).assertionElm(type));
							Element cANDd = new Element("AND");
							cANDd.appendChild(this.multiStatements.get(2).assertionElm(type));
							cANDd.appendChild(this.multiStatements.get(3).assertionElm(type));
							Element notAorB = new Element("NOT");
							notAorB.appendChild(aORb);
							elmOR.appendChild(notAorB);
							elmOR.appendChild(cANDd);
							return elmOR;
						}if(simpleForm.equalsIgnoreCase("iforthenor")){
							Element elmOR = new Element("OR");
							Element aORb = new Element("OR");
							aORb.appendChild(this.multiStatements.get(0).assertionElm(type));
							aORb.appendChild(this.multiStatements.get(1).assertionElm(type));
							Element cORd = new Element("OR");
							cORd.appendChild(this.multiStatements.get(2).assertionElm(type));
							cORd.appendChild(this.multiStatements.get(3).assertionElm(type));
							Element notAorB = new Element("NOT");
							notAorB.appendChild(aORb);
							elmOR.appendChild(notAorB);
							elmOR.appendChild(cORd);
							return elmOR;
						}
					}		
				}
			}
		}
		return null;
	}
	
	private Element singleAssertionElm(String type){
		String targetLocation = this.genLocation(type);
		
		
		if(this.getPattern().equals("Constant Value Check")){
			if (this.getSubPattern().equals("Single Value")) {
				if (this.literalValue.contains("^") && !this.targetName.equals("Encoding Characters")) {
					String[] splitedComponents = this.literalValue.split("\\^");
					
					
					Element andElm = new Element("AND");
					
					Element firstElmPlainText = new Element("PlainText");
					firstElmPlainText.addAttribute(new Attribute("Path", targetLocation + "." + 1 + "[1]"));
					firstElmPlainText.addAttribute(new Attribute("Text", splitedComponents[0]));
					firstElmPlainText.addAttribute(new Attribute("IgnoreCase", "false"));
					andElm.appendChild(firstElmPlainText);
					
					Element currentElm = andElm;
					for(int i=1; i<splitedComponents.length;i++){
						if(i == splitedComponents.length-1){
							Element elmPlainText = new Element("PlainText");
							elmPlainText.addAttribute(new Attribute("Path", targetLocation + "." + (i+1) + "[1]"));
							elmPlainText.addAttribute(new Attribute("Text", splitedComponents[i]));
							elmPlainText.addAttribute(new Attribute("IgnoreCase", "false"));
							currentElm.appendChild(elmPlainText);
						}else {
							Element subANDElm = new Element("AND");
							
							Element elmPlainText = new Element("PlainText");
							elmPlainText.addAttribute(new Attribute("Path", targetLocation + "." + (i+1) + "[1]"));
							elmPlainText.addAttribute(new Attribute("Text", splitedComponents[i]));
							elmPlainText.addAttribute(new Attribute("IgnoreCase", "false"));
							subANDElm.appendChild(elmPlainText);
							currentElm.appendChild(subANDElm);
							currentElm = subANDElm;
						}
						
					}
					
					return andElm;
				}else {
					Element elmPlainText = new Element("PlainText");
					elmPlainText.addAttribute(new Attribute("Path", targetLocation));
					elmPlainText.addAttribute(new Attribute("Text", this.getLiteralValue()));
					elmPlainText.addAttribute(new Attribute("IgnoreCase", "false"));
					return elmPlainText;
				}
			}	else if (this.getSubPattern().equals("List Values")) {
				Element elmStringList = new Element("StringList");
				String listValuesString = "";
				for (int i = 0; i < literalValues.size(); i++) {
					if (i == 0)
						listValuesString += literalValues.get(i);
					else
						listValuesString += "," + literalValues.get(i);
				}
				elmStringList.addAttribute(new Attribute("Path", targetLocation));
				elmStringList.addAttribute(new Attribute("CSV", listValuesString));
				return elmStringList;
			}	else if (this.getSubPattern().equals("Value Set")) {
				Element elmStringList = new Element("StringList");
				String listValuesString = "";
				for (int i = 0; i < valueSet.getCodes().size(); i++) {
					if (i == 0)
						listValuesString += valueSet.getCodes().get(i).getValue();
					else
						listValuesString += "," + valueSet.getCodes().get(i).getValue();
				}
				elmStringList.addAttribute(new Attribute("Path", targetLocation));
				elmStringList.addAttribute(new Attribute("CSV", listValuesString));
				return elmStringList;
			}
		} else if (this.getPattern().equals("Value Format Check")) {
			Element elmFormat = new Element("Format");
			elmFormat.addAttribute(new Attribute("Path", targetLocation));
			elmFormat.addAttribute(new Attribute("Regex",  this.genRegex(formatDef)));
			return elmFormat;
		} else if (this.getPattern().equals("Correlation Check")) {
			String anotherLocationStr = addInstanceNum( this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1));
			Element elmPathValue = new Element("PathValue");
			elmPathValue.addAttribute(new Attribute("Path1", targetLocation));
			elmPathValue.addAttribute(new Attribute("Operator", "EQ"));
			elmPathValue.addAttribute(new Attribute("Path2", anotherLocationStr));
			return elmPathValue;
		} else if (this.getPattern().equals("Presence Check")) {
			String anotherLocationStr = addInstanceNum( this.anotherNodeLocation.substring(this.anotherNodeLocation.indexOf(".") + 1));
			Element elmPresence = new Element("Presence");
			elmPresence.addAttribute(new Attribute("Path", anotherLocationStr));
			return elmPresence;
		}
		
		return null;
	}
	
	
}
