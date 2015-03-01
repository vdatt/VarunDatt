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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Encounter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Encounter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}EncounterState"/&gt;
 *         &lt;element name="class" type="{http://hl7.org/fhir}EncounterClass"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="participant" type="{http://hl7.org/fhir}Encounter.Participant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://hl7.org/fhir}Duration" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="indication" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="hospitalization" type="{http://hl7.org/fhir}Encounter.Hospitalization" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hl7.org/fhir}Encounter.Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serviceProvider" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="partOf" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Encounter", propOrder = {
    "identifiers",
    "status",
    "clazz",
    "types",
    "subject",
    "participants",
    "period",
    "length",
    "reason",
    "indication",
    "priority",
    "hospitalization",
    "locations",
    "serviceProvider",
    "partOf"
})
@XmlRootElement(name = "Encounter")
public class Encounter
    extends Resource
    implements Serializable, ToString
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(required = true)
    protected EncounterState status;
    @XmlElement(name = "class", required = true)
    protected EncounterClass clazz;
    @XmlElement(name = "type")
    protected List<CodeableConcept> types;
    protected ResourceReference subject;
    @XmlElement(name = "participant")
    protected List<EncounterParticipant> participants;
    protected Period period;
    protected TimeDuration length;
    protected CodeableConcept reason;
    protected ResourceReference indication;
    protected CodeableConcept priority;
    protected EncounterHospitalization hospitalization;
    @XmlElement(name = "location")
    protected List<EncounterLocation> locations;
    protected ResourceReference serviceProvider;
    protected ResourceReference partOf;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EncounterState }
     *     
     */
    public EncounterState getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncounterState }
     *     
     */
    public void setStatus(EncounterState value) {
        this.status = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link EncounterClass }
     *     
     */
    public EncounterClass getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncounterClass }
     *     
     */
    public void setClazz(EncounterClass value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getTypes() {
        if (types == null) {
            types = new ArrayList<CodeableConcept>();
        }
        return this.types;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncounterParticipant }
     * 
     * 
     */
    public List<EncounterParticipant> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<EncounterParticipant>();
        }
        return this.participants;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDuration }
     *     
     */
    public TimeDuration getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDuration }
     *     
     */
    public void setLength(TimeDuration value) {
        this.length = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReason(CodeableConcept value) {
        this.reason = value;
    }

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setIndication(ResourceReference value) {
        this.indication = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPriority(CodeableConcept value) {
        this.priority = value;
    }

    /**
     * Gets the value of the hospitalization property.
     * 
     * @return
     *     possible object is
     *     {@link EncounterHospitalization }
     *     
     */
    public EncounterHospitalization getHospitalization() {
        return hospitalization;
    }

    /**
     * Sets the value of the hospitalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncounterHospitalization }
     *     
     */
    public void setHospitalization(EncounterHospitalization value) {
        this.hospitalization = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncounterLocation }
     * 
     * 
     */
    public List<EncounterLocation> getLocations() {
        if (locations == null) {
            locations = new ArrayList<EncounterLocation>();
        }
        return this.locations;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setServiceProvider(ResourceReference value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPartOf() {
        return partOf;
    }

    /**
     * Sets the value of the partOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPartOf(ResourceReference value) {
        this.partOf = value;
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            EncounterState theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            EncounterClass theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz);
        }
        {
            List<CodeableConcept> theTypes;
            theTypes = (((this.types!= null)&&(!this.types.isEmpty()))?this.getTypes():null);
            strategy.appendField(locator, this, "types", buffer, theTypes);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            List<EncounterParticipant> theParticipants;
            theParticipants = (((this.participants!= null)&&(!this.participants.isEmpty()))?this.getParticipants():null);
            strategy.appendField(locator, this, "participants", buffer, theParticipants);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        {
            TimeDuration theLength;
            theLength = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theLength);
        }
        {
            CodeableConcept theReason;
            theReason = this.getReason();
            strategy.appendField(locator, this, "reason", buffer, theReason);
        }
        {
            ResourceReference theIndication;
            theIndication = this.getIndication();
            strategy.appendField(locator, this, "indication", buffer, theIndication);
        }
        {
            CodeableConcept thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority);
        }
        {
            EncounterHospitalization theHospitalization;
            theHospitalization = this.getHospitalization();
            strategy.appendField(locator, this, "hospitalization", buffer, theHospitalization);
        }
        {
            List<EncounterLocation> theLocations;
            theLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            strategy.appendField(locator, this, "locations", buffer, theLocations);
        }
        {
            ResourceReference theServiceProvider;
            theServiceProvider = this.getServiceProvider();
            strategy.appendField(locator, this, "serviceProvider", buffer, theServiceProvider);
        }
        {
            ResourceReference thePartOf;
            thePartOf = this.getPartOf();
            strategy.appendField(locator, this, "partOf", buffer, thePartOf);
        }
        return buffer;
    }

}
