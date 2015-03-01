//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 01:52:03 AM MST 
//


package org.hl7.fhir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Activity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="goal" type="{http://hl7.org/fhir}xmlIdRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}CarePlanActivityStatus" minOccurs="0"/&gt;
 *         &lt;element name="prohibited" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="actionResulting" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="simple" type="{http://hl7.org/fhir}CarePlan.Simple" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
public class CarePlanActivity
    extends BackboneElement
    implements Serializable, ToString
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
    public List<java.lang.String> getGoals() {
        if (goals == null) {
            goals = new ArrayList<java.lang.String>();
        }
        return this.goals;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanActivityStatus }
     *     
     */
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
    public List<ResourceReference> getActionResultings() {
        if (actionResultings == null) {
            actionResultings = new ArrayList<ResourceReference>();
        }
        return this.actionResultings;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
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

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<java.lang.String> theGoals;
            theGoals = (((this.goals!= null)&&(!this.goals.isEmpty()))?this.getGoals():null);
            strategy.appendField(locator, this, "goals", buffer, theGoals);
        }
        {
            CarePlanActivityStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Boolean theProhibited;
            theProhibited = this.getProhibited();
            strategy.appendField(locator, this, "prohibited", buffer, theProhibited);
        }
        {
            List<ResourceReference> theActionResultings;
            theActionResultings = (((this.actionResultings!= null)&&(!this.actionResultings.isEmpty()))?this.getActionResultings():null);
            strategy.appendField(locator, this, "actionResultings", buffer, theActionResultings);
        }
        {
            org.hl7.fhir.model.String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        {
            ResourceReference theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail);
        }
        {
            CarePlanSimple theSimple;
            theSimple = this.getSimple();
            strategy.appendField(locator, this, "simple", buffer, theSimple);
        }
        return buffer;
    }

}
