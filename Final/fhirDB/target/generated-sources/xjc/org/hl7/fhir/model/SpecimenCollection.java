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
 * Sample for analysis.
 * 
 * <p>Java class for Specimen.Collection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specimen.Collection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="collector" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="collectedDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="collectedPeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="sourceSite" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen.Collection", propOrder = {
    "collector",
    "comments",
    "collectedPeriod",
    "collectedDateTime",
    "quantity",
    "method",
    "sourceSite"
})
@Entity(name = "SpecimenCollection")
@Table(name = "SPECIMENCOLLECTION")
public class SpecimenCollection
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected ResourceReference collector;
    @XmlElement(name = "comment")
    protected List<org.hl7.fhir.model.String> comments;
    protected Period collectedPeriod;
    protected DateTime collectedDateTime;
    protected Quantity quantity;
    protected CodeableConcept method;
    protected CodeableConcept sourceSite;

    /**
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COLLECTOR_SPECIMENCOLLECTION_0")
    public ResourceReference getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setCollector(ResourceReference value) {
        this.collector = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
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
    @JoinColumn(name = "COMMENTS_SPECIMENCOLLECTION__0")
    public List<org.hl7.fhir.model.String> getComments() {
        if (comments == null) {
            comments = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.comments;
    }

    /**
     * 
     * 
     */
    public void setComments(List<org.hl7.fhir.model.String> comments) {
        this.comments = comments;
    }

    /**
     * Gets the value of the collectedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COLLECTEDPERIOD_SPECIMENCOLL_0")
    public Period getCollectedPeriod() {
        return collectedPeriod;
    }

    /**
     * Sets the value of the collectedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setCollectedPeriod(Period value) {
        this.collectedPeriod = value;
    }

    /**
     * Gets the value of the collectedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COLLECTEDDATETIME_SPECIMENCO_0")
    public DateTime getCollectedDateTime() {
        return collectedDateTime;
    }

    /**
     * Sets the value of the collectedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCollectedDateTime(DateTime value) {
        this.collectedDateTime = value;
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
    @JoinColumn(name = "QUANTITY_SPECIMENCOLLECTION__0")
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
    @JoinColumn(name = "METHOD__SPECIMENCOLLECTION_H_0")
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
     * Gets the value of the sourceSite property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCESITE_SPECIMENCOLLECTIO_0")
    public CodeableConcept getSourceSite() {
        return sourceSite;
    }

    /**
     * Sets the value of the sourceSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSourceSite(CodeableConcept value) {
        this.sourceSite = value;
    }

    public SpecimenCollection withCollector(ResourceReference value) {
        setCollector(value);
        return this;
    }

    public SpecimenCollection withComments(org.hl7.fhir.model.String... values) {
        if (values!= null) {
            for (org.hl7.fhir.model.String value: values) {
                getComments().add(value);
            }
        }
        return this;
    }

    public SpecimenCollection withComments(Collection<org.hl7.fhir.model.String> values) {
        if (values!= null) {
            getComments().addAll(values);
        }
        return this;
    }

    public SpecimenCollection withComments(List<org.hl7.fhir.model.String> comments) {
        setComments(comments);
        return this;
    }

    public SpecimenCollection withCollectedPeriod(Period value) {
        setCollectedPeriod(value);
        return this;
    }

    public SpecimenCollection withCollectedDateTime(DateTime value) {
        setCollectedDateTime(value);
        return this;
    }

    public SpecimenCollection withQuantity(Quantity value) {
        setQuantity(value);
        return this;
    }

    public SpecimenCollection withMethod(CodeableConcept value) {
        setMethod(value);
        return this;
    }

    public SpecimenCollection withSourceSite(CodeableConcept value) {
        setSourceSite(value);
        return this;
    }

    @Override
    public SpecimenCollection withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SpecimenCollection withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SpecimenCollection withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public SpecimenCollection withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SpecimenCollection withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SpecimenCollection withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public SpecimenCollection withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SpecimenCollection)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SpecimenCollection that = ((SpecimenCollection) object);
        {
            ResourceReference lhsCollector;
            lhsCollector = this.getCollector();
            ResourceReference rhsCollector;
            rhsCollector = that.getCollector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collector", lhsCollector), LocatorUtils.property(thatLocator, "collector", rhsCollector), lhsCollector, rhsCollector)) {
                return false;
            }
        }
        {
            List<org.hl7.fhir.model.String> lhsComments;
            lhsComments = (((this.comments!= null)&&(!this.comments.isEmpty()))?this.getComments():null);
            List<org.hl7.fhir.model.String> rhsComments;
            rhsComments = (((that.comments!= null)&&(!that.comments.isEmpty()))?that.getComments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments)) {
                return false;
            }
        }
        {
            Period lhsCollectedPeriod;
            lhsCollectedPeriod = this.getCollectedPeriod();
            Period rhsCollectedPeriod;
            rhsCollectedPeriod = that.getCollectedPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collectedPeriod", lhsCollectedPeriod), LocatorUtils.property(thatLocator, "collectedPeriod", rhsCollectedPeriod), lhsCollectedPeriod, rhsCollectedPeriod)) {
                return false;
            }
        }
        {
            DateTime lhsCollectedDateTime;
            lhsCollectedDateTime = this.getCollectedDateTime();
            DateTime rhsCollectedDateTime;
            rhsCollectedDateTime = that.getCollectedDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collectedDateTime", lhsCollectedDateTime), LocatorUtils.property(thatLocator, "collectedDateTime", rhsCollectedDateTime), lhsCollectedDateTime, rhsCollectedDateTime)) {
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
            CodeableConcept lhsMethod;
            lhsMethod = this.getMethod();
            CodeableConcept rhsMethod;
            rhsMethod = that.getMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "method", lhsMethod), LocatorUtils.property(thatLocator, "method", rhsMethod), lhsMethod, rhsMethod)) {
                return false;
            }
        }
        {
            CodeableConcept lhsSourceSite;
            lhsSourceSite = this.getSourceSite();
            CodeableConcept rhsSourceSite;
            rhsSourceSite = that.getSourceSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceSite", lhsSourceSite), LocatorUtils.property(thatLocator, "sourceSite", rhsSourceSite), lhsSourceSite, rhsSourceSite)) {
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
            ResourceReference theCollector;
            theCollector = this.getCollector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collector", theCollector), currentHashCode, theCollector);
        }
        {
            List<org.hl7.fhir.model.String> theComments;
            theComments = (((this.comments!= null)&&(!this.comments.isEmpty()))?this.getComments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments);
        }
        {
            Period theCollectedPeriod;
            theCollectedPeriod = this.getCollectedPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collectedPeriod", theCollectedPeriod), currentHashCode, theCollectedPeriod);
        }
        {
            DateTime theCollectedDateTime;
            theCollectedDateTime = this.getCollectedDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collectedDateTime", theCollectedDateTime), currentHashCode, theCollectedDateTime);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "method", theMethod), currentHashCode, theMethod);
        }
        {
            CodeableConcept theSourceSite;
            theSourceSite = this.getSourceSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceSite", theSourceSite), currentHashCode, theSourceSite);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
