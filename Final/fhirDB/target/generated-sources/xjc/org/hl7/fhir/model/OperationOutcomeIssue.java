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
 * A collection of error, warning or information messages that result from a system action.
 * 
 * <p>Java class for OperationOutcome.Issue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationOutcome.Issue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}IssueSeverity"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="details" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationOutcome.Issue", propOrder = {
    "severity",
    "type",
    "details",
    "locations"
})
@Entity(name = "OperationOutcomeIssue")
@Table(name = "OPERATIONOUTCOMEISSUE")
public class OperationOutcomeIssue
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected IssueSeverity severity;
    protected Coding type;
    protected org.hl7.fhir.model.String details;
    @XmlElement(name = "location")
    protected List<org.hl7.fhir.model.String> locations;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link IssueSeverity }
     *     
     */
    @ManyToOne(targetEntity = IssueSeverity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SEVERITY_OPERATIONOUTCOMEISS_0")
    public IssueSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueSeverity }
     *     
     */
    public void setSeverity(IssueSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    @ManyToOne(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__OPERATIONOUTCOMEISSUE__0")
    public Coding getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DETAILS_OPERATIONOUTCOMEISSU_0")
    public org.hl7.fhir.model.String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDetails(org.hl7.fhir.model.String value) {
        this.details = value;
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
     * {@link org.hl7.fhir.model.String }
     * 
     * 
     */
    @OneToMany(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOCATIONS_OPERATIONOUTCOMEIS_0")
    public List<org.hl7.fhir.model.String> getLocations() {
        if (locations == null) {
            locations = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.locations;
    }

    /**
     * 
     * 
     */
    public void setLocations(List<org.hl7.fhir.model.String> locations) {
        this.locations = locations;
    }

    public OperationOutcomeIssue withSeverity(IssueSeverity value) {
        setSeverity(value);
        return this;
    }

    public OperationOutcomeIssue withType(Coding value) {
        setType(value);
        return this;
    }

    public OperationOutcomeIssue withDetails(org.hl7.fhir.model.String value) {
        setDetails(value);
        return this;
    }

    public OperationOutcomeIssue withLocations(org.hl7.fhir.model.String... values) {
        if (values!= null) {
            for (org.hl7.fhir.model.String value: values) {
                getLocations().add(value);
            }
        }
        return this;
    }

    public OperationOutcomeIssue withLocations(Collection<org.hl7.fhir.model.String> values) {
        if (values!= null) {
            getLocations().addAll(values);
        }
        return this;
    }

    public OperationOutcomeIssue withLocations(List<org.hl7.fhir.model.String> locations) {
        setLocations(locations);
        return this;
    }

    @Override
    public OperationOutcomeIssue withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public OperationOutcomeIssue withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public OperationOutcomeIssue withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public OperationOutcomeIssue withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public OperationOutcomeIssue withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public OperationOutcomeIssue withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public OperationOutcomeIssue withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OperationOutcomeIssue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OperationOutcomeIssue that = ((OperationOutcomeIssue) object);
        {
            IssueSeverity lhsSeverity;
            lhsSeverity = this.getSeverity();
            IssueSeverity rhsSeverity;
            rhsSeverity = that.getSeverity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "severity", lhsSeverity), LocatorUtils.property(thatLocator, "severity", rhsSeverity), lhsSeverity, rhsSeverity)) {
                return false;
            }
        }
        {
            Coding lhsType;
            lhsType = this.getType();
            Coding rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDetails;
            lhsDetails = this.getDetails();
            org.hl7.fhir.model.String rhsDetails;
            rhsDetails = that.getDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "details", lhsDetails), LocatorUtils.property(thatLocator, "details", rhsDetails), lhsDetails, rhsDetails)) {
                return false;
            }
        }
        {
            List<org.hl7.fhir.model.String> lhsLocations;
            lhsLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            List<org.hl7.fhir.model.String> rhsLocations;
            rhsLocations = (((that.locations!= null)&&(!that.locations.isEmpty()))?that.getLocations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locations", lhsLocations), LocatorUtils.property(thatLocator, "locations", rhsLocations), lhsLocations, rhsLocations)) {
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
            IssueSeverity theSeverity;
            theSeverity = this.getSeverity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "severity", theSeverity), currentHashCode, theSeverity);
        }
        {
            Coding theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            org.hl7.fhir.model.String theDetails;
            theDetails = this.getDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "details", theDetails), currentHashCode, theDetails);
        }
        {
            List<org.hl7.fhir.model.String> theLocations;
            theLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locations", theLocations), currentHashCode, theLocations);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
