/**
 * 
 */
package gov.nist.healthcare.hl7tools.domain.util;

import gov.nist.healthcare.hl7tools.domain.Usage;

/**
 * @author Harold Affo
 */
public class UsageUtils {

    public static Usage[] usages = Usage.values();

    public static Usage getUsage(String value) {
        for (Usage usage : usages) {
            if (usage.getValue().equals(value)) {
                return usage;
            }
        }
        throw new RuntimeException("Unknown Usage " + value);
    }

    public static boolean usageEqualsConditionalUsage(String reference,
            String toBeUsage) {
        if (!isConditionalUsage(reference) || !isConditionalUsage(toBeUsage)) {
            return false;
        } else {
            return reference.charAt(2) == toBeUsage.charAt(2)
                    && reference.charAt(4) == toBeUsage.charAt(4);
        }
    }

    public static boolean isConditionalUsage(String usage) {
        return usage.contains("C(");
    }

    public static boolean isConditionalUsage(Usage usage) {
        return usage.getValue().contains("C(");
    }

}
