//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.04 at 12:30:41 上午 CST 
//


package amazclient.xmlmodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LuminanceUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LuminanceUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lumens"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuminanceUnitOfMeasure")
@XmlEnum
public enum LuminanceUnitOfMeasure {

    @XmlEnumValue("lumens")
    LUMENS("lumens");
    private final String value;

    LuminanceUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuminanceUnitOfMeasure fromValue(String v) {
        for (LuminanceUnitOfMeasure c: LuminanceUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
