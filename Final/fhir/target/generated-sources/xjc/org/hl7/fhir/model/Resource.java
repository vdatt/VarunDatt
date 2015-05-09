//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:02:37 AM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * The base resource declaration used for all FHIR resource types - adds Narrative and xml:lang
 * 
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="language" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://hl7.org/fhir}Narrative" minOccurs="0"/&gt;
 *         &lt;element name="contained" type="{http://hl7.org/fhir}Resource.Inline" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "language",
    "text",
    "containeds"
})
@XmlSeeAlso({
    ValueSet.class,
    Supply.class,
    Substance.class,
    Specimen.class,
    SecurityEvent.class,
    RelatedPerson.class,
    Questionnaire.class,
    Query.class,
    Provenance.class,
    Profile.class,
    Procedure.class,
    Practitioner.class,
    Patient.class,
    Other.class,
    Organization.class,
    OrderResponse.class,
    Order.class,
    OperationOutcome.class,
    Observation.class,
    MessageHeader.class,
    MedicationStatement.class,
    MedicationPrescription.class,
    MedicationDispense.class,
    MedicationAdministration.class,
    Medication.class,
    Media.class,
    Location.class,
    org.hl7.fhir.model.List.class,
    ImmunizationRecommendation.class,
    Immunization.class,
    ImagingStudy.class,
    Group.class,
    FamilyHistory.class,
    Encounter.class,
    DocumentReference.class,
    DocumentManifest.class,
    DiagnosticReport.class,
    DiagnosticOrder.class,
    DeviceObservationReport.class,
    Device.class,
    Conformance.class,
    Condition.class,
    ConceptMap.class,
    Composition.class,
    CarePlan.class,
    AllergyIntolerance.class,
    Alert.class,
    AdverseReaction.class
})
public class Resource
    extends BackboneElement
    implements ToString
{

    protected Code language;
    protected Narrative text;
    @XmlElement(name = "contained")
    protected java.util.List<ResourceInline> containeds;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLanguage(Code value) {
        this.language = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Narrative }
     *     
     */
    public Narrative getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Narrative }
     *     
     */
    public void setText(Narrative value) {
        this.text = value;
    }

    /**
     * Gets the value of the containeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContaineds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceInline }
     * 
     * 
     */
    public java.util.List<ResourceInline> getContaineds() {
        if (containeds == null) {
            containeds = new ArrayList<ResourceInline>();
        }
        return this.containeds;
    }

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Code theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage);
        }
        {
            Narrative theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            java.util.List<ResourceInline> theContaineds;
            theContaineds = (((this.containeds!= null)&&(!this.containeds.isEmpty()))?this.getContaineds():null);
            strategy.appendField(locator, this, "containeds", buffer, theContaineds);
        }
        return buffer;
    }

    public Resource withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    public Resource withText(Narrative value) {
        setText(value);
        return this;
    }

    public Resource withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    public Resource withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Resource withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Resource withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Resource withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Resource withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Resource withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
