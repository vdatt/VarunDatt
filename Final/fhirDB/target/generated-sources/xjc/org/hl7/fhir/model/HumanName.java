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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for HumanName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HumanName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="use" type="{http://hl7.org/fhir}NameUse" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="family" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="given" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumanName", propOrder = {
    "use",
    "text",
    "families",
    "givens",
    "prefixes",
    "suffixes",
    "period"
})
@Entity(name = "HumanName")
@Table(name = "HUMANNAME")
public class HumanName
    extends Element
    implements Serializable, Equals, HashCode
{

    protected NameUse use;
    protected org.hl7.fhir.model.String text;
    @XmlElement(name = "family")
    protected List<org.hl7.fhir.model.String> families;
    @XmlElement(name = "given")
    protected List<org.hl7.fhir.model.String> givens;
    @XmlElement(name = "prefix")
    protected List<org.hl7.fhir.model.String> prefixes;
    @XmlElement(name = "suffix")
    protected List<org.hl7.fhir.model.String> suffixes;
    protected Period period;

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link NameUse }
     *     
     */
    @ManyToOne(targetEntity = NameUse.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "USE__HUMANNAME_HJID")
    public NameUse getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameUse }
     *     
     */
    public void setUse(NameUse value) {
        this.use = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TEXT_HUMANNAME_HJID")
    public org.hl7.fhir.model.String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setText(org.hl7.fhir.model.String value) {
        this.text = value;
    }

    /**
     * Gets the value of the families property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the families property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilies().add(newItem);
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
    @JoinColumn(name = "FAMILIES_HUMANNAME_HJID")
    public List<org.hl7.fhir.model.String> getFamilies() {
        if (families == null) {
            families = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.families;
    }

    /**
     * 
     * 
     */
    public void setFamilies(List<org.hl7.fhir.model.String> families) {
        this.families = families;
    }

    /**
     * Gets the value of the givens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivens().add(newItem);
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
    @JoinColumn(name = "GIVENS_HUMANNAME_HJID")
    public List<org.hl7.fhir.model.String> getGivens() {
        if (givens == null) {
            givens = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.givens;
    }

    /**
     * 
     * 
     */
    public void setGivens(List<org.hl7.fhir.model.String> givens) {
        this.givens = givens;
    }

    /**
     * Gets the value of the prefixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefixes().add(newItem);
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
    @JoinColumn(name = "PREFIXES_HUMANNAME_HJID")
    public List<org.hl7.fhir.model.String> getPrefixes() {
        if (prefixes == null) {
            prefixes = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.prefixes;
    }

    /**
     * 
     * 
     */
    public void setPrefixes(List<org.hl7.fhir.model.String> prefixes) {
        this.prefixes = prefixes;
    }

    /**
     * Gets the value of the suffixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suffixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffixes().add(newItem);
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
    @JoinColumn(name = "SUFFIXES_HUMANNAME_HJID")
    public List<org.hl7.fhir.model.String> getSuffixes() {
        if (suffixes == null) {
            suffixes = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.suffixes;
    }

    /**
     * 
     * 
     */
    public void setSuffixes(List<org.hl7.fhir.model.String> suffixes) {
        this.suffixes = suffixes;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERIOD_HUMANNAME_HJID")
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    public HumanName withUse(NameUse value) {
        setUse(value);
        return this;
    }

    public HumanName withText(org.hl7.fhir.model.String value) {
        setText(value);
        return this;
    }

    public HumanName withFamilies(org.hl7.fhir.model.String... values) {
        if (values!= null) {
            for (org.hl7.fhir.model.String value: values) {
                getFamilies().add(value);
            }
        }
        return this;
    }

    public HumanName withFamilies(Collection<org.hl7.fhir.model.String> values) {
        if (values!= null) {
            getFamilies().addAll(values);
        }
        return this;
    }

    public HumanName withFamilies(List<org.hl7.fhir.model.String> families) {
        setFamilies(families);
        return this;
    }

    public HumanName withGivens(org.hl7.fhir.model.String... values) {
        if (values!= null) {
            for (org.hl7.fhir.model.String value: values) {
                getGivens().add(value);
            }
        }
        return this;
    }

    public HumanName withGivens(Collection<org.hl7.fhir.model.String> values) {
        if (values!= null) {
            getGivens().addAll(values);
        }
        return this;
    }

    public HumanName withGivens(List<org.hl7.fhir.model.String> givens) {
        setGivens(givens);
        return this;
    }

    public HumanName withPrefixes(org.hl7.fhir.model.String... values) {
        if (values!= null) {
            for (org.hl7.fhir.model.String value: values) {
                getPrefixes().add(value);
            }
        }
        return this;
    }

    public HumanName withPrefixes(Collection<org.hl7.fhir.model.String> values) {
        if (values!= null) {
            getPrefixes().addAll(values);
        }
        return this;
    }

    public HumanName withPrefixes(List<org.hl7.fhir.model.String> prefixes) {
        setPrefixes(prefixes);
        return this;
    }

    public HumanName withSuffixes(org.hl7.fhir.model.String... values) {
        if (values!= null) {
            for (org.hl7.fhir.model.String value: values) {
                getSuffixes().add(value);
            }
        }
        return this;
    }

    public HumanName withSuffixes(Collection<org.hl7.fhir.model.String> values) {
        if (values!= null) {
            getSuffixes().addAll(values);
        }
        return this;
    }

    public HumanName withSuffixes(List<org.hl7.fhir.model.String> suffixes) {
        setSuffixes(suffixes);
        return this;
    }

    public HumanName withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    @Override
    public HumanName withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public HumanName withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public HumanName withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public HumanName withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HumanName)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final HumanName that = ((HumanName) object);
        {
            NameUse lhsUse;
            lhsUse = this.getUse();
            NameUse rhsUse;
            rhsUse = that.getUse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "use", lhsUse), LocatorUtils.property(thatLocator, "use", rhsUse), lhsUse, rhsUse)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsText;
            lhsText = this.getText();
            org.hl7.fhir.model.String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
                return false;
            }
        }
        {
            List<org.hl7.fhir.model.String> lhsFamilies;
            lhsFamilies = (((this.families!= null)&&(!this.families.isEmpty()))?this.getFamilies():null);
            List<org.hl7.fhir.model.String> rhsFamilies;
            rhsFamilies = (((that.families!= null)&&(!that.families.isEmpty()))?that.getFamilies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "families", lhsFamilies), LocatorUtils.property(thatLocator, "families", rhsFamilies), lhsFamilies, rhsFamilies)) {
                return false;
            }
        }
        {
            List<org.hl7.fhir.model.String> lhsGivens;
            lhsGivens = (((this.givens!= null)&&(!this.givens.isEmpty()))?this.getGivens():null);
            List<org.hl7.fhir.model.String> rhsGivens;
            rhsGivens = (((that.givens!= null)&&(!that.givens.isEmpty()))?that.getGivens():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "givens", lhsGivens), LocatorUtils.property(thatLocator, "givens", rhsGivens), lhsGivens, rhsGivens)) {
                return false;
            }
        }
        {
            List<org.hl7.fhir.model.String> lhsPrefixes;
            lhsPrefixes = (((this.prefixes!= null)&&(!this.prefixes.isEmpty()))?this.getPrefixes():null);
            List<org.hl7.fhir.model.String> rhsPrefixes;
            rhsPrefixes = (((that.prefixes!= null)&&(!that.prefixes.isEmpty()))?that.getPrefixes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prefixes", lhsPrefixes), LocatorUtils.property(thatLocator, "prefixes", rhsPrefixes), lhsPrefixes, rhsPrefixes)) {
                return false;
            }
        }
        {
            List<org.hl7.fhir.model.String> lhsSuffixes;
            lhsSuffixes = (((this.suffixes!= null)&&(!this.suffixes.isEmpty()))?this.getSuffixes():null);
            List<org.hl7.fhir.model.String> rhsSuffixes;
            rhsSuffixes = (((that.suffixes!= null)&&(!that.suffixes.isEmpty()))?that.getSuffixes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suffixes", lhsSuffixes), LocatorUtils.property(thatLocator, "suffixes", rhsSuffixes), lhsSuffixes, rhsSuffixes)) {
                return false;
            }
        }
        {
            Period lhsPeriod;
            lhsPeriod = this.getPeriod();
            Period rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod)) {
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
            NameUse theUse;
            theUse = this.getUse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "use", theUse), currentHashCode, theUse);
        }
        {
            org.hl7.fhir.model.String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText);
        }
        {
            List<org.hl7.fhir.model.String> theFamilies;
            theFamilies = (((this.families!= null)&&(!this.families.isEmpty()))?this.getFamilies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "families", theFamilies), currentHashCode, theFamilies);
        }
        {
            List<org.hl7.fhir.model.String> theGivens;
            theGivens = (((this.givens!= null)&&(!this.givens.isEmpty()))?this.getGivens():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "givens", theGivens), currentHashCode, theGivens);
        }
        {
            List<org.hl7.fhir.model.String> thePrefixes;
            thePrefixes = (((this.prefixes!= null)&&(!this.prefixes.isEmpty()))?this.getPrefixes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefixes", thePrefixes), currentHashCode, thePrefixes);
        }
        {
            List<org.hl7.fhir.model.String> theSuffixes;
            theSuffixes = (((this.suffixes!= null)&&(!this.suffixes.isEmpty()))?this.getSuffixes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suffixes", theSuffixes), currentHashCode, theSuffixes);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}