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
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="ordered" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}ListMode"/>
 *         &lt;element name="entry" type="{http://hl7.org/fhir}List.Entry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emptyReason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List", propOrder = {
    "identifiers",
    "code",
    "subject",
    "source",
    "date",
    "ordered",
    "mode",
    "entries",
    "emptyReason"
})
@XmlRootElement(name = "List")
@Entity(name = "List")
@Table(name = "LIST")
public class List
    extends Resource
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "identifier")
    protected java.util.List<Identifier> identifiers;
    protected CodeableConcept code;
    protected ResourceReference subject;
    protected ResourceReference source;
    protected DateTime date;
    protected Boolean ordered;
    @XmlElement(required = true)
    protected ListMode mode;
    @XmlElement(name = "entry")
    protected java.util.List<ListEntry> entries;
    protected CodeableConcept emptyReason;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIERS_LIST_HJID")
    public java.util.List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * 
     * 
     */
    public void setIdentifiers(java.util.List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_LIST_HJID")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBJECT_LIST_HJID")
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__LIST_HJID")
    public ResourceReference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSource(ResourceReference value) {
        this.source = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATE__LIST_HJID")
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORDERED_LIST_HJID")
    public Boolean getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrdered(Boolean value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ListMode }
     *     
     */
    @ManyToOne(targetEntity = ListMode.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MODE__LIST_HJID")
    public ListMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMode }
     *     
     */
    public void setMode(ListMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListEntry }
     * 
     * 
     */
    @OneToMany(targetEntity = ListEntry.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENTRIES_LIST_HJID")
    public java.util.List<ListEntry> getEntries() {
        if (entries == null) {
            entries = new ArrayList<ListEntry>();
        }
        return this.entries;
    }

    /**
     * 
     * 
     */
    public void setEntries(java.util.List<ListEntry> entries) {
        this.entries = entries;
    }

    /**
     * Gets the value of the emptyReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EMPTYREASON_LIST_HJID")
    public CodeableConcept getEmptyReason() {
        return emptyReason;
    }

    /**
     * Sets the value of the emptyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setEmptyReason(CodeableConcept value) {
        this.emptyReason = value;
    }

    public List withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public List withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public List withIdentifiers(java.util.List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public List withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public List withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public List withSource(ResourceReference value) {
        setSource(value);
        return this;
    }

    public List withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public List withOrdered(Boolean value) {
        setOrdered(value);
        return this;
    }

    public List withMode(ListMode value) {
        setMode(value);
        return this;
    }

    public List withEntries(ListEntry... values) {
        if (values!= null) {
            for (ListEntry value: values) {
                getEntries().add(value);
            }
        }
        return this;
    }

    public List withEntries(Collection<ListEntry> values) {
        if (values!= null) {
            getEntries().addAll(values);
        }
        return this;
    }

    public List withEntries(java.util.List<ListEntry> entries) {
        setEntries(entries);
        return this;
    }

    public List withEmptyReason(CodeableConcept value) {
        setEmptyReason(value);
        return this;
    }

    @Override
    public List withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public List withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public List withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public List withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public List withContaineds(java.util.List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public List withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public List withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public List withModifierExtensions(java.util.List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public List withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public List withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public List withExtensions(java.util.List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public List withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof List)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final List that = ((List) object);
        {
            java.util.List<Identifier> lhsIdentifiers;
            lhsIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            java.util.List<Identifier> rhsIdentifiers;
            rhsIdentifiers = (((that.identifiers!= null)&&(!that.identifiers.isEmpty()))?that.getIdentifiers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifiers", lhsIdentifiers), LocatorUtils.property(thatLocator, "identifiers", rhsIdentifiers), lhsIdentifiers, rhsIdentifiers)) {
                return false;
            }
        }
        {
            CodeableConcept lhsCode;
            lhsCode = this.getCode();
            CodeableConcept rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            ResourceReference lhsSubject;
            lhsSubject = this.getSubject();
            ResourceReference rhsSubject;
            rhsSubject = that.getSubject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subject", lhsSubject), LocatorUtils.property(thatLocator, "subject", rhsSubject), lhsSubject, rhsSubject)) {
                return false;
            }
        }
        {
            ResourceReference lhsSource;
            lhsSource = this.getSource();
            ResourceReference rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            DateTime lhsDate;
            lhsDate = this.getDate();
            DateTime rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            Boolean lhsOrdered;
            lhsOrdered = this.getOrdered();
            Boolean rhsOrdered;
            rhsOrdered = that.getOrdered();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordered", lhsOrdered), LocatorUtils.property(thatLocator, "ordered", rhsOrdered), lhsOrdered, rhsOrdered)) {
                return false;
            }
        }
        {
            ListMode lhsMode;
            lhsMode = this.getMode();
            ListMode rhsMode;
            rhsMode = that.getMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode)) {
                return false;
            }
        }
        {
            java.util.List<ListEntry> lhsEntries;
            lhsEntries = (((this.entries!= null)&&(!this.entries.isEmpty()))?this.getEntries():null);
            java.util.List<ListEntry> rhsEntries;
            rhsEntries = (((that.entries!= null)&&(!that.entries.isEmpty()))?that.getEntries():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entries", lhsEntries), LocatorUtils.property(thatLocator, "entries", rhsEntries), lhsEntries, rhsEntries)) {
                return false;
            }
        }
        {
            CodeableConcept lhsEmptyReason;
            lhsEmptyReason = this.getEmptyReason();
            CodeableConcept rhsEmptyReason;
            rhsEmptyReason = that.getEmptyReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emptyReason", lhsEmptyReason), LocatorUtils.property(thatLocator, "emptyReason", rhsEmptyReason), lhsEmptyReason, rhsEmptyReason)) {
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
            java.util.List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifiers", theIdentifiers), currentHashCode, theIdentifiers);
        }
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            ResourceReference theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            Boolean theOrdered;
            theOrdered = this.getOrdered();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordered", theOrdered), currentHashCode, theOrdered);
        }
        {
            ListMode theMode;
            theMode = this.getMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode);
        }
        {
            java.util.List<ListEntry> theEntries;
            theEntries = (((this.entries!= null)&&(!this.entries.isEmpty()))?this.getEntries():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entries", theEntries), currentHashCode, theEntries);
        }
        {
            CodeableConcept theEmptyReason;
            theEmptyReason = this.getEmptyReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emptyReason", theEmptyReason), currentHashCode, theEmptyReason);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
