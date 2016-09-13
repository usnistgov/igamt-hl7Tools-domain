/**
 * 
 */
package gov.nist.healthcare.hl7tools.domain.util;

import java.util.UUID;

/**
 * @author Harold Affo (NIST)
 */
public class IdHelper {
    public static String createId() {
        return UUID.randomUUID().toString();
    }

}
