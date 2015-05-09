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
 * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
 * 
 * <p>Java class for Medication.Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Medication.Product">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="form" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="ingredient" type="{http://hl7.org/fhir}Medication.Ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medication.Product", propOrder = {
    "form",
    "ingredients"
})
@Entity(name = "MedicationProduct")
@Table(name = "MEDICATIONPRODUCT")
public class MedicationProduct
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected CodeableConcept form;
    @XmlElement(name = "ingredient")
    protected List<MedicationIngredient> ingredients;

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FORM_MEDICATIONPRODUCT_HJID")
    public CodeableConcept getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setForm(CodeableConcept value) {
        this.form = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationIngredient }
     * 
     * 
     */
    @OneToMany(targetEntity = MedicationIngredient.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INGREDIENTS_MEDICATIONPRODUC_0")
    public List<MedicationIngredient> getIngredients() {
        if (ingredients == null) {
            ingredients = new ArrayList<MedicationIngredient>();
        }
        return this.ingredients;
    }

    /**
     * 
     * 
     */
    public void setIngredients(List<MedicationIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public MedicationProduct withForm(CodeableConcept value) {
        setForm(value);
        return this;
    }

    public MedicationProduct withIngredients(MedicationIngredient... values) {
        if (values!= null) {
            for (MedicationIngredient value: values) {
                getIngredients().add(value);
            }
        }
        return this;
    }

    public MedicationProduct withIngredients(Collection<MedicationIngredient> values) {
        if (values!= null) {
            getIngredients().addAll(values);
        }
        return this;
    }

    public MedicationProduct withIngredients(List<MedicationIngredient> ingredients) {
        setIngredients(ingredients);
        return this;
    }

    @Override
    public MedicationProduct withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationProduct withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationProduct withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MedicationProduct withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationProduct withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationProduct withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MedicationProduct withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationProduct)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationProduct that = ((MedicationProduct) object);
        {
            CodeableConcept lhsForm;
            lhsForm = this.getForm();
            CodeableConcept rhsForm;
            rhsForm = that.getForm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "form", lhsForm), LocatorUtils.property(thatLocator, "form", rhsForm), lhsForm, rhsForm)) {
                return false;
            }
        }
        {
            List<MedicationIngredient> lhsIngredients;
            lhsIngredients = (((this.ingredients!= null)&&(!this.ingredients.isEmpty()))?this.getIngredients():null);
            List<MedicationIngredient> rhsIngredients;
            rhsIngredients = (((that.ingredients!= null)&&(!that.ingredients.isEmpty()))?that.getIngredients():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ingredients", lhsIngredients), LocatorUtils.property(thatLocator, "ingredients", rhsIngredients), lhsIngredients, rhsIngredients)) {
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
            CodeableConcept theForm;
            theForm = this.getForm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "form", theForm), currentHashCode, theForm);
        }
        {
            List<MedicationIngredient> theIngredients;
            theIngredients = (((this.ingredients!= null)&&(!this.ingredients.isEmpty()))?this.getIngredients():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ingredients", theIngredients), currentHashCode, theIngredients);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
