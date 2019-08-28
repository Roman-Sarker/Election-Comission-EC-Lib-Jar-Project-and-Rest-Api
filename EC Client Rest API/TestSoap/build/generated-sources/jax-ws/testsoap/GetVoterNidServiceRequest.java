
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterNidServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterNidServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="nationalIdOrPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterNidServiceRequest", propOrder = {
    "nationalIdOrPin"
})
public class GetVoterNidServiceRequest
    extends ServiceRequest
{

    protected String nationalIdOrPin;

    /**
     * Gets the value of the nationalIdOrPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdOrPin() {
        return nationalIdOrPin;
    }

    /**
     * Sets the value of the nationalIdOrPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdOrPin(String value) {
        this.nationalIdOrPin = value;
    }

}
