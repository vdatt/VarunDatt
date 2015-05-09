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
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Include complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Include">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://hl7.org/fhir}ValueSet.Filter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Include", propOrder = {
    "system",
    "version",
    "codes",
    "filters"
})
@Entity(name = "ValueSetInclude")
@Table(name = "VALUESETINCLUDE")
public class ValueSetInclude
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected Uri system;
    protected org.hl7.fhir.model.String version;
    @XmlElement(name = "code")
    protected List<Code> codes;
    @XmlElement(name = "filter")
    protected List<ValueSetFilter> filters;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SYSTEM__VALUESETINCLUDE_HJID")
    public Uri getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSystem(Uri value) {
        this.system = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VERSION__VALUESETINCLUDE_HJID")
    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    @OneToMany(targetEntity = Code.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODES_VALUESETINCLUDE_HJID")
    public List<Code> getCodes() {
        if (codes == null) {
            codes = new ArrayList<Code>();
        }
        return this.codes;
    }

    /**
     * 
     * 
     */
    public void setCodes(List<Code> codes) {
        this.codes = codes;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetFilter }
     * 
     * 
     */
    @OneToMany(targetEntity = ValueSetFilter.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FILTERS_VALUESETINCLUDE_HJID")
    public List<ValueSetFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<ValueSetFilter>();
        }
        return this.filters;
    }

    /**
     * 
     * 
     */
    public void setFilters(List<ValueSetFilter> filters) {
        this.filters = filters;
    }

    public ValueSetInclude withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    public ValueSetInclude withVersion(org.hl7.fhir.model.String value) {
        setVersion(value);
        return this;
    }

    public ValueSetInclude withCodes(Code... values) {
        if (values!= null) {
            for (Code value: values) {
                getCodes().add(value);
            }
        }
        return this;
    }

    public ValueSetInclude withCodes(Collection<Code> values) {
        if (values!= null) {
            getCodes().addAll(values);
        }
        return this;
    }

    public ValueSetInclude withCodes(List<Code> codes) {
        setCodes(codes);
        return this;
    }

    public ValueSetInclude withFilters(ValueSetFilter... values) {
        if (values!= null) {
            for (ValueSetFilter value: values) {
                getFilters().add(value);
            }
        }
        return this;
    }

    public ValueSetInclude withFilters(Collection<ValueSetFilter> values) {
        if (values!= null) {
            getFilters().addAll(values);
        }
        return this;
    }

    public ValueSetInclude withFilters(List<ValueSetFilter> filters) {
        setFilters(filters);
        return this;
    }

    @Override
    public ValueSetInclude withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetInclude withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetInclude withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ValueSetInclude withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetInclude withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetInclude withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ValueSetInclude withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValueSetInclude)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ValueSetInclude that = ((ValueSetInclude) object);
        {
            Uri lhsSystem;
            lhsSystem = this.getSystem();
            Uri rhsSystem;
            rhsSystem = that.getSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "system", lhsSystem), LocatorUtils.property(thatLocator, "system", rhsSystem), lhsSystem, rhsSystem)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsVersion;
            lhsVersion = this.getVersion();
            org.hl7.fhir.model.String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            List<Code> lhsCodes;
            lhsCodes = (((this.codes!= null)&&(!this.codes.isEmpty()))?this.getCodes():null);
            List<Code> rhsCodes;
            rhsCodes = (((that.codes!= null)&&(!that.codes.isEmpty()))?that.getCodes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codes", lhsCodes), LocatorUtils.property(thatLocator, "codes", rhsCodes), lhsCodes, rhsCodes)) {
                return false;
            }
        }
        {
            List<ValueSetFilter> lhsFilters;
            lhsFilters = (((this.filters!= null)&&(!this.filters.isEmpty()))?this.getFilters():null);
            List<ValueSetFilter> rhsFilters;
            rhsFilters = (((that.filters!= null)&&(!that.filters.isEmpty()))?that.getFilters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filters", lhsFilters), LocatorUtils.property(thatLocator, "filters", rhsFilters), lhsFilters, rhsFilters)) {
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
            Uri theSystem;
            theSystem = this.getSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "system", theSystem), currentHashCode, theSystem);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            List<Code> theCodes;
            theCodes = (((this.codes!= null)&&(!this.codes.isEmpty()))?this.getCodes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codes", theCodes), currentHashCode, theCodes);
        }
        {
            List<ValueSetFilter> theFilters;
            theFilters = (((this.filters!= null)&&(!this.filters.isEmpty()))?this.getFilters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filters", theFilters), currentHashCode, theFilters);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
