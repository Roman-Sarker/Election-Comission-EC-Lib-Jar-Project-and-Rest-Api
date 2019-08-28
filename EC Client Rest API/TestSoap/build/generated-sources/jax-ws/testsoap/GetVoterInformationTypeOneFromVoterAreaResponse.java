
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInformationTypeOneFromVoterAreaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInformationTypeOneFromVoterAreaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}getDetailVoterInformationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInformationTypeOneFromVoterAreaResponse", propOrder = {
    "_return"
})
public class GetVoterInformationTypeOneFromVoterAreaResponse {

    @XmlElement(name = "return")
    protected GetDetailVoterInformationResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDetailVoterInformationResponse }
     *     
     */
    public GetDetailVoterInformationResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDetailVoterInformationResponse }
     *     
     */
    public void setReturn(GetDetailVoterInformationResponse value) {
        this._return = value;
    }

}
