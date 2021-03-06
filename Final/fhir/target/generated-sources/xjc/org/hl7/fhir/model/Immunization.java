//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:02:37 AM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Immunization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Immunization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/&gt;
 *         &lt;element name="vaccineType" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="refusedIndicator" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="reported" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="performer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="requester" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="lotNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://hl7.org/fhir}date" minOccurs="0"/&gt;
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="doseQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="explanation" type="{http://hl7.org/fhir}Immunization.Explanation" minOccurs="0"/&gt;
 *         &lt;element name="reaction" type="{http://hl7.org/fhir}Immunization.Reaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vaccinationProtocol" type="{http://hl7.org/fhir}Immunization.VaccinationProtocol" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immunization", propOrder = {
    "identifiers",
    "date",
    "vaccineType",
    "subject",
    "refusedIndicator",
    "reported",
    "performer",
    "requester",
    "manufacturer",
    "location",
    "lotNumber",
    "expirationDate",
    "site",
    "route",
    "doseQuantity",
    "explanation",
    "reactions",
    "vaccinationProtocols"
})
@XmlRootElement(name = "Immunization")
public class Immunization
    extends Resource
    implements ToString
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(required = true)
    protected DateTime date;
    @XmlElement(required = true)
    protected CodeableConcept vaccineType;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected Boolean refusedIndicator;
    @XmlElement(required = true)
    protected Boolean reported;
    protected ResourceReference performer;
    protected ResourceReference requester;
    protected ResourceReference manufacturer;
    protected ResourceReference location;
    protected org.hl7.fhir.model.String lotNumber;
    protected Date expirationDate;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected Quantity doseQuantity;
    protected ImmunizationExplanation explanation;
    @XmlElement(name = "reaction")
    protected List<ImmunizationReaction> reactions;
    @XmlElement(name = "vaccinationProtocol")
    protected List<ImmunizationVaccinationProtocol> vaccinationProtocols;

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
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
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
     * Gets the value of the vaccineType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVaccineType() {
        return vaccineType;
    }

    /**
     * Sets the value of the vaccineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVaccineType(CodeableConcept value) {
        this.vaccineType = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
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
     * Gets the value of the refusedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRefusedIndicator() {
        return refusedIndicator;
    }

    /**
     * Sets the value of the refusedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefusedIndicator(Boolean value) {
        this.refusedIndicator = value;
    }

    /**
     * Gets the value of the reported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReported() {
        return reported;
    }

    /**
     * Sets the value of the reported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReported(Boolean value) {
        this.reported = value;
    }

    /**
     * Gets the value of the performer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPerformer() {
        return performer;
    }

    /**
     * Sets the value of the performer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPerformer(ResourceReference value) {
        this.performer = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setRequester(ResourceReference value) {
        this.requester = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setLocation(ResourceReference value) {
        this.location = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setLotNumber(org.hl7.fhir.model.String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSite(CodeableConcept value) {
        this.site = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDoseQuantity(Quantity value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link ImmunizationExplanation }
     *     
     */
    public ImmunizationExplanation getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmunizationExplanation }
     *     
     */
    public void setExplanation(ImmunizationExplanation value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the reactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationReaction }
     * 
     * 
     */
    public List<ImmunizationReaction> getReactions() {
        if (reactions == null) {
            reactions = new ArrayList<ImmunizationReaction>();
        }
        return this.reactions;
    }

    /**
     * Gets the value of the vaccinationProtocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vaccinationProtocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVaccinationProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationVaccinationProtocol }
     * 
     * 
     */
    public List<ImmunizationVaccinationProtocol> getVaccinationProtocols() {
        if (vaccinationProtocols == null) {
            vaccinationProtocols = new ArrayList<ImmunizationVaccinationProtocol>();
        }
        return this.vaccinationProtocols;
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            CodeableConcept theVaccineType;
            theVaccineType = this.getVaccineType();
            strategy.appendField(locator, this, "vaccineType", buffer, theVaccineType);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            Boolean theRefusedIndicator;
            theRefusedIndicator = this.getRefusedIndicator();
            strategy.appendField(locator, this, "refusedIndicator", buffer, theRefusedIndicator);
        }
        {
            Boolean theReported;
            theReported = this.getReported();
            strategy.appendField(locator, this, "reported", buffer, theReported);
        }
        {
            ResourceReference thePerformer;
            thePerformer = this.getPerformer();
            strategy.appendField(locator, this, "performer", buffer, thePerformer);
        }
        {
            ResourceReference theRequester;
            theRequester = this.getRequester();
            strategy.appendField(locator, this, "requester", buffer, theRequester);
        }
        {
            ResourceReference theManufacturer;
            theManufacturer = this.getManufacturer();
            strategy.appendField(locator, this, "manufacturer", buffer, theManufacturer);
        }
        {
            ResourceReference theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            org.hl7.fhir.model.String theLotNumber;
            theLotNumber = this.getLotNumber();
            strategy.appendField(locator, this, "lotNumber", buffer, theLotNumber);
        }
        {
            Date theExpirationDate;
            theExpirationDate = this.getExpirationDate();
            strategy.appendField(locator, this, "expirationDate", buffer, theExpirationDate);
        }
        {
            CodeableConcept theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            CodeableConcept theRoute;
            theRoute = this.getRoute();
            strategy.appendField(locator, this, "route", buffer, theRoute);
        }
        {
            Quantity theDoseQuantity;
            theDoseQuantity = this.getDoseQuantity();
            strategy.appendField(locator, this, "doseQuantity", buffer, theDoseQuantity);
        }
        {
            ImmunizationExplanation theExplanation;
            theExplanation = this.getExplanation();
            strategy.appendField(locator, this, "explanation", buffer, theExplanation);
        }
        {
            List<ImmunizationReaction> theReactions;
            theReactions = (((this.reactions!= null)&&(!this.reactions.isEmpty()))?this.getReactions():null);
            strategy.appendField(locator, this, "reactions", buffer, theReactions);
        }
        {
            List<ImmunizationVaccinationProtocol> theVaccinationProtocols;
            theVaccinationProtocols = (((this.vaccinationProtocols!= null)&&(!this.vaccinationProtocols.isEmpty()))?this.getVaccinationProtocols():null);
            strategy.appendField(locator, this, "vaccinationProtocols", buffer, theVaccinationProtocols);
        }
        return buffer;
    }

    public Immunization withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public Immunization withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public Immunization withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public Immunization withVaccineType(CodeableConcept value) {
        setVaccineType(value);
        return this;
    }

    public Immunization withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public Immunization withRefusedIndicator(Boolean value) {
        setRefusedIndicator(value);
        return this;
    }

    public Immunization withReported(Boolean value) {
        setReported(value);
        return this;
    }

    public Immunization withPerformer(ResourceReference value) {
        setPerformer(value);
        return this;
    }

    public Immunization withRequester(ResourceReference value) {
        setRequester(value);
        return this;
    }

    public Immunization withManufacturer(ResourceReference value) {
        setManufacturer(value);
        return this;
    }

    public Immunization withLocation(ResourceReference value) {
        setLocation(value);
        return this;
    }

    public Immunization withLotNumber(org.hl7.fhir.model.String value) {
        setLotNumber(value);
        return this;
    }

    public Immunization withExpirationDate(Date value) {
        setExpirationDate(value);
        return this;
    }

    public Immunization withSite(CodeableConcept value) {
        setSite(value);
        return this;
    }

    public Immunization withRoute(CodeableConcept value) {
        setRoute(value);
        return this;
    }

    public Immunization withDoseQuantity(Quantity value) {
        setDoseQuantity(value);
        return this;
    }

    public Immunization withExplanation(ImmunizationExplanation value) {
        setExplanation(value);
        return this;
    }

    public Immunization withReactions(ImmunizationReaction... values) {
        if (values!= null) {
            for (ImmunizationReaction value: values) {
                getReactions().add(value);
            }
        }
        return this;
    }

    public Immunization withReactions(Collection<ImmunizationReaction> values) {
        if (values!= null) {
            getReactions().addAll(values);
        }
        return this;
    }

    public Immunization withVaccinationProtocols(ImmunizationVaccinationProtocol... values) {
        if (values!= null) {
            for (ImmunizationVaccinationProtocol value: values) {
                getVaccinationProtocols().add(value);
            }
        }
        return this;
    }

    public Immunization withVaccinationProtocols(Collection<ImmunizationVaccinationProtocol> values) {
        if (values!= null) {
            getVaccinationProtocols().addAll(values);
        }
        return this;
    }

    @Override
    public Immunization withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Immunization withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Immunization withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Immunization withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Immunization withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Immunization withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Immunization withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Immunization withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Immunization withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
