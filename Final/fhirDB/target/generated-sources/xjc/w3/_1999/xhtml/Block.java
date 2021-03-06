//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package w3._1999.xhtml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Block">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}p"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h1"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h2"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h3"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h4"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h5"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h6"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}div"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ul"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ol"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dl"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}pre"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}hr"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}blockquote"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}table"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Block", propOrder = {
    "psAndH1SAndH2S"
})
@XmlSeeAlso({
    Blockquote.class
})
public class Block implements Serializable, Equals, HashCode
{

    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "h1", type = H1 .class),
        @XmlElement(name = "h2", type = H2 .class),
        @XmlElement(name = "h3", type = H3 .class),
        @XmlElement(name = "h4", type = H4 .class),
        @XmlElement(name = "h5", type = H5 .class),
        @XmlElement(name = "h6", type = H6 .class),
        @XmlElement(name = "div", type = Div.class),
        @XmlElement(name = "ul", type = Ul.class),
        @XmlElement(name = "ol", type = Ol.class),
        @XmlElement(name = "dl", type = Dl.class),
        @XmlElement(name = "pre", type = Pre.class),
        @XmlElement(name = "hr", type = Hr.class),
        @XmlElement(name = "blockquote", type = Blockquote.class),
        @XmlElement(name = "table", type = Table.class)
    })
    protected List<Object> psAndH1SAndH2S;

    /**
     * Gets the value of the psAndH1SAndH2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psAndH1SAndH2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSAndH1SAndH2S().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link H1 }
     * {@link H2 }
     * {@link H3 }
     * {@link H4 }
     * {@link H5 }
     * {@link H6 }
     * {@link Div }
     * {@link Ul }
     * {@link Ol }
     * {@link Dl }
     * {@link Pre }
     * {@link Hr }
     * {@link Blockquote }
     * {@link Table }
     * 
     * 
     */
    public List<Object> getPSAndH1SAndH2S() {
        if (psAndH1SAndH2S == null) {
            psAndH1SAndH2S = new ArrayList<Object>();
        }
        return this.psAndH1SAndH2S;
    }

    /**
     * 
     * 
     */
    public void setPSAndH1SAndH2S(List<Object> psAndH1SAndH2S) {
        this.psAndH1SAndH2S = psAndH1SAndH2S;
    }

    public Block withPSAndH1SAndH2S(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getPSAndH1SAndH2S().add(value);
            }
        }
        return this;
    }

    public Block withPSAndH1SAndH2S(Collection<Object> values) {
        if (values!= null) {
            getPSAndH1SAndH2S().addAll(values);
        }
        return this;
    }

    public Block withPSAndH1SAndH2S(List<Object> psAndH1SAndH2S) {
        setPSAndH1SAndH2S(psAndH1SAndH2S);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Block)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Block that = ((Block) object);
        {
            List<Object> lhsPSAndH1SAndH2S;
            lhsPSAndH1SAndH2S = (((this.psAndH1SAndH2S!= null)&&(!this.psAndH1SAndH2S.isEmpty()))?this.getPSAndH1SAndH2S():null);
            List<Object> rhsPSAndH1SAndH2S;
            rhsPSAndH1SAndH2S = (((that.psAndH1SAndH2S!= null)&&(!that.psAndH1SAndH2S.isEmpty()))?that.getPSAndH1SAndH2S():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "psAndH1SAndH2S", lhsPSAndH1SAndH2S), LocatorUtils.property(thatLocator, "psAndH1SAndH2S", rhsPSAndH1SAndH2S), lhsPSAndH1SAndH2S, rhsPSAndH1SAndH2S)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Object> thePSAndH1SAndH2S;
            thePSAndH1SAndH2S = (((this.psAndH1SAndH2S!= null)&&(!this.psAndH1SAndH2S.isEmpty()))?this.getPSAndH1SAndH2S():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "psAndH1SAndH2S", thePSAndH1SAndH2S), currentHashCode, thePSAndH1SAndH2S);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
