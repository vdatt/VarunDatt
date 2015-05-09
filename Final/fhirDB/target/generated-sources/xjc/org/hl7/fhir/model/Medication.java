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
 * <p>Java class for Medication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Medication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="isBrand" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://hl7.org/fhir}MedicationKind" minOccurs="0"/>
 *         &lt;element name="product" type="{http://hl7.org/fhir}Medication.Product" minOccurs="0"/>
 *         &lt;element name="package" type="{http://hl7.org/fhir}Medication.Package" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medication", propOrder = {
    "name",
    "code",
    "isBrand",
    "manufacturer",
    "kind",
    "product",
    "_package"
})
@XmlRootElement(name = "Medication")
@Entity(name = "Medication")
@Table(name = "MEDICATION")
public class Medication
    extends Resource
    implements Serializable, Equals, HashCode
{

    protected org.hl7.fhir.model.String name;
    protected CodeableConcept code;
    protected Boolean isBrand;
    protected ResourceReference manufacturer;
    protected MedicationKind kind;
    protected MedicationProduct product;
    @XmlElement(name = "package")
    protected MedicationPackage _package;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__MEDICATION_HJID")
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
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
    @JoinColumn(name = "CODE_MEDICATION_HJID")
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
     * Gets the value of the isBrand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ISBRAND_MEDICATION_HJID")
    public Boolean getIsBrand() {
        return isBrand;
    }

    /**
     * Sets the value of the isBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBrand(Boolean value) {
        this.isBrand = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MANUFACTURER_MEDICATION_HJID")
    public ResourceReference getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setManufacturer(ResourceReference value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationKind }
     *     
     */
    @ManyToOne(targetEntity = MedicationKind.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "KIND_MEDICATION_HJID")
    public MedicationKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationKind }
     *     
     */
    public void setKind(MedicationKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationProduct }
     *     
     */
    @ManyToOne(targetEntity = MedicationProduct.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRODUCT_MEDICATION_HJID")
    public MedicationProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationProduct }
     *     
     */
    public void setProduct(MedicationProduct value) {
        this.product = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationPackage }
     *     
     */
    @ManyToOne(targetEntity = MedicationPackage.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PACKAGE_MEDICATION_HJID")
    public MedicationPackage getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationPackage }
     *     
     */
    public void setPackage(MedicationPackage value) {
        this._package = value;
    }

    public Medication withName(org.hl7.fhir.model.String value) {
        setName(value);
        return this;
    }

    public Medication withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public Medication withIsBrand(Boolean value) {
        setIsBrand(value);
        return this;
    }

    public Medication withManufacturer(ResourceReference value) {
        setManufacturer(value);
        return this;
    }

    public Medication withKind(MedicationKind value) {
        setKind(value);
        return this;
    }

    public Medication withProduct(MedicationProduct value) {
        setProduct(value);
        return this;
    }

    public Medication withPackage(MedicationPackage value) {
        setPackage(value);
        return this;
    }

    @Override
    public Medication withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Medication withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Medication withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Medication withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Medication withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public Medication withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Medication withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Medication withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public Medication withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Medication withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Medication withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public Medication withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Medication)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Medication that = ((Medication) object);
        {
            org.hl7.fhir.model.String lhsName;
            lhsName = this.getName();
            org.hl7.fhir.model.String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            Boolean lhsIsBrand;
            lhsIsBrand = this.getIsBrand();
            Boolean rhsIsBrand;
            rhsIsBrand = that.getIsBrand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isBrand", lhsIsBrand), LocatorUtils.property(thatLocator, "isBrand", rhsIsBrand), lhsIsBrand, rhsIsBrand)) {
                return false;
            }
        }
        {
            ResourceReference lhsManufacturer;
            lhsManufacturer = this.getManufacturer();
            ResourceReference rhsManufacturer;
            rhsManufacturer = that.getManufacturer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturer", lhsManufacturer), LocatorUtils.property(thatLocator, "manufacturer", rhsManufacturer), lhsManufacturer, rhsManufacturer)) {
                return false;
            }
        }
        {
            MedicationKind lhsKind;
            lhsKind = this.getKind();
            MedicationKind rhsKind;
            rhsKind = that.getKind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kind", lhsKind), LocatorUtils.property(thatLocator, "kind", rhsKind), lhsKind, rhsKind)) {
                return false;
            }
        }
        {
            MedicationProduct lhsProduct;
            lhsProduct = this.getProduct();
            MedicationProduct rhsProduct;
            rhsProduct = that.getProduct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "product", lhsProduct), LocatorUtils.property(thatLocator, "product", rhsProduct), lhsProduct, rhsProduct)) {
                return false;
            }
        }
        {
            MedicationPackage lhsPackage;
            lhsPackage = this.getPackage();
            MedicationPackage rhsPackage;
            rhsPackage = that.getPackage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_package", lhsPackage), LocatorUtils.property(thatLocator, "_package", rhsPackage), lhsPackage, rhsPackage)) {
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
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            Boolean theIsBrand;
            theIsBrand = this.getIsBrand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isBrand", theIsBrand), currentHashCode, theIsBrand);
        }
        {
            ResourceReference theManufacturer;
            theManufacturer = this.getManufacturer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturer", theManufacturer), currentHashCode, theManufacturer);
        }
        {
            MedicationKind theKind;
            theKind = this.getKind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kind", theKind), currentHashCode, theKind);
        }
        {
            MedicationProduct theProduct;
            theProduct = this.getProduct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "product", theProduct), currentHashCode, theProduct);
        }
        {
            MedicationPackage thePackage;
            thePackage = this.getPackage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_package", thePackage), currentHashCode, thePackage);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
