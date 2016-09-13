package gov.nist.healthcare.hl7tools.domain.util;

import gov.nist.healthcare.hl7tools.domain.CodeTable;
import gov.nist.healthcare.hl7tools.domain.Component;
import gov.nist.healthcare.hl7tools.domain.Datatype;
import gov.nist.healthcare.hl7tools.domain.Element;
import gov.nist.healthcare.hl7tools.domain.ElementType;
import gov.nist.healthcare.hl7tools.domain.Field;
import gov.nist.healthcare.hl7tools.domain.Message;
import gov.nist.healthcare.hl7tools.domain.Segment;
import java.util.Set;

public class CachedValueIntializor {

    public static void init(Message message, Set<CodeTable> codeTableSet,
            Set<Datatype> datatypeSet, Set<Segment> segmentSet) {
        visitMessage(message, codeTableSet, datatypeSet, segmentSet);
    }

    public static void visitMessage(Message message,
            Set<CodeTable> codeTableSet, Set<Datatype> datatypeSet,
            Set<Segment> segmentSet) {
        if (message != null && message.getChildren() != null) {
            for (Element element : message.getChildren()) {
                visitElement(element, codeTableSet, datatypeSet, segmentSet);
            }
        }
    }

    public static void visitElement(Element element,
            Set<CodeTable> codeTableSet, Set<Datatype> datatypeSet,
            Set<Segment> segmentSet) {
        if (element != null)
            if (element.getType() == ElementType.SEGEMENT)
                visitSegment(element.getSegment(), codeTableSet, datatypeSet,
                        segmentSet);
            else {
                if (element.getChildren() != null) {
                    for (Element child : element.getChildren())
                        visitElement(child, codeTableSet, datatypeSet,
                                segmentSet);
                }
            }
    }

    public static void visitSegment(Segment segment,
            Set<CodeTable> codeTableSet, Set<Datatype> datatypeSet,
            Set<Segment> segmentSet) {
        if (segment != null) {
            // Register the segment
            segmentSet.add(segment);
            if (segment.getFields() != null) {
                for (Field f : segment.getFields())
                    visitField(f, codeTableSet, datatypeSet, segmentSet);
            }
        }
    }

    public static void visitField(Field field, Set<CodeTable> codeTableSet,
            Set<Datatype> datatypeSet, Set<Segment> segmentSet) {
        if (field != null) {
            if (field.getCodeTable() != null)
                // Register the code table
                codeTableSet.add(field.getCodeTable());
            visitDatatype(field.getDatatype(), codeTableSet, datatypeSet,
                    segmentSet);
        }
    }

    public static void visitDatatype(Datatype datatype,
            Set<CodeTable> codeTableSet, Set<Datatype> datatypeSet,
            Set<Segment> segmentSet) {
        if (datatype != null) {// Register the data type
            datatypeSet.add(datatype);
            if (datatype.getComponents() != null) {
                for (Component c : datatype.getComponents()) {
                    if (c.getCodeTable() != null)
                        // Register the code table
                        codeTableSet.add(c.getCodeTable());
                    visitDatatype(c.getDatatype(), codeTableSet, datatypeSet,
                            segmentSet);
                }
            }
        }
    }
}
