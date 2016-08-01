package gov.nist.healthcare.hl7tools.domain;

import java.io.Serializable;

public enum Usage implements Serializable {
    R("R"), RE("RE"), C("C"), CE("CE"), X("X"), O("O"), B("B"), W("W"), F("F"), NA(
            "NA"), C_a_b("C(a/b)"), C_R_R("C(R/R)"), C_R_O("C(R/O)"), C_R_RE(
            "C(R/RE)"), C_R_X("C(R/X)"), C_RE_R("C(RE/R)"), C_RE_RE("C(RE/RE)"), C_RE_O(
            "C(RE/O)"), C_RE_X("C(RE/X)"), C_O_R("C(O/R)"), C_O_RE("C(O/RE)"), C_O_O(
            "C(O/O)"), C_O_X("C(O/X)"), C_X_R("C(X/R)"), C_X_RE("C(X/RE)"), C_X_O(
            "C(X/O)"), VARIES("VARIES"), P("P"), E("E"), C_X_X("C(X/X)");

    private String value;

    Usage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public String getTrueUsage(){
    	if (value.startsWith("C") && value.contains("/")){
    		return value.substring(value.indexOf("(")+1, value.indexOf(")")).split("/")[0];
    	}
    	
    	return "O";
    }
    
    public String getFalseUsage(){
    	if (value.startsWith("C") && value.contains("/")){
    		return value.substring(value.indexOf("(")+1, value.indexOf(")")).split("/")[1];
    	}
    	
    	return "O";
    }
}
