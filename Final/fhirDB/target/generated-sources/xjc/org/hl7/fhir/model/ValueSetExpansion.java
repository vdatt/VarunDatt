//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package org.hl7.fhir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Expansion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Expansion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="contains" type="{http://hl7.org/fhir}ValueSet.Contains" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Expansion", propOrder = {
    "identifier",
    "timestamp",
    "contains"
})
@Entity(name = "ValueSetExpansion")
@Table(name = "VALUESETEXPANSION")
public class ValueSetExpansion
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Identifier identifier;
    @XmlElement(required = true)
    protected Instant timestamp;
    protected List<ValueSetContains> contains;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_VALUESETEXPANSION_0")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    @ManyToOne(targetEntity = Instant.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMESTAMP__VALUESETEXPANSION_0")
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setTimestamp(Instant value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the contains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetContains }
     * 
     * 
     */
    @OneToMany(targetEntity = ValueSetContains.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTAINS__VALUESETEXPANSION__0")
    public List<ValueSetContains> getContains() {
        if (contains == null) {
            contains = new ArrayList<ValueSetContains>();
        }
        return this.contains;
    }

    /**
     * 
     * 
     */
    public void setContains(List<ValueSetContains> contains) {
        this.contains = contains;
    }

    public ValueSetExpansion withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public ValueSetExpansion withTimestamp(Instant value) {
        setTimestamp(value);
        return this;
    }

    public ValueSetExpansion withContains(ValueSetContains... values) {
        if (values!= null) {
            for (ValueSetContains value: values) {
                getContains().add(value);
            }
        }
        return this;
    }

    public ValueSetExpansion withContains(Collection<ValueSetContains> values) {
        if (values!= null) {
            getContains().addAll(values);
        }
        return this;
    }

    public ValueSetExpansion withContains(List<ValueSetContains> contains) {
        setContains(contains);
        return this;
    }

    @Override
    public ValueSetExpansion withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetExpansion withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetExpansion withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ValueSetExpansion withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetExpansion withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetExpansion withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ValueSetExpansion withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValueSetExpansion)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ValueSetExpansion that = ((ValueSetExpansion) object);
        {
            Identifier lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Identifier rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            Instant lhsTimestamp;
            lhsTimestamp = this.getTimestamp();
            Instant rhsTimestamp;
            rhsTimestamp = that.getTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timestamp", lhsTimestamp), LocatorUtils.property(thatLocator, "timestamp", rhsTimestamp), lhsTimestamp, rhsTimestamp)) {
                return false;
            }
        }
        {
            List<ValueSetContains> lhsContains;
            lhsContains = (((this.contains!= null)&&(!this.contains.isEmpty()))?this.getContains():null);
            List<ValueSetContains> rhsContains;
            rhsContains = (((that.contains!= null)&&(!that.contains.isEmpty()))?that.getContains():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contains", lhsContains), LocatorUtils.property(thatLocator, "contains", rhsContains), lhsContains, rhsContains)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            Instant theTimestamp;
            theTimestamp = this.getTimestamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timestamp", theTimestamp), currentHashCode, theTimestamp);
        }
        {
            List<ValueSetContains> theContains;
            theContains = (((this.contains!= null)&&(!this.contains.isEmpty()))?this.getContains():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contains", theContains), currentHashCode, theContains);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
