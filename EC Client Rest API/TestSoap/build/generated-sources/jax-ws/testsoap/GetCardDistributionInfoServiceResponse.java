
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getCardDistributionInfoServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardDistributionInfoServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="boxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compartmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deactivateReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributionAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributionDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="distributionDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voterArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardDistributionInfoServiceResponse", propOrder = {
    "boxNo",
    "compartmentNo",
    "deactivateReason",
    "distributionAddress",
    "distributionDateEnd",
    "distributionDateStart",
    "nameEn",
    "voterArea"
})
public class GetCardDistributionInfoServiceResponse
    extends ServiceResponse
{

    protected String boxNo;
    protected String compartmentNo;
    protected String deactivateReason;
    protected String distributionAddress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar distributionDateEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar distributionDateStart;
    protected String nameEn;
    protected String voterArea;

    /**
     * Gets the value of the boxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxNo() {
        return boxNo;
    }

    /**
     * Sets the value of the boxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxNo(String value) {
        this.boxNo = value;
    }

    /**
     * Gets the value of the compartmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartmentNo() {
        return compartmentNo;
    }

    /**
     * Sets the value of the compartmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartmentNo(String value) {
        this.compartmentNo = value;
    }

    /**
     * Gets the value of the deactivateReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactivateReason() {
        return deactivateReason;
    }

    /**
     * Sets the value of the deactivateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivateReason(String value) {
        this.deactivateReason = value;
    }

    /**
     * Gets the value of the distributionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionAddress() {
        return distributionAddress;
    }

    /**
     * Sets the value of the distributionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionAddress(String value) {
        this.distributionAddress = value;
    }

    /**
     * Gets the value of the distributionDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDistributionDateEnd() {
        return distributionDateEnd;
    }

    /**
     * Sets the value of the distributionDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDistributionDateEnd(XMLGregorianCalendar value) {
        this.distributionDateEnd = value;
    }

    /**
     * Gets the value of the distributionDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDistributionDateStart() {
        return distributionDateStart;
    }

    /**
     * Sets the value of the distributionDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDistributionDateStart(XMLGregorianCalendar value) {
        this.distributionDateStart = value;
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
     * Gets the value of the voterArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterArea() {
        return voterArea;
    }

    /**
     * Sets the value of the voterArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterArea(String value) {
        this.voterArea = value;
    }

}
