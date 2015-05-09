//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package org.hl7.fhir.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Constraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Constraint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}ConstraintSeverity"/>
 *         &lt;element name="human" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="xpath" type="{http://hl7.org/fhir}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Constraint", propOrder = {
    "key",
    "name",
    "severity",
    "human",
    "xpath"
})
@Entity(name = "ProfileConstraint")
@Table(name = "PROFILECONSTRAINT")
public class ProfileConstraint
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected Id key;
    protected org.hl7.fhir.model.String name;
    @XmlElement(required = true)
    protected ConstraintSeverity severity;
    @XmlElement(required = true)
    protected org.hl7.fhir.model.String human;
    @XmlElement(required = true)
    protected org.hl7.fhir.model.String xpath;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    @ManyToOne(targetEntity = Id.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "KEY__PROFILECONSTRAINT_HJID")
    public Id getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setKey(Id value) {
        this.key = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__PROFILECONSTRAINT_HJID")
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintSeverity }
     *     
     */
    @ManyToOne(targetEntity = ConstraintSeverity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SEVERITY_PROFILECONSTRAINT_H_0")
    public ConstraintSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintSeverity }
     *     
     */
    public void setSeverity(ConstraintSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the human property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "HUMAN_PROFILECONSTRAINT_HJID")
    public org.hl7.fhir.model.String getHuman() {
        return human;
    }

    /**
     * Sets the value of the human property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setHuman(org.hl7.fhir.model.String value) {
        this.human = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "XPATH_PROFILECONSTRAINT_HJID")
    public org.hl7.fhir.model.String getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setXpath(org.hl7.fhir.model.String value) {
        this.xpath = value;
    }

    public ProfileConstraint withKey(Id value) {
        setKey(value);
        return this;
    }

    public ProfileConstraint withName(org.hl7.fhir.model.String value) {
        setName(value);
        return this;
    }

    public ProfileConstraint withSeverity(ConstraintSeverity value) {
        setSeverity(value);
        return this;
    }

    public ProfileConstraint withHuman(org.hl7.fhir.model.String value) {
        setHuman(value);
        return this;
    }

    public ProfileConstraint withXpath(org.hl7.fhir.model.String value) {
        setXpath(value);
        return this;
    }

    @Override
    public ProfileConstraint withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileConstraint withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileConstraint withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ProfileConstraint withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileConstraint withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileConstraint withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ProfileConstraint withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProfileConstraint)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProfileConstraint that = ((ProfileConstraint) object);
        {
            Id lhsKey;
            lhsKey = this.getKey();
            Id rhsKey;
            rhsKey = that.getKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "key", lhsKey), LocatorUtils.property(thatLocator, "key", rhsKey), lhsKey, rhsKey)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsName;
            lhsName = this.getName();
            org.hl7.fhir.model.String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            ConstraintSeverity lhsSeverity;
            lhsSeverity = this.getSeverity();
            ConstraintSeverity rhsSeverity;
            rhsSeverity = that.getSeverity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "severity", lhsSeverity), LocatorUtils.property(thatLocator, "severity", rhsSeverity), lhsSeverity, rhsSeverity)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsHuman;
            lhsHuman = this.getHuman();
            org.hl7.fhir.model.String rhsHuman;
            rhsHuman = that.getHuman();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "human", lhsHuman), LocatorUtils.property(thatLocator, "human", rhsHuman), lhsHuman, rhsHuman)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsXpath;
            lhsXpath = this.getXpath();
            org.hl7.fhir.model.String rhsXpath;
            rhsXpath = that.getXpath();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xpath", lhsXpath), LocatorUtils.property(thatLocator, "xpath", rhsXpath), lhsXpath, rhsXpath)) {
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
            Id theKey;
            theKey = this.getKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "key", theKey), currentHashCode, theKey);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            ConstraintSeverity theSeverity;
            theSeverity = this.getSeverity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "severity", theSeverity), currentHashCode, theSeverity);
        }
        {
            org.hl7.fhir.model.String theHuman;
            theHuman = this.getHuman();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "human", theHuman), currentHashCode, theHuman);
        }
        {
            org.hl7.fhir.model.String theXpath;
            theXpath = this.getXpath();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xpath", theXpath), currentHashCode, theXpath);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}