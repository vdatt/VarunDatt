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
 * A patient's point-of-time immunization status and recommendation with optional supporting justification.
 * 
 * <p>Java class for ImmunizationRecommendation.Protocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmunizationRecommendation.Protocol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="doseSequence" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="authority" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="series" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmunizationRecommendation.Protocol", propOrder = {
    "doseSequence",
    "description",
    "authority",
    "series"
})
@Entity(name = "ImmunizationRecommendationProtocol")
@Table(name = "IMMUNIZATIONRECOMMENDATIONPR_0")
public class ImmunizationRecommendationProtocol
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Integer doseSequence;
    protected org.hl7.fhir.model.String description;
    protected ResourceReference authority;
    protected org.hl7.fhir.model.String series;

    /**
     * Gets the value of the doseSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOSESEQUENCE_IMMUNIZATIONREC_0")
    public Integer getDoseSequence() {
        return doseSequence;
    }

    /**
     * Sets the value of the doseSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoseSequence(Integer value) {
        this.doseSequence = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_IMMUNIZATIONRECO_0")
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AUTHORITY_IMMUNIZATIONRECOMM_0")
    public ResourceReference getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setAuthority(ResourceReference value) {
        this.authority = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SERIES_IMMUNIZATIONRECOMMEND_0")
    public org.hl7.fhir.model.String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setSeries(org.hl7.fhir.model.String value) {
        this.series = value;
    }

    public ImmunizationRecommendationProtocol withDoseSequence(Integer value) {
        setDoseSequence(value);
        return this;
    }

    public ImmunizationRecommendationProtocol withDescription(org.hl7.fhir.model.String value) {
        setDescription(value);
        return this;
    }

    public ImmunizationRecommendationProtocol withAuthority(ResourceReference value) {
        setAuthority(value);
        return this;
    }

    public ImmunizationRecommendationProtocol withSeries(org.hl7.fhir.model.String value) {
        setSeries(value);
        return this;
    }

    @Override
    public ImmunizationRecommendationProtocol withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationProtocol withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationProtocol withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ImmunizationRecommendationProtocol withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationProtocol withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationProtocol withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ImmunizationRecommendationProtocol withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImmunizationRecommendationProtocol)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ImmunizationRecommendationProtocol that = ((ImmunizationRecommendationProtocol) object);
        {
            Integer lhsDoseSequence;
            lhsDoseSequence = this.getDoseSequence();
            Integer rhsDoseSequence;
            rhsDoseSequence = that.getDoseSequence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doseSequence", lhsDoseSequence), LocatorUtils.property(thatLocator, "doseSequence", rhsDoseSequence), lhsDoseSequence, rhsDoseSequence)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDescription;
            lhsDescription = this.getDescription();
            org.hl7.fhir.model.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            ResourceReference lhsAuthority;
            lhsAuthority = this.getAuthority();
            ResourceReference rhsAuthority;
            rhsAuthority = that.getAuthority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authority", lhsAuthority), LocatorUtils.property(thatLocator, "authority", rhsAuthority), lhsAuthority, rhsAuthority)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsSeries;
            lhsSeries = this.getSeries();
            org.hl7.fhir.model.String rhsSeries;
            rhsSeries = that.getSeries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "series", lhsSeries), LocatorUtils.property(thatLocator, "series", rhsSeries), lhsSeries, rhsSeries)) {
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
            Integer theDoseSequence;
            theDoseSequence = this.getDoseSequence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doseSequence", theDoseSequence), currentHashCode, theDoseSequence);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            ResourceReference theAuthority;
            theAuthority = this.getAuthority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authority", theAuthority), currentHashCode, theAuthority);
        }
        {
            org.hl7.fhir.model.String theSeries;
            theSeries = this.getSeries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "series", theSeries), currentHashCode, theSeries);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
