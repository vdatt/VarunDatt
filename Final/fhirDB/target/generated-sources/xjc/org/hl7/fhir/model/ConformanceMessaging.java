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
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * 
 * <p>Java class for Conformance.Messaging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Messaging">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="endpoint" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="reliableCache" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="event" type="{http://hl7.org/fhir}Conformance.Event" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Messaging", propOrder = {
    "endpoint",
    "reliableCache",
    "documentation",
    "events"
})
@Entity(name = "ConformanceMessaging")
@Table(name = "CONFORMANCEMESSAGING")
public class ConformanceMessaging
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Uri endpoint;
    protected Integer reliableCache;
    protected org.hl7.fhir.model.String documentation;
    @XmlElement(name = "event", required = true)
    protected List<ConformanceEvent> events;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENDPOINT_CONFORMANCEMESSAGIN_0")
    public Uri getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setEndpoint(Uri value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the reliableCache property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELIABLECACHE_CONFORMANCEMES_0")
    public Integer getReliableCache() {
        return reliableCache;
    }

    /**
     * Sets the value of the reliableCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReliableCache(Integer value) {
        this.reliableCache = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENTATION_CONFORMANCEMES_0")
    public org.hl7.fhir.model.String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDocumentation(org.hl7.fhir.model.String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceEvent }
     * 
     * 
     */
    @OneToMany(targetEntity = ConformanceEvent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENTS_CONFORMANCEMESSAGING__0")
    public List<ConformanceEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<ConformanceEvent>();
        }
        return this.events;
    }

    /**
     * 
     * 
     */
    public void setEvents(List<ConformanceEvent> events) {
        this.events = events;
    }

    public ConformanceMessaging withEndpoint(Uri value) {
        setEndpoint(value);
        return this;
    }

    public ConformanceMessaging withReliableCache(Integer value) {
        setReliableCache(value);
        return this;
    }

    public ConformanceMessaging withDocumentation(org.hl7.fhir.model.String value) {
        setDocumentation(value);
        return this;
    }

    public ConformanceMessaging withEvents(ConformanceEvent... values) {
        if (values!= null) {
            for (ConformanceEvent value: values) {
                getEvents().add(value);
            }
        }
        return this;
    }

    public ConformanceMessaging withEvents(Collection<ConformanceEvent> values) {
        if (values!= null) {
            getEvents().addAll(values);
        }
        return this;
    }

    public ConformanceMessaging withEvents(List<ConformanceEvent> events) {
        setEvents(events);
        return this;
    }

    @Override
    public ConformanceMessaging withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceMessaging withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceMessaging withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ConformanceMessaging withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceMessaging withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceMessaging withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ConformanceMessaging withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConformanceMessaging)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConformanceMessaging that = ((ConformanceMessaging) object);
        {
            Uri lhsEndpoint;
            lhsEndpoint = this.getEndpoint();
            Uri rhsEndpoint;
            rhsEndpoint = that.getEndpoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endpoint", lhsEndpoint), LocatorUtils.property(thatLocator, "endpoint", rhsEndpoint), lhsEndpoint, rhsEndpoint)) {
                return false;
            }
        }
        {
            Integer lhsReliableCache;
            lhsReliableCache = this.getReliableCache();
            Integer rhsReliableCache;
            rhsReliableCache = that.getReliableCache();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reliableCache", lhsReliableCache), LocatorUtils.property(thatLocator, "reliableCache", rhsReliableCache), lhsReliableCache, rhsReliableCache)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDocumentation;
            lhsDocumentation = this.getDocumentation();
            org.hl7.fhir.model.String rhsDocumentation;
            rhsDocumentation = that.getDocumentation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentation", lhsDocumentation), LocatorUtils.property(thatLocator, "documentation", rhsDocumentation), lhsDocumentation, rhsDocumentation)) {
                return false;
            }
        }
        {
            List<ConformanceEvent> lhsEvents;
            lhsEvents = (((this.events!= null)&&(!this.events.isEmpty()))?this.getEvents():null);
            List<ConformanceEvent> rhsEvents;
            rhsEvents = (((that.events!= null)&&(!that.events.isEmpty()))?that.getEvents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "events", lhsEvents), LocatorUtils.property(thatLocator, "events", rhsEvents), lhsEvents, rhsEvents)) {
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
            Uri theEndpoint;
            theEndpoint = this.getEndpoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endpoint", theEndpoint), currentHashCode, theEndpoint);
        }
        {
            Integer theReliableCache;
            theReliableCache = this.getReliableCache();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reliableCache", theReliableCache), currentHashCode, theReliableCache);
        }
        {
            org.hl7.fhir.model.String theDocumentation;
            theDocumentation = this.getDocumentation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentation", theDocumentation), currentHashCode, theDocumentation);
        }
        {
            List<ConformanceEvent> theEvents;
            theEvents = (((this.events!= null)&&(!this.events.isEmpty()))?this.getEvents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "events", theEvents), currentHashCode, theEvents);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
