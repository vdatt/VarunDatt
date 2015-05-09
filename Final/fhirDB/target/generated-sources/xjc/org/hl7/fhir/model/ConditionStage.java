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
 * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a Diagnosis during an Encounter; populating a problem List or a Summary Statement, such as a Discharge Summary.
 * 
 * <p>Java class for Condition.Stage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Condition.Stage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="summary" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="assessment" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition.Stage", propOrder = {
    "summary",
    "assessments"
})
@Entity(name = "ConditionStage")
@Table(name = "CONDITIONSTAGE")
public class ConditionStage
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected CodeableConcept summary;
    @XmlElement(name = "assessment")
    protected List<ResourceReference> assessments;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUMMARY_CONDITIONSTAGE_HJID")
    public CodeableConcept getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSummary(CodeableConcept value) {
        this.summary = value;
    }

    /**
     * Gets the value of the assessments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASSESSMENTS_CONDITIONSTAGE_H_0")
    public List<ResourceReference> getAssessments() {
        if (assessments == null) {
            assessments = new ArrayList<ResourceReference>();
        }
        return this.assessments;
    }

    /**
     * 
     * 
     */
    public void setAssessments(List<ResourceReference> assessments) {
        this.assessments = assessments;
    }

    public ConditionStage withSummary(CodeableConcept value) {
        setSummary(value);
        return this;
    }

    public ConditionStage withAssessments(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getAssessments().add(value);
            }
        }
        return this;
    }

    public ConditionStage withAssessments(Collection<ResourceReference> values) {
        if (values!= null) {
            getAssessments().addAll(values);
        }
        return this;
    }

    public ConditionStage withAssessments(List<ResourceReference> assessments) {
        setAssessments(assessments);
        return this;
    }

    @Override
    public ConditionStage withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConditionStage withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConditionStage withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ConditionStage withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConditionStage withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConditionStage withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ConditionStage withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConditionStage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConditionStage that = ((ConditionStage) object);
        {
            CodeableConcept lhsSummary;
            lhsSummary = this.getSummary();
            CodeableConcept rhsSummary;
            rhsSummary = that.getSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "summary", lhsSummary), LocatorUtils.property(thatLocator, "summary", rhsSummary), lhsSummary, rhsSummary)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsAssessments;
            lhsAssessments = (((this.assessments!= null)&&(!this.assessments.isEmpty()))?this.getAssessments():null);
            List<ResourceReference> rhsAssessments;
            rhsAssessments = (((that.assessments!= null)&&(!that.assessments.isEmpty()))?that.getAssessments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assessments", lhsAssessments), LocatorUtils.property(thatLocator, "assessments", rhsAssessments), lhsAssessments, rhsAssessments)) {
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
            CodeableConcept theSummary;
            theSummary = this.getSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "summary", theSummary), currentHashCode, theSummary);
        }
        {
            List<ResourceReference> theAssessments;
            theAssessments = (((this.assessments!= null)&&(!this.assessments.isEmpty()))?this.getAssessments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assessments", theAssessments), currentHashCode, theAssessments);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
