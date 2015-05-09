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
 * <p>Java class for MedicationDispense.Substitution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense.Substitution">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responsibleParty" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.Substitution", propOrder = {
    "type",
    "reasons",
    "responsibleParties"
})
@Entity(name = "MedicationDispenseSubstitution")
@Table(name = "MEDICATIONDISPENSESUBSTITUTI_0")
public class MedicationDispenseSubstitution
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "reason")
    protected List<CodeableConcept> reasons;
    @XmlElement(name = "responsibleParty")
    protected List<ResourceReference> responsibleParties;

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
    @JoinColumn(name = "TYPE__MEDICATIONDISPENSESUBS_0")
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
     * Gets the value of the reasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REASONS_MEDICATIONDISPENSESU_0")
    public List<CodeableConcept> getReasons() {
        if (reasons == null) {
            reasons = new ArrayList<CodeableConcept>();
        }
        return this.reasons;
    }

    /**
     * 
     * 
     */
    public void setReasons(List<CodeableConcept> reasons) {
        this.reasons = reasons;
    }

    /**
     * Gets the value of the responsibleParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleParties().add(newItem);
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
    @JoinColumn(name = "RESPONSIBLEPARTIES_MEDICATIO_0")
    public List<ResourceReference> getResponsibleParties() {
        if (responsibleParties == null) {
            responsibleParties = new ArrayList<ResourceReference>();
        }
        return this.responsibleParties;
    }

    /**
     * 
     * 
     */
    public void setResponsibleParties(List<ResourceReference> responsibleParties) {
        this.responsibleParties = responsibleParties;
    }

    public MedicationDispenseSubstitution withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public MedicationDispenseSubstitution withReasons(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getReasons().add(value);
            }
        }
        return this;
    }

    public MedicationDispenseSubstitution withReasons(Collection<CodeableConcept> values) {
        if (values!= null) {
            getReasons().addAll(values);
        }
        return this;
    }

    public MedicationDispenseSubstitution withReasons(List<CodeableConcept> reasons) {
        setReasons(reasons);
        return this;
    }

    public MedicationDispenseSubstitution withResponsibleParties(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getResponsibleParties().add(value);
            }
        }
        return this;
    }

    public MedicationDispenseSubstitution withResponsibleParties(Collection<ResourceReference> values) {
        if (values!= null) {
            getResponsibleParties().addAll(values);
        }
        return this;
    }

    public MedicationDispenseSubstitution withResponsibleParties(List<ResourceReference> responsibleParties) {
        setResponsibleParties(responsibleParties);
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MedicationDispenseSubstitution withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationDispenseSubstitution)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationDispenseSubstitution that = ((MedicationDispenseSubstitution) object);
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
            List<CodeableConcept> lhsReasons;
            lhsReasons = (((this.reasons!= null)&&(!this.reasons.isEmpty()))?this.getReasons():null);
            List<CodeableConcept> rhsReasons;
            rhsReasons = (((that.reasons!= null)&&(!that.reasons.isEmpty()))?that.getReasons():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reasons", lhsReasons), LocatorUtils.property(thatLocator, "reasons", rhsReasons), lhsReasons, rhsReasons)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsResponsibleParties;
            lhsResponsibleParties = (((this.responsibleParties!= null)&&(!this.responsibleParties.isEmpty()))?this.getResponsibleParties():null);
            List<ResourceReference> rhsResponsibleParties;
            rhsResponsibleParties = (((that.responsibleParties!= null)&&(!that.responsibleParties.isEmpty()))?that.getResponsibleParties():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responsibleParties", lhsResponsibleParties), LocatorUtils.property(thatLocator, "responsibleParties", rhsResponsibleParties), lhsResponsibleParties, rhsResponsibleParties)) {
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
            List<CodeableConcept> theReasons;
            theReasons = (((this.reasons!= null)&&(!this.reasons.isEmpty()))?this.getReasons():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reasons", theReasons), currentHashCode, theReasons);
        }
        {
            List<ResourceReference> theResponsibleParties;
            theResponsibleParties = (((this.responsibleParties!= null)&&(!this.responsibleParties.isEmpty()))?this.getResponsibleParties():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsibleParties", theResponsibleParties), currentHashCode, theResponsibleParties);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
