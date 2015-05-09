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
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement.
 * 
 * <p>Java class for Composition.Attester complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Composition.Attester">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}CompositionAttestationMode" maxOccurs="unbounded"/>
 *         &lt;element name="time" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="party" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Composition.Attester", propOrder = {
    "modes",
    "time",
    "party"
})
@Entity(name = "CompositionAttester")
@Table(name = "COMPOSITIONATTESTER")
public class CompositionAttester
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "mode", required = true)
    protected List<CompositionAttestationMode> modes;
    protected DateTime time;
    protected ResourceReference party;

    /**
     * Gets the value of the modes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositionAttestationMode }
     * 
     * 
     */
    @OneToMany(targetEntity = CompositionAttestationMode.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MODES_COMPOSITIONATTESTER_HJ_0")
    public List<CompositionAttestationMode> getModes() {
        if (modes == null) {
            modes = new ArrayList<CompositionAttestationMode>();
        }
        return this.modes;
    }

    /**
     * 
     * 
     */
    public void setModes(List<CompositionAttestationMode> modes) {
        this.modes = modes;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIME__COMPOSITIONATTESTER_HJ_0")
    public DateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTime(DateTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARTY_COMPOSITIONATTESTER_HJ_0")
    public ResourceReference getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setParty(ResourceReference value) {
        this.party = value;
    }

    public CompositionAttester withModes(CompositionAttestationMode... values) {
        if (values!= null) {
            for (CompositionAttestationMode value: values) {
                getModes().add(value);
            }
        }
        return this;
    }

    public CompositionAttester withModes(Collection<CompositionAttestationMode> values) {
        if (values!= null) {
            getModes().addAll(values);
        }
        return this;
    }

    public CompositionAttester withModes(List<CompositionAttestationMode> modes) {
        setModes(modes);
        return this;
    }

    public CompositionAttester withTime(DateTime value) {
        setTime(value);
        return this;
    }

    public CompositionAttester withParty(ResourceReference value) {
        setParty(value);
        return this;
    }

    @Override
    public CompositionAttester withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CompositionAttester withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CompositionAttester withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public CompositionAttester withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CompositionAttester withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CompositionAttester withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public CompositionAttester withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompositionAttester)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompositionAttester that = ((CompositionAttester) object);
        {
            List<CompositionAttestationMode> lhsModes;
            lhsModes = (((this.modes!= null)&&(!this.modes.isEmpty()))?this.getModes():null);
            List<CompositionAttestationMode> rhsModes;
            rhsModes = (((that.modes!= null)&&(!that.modes.isEmpty()))?that.getModes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modes", lhsModes), LocatorUtils.property(thatLocator, "modes", rhsModes), lhsModes, rhsModes)) {
                return false;
            }
        }
        {
            DateTime lhsTime;
            lhsTime = this.getTime();
            DateTime rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
                return false;
            }
        }
        {
            ResourceReference lhsParty;
            lhsParty = this.getParty();
            ResourceReference rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty)) {
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
            List<CompositionAttestationMode> theModes;
            theModes = (((this.modes!= null)&&(!this.modes.isEmpty()))?this.getModes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modes", theModes), currentHashCode, theModes);
        }
        {
            DateTime theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
        }
        {
            ResourceReference theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}