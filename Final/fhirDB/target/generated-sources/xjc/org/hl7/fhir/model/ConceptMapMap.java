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
 * A statement of relationships from one set of concepts to one or more other concept systems.
 * 
 * <p>Java class for ConceptMap.Map complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap.Map">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="equivalence" type="{http://hl7.org/fhir}ConceptMapEquivalence"/>
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://hl7.org/fhir}ConceptMap.DependsOn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.Map", propOrder = {
    "system",
    "code",
    "equivalence",
    "comments",
    "products"
})
@Entity(name = "ConceptMapMap")
@Table(name = "CONCEPTMAPMAP")
public class ConceptMapMap
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Uri system;
    protected Code code;
    @XmlElement(required = true)
    protected ConceptMapEquivalence equivalence;
    protected org.hl7.fhir.model.String comments;
    @XmlElement(name = "product")
    protected List<ConceptMapDependsOn> products;

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
    @JoinColumn(name = "SYSTEM__CONCEPTMAPMAP_HJID")
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    @ManyToOne(targetEntity = Code.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_CONCEPTMAPMAP_HJID")
    public Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the equivalence property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    @ManyToOne(targetEntity = ConceptMapEquivalence.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EQUIVALENCE_CONCEPTMAPMAP_HJ_0")
    public ConceptMapEquivalence getEquivalence() {
        return equivalence;
    }

    /**
     * Sets the value of the equivalence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    public void setEquivalence(ConceptMapEquivalence value) {
        this.equivalence = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COMMENTS_CONCEPTMAPMAP_HJID")
    public org.hl7.fhir.model.String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setComments(org.hl7.fhir.model.String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapDependsOn }
     * 
     * 
     */
    @OneToMany(targetEntity = ConceptMapDependsOn.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRODUCTS_CONCEPTMAPMAP_HJID")
    public List<ConceptMapDependsOn> getProducts() {
        if (products == null) {
            products = new ArrayList<ConceptMapDependsOn>();
        }
        return this.products;
    }

    /**
     * 
     * 
     */
    public void setProducts(List<ConceptMapDependsOn> products) {
        this.products = products;
    }

    public ConceptMapMap withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    public ConceptMapMap withCode(Code value) {
        setCode(value);
        return this;
    }

    public ConceptMapMap withEquivalence(ConceptMapEquivalence value) {
        setEquivalence(value);
        return this;
    }

    public ConceptMapMap withComments(org.hl7.fhir.model.String value) {
        setComments(value);
        return this;
    }

    public ConceptMapMap withProducts(ConceptMapDependsOn... values) {
        if (values!= null) {
            for (ConceptMapDependsOn value: values) {
                getProducts().add(value);
            }
        }
        return this;
    }

    public ConceptMapMap withProducts(Collection<ConceptMapDependsOn> values) {
        if (values!= null) {
            getProducts().addAll(values);
        }
        return this;
    }

    public ConceptMapMap withProducts(List<ConceptMapDependsOn> products) {
        setProducts(products);
        return this;
    }

    @Override
    public ConceptMapMap withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMapMap withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMapMap withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ConceptMapMap withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMapMap withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMapMap withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ConceptMapMap withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConceptMapMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConceptMapMap that = ((ConceptMapMap) object);
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
            Code lhsCode;
            lhsCode = this.getCode();
            Code rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            ConceptMapEquivalence lhsEquivalence;
            lhsEquivalence = this.getEquivalence();
            ConceptMapEquivalence rhsEquivalence;
            rhsEquivalence = that.getEquivalence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equivalence", lhsEquivalence), LocatorUtils.property(thatLocator, "equivalence", rhsEquivalence), lhsEquivalence, rhsEquivalence)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsComments;
            lhsComments = this.getComments();
            org.hl7.fhir.model.String rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments)) {
                return false;
            }
        }
        {
            List<ConceptMapDependsOn> lhsProducts;
            lhsProducts = (((this.products!= null)&&(!this.products.isEmpty()))?this.getProducts():null);
            List<ConceptMapDependsOn> rhsProducts;
            rhsProducts = (((that.products!= null)&&(!that.products.isEmpty()))?that.getProducts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "products", lhsProducts), LocatorUtils.property(thatLocator, "products", rhsProducts), lhsProducts, rhsProducts)) {
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
            Code theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            ConceptMapEquivalence theEquivalence;
            theEquivalence = this.getEquivalence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equivalence", theEquivalence), currentHashCode, theEquivalence);
        }
        {
            org.hl7.fhir.model.String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments);
        }
        {
            List<ConceptMapDependsOn> theProducts;
            theProducts = (((this.products!= null)&&(!this.products.isEmpty()))?this.getProducts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "products", theProducts), currentHashCode, theProducts);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
