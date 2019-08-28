
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterNidServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterNidServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterNidServiceResponse", propOrder = {
    "nid",
    "pin"
})
public class GetVoterNidServiceResponse
    extends ServiceResponse
{

    protected String nid;
    protected String pin;

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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

}
