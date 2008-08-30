//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.06.20 at 06:10:07 PM HST 
//


package com.google.code.facebookapi.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eid" type="{http://api.facebook.com/1.0/}eid"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tagline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nid" type="{http://api.facebook.com/1.0/}nid"/>
 *         &lt;element name="pic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pic_big" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pic_small" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event_subtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_time" type="{http://api.facebook.com/1.0/}time"/>
 *         &lt;element name="end_time" type="{http://api.facebook.com/1.0/}time"/>
 *         &lt;element name="creator" type="{http://api.facebook.com/1.0/}uid"/>
 *         &lt;element name="update_time" type="{http://api.facebook.com/1.0/}time"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="venue" type="{http://api.facebook.com/1.0/}location"/>
 *         &lt;element name="pic_square" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = {
    "eid",
    "name",
    "tagline",
    "nid",
    "pic",
    "picBig",
    "picSmall",
    "host",
    "description",
    "eventType",
    "eventSubtype",
    "startTime",
    "endTime",
    "creator",
    "updateTime",
    "location",
    "venue",
    "picSquare"
})
public class Event {

    protected long eid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String tagline;
    protected int nid;
    @XmlElement(required = true)
    protected String pic;
    @XmlElement(name = "pic_big", required = true)
    protected String picBig;
    @XmlElement(name = "pic_small", required = true)
    protected String picSmall;
    @XmlElement(required = true)
    protected String host;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "event_type", required = true)
    protected String eventType;
    @XmlElement(name = "event_subtype", required = true)
    protected String eventSubtype;
    @XmlElement(name = "start_time")
    protected int startTime;
    @XmlElement(name = "end_time")
    protected int endTime;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long creator;
    @XmlElement(name = "update_time")
    protected int updateTime;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected Location venue;
    @XmlElement(name = "pic_square", required = true)
    protected String picSquare;

    /**
     * Gets the value of the eid property.
     * 
     */
    public synchronized long getEid() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     */
    public synchronized void setEid(long value) {
        this.eid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getName() {
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
    public synchronized void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tagline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getTagline() {
        return tagline;
    }

    /**
     * Sets the value of the tagline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setTagline(String value) {
        this.tagline = value;
    }

    /**
     * Gets the value of the nid property.
     * 
     */
    public synchronized int getNid() {
        return nid;
    }

    /**
     * Sets the value of the nid property.
     * 
     */
    public synchronized void setNid(int value) {
        this.nid = value;
    }

    /**
     * Gets the value of the pic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getPic() {
        return pic;
    }

    /**
     * Sets the value of the pic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setPic(String value) {
        this.pic = value;
    }

    /**
     * Gets the value of the picBig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getPicBig() {
        return picBig;
    }

    /**
     * Sets the value of the picBig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setPicBig(String value) {
        this.picBig = value;
    }

    /**
     * Gets the value of the picSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getPicSmall() {
        return picSmall;
    }

    /**
     * Sets the value of the picSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setPicSmall(String value) {
        this.picSmall = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getEventSubtype() {
        return eventSubtype;
    }

    /**
     * Sets the value of the eventSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setEventSubtype(String value) {
        this.eventSubtype = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     */
    public synchronized int getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     */
    public synchronized void setStartTime(int value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     */
    public synchronized int getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     */
    public synchronized void setEndTime(int value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public synchronized Long getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public synchronized void setCreator(Long value) {
        this.creator = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     */
    public synchronized int getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     */
    public synchronized void setUpdateTime(int value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public synchronized Location getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public synchronized void setVenue(Location value) {
        this.venue = value;
    }

    /**
     * Gets the value of the picSquare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getPicSquare() {
        return picSquare;
    }

    /**
     * Sets the value of the picSquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setPicSquare(String value) {
        this.picSquare = value;
    }

}