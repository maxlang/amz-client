//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.04 at 12:30:41 上午 CST 
//


package amazclient.xmlmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShoulderHarnessMaximumHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ShoulderHarnessMinimumHeight" type="{}LengthDimension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shoulderHarnessMaximumHeight",
    "shoulderHarnessMinimumHeight"
})
@XmlRootElement(name = "ShoulderHarnessHeight")
public class ShoulderHarnessHeight {

    @XmlElement(name = "ShoulderHarnessMaximumHeight")
    protected LengthDimension shoulderHarnessMaximumHeight;
    @XmlElement(name = "ShoulderHarnessMinimumHeight")
    protected LengthDimension shoulderHarnessMinimumHeight;

    /**
     * Gets the value of the shoulderHarnessMaximumHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getShoulderHarnessMaximumHeight() {
        return shoulderHarnessMaximumHeight;
    }

    /**
     * Sets the value of the shoulderHarnessMaximumHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setShoulderHarnessMaximumHeight(LengthDimension value) {
        this.shoulderHarnessMaximumHeight = value;
    }

    /**
     * Gets the value of the shoulderHarnessMinimumHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getShoulderHarnessMinimumHeight() {
        return shoulderHarnessMinimumHeight;
    }

    /**
     * Sets the value of the shoulderHarnessMinimumHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setShoulderHarnessMinimumHeight(LengthDimension value) {
        this.shoulderHarnessMinimumHeight = value;
    }

}
