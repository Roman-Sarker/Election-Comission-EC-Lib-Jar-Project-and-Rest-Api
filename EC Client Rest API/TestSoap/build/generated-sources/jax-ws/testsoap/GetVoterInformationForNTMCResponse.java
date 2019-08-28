
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInformationForNTMCResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInformationForNTMCResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}getVoterInformationForNTMCServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInformationForNTMCResponse", propOrder = {
    "_return"
})
public class GetVoterInformationForNTMCResponse {

    @XmlElement(name = "return")
    protected GetVoterInformationForNTMCServiceResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVoterInformationForNTMCServiceResponse }
     *     
     */
    public GetVoterInformationForNTMCServiceResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVoterInformationForNTMCServiceResponse }
     *     
     */
    public void setReturn(GetVoterInformationForNTMCServiceResponse value) {
        this._return = value;
    }

}
