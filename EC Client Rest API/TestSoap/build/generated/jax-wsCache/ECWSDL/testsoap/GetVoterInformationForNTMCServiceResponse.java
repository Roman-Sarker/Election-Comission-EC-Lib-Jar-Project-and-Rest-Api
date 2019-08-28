
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInformationForNTMCServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInformationForNTMCServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterResponseInfoForNTMC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInformationForNTMCServiceResponse", propOrder = {
    "response"
})
public class GetVoterInformationForNTMCServiceResponse
    extends ServiceResponse
{

    protected VoterResponseInfoForNTMC response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link VoterResponseInfoForNTMC }
     *     
     */
    public VoterResponseInfoForNTMC getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterResponseInfoForNTMC }
     *     
     */
    public void setResponse(VoterResponseInfoForNTMC value) {
        this.response = value;
    }

}
