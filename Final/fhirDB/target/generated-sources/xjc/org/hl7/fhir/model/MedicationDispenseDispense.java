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
 * Dispensing a medication to a named patient.  This includes a description of the supply provided and the instructions for administering the medication.
 * 
 * <p>Java class for MedicationDispense.Dispense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense.Dispense">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationDispenseStatus" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="medication" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="whenPrepared" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="whenHandedOver" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}MedicationDispense.Dosage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.Dispense", propOrder = {
    "identifier",
    "status",
    "type",
    "quantity",
    "medication",
    "whenPrepared",
    "whenHandedOver",
    "destination",
    "receivers",
    "dosages"
})
@Entity(name = "MedicationDispenseDispense")
@Table(name = "MEDICATIONDISPENSEDISPENSE")
public class MedicationDispenseDispense
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Identifier identifier;
    protected MedicationDispenseStatus status;
    protected CodeableConcept type;
    protected Quantity quantity;
    protected ResourceReference medication;
    protected DateTime whenPrepared;
    protected DateTime whenHandedOver;
    protected ResourceReference destination;
    @XmlElement(name = "receiver")
    protected List<ResourceReference> receivers;
    @XmlElement(name = "dosage")
    protected List<MedicationDispenseDosage> dosages;

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
    @JoinColumn(name = "IDENTIFIER_MEDICATIONDISPENS_1")
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    @ManyToOne(targetEntity = MedicationDispenseStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_MEDICATIONDISPENSEDIS_0")
    public MedicationDispenseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationDispenseStatus }
     *     
     */
    public void setStatus(MedicationDispenseStatus value) {
        this.status = value;
    }

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
    @JoinColumn(name = "TYPE__MEDICATIONDISPENSEDISP_0")
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    @ManyToOne(targetEntity = Quantity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUANTITY_MEDICATIONDISPENSED_0")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the medication property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MEDICATION_MEDICATIONDISPENS_0")
    public ResourceReference getMedication() {
        return medication;
    }

    /**
     * Sets the value of the medication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setMedication(ResourceReference value) {
        this.medication = value;
    }

    /**
     * Gets the value of the whenPrepared property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WHENPREPARED_MEDICATIONDISPE_0")
    public DateTime getWhenPrepared() {
        return whenPrepared;
    }

    /**
     * Sets the value of the whenPrepared property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhenPrepared(DateTime value) {
        this.whenPrepared = value;
    }

    /**
     * Gets the value of the whenHandedOver property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WHENHANDEDOVER_MEDICATIONDIS_0")
    public DateTime getWhenHandedOver() {
        return whenHandedOver;
    }

    /**
     * Sets the value of the whenHandedOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhenHandedOver(DateTime value) {
        this.whenHandedOver = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESTINATION_MEDICATIONDISPEN_0")
    public ResourceReference getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDestination(ResourceReference value) {
        this.destination = value;
    }

    /**
     * Gets the value of the receivers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivers().add(newItem);
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
    @JoinColumn(name = "RECEIVERS_MEDICATIONDISPENSE_0")
    public List<ResourceReference> getReceivers() {
        if (receivers == null) {
            receivers = new ArrayList<ResourceReference>();
        }
        return this.receivers;
    }

    /**
     * 
     * 
     */
    public void setReceivers(List<ResourceReference> receivers) {
        this.receivers = receivers;
    }

    /**
     * Gets the value of the dosages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationDispenseDosage }
     * 
     * 
     */
    @OneToMany(targetEntity = MedicationDispenseDosage.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOSAGES_MEDICATIONDISPENSEDI_0")
    public List<MedicationDispenseDosage> getDosages() {
        if (dosages == null) {
            dosages = new ArrayList<MedicationDispenseDosage>();
        }
        return this.dosages;
    }

    /**
     * 
     * 
     */
    public void setDosages(List<MedicationDispenseDosage> dosages) {
        this.dosages = dosages;
    }

    public MedicationDispenseDispense withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public MedicationDispenseDispense withStatus(MedicationDispenseStatus value) {
        setStatus(value);
        return this;
    }

    public MedicationDispenseDispense withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public MedicationDispenseDispense withQuantity(Quantity value) {
        setQuantity(value);
        return this;
    }

    public MedicationDispenseDispense withMedication(ResourceReference value) {
        setMedication(value);
        return this;
    }

    public MedicationDispenseDispense withWhenPrepared(DateTime value) {
        setWhenPrepared(value);
        return this;
    }

    public MedicationDispenseDispense withWhenHandedOver(DateTime value) {
        setWhenHandedOver(value);
        return this;
    }

    public MedicationDispenseDispense withDestination(ResourceReference value) {
        setDestination(value);
        return this;
    }

    public MedicationDispenseDispense withReceivers(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getReceivers().add(value);
            }
        }
        return this;
    }

    public MedicationDispenseDispense withReceivers(Collection<ResourceReference> values) {
        if (values!= null) {
            getReceivers().addAll(values);
        }
        return this;
    }

    public MedicationDispenseDispense withReceivers(List<ResourceReference> receivers) {
        setReceivers(receivers);
        return this;
    }

    public MedicationDispenseDispense withDosages(MedicationDispenseDosage... values) {
        if (values!= null) {
            for (MedicationDispenseDosage value: values) {
                getDosages().add(value);
            }
        }
        return this;
    }

    public MedicationDispenseDispense withDosages(Collection<MedicationDispenseDosage> values) {
        if (values!= null) {
            getDosages().addAll(values);
        }
        return this;
    }

    public MedicationDispenseDispense withDosages(List<MedicationDispenseDosage> dosages) {
        setDosages(dosages);
        return this;
    }

    @Override
    public MedicationDispenseDispense withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseDispense withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseDispense withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MedicationDispenseDispense withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseDispense withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseDispense withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MedicationDispenseDispense withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationDispenseDispense)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationDispenseDispense that = ((MedicationDispenseDispense) object);
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
            MedicationDispenseStatus lhsStatus;
            lhsStatus = this.getStatus();
            MedicationDispenseStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
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
            Quantity lhsQuantity;
            lhsQuantity = this.getQuantity();
            Quantity rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            ResourceReference lhsMedication;
            lhsMedication = this.getMedication();
            ResourceReference rhsMedication;
            rhsMedication = that.getMedication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "medication", lhsMedication), LocatorUtils.property(thatLocator, "medication", rhsMedication), lhsMedication, rhsMedication)) {
                return false;
            }
        }
        {
            DateTime lhsWhenPrepared;
            lhsWhenPrepared = this.getWhenPrepared();
            DateTime rhsWhenPrepared;
            rhsWhenPrepared = that.getWhenPrepared();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whenPrepared", lhsWhenPrepared), LocatorUtils.property(thatLocator, "whenPrepared", rhsWhenPrepared), lhsWhenPrepared, rhsWhenPrepared)) {
                return false;
            }
        }
        {
            DateTime lhsWhenHandedOver;
            lhsWhenHandedOver = this.getWhenHandedOver();
            DateTime rhsWhenHandedOver;
            rhsWhenHandedOver = that.getWhenHandedOver();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whenHandedOver", lhsWhenHandedOver), LocatorUtils.property(thatLocator, "whenHandedOver", rhsWhenHandedOver), lhsWhenHandedOver, rhsWhenHandedOver)) {
                return false;
            }
        }
        {
            ResourceReference lhsDestination;
            lhsDestination = this.getDestination();
            ResourceReference rhsDestination;
            rhsDestination = that.getDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destination", lhsDestination), LocatorUtils.property(thatLocator, "destination", rhsDestination), lhsDestination, rhsDestination)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsReceivers;
            lhsReceivers = (((this.receivers!= null)&&(!this.receivers.isEmpty()))?this.getReceivers():null);
            List<ResourceReference> rhsReceivers;
            rhsReceivers = (((that.receivers!= null)&&(!that.receivers.isEmpty()))?that.getReceivers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivers", lhsReceivers), LocatorUtils.property(thatLocator, "receivers", rhsReceivers), lhsReceivers, rhsReceivers)) {
                return false;
            }
        }
        {
            List<MedicationDispenseDosage> lhsDosages;
            lhsDosages = (((this.dosages!= null)&&(!this.dosages.isEmpty()))?this.getDosages():null);
            List<MedicationDispenseDosage> rhsDosages;
            rhsDosages = (((that.dosages!= null)&&(!that.dosages.isEmpty()))?that.getDosages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dosages", lhsDosages), LocatorUtils.property(thatLocator, "dosages", rhsDosages), lhsDosages, rhsDosages)) {
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
            MedicationDispenseStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            ResourceReference theMedication;
            theMedication = this.getMedication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "medication", theMedication), currentHashCode, theMedication);
        }
        {
            DateTime theWhenPrepared;
            theWhenPrepared = this.getWhenPrepared();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whenPrepared", theWhenPrepared), currentHashCode, theWhenPrepared);
        }
        {
            DateTime theWhenHandedOver;
            theWhenHandedOver = this.getWhenHandedOver();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whenHandedOver", theWhenHandedOver), currentHashCode, theWhenHandedOver);
        }
        {
            ResourceReference theDestination;
            theDestination = this.getDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destination", theDestination), currentHashCode, theDestination);
        }
        {
            List<ResourceReference> theReceivers;
            theReceivers = (((this.receivers!= null)&&(!this.receivers.isEmpty()))?this.getReceivers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivers", theReceivers), currentHashCode, theReceivers);
        }
        {
            List<MedicationDispenseDosage> theDosages;
            theDosages = (((this.dosages!= null)&&(!this.dosages.isEmpty()))?this.getDosages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dosages", theDosages), currentHashCode, theDosages);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}