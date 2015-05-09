//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package w3._1999.xhtml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}attrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}focus"/>
 *       &lt;attribute name="shape" type="{http://www.w3.org/1999/xhtml}Shape" default="rect" />
 *       &lt;attribute name="coords" type="{http://www.w3.org/1999/xhtml}Coords" />
 *       &lt;attribute name="href" type="{http://www.w3.org/1999/xhtml}URI" />
 *       &lt;attribute name="nohref">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="nohref"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="alt" use="required" type="{http://www.w3.org/1999/xhtml}Text" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "area")
public class Area
    implements Serializable, Equals, HashCode
{

    @XmlAttribute(name = "shape")
    protected Shape shape;
    @XmlAttribute(name = "coords")
    protected String coords;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "nohref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nohref;
    @XmlAttribute(name = "alt", required = true)
    protected String alt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected List<String> clazzs;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "accesskey")
    protected String accesskey;
    @XmlAttribute(name = "tabindex")
    protected Integer tabindex;

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link Shape }
     *     
     */
    public Shape getShape() {
        if (shape == null) {
            return Shape.RECT;
        } else {
            return shape;
        }
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shape }
     *     
     */
    public void setShape(Shape value) {
        this.shape = value;
    }

    /**
     * Gets the value of the coords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoords() {
        return coords;
    }

    /**
     * Sets the value of the coords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoords(String value) {
        this.coords = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the nohref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNohref() {
        return nohref;
    }

    /**
     * Sets the value of the nohref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNohref(String value) {
        this.nohref = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt(String value) {
        this.alt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazzs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazzs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<String>();
        }
        return this.clazzs;
    }

    /**
     * 
     * 
     */
    public void setClazzs(List<String> clazzs) {
        this.clazzs = clazzs;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the accesskey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccesskey() {
        return accesskey;
    }

    /**
     * Sets the value of the accesskey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccesskey(String value) {
        this.accesskey = value;
    }

    /**
     * Gets the value of the tabindex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTabindex() {
        return tabindex;
    }

    /**
     * Sets the value of the tabindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTabindex(Integer value) {
        this.tabindex = value;
    }

    public Area withShape(Shape value) {
        setShape(value);
        return this;
    }

    public Area withCoords(String value) {
        setCoords(value);
        return this;
    }

    public Area withHref(String value) {
        setHref(value);
        return this;
    }

    public Area withNohref(String value) {
        setNohref(value);
        return this;
    }

    public Area withAlt(String value) {
        setAlt(value);
        return this;
    }

    public Area withId(String value) {
        setId(value);
        return this;
    }

    public Area withClazzs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getClazzs().add(value);
            }
        }
        return this;
    }

    public Area withClazzs(Collection<String> values) {
        if (values!= null) {
            getClazzs().addAll(values);
        }
        return this;
    }

    public Area withClazzs(List<String> clazzs) {
        setClazzs(clazzs);
        return this;
    }

    public Area withStyle(String value) {
        setStyle(value);
        return this;
    }

    public Area withTitle(String value) {
        setTitle(value);
        return this;
    }

    public Area withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public Area withLang(String value) {
        setLang(value);
        return this;
    }

    public Area withDir(String value) {
        setDir(value);
        return this;
    }

    public Area withAccesskey(String value) {
        setAccesskey(value);
        return this;
    }

    public Area withTabindex(Integer value) {
        setTabindex(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Area)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Area that = ((Area) object);
        {
            Shape lhsShape;
            lhsShape = this.getShape();
            Shape rhsShape;
            rhsShape = that.getShape();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shape", lhsShape), LocatorUtils.property(thatLocator, "shape", rhsShape), lhsShape, rhsShape)) {
                return false;
            }
        }
        {
            String lhsCoords;
            lhsCoords = this.getCoords();
            String rhsCoords;
            rhsCoords = that.getCoords();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coords", lhsCoords), LocatorUtils.property(thatLocator, "coords", rhsCoords), lhsCoords, rhsCoords)) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                return false;
            }
        }
        {
            String lhsNohref;
            lhsNohref = this.getNohref();
            String rhsNohref;
            rhsNohref = that.getNohref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nohref", lhsNohref), LocatorUtils.property(thatLocator, "nohref", rhsNohref), lhsNohref, rhsNohref)) {
                return false;
            }
        }
        {
            String lhsAlt;
            lhsAlt = this.getAlt();
            String rhsAlt;
            rhsAlt = that.getAlt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alt", lhsAlt), LocatorUtils.property(thatLocator, "alt", rhsAlt), lhsAlt, rhsAlt)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            List<String> lhsClazzs;
            lhsClazzs = (((this.clazzs!= null)&&(!this.clazzs.isEmpty()))?this.getClazzs():null);
            List<String> rhsClazzs;
            rhsClazzs = (((that.clazzs!= null)&&(!that.clazzs.isEmpty()))?that.getClazzs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazzs", lhsClazzs), LocatorUtils.property(thatLocator, "clazzs", rhsClazzs), lhsClazzs, rhsClazzs)) {
                return false;
            }
        }
        {
            String lhsStyle;
            lhsStyle = this.getStyle();
            String rhsStyle;
            rhsStyle = that.getStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "style", lhsStyle), LocatorUtils.property(thatLocator, "style", rhsStyle), lhsStyle, rhsStyle)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsLanguage;
            lhsLanguage = this.getLanguage();
            String rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage)) {
                return false;
            }
        }
        {
            String lhsLang;
            lhsLang = this.getLang();
            String rhsLang;
            rhsLang = that.getLang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lang", lhsLang), LocatorUtils.property(thatLocator, "lang", rhsLang), lhsLang, rhsLang)) {
                return false;
            }
        }
        {
            String lhsDir;
            lhsDir = this.getDir();
            String rhsDir;
            rhsDir = that.getDir();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dir", lhsDir), LocatorUtils.property(thatLocator, "dir", rhsDir), lhsDir, rhsDir)) {
                return false;
            }
        }
        {
            String lhsAccesskey;
            lhsAccesskey = this.getAccesskey();
            String rhsAccesskey;
            rhsAccesskey = that.getAccesskey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accesskey", lhsAccesskey), LocatorUtils.property(thatLocator, "accesskey", rhsAccesskey), lhsAccesskey, rhsAccesskey)) {
                return false;
            }
        }
        {
            Integer lhsTabindex;
            lhsTabindex = this.getTabindex();
            Integer rhsTabindex;
            rhsTabindex = that.getTabindex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tabindex", lhsTabindex), LocatorUtils.property(thatLocator, "tabindex", rhsTabindex), lhsTabindex, rhsTabindex)) {
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
        int currentHashCode = 1;
        {
            Shape theShape;
            theShape = this.getShape();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shape", theShape), currentHashCode, theShape);
        }
        {
            String theCoords;
            theCoords = this.getCoords();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coords", theCoords), currentHashCode, theCoords);
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref);
        }
        {
            String theNohref;
            theNohref = this.getNohref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nohref", theNohref), currentHashCode, theNohref);
        }
        {
            String theAlt;
            theAlt = this.getAlt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alt", theAlt), currentHashCode, theAlt);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<String> theClazzs;
            theClazzs = (((this.clazzs!= null)&&(!this.clazzs.isEmpty()))?this.getClazzs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clazzs", theClazzs), currentHashCode, theClazzs);
        }
        {
            String theStyle;
            theStyle = this.getStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "style", theStyle), currentHashCode, theStyle);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage);
        }
        {
            String theLang;
            theLang = this.getLang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lang", theLang), currentHashCode, theLang);
        }
        {
            String theDir;
            theDir = this.getDir();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dir", theDir), currentHashCode, theDir);
        }
        {
            String theAccesskey;
            theAccesskey = this.getAccesskey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accesskey", theAccesskey), currentHashCode, theAccesskey);
        }
        {
            Integer theTabindex;
            theTabindex = this.getTabindex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tabindex", theTabindex), currentHashCode, theTabindex);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}