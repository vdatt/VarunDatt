//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package w3._1999.xhtml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}caption" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}col" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}colgroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}thead" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}tfoot" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}tbody" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}tr" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}attrs"/>
 *       &lt;attribute name="summary" type="{http://www.w3.org/1999/xhtml}Text" />
 *       &lt;attribute name="width" type="{http://www.w3.org/1999/xhtml}Length" />
 *       &lt;attribute name="border" type="{http://www.w3.org/1999/xhtml}Pixels" />
 *       &lt;attribute name="frame" type="{http://www.w3.org/1999/xhtml}TFrame" />
 *       &lt;attribute name="rules" type="{http://www.w3.org/1999/xhtml}TRules" />
 *       &lt;attribute name="cellspacing" type="{http://www.w3.org/1999/xhtml}Length" />
 *       &lt;attribute name="cellpadding" type="{http://www.w3.org/1999/xhtml}Length" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "colgroups",
    "cols",
    "thead",
    "tfoot",
    "trs",
    "tbodies"
})
@XmlRootElement(name = "table")
public class Table implements Serializable, Equals, HashCode
{

    protected Caption caption;
    @XmlElement(name = "colgroup")
    protected List<Colgroup> colgroups;
    @XmlElement(name = "col")
    protected List<Col> cols;
    protected Thead thead;
    protected Tfoot tfoot;
    @XmlElement(name = "tr")
    protected List<Tr> trs;
    @XmlElement(name = "tbody")
    protected List<Tbody> tbodies;
    @XmlAttribute(name = "summary")
    protected String summary;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "border")
    protected BigInteger border;
    @XmlAttribute(name = "frame")
    protected TFrame frame;
    @XmlAttribute(name = "rules")
    protected TRules rules;
    @XmlAttribute(name = "cellspacing")
    protected String cellspacing;
    @XmlAttribute(name = "cellpadding")
    protected String cellpadding;
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

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the colgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Colgroup }
     * 
     * 
     */
    public List<Colgroup> getColgroups() {
        if (colgroups == null) {
            colgroups = new ArrayList<Colgroup>();
        }
        return this.colgroups;
    }

    /**
     * 
     * 
     */
    public void setColgroups(List<Colgroup> colgroups) {
        this.colgroups = colgroups;
    }

    /**
     * Gets the value of the cols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Col }
     * 
     * 
     */
    public List<Col> getCols() {
        if (cols == null) {
            cols = new ArrayList<Col>();
        }
        return this.cols;
    }

    /**
     * 
     * 
     */
    public void setCols(List<Col> cols) {
        this.cols = cols;
    }

    /**
     * Gets the value of the thead property.
     * 
     * @return
     *     possible object is
     *     {@link Thead }
     *     
     */
    public Thead getThead() {
        return thead;
    }

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thead }
     *     
     */
    public void setThead(Thead value) {
        this.thead = value;
    }

    /**
     * Gets the value of the tfoot property.
     * 
     * @return
     *     possible object is
     *     {@link Tfoot }
     *     
     */
    public Tfoot getTfoot() {
        return tfoot;
    }

    /**
     * Sets the value of the tfoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tfoot }
     *     
     */
    public void setTfoot(Tfoot value) {
        this.tfoot = value;
    }

    /**
     * Gets the value of the trs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tr }
     * 
     * 
     */
    public List<Tr> getTrs() {
        if (trs == null) {
            trs = new ArrayList<Tr>();
        }
        return this.trs;
    }

    /**
     * 
     * 
     */
    public void setTrs(List<Tr> trs) {
        this.trs = trs;
    }

    /**
     * Gets the value of the tbodies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbodies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbodies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tbody }
     * 
     * 
     */
    public List<Tbody> getTbodies() {
        if (tbodies == null) {
            tbodies = new ArrayList<Tbody>();
        }
        return this.tbodies;
    }

    /**
     * 
     * 
     */
    public void setTbodies(List<Tbody> tbodies) {
        this.tbodies = tbodies;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBorder(BigInteger value) {
        this.border = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link TFrame }
     *     
     */
    public TFrame getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFrame }
     *     
     */
    public void setFrame(TFrame value) {
        this.frame = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link TRules }
     *     
     */
    public TRules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRules }
     *     
     */
    public void setRules(TRules value) {
        this.rules = value;
    }

    /**
     * Gets the value of the cellspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellspacing() {
        return cellspacing;
    }

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellspacing(String value) {
        this.cellspacing = value;
    }

    /**
     * Gets the value of the cellpadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellpadding() {
        return cellpadding;
    }

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellpadding(String value) {
        this.cellpadding = value;
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

    public Table withCaption(Caption value) {
        setCaption(value);
        return this;
    }

    public Table withColgroups(Colgroup... values) {
        if (values!= null) {
            for (Colgroup value: values) {
                getColgroups().add(value);
            }
        }
        return this;
    }

    public Table withColgroups(Collection<Colgroup> values) {
        if (values!= null) {
            getColgroups().addAll(values);
        }
        return this;
    }

    public Table withColgroups(List<Colgroup> colgroups) {
        setColgroups(colgroups);
        return this;
    }

    public Table withCols(Col... values) {
        if (values!= null) {
            for (Col value: values) {
                getCols().add(value);
            }
        }
        return this;
    }

    public Table withCols(Collection<Col> values) {
        if (values!= null) {
            getCols().addAll(values);
        }
        return this;
    }

    public Table withCols(List<Col> cols) {
        setCols(cols);
        return this;
    }

    public Table withThead(Thead value) {
        setThead(value);
        return this;
    }

    public Table withTfoot(Tfoot value) {
        setTfoot(value);
        return this;
    }

    public Table withTrs(Tr... values) {
        if (values!= null) {
            for (Tr value: values) {
                getTrs().add(value);
            }
        }
        return this;
    }

    public Table withTrs(Collection<Tr> values) {
        if (values!= null) {
            getTrs().addAll(values);
        }
        return this;
    }

    public Table withTrs(List<Tr> trs) {
        setTrs(trs);
        return this;
    }

    public Table withTbodies(Tbody... values) {
        if (values!= null) {
            for (Tbody value: values) {
                getTbodies().add(value);
            }
        }
        return this;
    }

    public Table withTbodies(Collection<Tbody> values) {
        if (values!= null) {
            getTbodies().addAll(values);
        }
        return this;
    }

    public Table withTbodies(List<Tbody> tbodies) {
        setTbodies(tbodies);
        return this;
    }

    public Table withSummary(String value) {
        setSummary(value);
        return this;
    }

    public Table withWidth(String value) {
        setWidth(value);
        return this;
    }

    public Table withBorder(BigInteger value) {
        setBorder(value);
        return this;
    }

    public Table withFrame(TFrame value) {
        setFrame(value);
        return this;
    }

    public Table withRules(TRules value) {
        setRules(value);
        return this;
    }

    public Table withCellspacing(String value) {
        setCellspacing(value);
        return this;
    }

    public Table withCellpadding(String value) {
        setCellpadding(value);
        return this;
    }

    public Table withId(String value) {
        setId(value);
        return this;
    }

    public Table withClazzs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getClazzs().add(value);
            }
        }
        return this;
    }

    public Table withClazzs(Collection<String> values) {
        if (values!= null) {
            getClazzs().addAll(values);
        }
        return this;
    }

    public Table withClazzs(List<String> clazzs) {
        setClazzs(clazzs);
        return this;
    }

    public Table withStyle(String value) {
        setStyle(value);
        return this;
    }

    public Table withTitle(String value) {
        setTitle(value);
        return this;
    }

    public Table withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public Table withLang(String value) {
        setLang(value);
        return this;
    }

    public Table withDir(String value) {
        setDir(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Table)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Table that = ((Table) object);
        {
            Caption lhsCaption;
            lhsCaption = this.getCaption();
            Caption rhsCaption;
            rhsCaption = that.getCaption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caption", lhsCaption), LocatorUtils.property(thatLocator, "caption", rhsCaption), lhsCaption, rhsCaption)) {
                return false;
            }
        }
        {
            List<Colgroup> lhsColgroups;
            lhsColgroups = (((this.colgroups!= null)&&(!this.colgroups.isEmpty()))?this.getColgroups():null);
            List<Colgroup> rhsColgroups;
            rhsColgroups = (((that.colgroups!= null)&&(!that.colgroups.isEmpty()))?that.getColgroups():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colgroups", lhsColgroups), LocatorUtils.property(thatLocator, "colgroups", rhsColgroups), lhsColgroups, rhsColgroups)) {
                return false;
            }
        }
        {
            List<Col> lhsCols;
            lhsCols = (((this.cols!= null)&&(!this.cols.isEmpty()))?this.getCols():null);
            List<Col> rhsCols;
            rhsCols = (((that.cols!= null)&&(!that.cols.isEmpty()))?that.getCols():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cols", lhsCols), LocatorUtils.property(thatLocator, "cols", rhsCols), lhsCols, rhsCols)) {
                return false;
            }
        }
        {
            Thead lhsThead;
            lhsThead = this.getThead();
            Thead rhsThead;
            rhsThead = that.getThead();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thead", lhsThead), LocatorUtils.property(thatLocator, "thead", rhsThead), lhsThead, rhsThead)) {
                return false;
            }
        }
        {
            Tfoot lhsTfoot;
            lhsTfoot = this.getTfoot();
            Tfoot rhsTfoot;
            rhsTfoot = that.getTfoot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tfoot", lhsTfoot), LocatorUtils.property(thatLocator, "tfoot", rhsTfoot), lhsTfoot, rhsTfoot)) {
                return false;
            }
        }
        {
            List<Tr> lhsTrs;
            lhsTrs = (((this.trs!= null)&&(!this.trs.isEmpty()))?this.getTrs():null);
            List<Tr> rhsTrs;
            rhsTrs = (((that.trs!= null)&&(!that.trs.isEmpty()))?that.getTrs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trs", lhsTrs), LocatorUtils.property(thatLocator, "trs", rhsTrs), lhsTrs, rhsTrs)) {
                return false;
            }
        }
        {
            List<Tbody> lhsTbodies;
            lhsTbodies = (((this.tbodies!= null)&&(!this.tbodies.isEmpty()))?this.getTbodies():null);
            List<Tbody> rhsTbodies;
            rhsTbodies = (((that.tbodies!= null)&&(!that.tbodies.isEmpty()))?that.getTbodies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tbodies", lhsTbodies), LocatorUtils.property(thatLocator, "tbodies", rhsTbodies), lhsTbodies, rhsTbodies)) {
                return false;
            }
        }
        {
            String lhsSummary;
            lhsSummary = this.getSummary();
            String rhsSummary;
            rhsSummary = that.getSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "summary", lhsSummary), LocatorUtils.property(thatLocator, "summary", rhsSummary), lhsSummary, rhsSummary)) {
                return false;
            }
        }
        {
            String lhsWidth;
            lhsWidth = this.getWidth();
            String rhsWidth;
            rhsWidth = that.getWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "width", lhsWidth), LocatorUtils.property(thatLocator, "width", rhsWidth), lhsWidth, rhsWidth)) {
                return false;
            }
        }
        {
            BigInteger lhsBorder;
            lhsBorder = this.getBorder();
            BigInteger rhsBorder;
            rhsBorder = that.getBorder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "border", lhsBorder), LocatorUtils.property(thatLocator, "border", rhsBorder), lhsBorder, rhsBorder)) {
                return false;
            }
        }
        {
            TFrame lhsFrame;
            lhsFrame = this.getFrame();
            TFrame rhsFrame;
            rhsFrame = that.getFrame();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frame", lhsFrame), LocatorUtils.property(thatLocator, "frame", rhsFrame), lhsFrame, rhsFrame)) {
                return false;
            }
        }
        {
            TRules lhsRules;
            lhsRules = this.getRules();
            TRules rhsRules;
            rhsRules = that.getRules();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rules", lhsRules), LocatorUtils.property(thatLocator, "rules", rhsRules), lhsRules, rhsRules)) {
                return false;
            }
        }
        {
            String lhsCellspacing;
            lhsCellspacing = this.getCellspacing();
            String rhsCellspacing;
            rhsCellspacing = that.getCellspacing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellspacing", lhsCellspacing), LocatorUtils.property(thatLocator, "cellspacing", rhsCellspacing), lhsCellspacing, rhsCellspacing)) {
                return false;
            }
        }
        {
            String lhsCellpadding;
            lhsCellpadding = this.getCellpadding();
            String rhsCellpadding;
            rhsCellpadding = that.getCellpadding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellpadding", lhsCellpadding), LocatorUtils.property(thatLocator, "cellpadding", rhsCellpadding), lhsCellpadding, rhsCellpadding)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            Caption theCaption;
            theCaption = this.getCaption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caption", theCaption), currentHashCode, theCaption);
        }
        {
            List<Colgroup> theColgroups;
            theColgroups = (((this.colgroups!= null)&&(!this.colgroups.isEmpty()))?this.getColgroups():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colgroups", theColgroups), currentHashCode, theColgroups);
        }
        {
            List<Col> theCols;
            theCols = (((this.cols!= null)&&(!this.cols.isEmpty()))?this.getCols():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cols", theCols), currentHashCode, theCols);
        }
        {
            Thead theThead;
            theThead = this.getThead();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thead", theThead), currentHashCode, theThead);
        }
        {
            Tfoot theTfoot;
            theTfoot = this.getTfoot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tfoot", theTfoot), currentHashCode, theTfoot);
        }
        {
            List<Tr> theTrs;
            theTrs = (((this.trs!= null)&&(!this.trs.isEmpty()))?this.getTrs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trs", theTrs), currentHashCode, theTrs);
        }
        {
            List<Tbody> theTbodies;
            theTbodies = (((this.tbodies!= null)&&(!this.tbodies.isEmpty()))?this.getTbodies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tbodies", theTbodies), currentHashCode, theTbodies);
        }
        {
            String theSummary;
            theSummary = this.getSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "summary", theSummary), currentHashCode, theSummary);
        }
        {
            String theWidth;
            theWidth = this.getWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "width", theWidth), currentHashCode, theWidth);
        }
        {
            BigInteger theBorder;
            theBorder = this.getBorder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "border", theBorder), currentHashCode, theBorder);
        }
        {
            TFrame theFrame;
            theFrame = this.getFrame();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frame", theFrame), currentHashCode, theFrame);
        }
        {
            TRules theRules;
            theRules = this.getRules();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rules", theRules), currentHashCode, theRules);
        }
        {
            String theCellspacing;
            theCellspacing = this.getCellspacing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellspacing", theCellspacing), currentHashCode, theCellspacing);
        }
        {
            String theCellpadding;
            theCellpadding = this.getCellpadding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellpadding", theCellpadding), currentHashCode, theCellpadding);
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
