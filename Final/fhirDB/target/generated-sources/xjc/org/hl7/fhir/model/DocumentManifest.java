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
 * <p>Java class for DocumentManifest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentManifest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="masterIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded"/>
 *         &lt;element name="recipient" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}DocumentReferenceStatus"/>
 *         &lt;element name="supercedes" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="confidentiality" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="content" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentManifest", propOrder = {
    "masterIdentifier",
    "identifiers",
    "subjects",
    "recipients",
    "type",
    "authors",
    "created",
    "source",
    "status",
    "supercedes",
    "description",
    "confidentiality",
    "contents"
})
@XmlRootElement(name = "DocumentManifest")
@Entity(name = "DocumentManifest")
@Table(name = "DOCUMENTMANIFEST")
public class DocumentManifest
    extends Resource
    implements Serializable, Equals, HashCode
{

    @XmlElement(required = true)
    protected Identifier masterIdentifier;
    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(name = "subject", required = true)
    protected List<ResourceReference> subjects;
    @XmlElement(name = "recipient")
    protected List<ResourceReference> recipients;
    protected CodeableConcept type;
    @XmlElement(name = "author")
    protected List<ResourceReference> authors;
    protected DateTime created;
    protected Uri source;
    @XmlElement(required = true)
    protected DocumentReferenceStatus status;
    protected ResourceReference supercedes;
    protected org.hl7.fhir.model.String description;
    protected CodeableConcept confidentiality;
    @XmlElement(name = "content", required = true)
    protected List<ResourceReference> contents;

    /**
     * Gets the value of the masterIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MASTERIDENTIFIER_DOCUMENTMAN_0")
    public Identifier getMasterIdentifier() {
        return masterIdentifier;
    }

    /**
     * Sets the value of the masterIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setMasterIdentifier(Identifier value) {
        this.masterIdentifier = value;
    }

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
    @JoinColumn(name = "IDENTIFIERS_DOCUMENTMANIFEST_0")
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * 
     * 
     */
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjects().add(newItem);
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
    @JoinColumn(name = "SUBJECTS_DOCUMENTMANIFEST_HJ_0")
    public List<ResourceReference> getSubjects() {
        if (subjects == null) {
            subjects = new ArrayList<ResourceReference>();
        }
        return this.subjects;
    }

    /**
     * 
     * 
     */
    public void setSubjects(List<ResourceReference> subjects) {
        this.subjects = subjects;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipients().add(newItem);
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
    @JoinColumn(name = "RECIPIENTS_DOCUMENTMANIFEST__0")
    public List<ResourceReference> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<ResourceReference>();
        }
        return this.recipients;
    }

    /**
     * 
     * 
     */
    public void setRecipients(List<ResourceReference> recipients) {
        this.recipients = recipients;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__DOCUMENTMANIFEST_HJID")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
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
    @JoinColumn(name = "AUTHORS_DOCUMENTMANIFEST_HJID")
    public List<ResourceReference> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<ResourceReference>();
        }
        return this.authors;
    }

    /**
     * 
     * 
     */
    public void setAuthors(List<ResourceReference> authors) {
        this.authors = authors;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CREATED_DOCUMENTMANIFEST_HJID")
    public DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__DOCUMENTMANIFEST_HJID")
    public Uri getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSource(Uri value) {
        this.source = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceStatus }
     *     
     */
    @ManyToOne(targetEntity = DocumentReferenceStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_DOCUMENTMANIFEST_HJID")
    public DocumentReferenceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceStatus }
     *     
     */
    public void setStatus(DocumentReferenceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the supercedes property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUPERCEDES_DOCUMENTMANIFEST__0")
    public ResourceReference getSupercedes() {
        return supercedes;
    }

    /**
     * Sets the value of the supercedes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSupercedes(ResourceReference value) {
        this.supercedes = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_DOCUMENTMANIFEST_0")
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONFIDENTIALITY_DOCUMENTMANI_0")
    public CodeableConcept getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setConfidentiality(CodeableConcept value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the contents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContents().add(newItem);
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
    @JoinColumn(name = "CONTENTS_DOCUMENTMANIFEST_HJ_0")
    public List<ResourceReference> getContents() {
        if (contents == null) {
            contents = new ArrayList<ResourceReference>();
        }
        return this.contents;
    }

    /**
     * 
     * 
     */
    public void setContents(List<ResourceReference> contents) {
        this.contents = contents;
    }

    public DocumentManifest withMasterIdentifier(Identifier value) {
        setMasterIdentifier(value);
        return this;
    }

    public DocumentManifest withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public DocumentManifest withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public DocumentManifest withIdentifiers(List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public DocumentManifest withSubjects(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getSubjects().add(value);
            }
        }
        return this;
    }

    public DocumentManifest withSubjects(Collection<ResourceReference> values) {
        if (values!= null) {
            getSubjects().addAll(values);
        }
        return this;
    }

    public DocumentManifest withSubjects(List<ResourceReference> subjects) {
        setSubjects(subjects);
        return this;
    }

    public DocumentManifest withRecipients(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getRecipients().add(value);
            }
        }
        return this;
    }

    public DocumentManifest withRecipients(Collection<ResourceReference> values) {
        if (values!= null) {
            getRecipients().addAll(values);
        }
        return this;
    }

    public DocumentManifest withRecipients(List<ResourceReference> recipients) {
        setRecipients(recipients);
        return this;
    }

    public DocumentManifest withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public DocumentManifest withAuthors(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getAuthors().add(value);
            }
        }
        return this;
    }

    public DocumentManifest withAuthors(Collection<ResourceReference> values) {
        if (values!= null) {
            getAuthors().addAll(values);
        }
        return this;
    }

    public DocumentManifest withAuthors(List<ResourceReference> authors) {
        setAuthors(authors);
        return this;
    }

    public DocumentManifest withCreated(DateTime value) {
        setCreated(value);
        return this;
    }

    public DocumentManifest withSource(Uri value) {
        setSource(value);
        return this;
    }

    public DocumentManifest withStatus(DocumentReferenceStatus value) {
        setStatus(value);
        return this;
    }

    public DocumentManifest withSupercedes(ResourceReference value) {
        setSupercedes(value);
        return this;
    }

    public DocumentManifest withDescription(org.hl7.fhir.model.String value) {
        setDescription(value);
        return this;
    }

    public DocumentManifest withConfidentiality(CodeableConcept value) {
        setConfidentiality(value);
        return this;
    }

    public DocumentManifest withContents(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getContents().add(value);
            }
        }
        return this;
    }

    public DocumentManifest withContents(Collection<ResourceReference> values) {
        if (values!= null) {
            getContents().addAll(values);
        }
        return this;
    }

    public DocumentManifest withContents(List<ResourceReference> contents) {
        setContents(contents);
        return this;
    }

    @Override
    public DocumentManifest withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public DocumentManifest withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public DocumentManifest withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentManifest withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentManifest withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public DocumentManifest withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentManifest withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentManifest withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public DocumentManifest withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentManifest withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentManifest withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public DocumentManifest withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DocumentManifest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DocumentManifest that = ((DocumentManifest) object);
        {
            Identifier lhsMasterIdentifier;
            lhsMasterIdentifier = this.getMasterIdentifier();
            Identifier rhsMasterIdentifier;
            rhsMasterIdentifier = that.getMasterIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "masterIdentifier", lhsMasterIdentifier), LocatorUtils.property(thatLocator, "masterIdentifier", rhsMasterIdentifier), lhsMasterIdentifier, rhsMasterIdentifier)) {
                return false;
            }
        }
        {
            List<Identifier> lhsIdentifiers;
            lhsIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            List<Identifier> rhsIdentifiers;
            rhsIdentifiers = (((that.identifiers!= null)&&(!that.identifiers.isEmpty()))?that.getIdentifiers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifiers", lhsIdentifiers), LocatorUtils.property(thatLocator, "identifiers", rhsIdentifiers), lhsIdentifiers, rhsIdentifiers)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsSubjects;
            lhsSubjects = (((this.subjects!= null)&&(!this.subjects.isEmpty()))?this.getSubjects():null);
            List<ResourceReference> rhsSubjects;
            rhsSubjects = (((that.subjects!= null)&&(!that.subjects.isEmpty()))?that.getSubjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subjects", lhsSubjects), LocatorUtils.property(thatLocator, "subjects", rhsSubjects), lhsSubjects, rhsSubjects)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsRecipients;
            lhsRecipients = (((this.recipients!= null)&&(!this.recipients.isEmpty()))?this.getRecipients():null);
            List<ResourceReference> rhsRecipients;
            rhsRecipients = (((that.recipients!= null)&&(!that.recipients.isEmpty()))?that.getRecipients():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recipients", lhsRecipients), LocatorUtils.property(thatLocator, "recipients", rhsRecipients), lhsRecipients, rhsRecipients)) {
                return false;
            }
        }
        {
            CodeableConcept lhsType;
            lhsType = this.getType();
            CodeableConcept rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsAuthors;
            lhsAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            List<ResourceReference> rhsAuthors;
            rhsAuthors = (((that.authors!= null)&&(!that.authors.isEmpty()))?that.getAuthors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authors", lhsAuthors), LocatorUtils.property(thatLocator, "authors", rhsAuthors), lhsAuthors, rhsAuthors)) {
                return false;
            }
        }
        {
            DateTime lhsCreated;
            lhsCreated = this.getCreated();
            DateTime rhsCreated;
            rhsCreated = that.getCreated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "created", lhsCreated), LocatorUtils.property(thatLocator, "created", rhsCreated), lhsCreated, rhsCreated)) {
                return false;
            }
        }
        {
            Uri lhsSource;
            lhsSource = this.getSource();
            Uri rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            DocumentReferenceStatus lhsStatus;
            lhsStatus = this.getStatus();
            DocumentReferenceStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            ResourceReference lhsSupercedes;
            lhsSupercedes = this.getSupercedes();
            ResourceReference rhsSupercedes;
            rhsSupercedes = that.getSupercedes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supercedes", lhsSupercedes), LocatorUtils.property(thatLocator, "supercedes", rhsSupercedes), lhsSupercedes, rhsSupercedes)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDescription;
            lhsDescription = this.getDescription();
            org.hl7.fhir.model.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            CodeableConcept lhsConfidentiality;
            lhsConfidentiality = this.getConfidentiality();
            CodeableConcept rhsConfidentiality;
            rhsConfidentiality = that.getConfidentiality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confidentiality", lhsConfidentiality), LocatorUtils.property(thatLocator, "confidentiality", rhsConfidentiality), lhsConfidentiality, rhsConfidentiality)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsContents;
            lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            List<ResourceReference> rhsContents;
            rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
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
            Identifier theMasterIdentifier;
            theMasterIdentifier = this.getMasterIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "masterIdentifier", theMasterIdentifier), currentHashCode, theMasterIdentifier);
        }
        {
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifiers", theIdentifiers), currentHashCode, theIdentifiers);
        }
        {
            List<ResourceReference> theSubjects;
            theSubjects = (((this.subjects!= null)&&(!this.subjects.isEmpty()))?this.getSubjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subjects", theSubjects), currentHashCode, theSubjects);
        }
        {
            List<ResourceReference> theRecipients;
            theRecipients = (((this.recipients!= null)&&(!this.recipients.isEmpty()))?this.getRecipients():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recipients", theRecipients), currentHashCode, theRecipients);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<ResourceReference> theAuthors;
            theAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authors", theAuthors), currentHashCode, theAuthors);
        }
        {
            DateTime theCreated;
            theCreated = this.getCreated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "created", theCreated), currentHashCode, theCreated);
        }
        {
            Uri theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            DocumentReferenceStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            ResourceReference theSupercedes;
            theSupercedes = this.getSupercedes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supercedes", theSupercedes), currentHashCode, theSupercedes);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            CodeableConcept theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidentiality", theConfidentiality), currentHashCode, theConfidentiality);
        }
        {
            List<ResourceReference> theContents;
            theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}