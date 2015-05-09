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
 * A record of medication being taken by a patient, or that the medication has been given to a patient where the record is the result of a report from the patient or another clinician.
 * 
 * <p>Java class for MedicationStatement.Dosage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationStatement.Dosage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="timing" type="{http://hl7.org/fhir}Schedule" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="asNeededBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="asNeededCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;/choice>
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *         &lt;element name="maxDosePerPeriod" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationStatement.Dosage", propOrder = {
    "timing",
    "asNeededCodeableConcept",
    "asNeededBoolean",
    "site",
    "route",
    "method",
    "quantity",
    "rate",
    "maxDosePerPeriod"
})
@Entity(name = "MedicationStatementDosage")
@Table(name = "MEDICATIONSTATEMENTDOSAGE")
public class MedicationStatementDosage
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Schedule timing;
    protected CodeableConcept asNeededCodeableConcept;
    protected Boolean asNeededBoolean;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected CodeableConcept method;
    protected Quantity quantity;
    protected Ratio rate;
    protected Ratio maxDosePerPeriod;

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    @ManyToOne(targetEntity = Schedule.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMING_MEDICATIONSTATEMENTDO_0")
    public Schedule getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setTiming(Schedule value) {
        this.timing = value;
    }

    /**
     * Gets the value of the asNeededCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASNEEDEDCODEABLECONCEPT_MEDI_2")
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * Sets the value of the asNeededCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAsNeededCodeableConcept(CodeableConcept value) {
        this.asNeededCodeableConcept = value;
    }

    /**
     * Gets the value of the asNeededBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASNEEDEDBOOLEAN_MEDICATIONST_0")
    public Boolean getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * Sets the value of the asNeededBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsNeededBoolean(Boolean value) {
        this.asNeededBoolean = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SITE_MEDICATIONSTATEMENTDOSA_0")
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSite(CodeableConcept value) {
        this.site = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROUTE_MEDICATIONSTATEMENTDOS_0")
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "METHOD__MEDICATIONSTATEMENTD_0")
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
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
    @JoinColumn(name = "QUANTITY_MEDICATIONSTATEMENT_0")
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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RATE_MEDICATIONSTATEMENTDOSA_0")
    public Ratio getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setRate(Ratio value) {
        this.rate = value;
    }

    /**
     * Gets the value of the maxDosePerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MAXDOSEPERPERIOD_MEDICATIONS_0")
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    /**
     * Sets the value of the maxDosePerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = value;
    }

    public MedicationStatementDosage withTiming(Schedule value) {
        setTiming(value);
        return this;
    }

    public MedicationStatementDosage withAsNeededCodeableConcept(CodeableConcept value) {
        setAsNeededCodeableConcept(value);
        return this;
    }

    public MedicationStatementDosage withAsNeededBoolean(Boolean value) {
        setAsNeededBoolean(value);
        return this;
    }

    public MedicationStatementDosage withSite(CodeableConcept value) {
        setSite(value);
        return this;
    }

    public MedicationStatementDosage withRoute(CodeableConcept value) {
        setRoute(value);
        return this;
    }

    public MedicationStatementDosage withMethod(CodeableConcept value) {
        setMethod(value);
        return this;
    }

    public MedicationStatementDosage withQuantity(Quantity value) {
        setQuantity(value);
        return this;
    }

    public MedicationStatementDosage withRate(Ratio value) {
        setRate(value);
        return this;
    }

    public MedicationStatementDosage withMaxDosePerPeriod(Ratio value) {
        setMaxDosePerPeriod(value);
        return this;
    }

    @Override
    public MedicationStatementDosage withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationStatementDosage withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationStatementDosage withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MedicationStatementDosage withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationStatementDosage withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationStatementDosage withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MedicationStatementDosage withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationStatementDosage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationStatementDosage that = ((MedicationStatementDosage) object);
        {
            Schedule lhsTiming;
            lhsTiming = this.getTiming();
            Schedule rhsTiming;
            rhsTiming = that.getTiming();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timing", lhsTiming), LocatorUtils.property(thatLocator, "timing", rhsTiming), lhsTiming, rhsTiming)) {
                return false;
            }
        }
        {
            CodeableConcept lhsAsNeededCodeableConcept;
            lhsAsNeededCodeableConcept = this.getAsNeededCodeableConcept();
            CodeableConcept rhsAsNeededCodeableConcept;
            rhsAsNeededCodeableConcept = that.getAsNeededCodeableConcept();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asNeededCodeableConcept", lhsAsNeededCodeableConcept), LocatorUtils.property(thatLocator, "asNeededCodeableConcept", rhsAsNeededCodeableConcept), lhsAsNeededCodeableConcept, rhsAsNeededCodeableConcept)) {
                return false;
            }
        }
        {
            Boolean lhsAsNeededBoolean;
            lhsAsNeededBoolean = this.getAsNeededBoolean();
            Boolean rhsAsNeededBoolean;
            rhsAsNeededBoolean = that.getAsNeededBoolean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asNeededBoolean", lhsAsNeededBoolean), LocatorUtils.property(thatLocator, "asNeededBoolean", rhsAsNeededBoolean), lhsAsNeededBoolean, rhsAsNeededBoolean)) {
                return false;
            }
        }
        {
            CodeableConcept lhsSite;
            lhsSite = this.getSite();
            CodeableConcept rhsSite;
            rhsSite = that.getSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "site", lhsSite), LocatorUtils.property(thatLocator, "site", rhsSite), lhsSite, rhsSite)) {
                return false;
            }
        }
        {
            CodeableConcept lhsRoute;
            lhsRoute = this.getRoute();
            CodeableConcept rhsRoute;
            rhsRoute = that.getRoute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "route", lhsRoute), LocatorUtils.property(thatLocator, "route", rhsRoute), lhsRoute, rhsRoute)) {
                return false;
            }
        }
        {
            CodeableConcept lhsMethod;
            lhsMethod = this.getMethod();
            CodeableConcept rhsMethod;
            rhsMethod = that.getMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "method", lhsMethod), LocatorUtils.property(thatLocator, "method", rhsMethod), lhsMethod, rhsMethod)) {
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
            Ratio lhsRate;
            lhsRate = this.getRate();
            Ratio rhsRate;
            rhsRate = that.getRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rate", lhsRate), LocatorUtils.property(thatLocator, "rate", rhsRate), lhsRate, rhsRate)) {
                return false;
            }
        }
        {
            Ratio lhsMaxDosePerPeriod;
            lhsMaxDosePerPeriod = this.getMaxDosePerPeriod();
            Ratio rhsMaxDosePerPeriod;
            rhsMaxDosePerPeriod = that.getMaxDosePerPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxDosePerPeriod", lhsMaxDosePerPeriod), LocatorUtils.property(thatLocator, "maxDosePerPeriod", rhsMaxDosePerPeriod), lhsMaxDosePerPeriod, rhsMaxDosePerPeriod)) {
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
            Schedule theTiming;
            theTiming = this.getTiming();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timing", theTiming), currentHashCode, theTiming);
        }
        {
            CodeableConcept theAsNeededCodeableConcept;
            theAsNeededCodeableConcept = this.getAsNeededCodeableConcept();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asNeededCodeableConcept", theAsNeededCodeableConcept), currentHashCode, theAsNeededCodeableConcept);
        }
        {
            Boolean theAsNeededBoolean;
            theAsNeededBoolean = this.getAsNeededBoolean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asNeededBoolean", theAsNeededBoolean), currentHashCode, theAsNeededBoolean);
        }
        {
            CodeableConcept theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            CodeableConcept theRoute;
            theRoute = this.getRoute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "route", theRoute), currentHashCode, theRoute);
        }
        {
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "method", theMethod), currentHashCode, theMethod);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            Ratio theRate;
            theRate = this.getRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rate", theRate), currentHashCode, theRate);
        }
        {
            Ratio theMaxDosePerPeriod;
            theMaxDosePerPeriod = this.getMaxDosePerPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxDosePerPeriod", theMaxDosePerPeriod), currentHashCode, theMaxDosePerPeriod);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}