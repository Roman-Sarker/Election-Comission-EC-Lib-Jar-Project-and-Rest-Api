
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for voterResponseInfoForNTMC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voterResponseInfoForNTMC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="father" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permanentAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="presentAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voterResponseInfoForNTMC", propOrder = {
    "bloodGroup",
    "dob",
    "father",
    "gender",
    "mother",
    "name",
    "nameEn",
    "nid",
    "permanentAddress",
    "photo",
    "presentAddress",
    "profession",
    "spouse"
})
public class VoterResponseInfoForNTMC {

    protected String bloodGroup;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dob;
    protected String father;
    protected String gender;
    protected String mother;
    protected String name;
    protected String nameEn;
    protected String nid;
    protected String permanentAddress;
    protected byte[] photo;
    protected String presentAddress;
    protected String profession;
    protected String spouse;

    /**
     * Gets the value of the bloodGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Sets the value of the bloodGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodGroup(String value) {
        this.bloodGroup = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the father property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFather() {
        return father;
    }

    /**
     * Sets the value of the father property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFather(String value) {
        this.father = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the mother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMother() {
        return mother;
    }

    /**
     * Sets the value of the mother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMother(String value) {
        this.mother = value;
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
     * Gets the value of the nameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Sets the value of the nameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEn(String value) {
        this.nameEn = value;
    }

    /**
     * Gets the value of the nid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNid() {
        return nid;
    }

    /**
     * Sets the value of the nid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNid(String value) {
        this.nid = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermanentAddress(String value) {
        this.permanentAddress = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhoto(byte[] value) {
        this.photo = value;
    }

    /**
     * Gets the value of the presentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentAddress() {
        return presentAddress;
    }

    /**
     * Sets the value of the presentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentAddress(String value) {
        this.presentAddress = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfession(String value) {
        this.profession = value;
    }

    /**
     * Gets the value of the spouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * Sets the value of the spouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouse(String value) {
        this.spouse = value;
    }

}
