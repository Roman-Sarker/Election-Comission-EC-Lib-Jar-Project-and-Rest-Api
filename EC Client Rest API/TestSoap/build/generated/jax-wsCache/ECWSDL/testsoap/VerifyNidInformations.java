
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verifyNidInformations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifyNidInformations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}verifyNidInformationsServiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyNidInformations", propOrder = {
    "request"
})
public class VerifyNidInformations {

    protected VerifyNidInformationsServiceRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyNidInformationsServiceRequest }
     *     
     */
    public VerifyNidInformationsServiceRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyNidInformationsServiceRequest }
     *     
     */
    public void setRequest(VerifyNidInformationsServiceRequest value) {
        this.request = value;
    }

}
