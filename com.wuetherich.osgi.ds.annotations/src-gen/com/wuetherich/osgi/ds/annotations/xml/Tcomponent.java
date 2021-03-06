//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.15 at 06:39:31 AM CET 
//


package com.wuetherich.osgi.ds.annotations.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3c.dom.Element;


/**
 * <p>Java class for Tcomponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tcomponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="property" type="{http://www.osgi.org/xmlns/scr/v1.1.0}Tproperty"/>
 *           &lt;element name="properties" type="{http://www.osgi.org/xmlns/scr/v1.1.0}Tproperties"/>
 *         &lt;/choice>
 *         &lt;element name="service" type="{http://www.osgi.org/xmlns/scr/v1.1.0}Tservice" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.osgi.org/xmlns/scr/v1.1.0}Treference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="implementation" type="{http://www.osgi.org/xmlns/scr/v1.1.0}Timplementation"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="factory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="immediate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="configuration-policy" type="{http://www.osgi.org/xmlns/scr/v1.1.0}Tconfiguration-policy" default="optional" />
 *       &lt;attribute name="activate" type="{http://www.w3.org/2001/XMLSchema}token" default="activate" />
 *       &lt;attribute name="deactivate" type="{http://www.w3.org/2001/XMLSchema}token" default="deactivate" />
 *       &lt;attribute name="modified" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tcomponent", propOrder = {
    "propertyOrProperties",
    "service",
    "reference",
    "implementation",
    "any"
})
public class Tcomponent
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElements({
        @XmlElement(name = "property", type = Tproperty.class),
        @XmlElement(name = "properties", type = Tproperties.class)
    })
    protected List<Object> propertyOrProperties;
    protected Tservice service;
    protected List<Treference> reference;
    @XmlElement(required = true)
    protected Timplementation implementation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlAttribute(name = "factory")
    protected String factory;
    @XmlAttribute(name = "immediate")
    protected Boolean immediate;
    @XmlAttribute(name = "configuration-policy")
    protected TconfigurationPolicy configurationPolicy;
    @XmlAttribute(name = "activate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String activate;
    @XmlAttribute(name = "deactivate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deactivate;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String modified;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the propertyOrProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tproperty }
     * {@link Tproperties }
     * 
     * 
     */
    public List<Object> getPropertyOrProperties() {
        if (propertyOrProperties == null) {
            propertyOrProperties = new ArrayList<Object>();
        }
        return this.propertyOrProperties;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Tservice }
     *     
     */
    public Tservice getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tservice }
     *     
     */
    public void setService(Tservice value) {
        this.service = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Treference }
     * 
     * 
     */
    public List<Treference> getReference() {
        if (reference == null) {
            reference = new ArrayList<Treference>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link Timplementation }
     *     
     */
    public Timplementation getImplementation() {
        return implementation;
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timplementation }
     *     
     */
    public void setImplementation(Timplementation value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the factory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactory() {
        return factory;
    }

    /**
     * Sets the value of the factory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactory(String value) {
        this.factory = value;
    }

    /**
     * Gets the value of the immediate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediate() {
        return immediate;
    }

    /**
     * Sets the value of the immediate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediate(Boolean value) {
        this.immediate = value;
    }

    /**
     * Gets the value of the configurationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link TconfigurationPolicy }
     *     
     */
    public TconfigurationPolicy getConfigurationPolicy() {
        if (configurationPolicy == null) {
            return TconfigurationPolicy.OPTIONAL;
        } else {
            return configurationPolicy;
        }
    }

    /**
     * Sets the value of the configurationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TconfigurationPolicy }
     *     
     */
    public void setConfigurationPolicy(TconfigurationPolicy value) {
        this.configurationPolicy = value;
    }

    /**
     * Gets the value of the activate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivate() {
        if (activate == null) {
            return "activate";
        } else {
            return activate;
        }
    }

    /**
     * Sets the value of the activate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivate(String value) {
        this.activate = value;
    }

    /**
     * Gets the value of the deactivate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactivate() {
        if (deactivate == null) {
            return "deactivate";
        } else {
            return deactivate;
        }
    }

    /**
     * Sets the value of the deactivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivate(String value) {
        this.deactivate = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Tcomponent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Tcomponent that = ((Tcomponent) object);
        {
            List<Object> lhsPropertyOrProperties;
            lhsPropertyOrProperties = (((this.propertyOrProperties!= null)&&(!this.propertyOrProperties.isEmpty()))?this.getPropertyOrProperties():null);
            List<Object> rhsPropertyOrProperties;
            rhsPropertyOrProperties = (((that.propertyOrProperties!= null)&&(!that.propertyOrProperties.isEmpty()))?that.getPropertyOrProperties():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyOrProperties", lhsPropertyOrProperties), LocatorUtils.property(thatLocator, "propertyOrProperties", rhsPropertyOrProperties), lhsPropertyOrProperties, rhsPropertyOrProperties)) {
                return false;
            }
        }
        {
            Tservice lhsService;
            lhsService = this.getService();
            Tservice rhsService;
            rhsService = that.getService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "service", lhsService), LocatorUtils.property(thatLocator, "service", rhsService), lhsService, rhsService)) {
                return false;
            }
        }
        {
            List<Treference> lhsReference;
            lhsReference = (((this.reference!= null)&&(!this.reference.isEmpty()))?this.getReference():null);
            List<Treference> rhsReference;
            rhsReference = (((that.reference!= null)&&(!that.reference.isEmpty()))?that.getReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference)) {
                return false;
            }
        }
        {
            Timplementation lhsImplementation;
            lhsImplementation = this.getImplementation();
            Timplementation rhsImplementation;
            rhsImplementation = that.getImplementation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "implementation", lhsImplementation), LocatorUtils.property(thatLocator, "implementation", rhsImplementation), lhsImplementation, rhsImplementation)) {
                return false;
            }
        }
        {
            List<Object> lhsAny;
            lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            List<Object> rhsAny;
            rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                return false;
            }
        }
        {
            boolean lhsEnabled;
            lhsEnabled = ((this.enabled!= null)?this.isEnabled():false);
            boolean rhsEnabled;
            rhsEnabled = ((that.enabled!= null)?that.isEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enabled", lhsEnabled), LocatorUtils.property(thatLocator, "enabled", rhsEnabled), lhsEnabled, rhsEnabled)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsFactory;
            lhsFactory = this.getFactory();
            String rhsFactory;
            rhsFactory = that.getFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "factory", lhsFactory), LocatorUtils.property(thatLocator, "factory", rhsFactory), lhsFactory, rhsFactory)) {
                return false;
            }
        }
        {
            Boolean lhsImmediate;
            lhsImmediate = this.isImmediate();
            Boolean rhsImmediate;
            rhsImmediate = that.isImmediate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immediate", lhsImmediate), LocatorUtils.property(thatLocator, "immediate", rhsImmediate), lhsImmediate, rhsImmediate)) {
                return false;
            }
        }
        {
            TconfigurationPolicy lhsConfigurationPolicy;
            lhsConfigurationPolicy = this.getConfigurationPolicy();
            TconfigurationPolicy rhsConfigurationPolicy;
            rhsConfigurationPolicy = that.getConfigurationPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "configurationPolicy", lhsConfigurationPolicy), LocatorUtils.property(thatLocator, "configurationPolicy", rhsConfigurationPolicy), lhsConfigurationPolicy, rhsConfigurationPolicy)) {
                return false;
            }
        }
        {
            String lhsActivate;
            lhsActivate = this.getActivate();
            String rhsActivate;
            rhsActivate = that.getActivate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activate", lhsActivate), LocatorUtils.property(thatLocator, "activate", rhsActivate), lhsActivate, rhsActivate)) {
                return false;
            }
        }
        {
            String lhsDeactivate;
            lhsDeactivate = this.getDeactivate();
            String rhsDeactivate;
            rhsDeactivate = that.getDeactivate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deactivate", lhsDeactivate), LocatorUtils.property(thatLocator, "deactivate", rhsDeactivate), lhsDeactivate, rhsDeactivate)) {
                return false;
            }
        }
        {
            String lhsModified;
            lhsModified = this.getModified();
            String rhsModified;
            rhsModified = that.getModified();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modified", lhsModified), LocatorUtils.property(thatLocator, "modified", rhsModified), lhsModified, rhsModified)) {
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
            List<Object> thePropertyOrProperties;
            thePropertyOrProperties = (((this.propertyOrProperties!= null)&&(!this.propertyOrProperties.isEmpty()))?this.getPropertyOrProperties():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyOrProperties", thePropertyOrProperties), currentHashCode, thePropertyOrProperties);
        }
        {
            Tservice theService;
            theService = this.getService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "service", theService), currentHashCode, theService);
        }
        {
            List<Treference> theReference;
            theReference = (((this.reference!= null)&&(!this.reference.isEmpty()))?this.getReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reference", theReference), currentHashCode, theReference);
        }
        {
            Timplementation theImplementation;
            theImplementation = this.getImplementation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "implementation", theImplementation), currentHashCode, theImplementation);
        }
        {
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
        }
        {
            boolean theEnabled;
            theEnabled = ((this.enabled!= null)?this.isEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enabled", theEnabled), currentHashCode, theEnabled);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theFactory;
            theFactory = this.getFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "factory", theFactory), currentHashCode, theFactory);
        }
        {
            Boolean theImmediate;
            theImmediate = this.isImmediate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "immediate", theImmediate), currentHashCode, theImmediate);
        }
        {
            TconfigurationPolicy theConfigurationPolicy;
            theConfigurationPolicy = this.getConfigurationPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "configurationPolicy", theConfigurationPolicy), currentHashCode, theConfigurationPolicy);
        }
        {
            String theActivate;
            theActivate = this.getActivate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activate", theActivate), currentHashCode, theActivate);
        }
        {
            String theDeactivate;
            theDeactivate = this.getDeactivate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deactivate", theDeactivate), currentHashCode, theDeactivate);
        }
        {
            String theModified;
            theModified = this.getModified();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modified", theModified), currentHashCode, theModified);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
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
        {
            List<Object> thePropertyOrProperties;
            thePropertyOrProperties = (((this.propertyOrProperties!= null)&&(!this.propertyOrProperties.isEmpty()))?this.getPropertyOrProperties():null);
            strategy.appendField(locator, this, "propertyOrProperties", buffer, thePropertyOrProperties);
        }
        {
            Tservice theService;
            theService = this.getService();
            strategy.appendField(locator, this, "service", buffer, theService);
        }
        {
            List<Treference> theReference;
            theReference = (((this.reference!= null)&&(!this.reference.isEmpty()))?this.getReference():null);
            strategy.appendField(locator, this, "reference", buffer, theReference);
        }
        {
            Timplementation theImplementation;
            theImplementation = this.getImplementation();
            strategy.appendField(locator, this, "implementation", buffer, theImplementation);
        }
        {
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            strategy.appendField(locator, this, "any", buffer, theAny);
        }
        {
            boolean theEnabled;
            theEnabled = ((this.enabled!= null)?this.isEnabled():false);
            strategy.appendField(locator, this, "enabled", buffer, theEnabled);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theFactory;
            theFactory = this.getFactory();
            strategy.appendField(locator, this, "factory", buffer, theFactory);
        }
        {
            Boolean theImmediate;
            theImmediate = this.isImmediate();
            strategy.appendField(locator, this, "immediate", buffer, theImmediate);
        }
        {
            TconfigurationPolicy theConfigurationPolicy;
            theConfigurationPolicy = this.getConfigurationPolicy();
            strategy.appendField(locator, this, "configurationPolicy", buffer, theConfigurationPolicy);
        }
        {
            String theActivate;
            theActivate = this.getActivate();
            strategy.appendField(locator, this, "activate", buffer, theActivate);
        }
        {
            String theDeactivate;
            theDeactivate = this.getDeactivate();
            strategy.appendField(locator, this, "deactivate", buffer, theDeactivate);
        }
        {
            String theModified;
            theModified = this.getModified();
            strategy.appendField(locator, this, "modified", buffer, theModified);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Tcomponent) {
            final Tcomponent copy = ((Tcomponent) draftCopy);
            if ((this.propertyOrProperties!= null)&&(!this.propertyOrProperties.isEmpty())) {
                List<Object> sourcePropertyOrProperties;
                sourcePropertyOrProperties = (((this.propertyOrProperties!= null)&&(!this.propertyOrProperties.isEmpty()))?this.getPropertyOrProperties():null);
                @SuppressWarnings("unchecked")
                List<Object> copyPropertyOrProperties = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "propertyOrProperties", sourcePropertyOrProperties), sourcePropertyOrProperties));
                copy.propertyOrProperties = null;
                if (copyPropertyOrProperties!= null) {
                    List<Object> uniquePropertyOrPropertiesl = copy.getPropertyOrProperties();
                    uniquePropertyOrPropertiesl.addAll(copyPropertyOrProperties);
                }
            } else {
                copy.propertyOrProperties = null;
            }
            if (this.service!= null) {
                Tservice sourceService;
                sourceService = this.getService();
                Tservice copyService = ((Tservice) strategy.copy(LocatorUtils.property(locator, "service", sourceService), sourceService));
                copy.setService(copyService);
            } else {
                copy.service = null;
            }
            if ((this.reference!= null)&&(!this.reference.isEmpty())) {
                List<Treference> sourceReference;
                sourceReference = (((this.reference!= null)&&(!this.reference.isEmpty()))?this.getReference():null);
                @SuppressWarnings("unchecked")
                List<Treference> copyReference = ((List<Treference> ) strategy.copy(LocatorUtils.property(locator, "reference", sourceReference), sourceReference));
                copy.reference = null;
                if (copyReference!= null) {
                    List<Treference> uniqueReferencel = copy.getReference();
                    uniqueReferencel.addAll(copyReference);
                }
            } else {
                copy.reference = null;
            }
            if (this.implementation!= null) {
                Timplementation sourceImplementation;
                sourceImplementation = this.getImplementation();
                Timplementation copyImplementation = ((Timplementation) strategy.copy(LocatorUtils.property(locator, "implementation", sourceImplementation), sourceImplementation));
                copy.setImplementation(copyImplementation);
            } else {
                copy.implementation = null;
            }
            if ((this.any!= null)&&(!this.any.isEmpty())) {
                List<Object> sourceAny;
                sourceAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                @SuppressWarnings("unchecked")
                List<Object> copyAny = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "any", sourceAny), sourceAny));
                copy.any = null;
                if (copyAny!= null) {
                    List<Object> uniqueAnyl = copy.getAny();
                    uniqueAnyl.addAll(copyAny);
                }
            } else {
                copy.any = null;
            }
            if (this.enabled!= null) {
                boolean sourceEnabled;
                sourceEnabled = ((this.enabled!= null)?this.isEnabled():false);
                boolean copyEnabled = strategy.copy(LocatorUtils.property(locator, "enabled", sourceEnabled), sourceEnabled);
                copy.setEnabled(copyEnabled);
            } else {
                copy.enabled = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.factory!= null) {
                String sourceFactory;
                sourceFactory = this.getFactory();
                String copyFactory = ((String) strategy.copy(LocatorUtils.property(locator, "factory", sourceFactory), sourceFactory));
                copy.setFactory(copyFactory);
            } else {
                copy.factory = null;
            }
            if (this.immediate!= null) {
                Boolean sourceImmediate;
                sourceImmediate = this.isImmediate();
                Boolean copyImmediate = ((Boolean) strategy.copy(LocatorUtils.property(locator, "immediate", sourceImmediate), sourceImmediate));
                copy.setImmediate(copyImmediate);
            } else {
                copy.immediate = null;
            }
            if (this.configurationPolicy!= null) {
                TconfigurationPolicy sourceConfigurationPolicy;
                sourceConfigurationPolicy = this.getConfigurationPolicy();
                TconfigurationPolicy copyConfigurationPolicy = ((TconfigurationPolicy) strategy.copy(LocatorUtils.property(locator, "configurationPolicy", sourceConfigurationPolicy), sourceConfigurationPolicy));
                copy.setConfigurationPolicy(copyConfigurationPolicy);
            } else {
                copy.configurationPolicy = null;
            }
            if (this.activate!= null) {
                String sourceActivate;
                sourceActivate = this.getActivate();
                String copyActivate = ((String) strategy.copy(LocatorUtils.property(locator, "activate", sourceActivate), sourceActivate));
                copy.setActivate(copyActivate);
            } else {
                copy.activate = null;
            }
            if (this.deactivate!= null) {
                String sourceDeactivate;
                sourceDeactivate = this.getDeactivate();
                String copyDeactivate = ((String) strategy.copy(LocatorUtils.property(locator, "deactivate", sourceDeactivate), sourceDeactivate));
                copy.setDeactivate(copyDeactivate);
            } else {
                copy.deactivate = null;
            }
            if (this.modified!= null) {
                String sourceModified;
                sourceModified = this.getModified();
                String copyModified = ((String) strategy.copy(LocatorUtils.property(locator, "modified", sourceModified), sourceModified));
                copy.setModified(copyModified);
            } else {
                copy.modified = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Tcomponent();
    }

}
