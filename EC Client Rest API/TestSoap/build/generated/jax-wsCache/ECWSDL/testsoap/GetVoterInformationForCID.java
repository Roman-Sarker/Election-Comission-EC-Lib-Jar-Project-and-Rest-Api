
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVoterInformationForCID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVoterInformationForCID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}identifyByNationalIdServiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoterInformationForCID", propOrder = {
    "request"
})
public class GetVoterInformationForCID {

    protected IdentifyByNationalIdServiceRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifyByNationalIdServiceRequest }
     *     
     */
    public IdentifyByNationalIdServiceRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifyByNationalIdServiceRequest }
     *     
     */
    public void setRequest(IdentifyByNationalIdServiceRequest value) {
        this.request = value;
    }

}
