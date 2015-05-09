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
 * <p>Java class for Conformance.Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}MessageSignificanceCategory" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}ConformanceEventMode"/>
 *         &lt;element name="protocol" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="focus" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Event", propOrder = {
    "code",
    "category",
    "mode",
    "protocols",
    "focus",
    "request",
    "response",
    "documentation"
})
@Entity(name = "ConformanceEvent")
@Table(name = "CONFORMANCEEVENT")
public class ConformanceEvent
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected Coding code;
    protected MessageSignificanceCategory category;
    @XmlElement(required = true)
    protected ConformanceEventMode mode;
    @XmlElement(name = "protocol")
    protected List<Coding> protocols;
    @XmlElement(required = true)
    protected Code focus;
    @XmlElement(required = true)
    protected ResourceReference request;
    @XmlElement(required = true)
    protected ResourceReference response;
    protected org.hl7.fhir.model.String documentation;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    @ManyToOne(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_CONFORMANCEEVENT_HJID")
    public Coding getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setCode(Coding value) {
        this.code = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    @ManyToOne(targetEntity = MessageSignificanceCategory.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CATEGORY_CONFORMANCEEVENT_HJ_0")
    public MessageSignificanceCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSignificanceCategory }
     *     
     */
    public void setCategory(MessageSignificanceCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceEventMode }
     *     
     */
    @ManyToOne(targetEntity = ConformanceEventMode.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MODE__CONFORMANCEEVENT_HJID")
    public ConformanceEventMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceEventMode }
     *     
     */
    public void setMode(ConformanceEventMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the protocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    @OneToMany(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROTOCOLS_CONFORMANCEEVENT_H_0")
    public List<Coding> getProtocols() {
        if (protocols == null) {
            protocols = new ArrayList<Coding>();
        }
        return this.protocols;
    }

    /**
     * 
     * 
     */
    public void setProtocols(List<Coding> protocols) {
        this.protocols = protocols;
    }

    /**
     * Gets the value of the focus property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    @ManyToOne(targetEntity = Code.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FOCUS_CONFORMANCEEVENT_HJID")
    public Code getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFocus(Code value) {
        this.focus = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REQUEST_CONFORMANCEEVENT_HJID")
    public ResourceReference getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setRequest(ResourceReference value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RESPONSE_CONFORMANCEEVENT_HJ_0")
    public ResourceReference getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setResponse(ResourceReference value) {
        this.response = value;
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
    @JoinColumn(name = "DOCUMENTATION_CONFORMANCEEVE_0")
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

    public ConformanceEvent withCode(Coding value) {
        setCode(value);
        return this;
    }

    public ConformanceEvent withCategory(MessageSignificanceCategory value) {
        setCategory(value);
        return this;
    }

    public ConformanceEvent withMode(ConformanceEventMode value) {
        setMode(value);
        return this;
    }

    public ConformanceEvent withProtocols(Coding... values) {
        if (values!= null) {
            for (Coding value: values) {
                getProtocols().add(value);
            }
        }
        return this;
    }

    public ConformanceEvent withProtocols(Collection<Coding> values) {
        if (values!= null) {
            getProtocols().addAll(values);
        }
        return this;
    }

    public ConformanceEvent withProtocols(List<Coding> protocols) {
        setProtocols(protocols);
        return this;
    }

    public ConformanceEvent withFocus(Code value) {
        setFocus(value);
        return this;
    }

    public ConformanceEvent withRequest(ResourceReference value) {
        setRequest(value);
        return this;
    }

    public ConformanceEvent withResponse(ResourceReference value) {
        setResponse(value);
        return this;
    }

    public ConformanceEvent withDocumentation(org.hl7.fhir.model.String value) {
        setDocumentation(value);
        return this;
    }

    @Override
    public ConformanceEvent withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceEvent withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceEvent withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ConformanceEvent withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceEvent withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceEvent withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ConformanceEvent withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConformanceEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConformanceEvent that = ((ConformanceEvent) object);
        {
            Coding lhsCode;
            lhsCode = this.getCode();
            Coding rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            MessageSignificanceCategory lhsCategory;
            lhsCategory = this.getCategory();
            MessageSignificanceCategory rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                return false;
            }
        }
        {
            ConformanceEventMode lhsMode;
            lhsMode = this.getMode();
            ConformanceEventMode rhsMode;
            rhsMode = that.getMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode)) {
                return false;
            }
        }
        {
            List<Coding> lhsProtocols;
            lhsProtocols = (((this.protocols!= null)&&(!this.protocols.isEmpty()))?this.getProtocols():null);
            List<Coding> rhsProtocols;
            rhsProtocols = (((that.protocols!= null)&&(!that.protocols.isEmpty()))?that.getProtocols():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "protocols", lhsProtocols), LocatorUtils.property(thatLocator, "protocols", rhsProtocols), lhsProtocols, rhsProtocols)) {
                return false;
            }
        }
        {
            Code lhsFocus;
            lhsFocus = this.getFocus();
            Code rhsFocus;
            rhsFocus = that.getFocus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "focus", lhsFocus), LocatorUtils.property(thatLocator, "focus", rhsFocus), lhsFocus, rhsFocus)) {
                return false;
            }
        }
        {
            ResourceReference lhsRequest;
            lhsRequest = this.getRequest();
            ResourceReference rhsRequest;
            rhsRequest = that.getRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "request", lhsRequest), LocatorUtils.property(thatLocator, "request", rhsRequest), lhsRequest, rhsRequest)) {
                return false;
            }
        }
        {
            ResourceReference lhsResponse;
            lhsResponse = this.getResponse();
            ResourceReference rhsResponse;
            rhsResponse = that.getResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "response", lhsResponse), LocatorUtils.property(thatLocator, "response", rhsResponse), lhsResponse, rhsResponse)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Coding theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            MessageSignificanceCategory theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory);
        }
        {
            ConformanceEventMode theMode;
            theMode = this.getMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode);
        }
        {
            List<Coding> theProtocols;
            theProtocols = (((this.protocols!= null)&&(!this.protocols.isEmpty()))?this.getProtocols():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "protocols", theProtocols), currentHashCode, theProtocols);
        }
        {
            Code theFocus;
            theFocus = this.getFocus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "focus", theFocus), currentHashCode, theFocus);
        }
        {
            ResourceReference theRequest;
            theRequest = this.getRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "request", theRequest), currentHashCode, theRequest);
        }
        {
            ResourceReference theResponse;
            theResponse = this.getResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "response", theResponse), currentHashCode, theResponse);
        }
        {
            org.hl7.fhir.model.String theDocumentation;
            theDocumentation = this.getDocumentation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentation", theDocumentation), currentHashCode, theDocumentation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}