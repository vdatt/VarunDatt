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
 * A supply - a  request for something, and provision of what is supplied.
 * 
 * <p>Java class for Supply.Dispense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supply.Dispense">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}SupplyDispenseStatus" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="suppliedItem" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="whenPrepared" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="whenHandedOver" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supply.Dispense", propOrder = {
    "identifier",
    "status",
    "type",
    "quantity",
    "suppliedItem",
    "supplier",
    "whenPrepared",
    "whenHandedOver",
    "destination",
    "receivers"
})
@Entity(name = "SupplyDispense")
@Table(name = "SUPPLYDISPENSE")
public class SupplyDispense
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Identifier identifier;
    protected SupplyDispenseStatus status;
    protected CodeableConcept type;
    protected Quantity quantity;
    protected ResourceReference suppliedItem;
    protected ResourceReference supplier;
    protected Period whenPrepared;
    protected Period whenHandedOver;
    protected ResourceReference destination;
    @XmlElement(name = "receiver")
    protected List<ResourceReference> receivers;

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
    @JoinColumn(name = "IDENTIFIER_SUPPLYDISPENSE_HJ_0")
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
     *     {@link SupplyDispenseStatus }
     *     
     */
    @ManyToOne(targetEntity = SupplyDispenseStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_SUPPLYDISPENSE_HJID")
    public SupplyDispenseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyDispenseStatus }
     *     
     */
    public void setStatus(SupplyDispenseStatus value) {
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
    @JoinColumn(name = "TYPE__SUPPLYDISPENSE_HJID")
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
    @JoinColumn(name = "QUANTITY_SUPPLYDISPENSE_HJID")
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
     * Gets the value of the suppliedItem property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUPPLIEDITEM_SUPPLYDISPENSE__0")
    public ResourceReference getSuppliedItem() {
        return suppliedItem;
    }

    /**
     * Sets the value of the suppliedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSuppliedItem(ResourceReference value) {
        this.suppliedItem = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUPPLIER_SUPPLYDISPENSE_HJID")
    public ResourceReference getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSupplier(ResourceReference value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the whenPrepared property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WHENPREPARED_SUPPLYDISPENSE__0")
    public Period getWhenPrepared() {
        return whenPrepared;
    }

    /**
     * Sets the value of the whenPrepared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setWhenPrepared(Period value) {
        this.whenPrepared = value;
    }

    /**
     * Gets the value of the whenHandedOver property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WHENHANDEDOVER_SUPPLYDISPENS_0")
    public Period getWhenHandedOver() {
        return whenHandedOver;
    }

    /**
     * Sets the value of the whenHandedOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setWhenHandedOver(Period value) {
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
    @JoinColumn(name = "DESTINATION_SUPPLYDISPENSE_H_0")
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
    @JoinColumn(name = "RECEIVERS_SUPPLYDISPENSE_HJID")
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

    public SupplyDispense withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public SupplyDispense withStatus(SupplyDispenseStatus value) {
        setStatus(value);
        return this;
    }

    public SupplyDispense withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public SupplyDispense withQuantity(Quantity value) {
        setQuantity(value);
        return this;
    }

    public SupplyDispense withSuppliedItem(ResourceReference value) {
        setSuppliedItem(value);
        return this;
    }

    public SupplyDispense withSupplier(ResourceReference value) {
        setSupplier(value);
        return this;
    }

    public SupplyDispense withWhenPrepared(Period value) {
        setWhenPrepared(value);
        return this;
    }

    public SupplyDispense withWhenHandedOver(Period value) {
        setWhenHandedOver(value);
        return this;
    }

    public SupplyDispense withDestination(ResourceReference value) {
        setDestination(value);
        return this;
    }

    public SupplyDispense withReceivers(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getReceivers().add(value);
            }
        }
        return this;
    }

    public SupplyDispense withReceivers(Collection<ResourceReference> values) {
        if (values!= null) {
            getReceivers().addAll(values);
        }
        return this;
    }

    public SupplyDispense withReceivers(List<ResourceReference> receivers) {
        setReceivers(receivers);
        return this;
    }

    @Override
    public SupplyDispense withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SupplyDispense withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SupplyDispense withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public SupplyDispense withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SupplyDispense withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SupplyDispense withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public SupplyDispense withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SupplyDispense)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SupplyDispense that = ((SupplyDispense) object);
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
            SupplyDispenseStatus lhsStatus;
            lhsStatus = this.getStatus();
            SupplyDispenseStatus rhsStatus;
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
            ResourceReference lhsSuppliedItem;
            lhsSuppliedItem = this.getSuppliedItem();
            ResourceReference rhsSuppliedItem;
            rhsSuppliedItem = that.getSuppliedItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suppliedItem", lhsSuppliedItem), LocatorUtils.property(thatLocator, "suppliedItem", rhsSuppliedItem), lhsSuppliedItem, rhsSuppliedItem)) {
                return false;
            }
        }
        {
            ResourceReference lhsSupplier;
            lhsSupplier = this.getSupplier();
            ResourceReference rhsSupplier;
            rhsSupplier = that.getSupplier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplier", lhsSupplier), LocatorUtils.property(thatLocator, "supplier", rhsSupplier), lhsSupplier, rhsSupplier)) {
                return false;
            }
        }
        {
            Period lhsWhenPrepared;
            lhsWhenPrepared = this.getWhenPrepared();
            Period rhsWhenPrepared;
            rhsWhenPrepared = that.getWhenPrepared();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whenPrepared", lhsWhenPrepared), LocatorUtils.property(thatLocator, "whenPrepared", rhsWhenPrepared), lhsWhenPrepared, rhsWhenPrepared)) {
                return false;
            }
        }
        {
            Period lhsWhenHandedOver;
            lhsWhenHandedOver = this.getWhenHandedOver();
            Period rhsWhenHandedOver;
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
            SupplyDispenseStatus theStatus;
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
            ResourceReference theSuppliedItem;
            theSuppliedItem = this.getSuppliedItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suppliedItem", theSuppliedItem), currentHashCode, theSuppliedItem);
        }
        {
            ResourceReference theSupplier;
            theSupplier = this.getSupplier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplier", theSupplier), currentHashCode, theSupplier);
        }
        {
            Period theWhenPrepared;
            theWhenPrepared = this.getWhenPrepared();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whenPrepared", theWhenPrepared), currentHashCode, theWhenPrepared);
        }
        {
            Period theWhenHandedOver;
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
