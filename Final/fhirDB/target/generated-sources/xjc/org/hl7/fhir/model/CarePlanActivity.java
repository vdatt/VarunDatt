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
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
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
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Activity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="goal" type="{http://hl7.org/fhir}xmlIdRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}CarePlanActivityStatus" minOccurs="0"/>
 *         &lt;element name="prohibited" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="actionResulting" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="simple" type="{http://hl7.org/fhir}CarePlan.Simple" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Activity", propOrder = {
    "goals",
    "status",
    "prohibited",
    "actionResultings",
    "notes",
    "detail",
    "simple"
})
@Entity(name = "CarePlanActivity")
@Table(name = "CAREPLANACTIVITY")
public class CarePlanActivity
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "goal")
    protected List<java.lang.String> goals;
    protected CarePlanActivityStatus status;
    @XmlElement(required = true)
    protected Boolean prohibited;
    @XmlElement(name = "actionResulting")
    protected List<ResourceReference> actionResultings;
    protected org.hl7.fhir.model.String notes;
    protected ResourceReference detail;
    protected CarePlanSimple simple;

    /**
     * Gets the value of the goals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    @ElementCollection
    @OrderColumn(name = "HJINDEX")
    @Column(name = "HJVALUE", length = 255)
    @CollectionTable(name = "CAREPLANACTIVITY_GOALS", joinColumns = {
        @JoinColumn(name = "HJID")
    })
    public List<java.lang.String> getGoals() {
        if (goals == null) {
            goals = new ArrayList<java.lang.String>();
        }
        return this.goals;
    }

    /**
     * 
     * 
     */
    public void setGoals(List<java.lang.String> goals) {
        this.goals = goals;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanActivityStatus }
     *     
     */
    @ManyToOne(targetEntity = CarePlanActivityStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_CAREPLANACTIVITY_HJID")
    public CarePlanActivityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanActivityStatus }
     *     
     */
    public void setStatus(CarePlanActivityStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the prohibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROHIBITED_CAREPLANACTIVITY__0")
    public Boolean getProhibited() {
        return prohibited;
    }

    /**
     * Sets the value of the prohibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibited(Boolean value) {
        this.prohibited = value;
    }

    /**
     * Gets the value of the actionResultings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionResultings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionResultings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ACTIONRESULTINGS_CAREPLANACT_0")
    public List<ResourceReference> getActionResultings() {
        if (actionResultings == null) {
            actionResultings = new ArrayList<ResourceReference>();
        }
        return this.actionResultings;
    }

    /**
     * 
     * 
     */
    public void setActionResultings(List<ResourceReference> actionResultings) {
        this.actionResultings = actionResultings;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NOTES_CAREPLANACTIVITY_HJID")
    public org.hl7.fhir.model.String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setNotes(org.hl7.fhir.model.String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DETAIL_CAREPLANACTIVITY_HJID")
    public ResourceReference getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDetail(ResourceReference value) {
        this.detail = value;
    }

    /**
     * Gets the value of the simple property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanSimple }
     *     
     */
    @ManyToOne(targetEntity = CarePlanSimple.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SIMPLE__CAREPLANACTIVITY_HJID")
    public CarePlanSimple getSimple() {
        return simple;
    }

    /**
     * Sets the value of the simple property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanSimple }
     *     
     */
    public void setSimple(CarePlanSimple value) {
        this.simple = value;
    }

    public CarePlanActivity withGoals(java.lang.String... values) {
        if (values!= null) {
            for (java.lang.String value: values) {
                getGoals().add(value);
            }
        }
        return this;
    }

    public CarePlanActivity withGoals(Collection<java.lang.String> values) {
        if (values!= null) {
            getGoals().addAll(values);
        }
        return this;
    }

    public CarePlanActivity withGoals(List<java.lang.String> goals) {
        setGoals(goals);
        return this;
    }

    public CarePlanActivity withStatus(CarePlanActivityStatus value) {
        setStatus(value);
        return this;
    }

    public CarePlanActivity withProhibited(Boolean value) {
        setProhibited(value);
        return this;
    }

    public CarePlanActivity withActionResultings(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getActionResultings().add(value);
            }
        }
        return this;
    }

    public CarePlanActivity withActionResultings(Collection<ResourceReference> values) {
        if (values!= null) {
            getActionResultings().addAll(values);
        }
        return this;
    }

    public CarePlanActivity withActionResultings(List<ResourceReference> actionResultings) {
        setActionResultings(actionResultings);
        return this;
    }

    public CarePlanActivity withNotes(org.hl7.fhir.model.String value) {
        setNotes(value);
        return this;
    }

    public CarePlanActivity withDetail(ResourceReference value) {
        setDetail(value);
        return this;
    }

    public CarePlanActivity withSimple(CarePlanSimple value) {
        setSimple(value);
        return this;
    }

    @Override
    public CarePlanActivity withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanActivity withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanActivity withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public CarePlanActivity withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanActivity withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanActivity withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public CarePlanActivity withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CarePlanActivity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CarePlanActivity that = ((CarePlanActivity) object);
        {
            List<java.lang.String> lhsGoals;
            lhsGoals = (((this.goals!= null)&&(!this.goals.isEmpty()))?this.getGoals():null);
            List<java.lang.String> rhsGoals;
            rhsGoals = (((that.goals!= null)&&(!that.goals.isEmpty()))?that.getGoals():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goals", lhsGoals), LocatorUtils.property(thatLocator, "goals", rhsGoals), lhsGoals, rhsGoals)) {
                return false;
            }
        }
        {
            CarePlanActivityStatus lhsStatus;
            lhsStatus = this.getStatus();
            CarePlanActivityStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            Boolean lhsProhibited;
            lhsProhibited = this.getProhibited();
            Boolean rhsProhibited;
            rhsProhibited = that.getProhibited();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prohibited", lhsProhibited), LocatorUtils.property(thatLocator, "prohibited", rhsProhibited), lhsProhibited, rhsProhibited)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsActionResultings;
            lhsActionResultings = (((this.actionResultings!= null)&&(!this.actionResultings.isEmpty()))?this.getActionResultings():null);
            List<ResourceReference> rhsActionResultings;
            rhsActionResultings = (((that.actionResultings!= null)&&(!that.actionResultings.isEmpty()))?that.getActionResultings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionResultings", lhsActionResultings), LocatorUtils.property(thatLocator, "actionResultings", rhsActionResultings), lhsActionResultings, rhsActionResultings)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsNotes;
            lhsNotes = this.getNotes();
            org.hl7.fhir.model.String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes)) {
                return false;
            }
        }
        {
            ResourceReference lhsDetail;
            lhsDetail = this.getDetail();
            ResourceReference rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail)) {
                return false;
            }
        }
        {
            CarePlanSimple lhsSimple;
            lhsSimple = this.getSimple();
            CarePlanSimple rhsSimple;
            rhsSimple = that.getSimple();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "simple", lhsSimple), LocatorUtils.property(thatLocator, "simple", rhsSimple), lhsSimple, rhsSimple)) {
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
            List<java.lang.String> theGoals;
            theGoals = (((this.goals!= null)&&(!this.goals.isEmpty()))?this.getGoals():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goals", theGoals), currentHashCode, theGoals);
        }
        {
            CarePlanActivityStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            Boolean theProhibited;
            theProhibited = this.getProhibited();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prohibited", theProhibited), currentHashCode, theProhibited);
        }
        {
            List<ResourceReference> theActionResultings;
            theActionResultings = (((this.actionResultings!= null)&&(!this.actionResultings.isEmpty()))?this.getActionResultings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionResultings", theActionResultings), currentHashCode, theActionResultings);
        }
        {
            org.hl7.fhir.model.String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        {
            ResourceReference theDetail;
            theDetail = this.getDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detail", theDetail), currentHashCode, theDetail);
        }
        {
            CarePlanSimple theSimple;
            theSimple = this.getSimple();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simple", theSimple), currentHashCode, theSimple);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}