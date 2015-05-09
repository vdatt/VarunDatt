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
 * Significant health events and conditions for people related to the subject relevant in the context of care for the subject.
 * 
 * <p>Java class for FamilyHistory.Relation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyHistory.Relation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="bornPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="bornDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="bornString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="deceasedBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="deceasedAge" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="deceasedRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="deceasedDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="deceasedString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://hl7.org/fhir}FamilyHistory.Condition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistory.Relation", propOrder = {
    "name",
    "relationship",
    "bornString",
    "bornDate",
    "bornPeriod",
    "deceasedString",
    "deceasedDate",
    "deceasedRange",
    "deceasedAge",
    "deceasedBoolean",
    "note",
    "conditions"
})
@Entity(name = "FamilyHistoryRelation")
@Table(name = "FAMILYHISTORYRELATION")
public class FamilyHistoryRelation
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected org.hl7.fhir.model.String name;
    @XmlElement(required = true)
    protected CodeableConcept relationship;
    protected org.hl7.fhir.model.String bornString;
    protected Date bornDate;
    protected Period bornPeriod;
    protected org.hl7.fhir.model.String deceasedString;
    protected Date deceasedDate;
    protected Range deceasedRange;
    protected Age deceasedAge;
    protected Boolean deceasedBoolean;
    protected org.hl7.fhir.model.String note;
    @XmlElement(name = "condition")
    protected List<FamilyHistoryCondition> conditions;

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
    @JoinColumn(name = "NAME__FAMILYHISTORYRELATION__0")
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
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATIONSHIP_FAMILYHISTORYRE_0")
    public CodeableConcept getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRelationship(CodeableConcept value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the bornString property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BORNSTRING_FAMILYHISTORYRELA_0")
    public org.hl7.fhir.model.String getBornString() {
        return bornString;
    }

    /**
     * Sets the value of the bornString property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setBornString(org.hl7.fhir.model.String value) {
        this.bornString = value;
    }

    /**
     * Gets the value of the bornDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    @ManyToOne(targetEntity = Date.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BORNDATE_FAMILYHISTORYRELATI_0")
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * Sets the value of the bornDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBornDate(Date value) {
        this.bornDate = value;
    }

    /**
     * Gets the value of the bornPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BORNPERIOD_FAMILYHISTORYRELA_0")
    public Period getBornPeriod() {
        return bornPeriod;
    }

    /**
     * Sets the value of the bornPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setBornPeriod(Period value) {
        this.bornPeriod = value;
    }

    /**
     * Gets the value of the deceasedString property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DECEASEDSTRING_FAMILYHISTORY_0")
    public org.hl7.fhir.model.String getDeceasedString() {
        return deceasedString;
    }

    /**
     * Sets the value of the deceasedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDeceasedString(org.hl7.fhir.model.String value) {
        this.deceasedString = value;
    }

    /**
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    @ManyToOne(targetEntity = Date.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DECEASEDDATE_FAMILYHISTORYRE_0")
    public Date getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDeceasedDate(Date value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the deceasedRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    @ManyToOne(targetEntity = Range.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DECEASEDRANGE_FAMILYHISTORYR_0")
    public Range getDeceasedRange() {
        return deceasedRange;
    }

    /**
     * Sets the value of the deceasedRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDeceasedRange(Range value) {
        this.deceasedRange = value;
    }

    /**
     * Gets the value of the deceasedAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    @ManyToOne(targetEntity = Age.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DECEASEDAGE_FAMILYHISTORYREL_0")
    public Age getDeceasedAge() {
        return deceasedAge;
    }

    /**
     * Sets the value of the deceasedAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setDeceasedAge(Age value) {
        this.deceasedAge = value;
    }

    /**
     * Gets the value of the deceasedBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DECEASEDBOOLEAN_FAMILYHISTOR_0")
    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    /**
     * Sets the value of the deceasedBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedBoolean(Boolean value) {
        this.deceasedBoolean = value;
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
    @JoinColumn(name = "NOTE_FAMILYHISTORYRELATION_H_0")
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

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyHistoryCondition }
     * 
     * 
     */
    @OneToMany(targetEntity = FamilyHistoryCondition.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONDITIONS_FAMILYHISTORYRELA_0")
    public List<FamilyHistoryCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<FamilyHistoryCondition>();
        }
        return this.conditions;
    }

    /**
     * 
     * 
     */
    public void setConditions(List<FamilyHistoryCondition> conditions) {
        this.conditions = conditions;
    }

    public FamilyHistoryRelation withName(org.hl7.fhir.model.String value) {
        setName(value);
        return this;
    }

    public FamilyHistoryRelation withRelationship(CodeableConcept value) {
        setRelationship(value);
        return this;
    }

    public FamilyHistoryRelation withBornString(org.hl7.fhir.model.String value) {
        setBornString(value);
        return this;
    }

    public FamilyHistoryRelation withBornDate(Date value) {
        setBornDate(value);
        return this;
    }

    public FamilyHistoryRelation withBornPeriod(Period value) {
        setBornPeriod(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedString(org.hl7.fhir.model.String value) {
        setDeceasedString(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedDate(Date value) {
        setDeceasedDate(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedRange(Range value) {
        setDeceasedRange(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedAge(Age value) {
        setDeceasedAge(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedBoolean(Boolean value) {
        setDeceasedBoolean(value);
        return this;
    }

    public FamilyHistoryRelation withNote(org.hl7.fhir.model.String value) {
        setNote(value);
        return this;
    }

    public FamilyHistoryRelation withConditions(FamilyHistoryCondition... values) {
        if (values!= null) {
            for (FamilyHistoryCondition value: values) {
                getConditions().add(value);
            }
        }
        return this;
    }

    public FamilyHistoryRelation withConditions(Collection<FamilyHistoryCondition> values) {
        if (values!= null) {
            getConditions().addAll(values);
        }
        return this;
    }

    public FamilyHistoryRelation withConditions(List<FamilyHistoryCondition> conditions) {
        setConditions(conditions);
        return this;
    }

    @Override
    public FamilyHistoryRelation withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public FamilyHistoryRelation withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public FamilyHistoryRelation withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FamilyHistoryRelation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FamilyHistoryRelation that = ((FamilyHistoryRelation) object);
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
            CodeableConcept lhsRelationship;
            lhsRelationship = this.getRelationship();
            CodeableConcept rhsRelationship;
            rhsRelationship = that.getRelationship();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationship", lhsRelationship), LocatorUtils.property(thatLocator, "relationship", rhsRelationship), lhsRelationship, rhsRelationship)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsBornString;
            lhsBornString = this.getBornString();
            org.hl7.fhir.model.String rhsBornString;
            rhsBornString = that.getBornString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bornString", lhsBornString), LocatorUtils.property(thatLocator, "bornString", rhsBornString), lhsBornString, rhsBornString)) {
                return false;
            }
        }
        {
            Date lhsBornDate;
            lhsBornDate = this.getBornDate();
            Date rhsBornDate;
            rhsBornDate = that.getBornDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bornDate", lhsBornDate), LocatorUtils.property(thatLocator, "bornDate", rhsBornDate), lhsBornDate, rhsBornDate)) {
                return false;
            }
        }
        {
            Period lhsBornPeriod;
            lhsBornPeriod = this.getBornPeriod();
            Period rhsBornPeriod;
            rhsBornPeriod = that.getBornPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bornPeriod", lhsBornPeriod), LocatorUtils.property(thatLocator, "bornPeriod", rhsBornPeriod), lhsBornPeriod, rhsBornPeriod)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDeceasedString;
            lhsDeceasedString = this.getDeceasedString();
            org.hl7.fhir.model.String rhsDeceasedString;
            rhsDeceasedString = that.getDeceasedString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deceasedString", lhsDeceasedString), LocatorUtils.property(thatLocator, "deceasedString", rhsDeceasedString), lhsDeceasedString, rhsDeceasedString)) {
                return false;
            }
        }
        {
            Date lhsDeceasedDate;
            lhsDeceasedDate = this.getDeceasedDate();
            Date rhsDeceasedDate;
            rhsDeceasedDate = that.getDeceasedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deceasedDate", lhsDeceasedDate), LocatorUtils.property(thatLocator, "deceasedDate", rhsDeceasedDate), lhsDeceasedDate, rhsDeceasedDate)) {
                return false;
            }
        }
        {
            Range lhsDeceasedRange;
            lhsDeceasedRange = this.getDeceasedRange();
            Range rhsDeceasedRange;
            rhsDeceasedRange = that.getDeceasedRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deceasedRange", lhsDeceasedRange), LocatorUtils.property(thatLocator, "deceasedRange", rhsDeceasedRange), lhsDeceasedRange, rhsDeceasedRange)) {
                return false;
            }
        }
        {
            Age lhsDeceasedAge;
            lhsDeceasedAge = this.getDeceasedAge();
            Age rhsDeceasedAge;
            rhsDeceasedAge = that.getDeceasedAge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deceasedAge", lhsDeceasedAge), LocatorUtils.property(thatLocator, "deceasedAge", rhsDeceasedAge), lhsDeceasedAge, rhsDeceasedAge)) {
                return false;
            }
        }
        {
            Boolean lhsDeceasedBoolean;
            lhsDeceasedBoolean = this.getDeceasedBoolean();
            Boolean rhsDeceasedBoolean;
            rhsDeceasedBoolean = that.getDeceasedBoolean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deceasedBoolean", lhsDeceasedBoolean), LocatorUtils.property(thatLocator, "deceasedBoolean", rhsDeceasedBoolean), lhsDeceasedBoolean, rhsDeceasedBoolean)) {
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
        {
            List<FamilyHistoryCondition> lhsConditions;
            lhsConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            List<FamilyHistoryCondition> rhsConditions;
            rhsConditions = (((that.conditions!= null)&&(!that.conditions.isEmpty()))?that.getConditions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditions", lhsConditions), LocatorUtils.property(thatLocator, "conditions", rhsConditions), lhsConditions, rhsConditions)) {
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
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            CodeableConcept theRelationship;
            theRelationship = this.getRelationship();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationship", theRelationship), currentHashCode, theRelationship);
        }
        {
            org.hl7.fhir.model.String theBornString;
            theBornString = this.getBornString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bornString", theBornString), currentHashCode, theBornString);
        }
        {
            Date theBornDate;
            theBornDate = this.getBornDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bornDate", theBornDate), currentHashCode, theBornDate);
        }
        {
            Period theBornPeriod;
            theBornPeriod = this.getBornPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bornPeriod", theBornPeriod), currentHashCode, theBornPeriod);
        }
        {
            org.hl7.fhir.model.String theDeceasedString;
            theDeceasedString = this.getDeceasedString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deceasedString", theDeceasedString), currentHashCode, theDeceasedString);
        }
        {
            Date theDeceasedDate;
            theDeceasedDate = this.getDeceasedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deceasedDate", theDeceasedDate), currentHashCode, theDeceasedDate);
        }
        {
            Range theDeceasedRange;
            theDeceasedRange = this.getDeceasedRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deceasedRange", theDeceasedRange), currentHashCode, theDeceasedRange);
        }
        {
            Age theDeceasedAge;
            theDeceasedAge = this.getDeceasedAge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deceasedAge", theDeceasedAge), currentHashCode, theDeceasedAge);
        }
        {
            Boolean theDeceasedBoolean;
            theDeceasedBoolean = this.getDeceasedBoolean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deceasedBoolean", theDeceasedBoolean), currentHashCode, theDeceasedBoolean);
        }
        {
            org.hl7.fhir.model.String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        {
            List<FamilyHistoryCondition> theConditions;
            theConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditions", theConditions), currentHashCode, theConditions);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
