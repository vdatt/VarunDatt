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
 * Significant health events and conditions for people related to the subject relevant in the context of care for the subject.
 * 
 * <p>Java class for FamilyHistory.Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyHistory.Condition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="onsetAge" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="onsetRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="onsetString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistory.Condition", propOrder = {
    "type",
    "outcome",
    "onsetString",
    "onsetRange",
    "onsetAge",
    "note"
})
@Entity(name = "FamilyHistoryCondition")
@Table(name = "FAMILYHISTORYCONDITION")
public class FamilyHistoryCondition
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected CodeableConcept outcome;
    protected org.hl7.fhir.model.String onsetString;
    protected Range onsetRange;
    protected Age onsetAge;
    protected org.hl7.fhir.model.String note;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__FAMILYHISTORYCONDITION_0")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OUTCOME_FAMILYHISTORYCONDITI_0")
    public CodeableConcept getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setOutcome(CodeableConcept value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the onsetString property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ONSETSTRING_FAMILYHISTORYCON_0")
    public org.hl7.fhir.model.String getOnsetString() {
        return onsetString;
    }

    /**
     * Sets the value of the onsetString property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setOnsetString(org.hl7.fhir.model.String value) {
        this.onsetString = value;
    }

    /**
     * Gets the value of the onsetRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    @ManyToOne(targetEntity = Range.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ONSETRANGE_FAMILYHISTORYCOND_0")
    public Range getOnsetRange() {
        return onsetRange;
    }

    /**
     * Sets the value of the onsetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setOnsetRange(Range value) {
        this.onsetRange = value;
    }

    /**
     * Gets the value of the onsetAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    @ManyToOne(targetEntity = Age.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ONSETAGE_FAMILYHISTORYCONDIT_0")
    public Age getOnsetAge() {
        return onsetAge;
    }

    /**
     * Sets the value of the onsetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setOnsetAge(Age value) {
        this.onsetAge = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NOTE_FAMILYHISTORYCONDITION__0")
    public org.hl7.fhir.model.String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setNote(org.hl7.fhir.model.String value) {
        this.note = value;
    }

    public FamilyHistoryCondition withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public FamilyHistoryCondition withOutcome(CodeableConcept value) {
        setOutcome(value);
        return this;
    }

    public FamilyHistoryCondition withOnsetString(org.hl7.fhir.model.String value) {
        setOnsetString(value);
        return this;
    }

    public FamilyHistoryCondition withOnsetRange(Range value) {
        setOnsetRange(value);
        return this;
    }

    public FamilyHistoryCondition withOnsetAge(Age value) {
        setOnsetAge(value);
        return this;
    }

    public FamilyHistoryCondition withNote(org.hl7.fhir.model.String value) {
        setNote(value);
        return this;
    }

    @Override
    public FamilyHistoryCondition withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistoryCondition withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistoryCondition withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public FamilyHistoryCondition withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistoryCondition withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistoryCondition withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public FamilyHistoryCondition withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FamilyHistoryCondition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FamilyHistoryCondition that = ((FamilyHistoryCondition) object);
        {
            CodeableConcept lhsType;
            lhsType = this.getType();
            CodeableConcept rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            CodeableConcept lhsOutcome;
            lhsOutcome = this.getOutcome();
            CodeableConcept rhsOutcome;
            rhsOutcome = that.getOutcome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outcome", lhsOutcome), LocatorUtils.property(thatLocator, "outcome", rhsOutcome), lhsOutcome, rhsOutcome)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsOnsetString;
            lhsOnsetString = this.getOnsetString();
            org.hl7.fhir.model.String rhsOnsetString;
            rhsOnsetString = that.getOnsetString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onsetString", lhsOnsetString), LocatorUtils.property(thatLocator, "onsetString", rhsOnsetString), lhsOnsetString, rhsOnsetString)) {
                return false;
            }
        }
        {
            Range lhsOnsetRange;
            lhsOnsetRange = this.getOnsetRange();
            Range rhsOnsetRange;
            rhsOnsetRange = that.getOnsetRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onsetRange", lhsOnsetRange), LocatorUtils.property(thatLocator, "onsetRange", rhsOnsetRange), lhsOnsetRange, rhsOnsetRange)) {
                return false;
            }
        }
        {
            Age lhsOnsetAge;
            lhsOnsetAge = this.getOnsetAge();
            Age rhsOnsetAge;
            rhsOnsetAge = that.getOnsetAge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onsetAge", lhsOnsetAge), LocatorUtils.property(thatLocator, "onsetAge", rhsOnsetAge), lhsOnsetAge, rhsOnsetAge)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsNote;
            lhsNote = this.getNote();
            org.hl7.fhir.model.String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
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
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            CodeableConcept theOutcome;
            theOutcome = this.getOutcome();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outcome", theOutcome), currentHashCode, theOutcome);
        }
        {
            org.hl7.fhir.model.String theOnsetString;
            theOnsetString = this.getOnsetString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onsetString", theOnsetString), currentHashCode, theOnsetString);
        }
        {
            Range theOnsetRange;
            theOnsetRange = this.getOnsetRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onsetRange", theOnsetRange), currentHashCode, theOnsetRange);
        }
        {
            Age theOnsetAge;
            theOnsetAge = this.getOnsetAge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onsetAge", theOnsetAge), currentHashCode, theOnsetAge);
        }
        {
            org.hl7.fhir.model.String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
