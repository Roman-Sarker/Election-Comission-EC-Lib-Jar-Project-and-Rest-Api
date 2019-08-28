
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verifyNidInformationsTypeOne complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifyNidInformationsTypeOne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}verifyNidInfoTypeOneServiceRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyNidInformationsTypeOne", propOrder = {
    "request"
})
public class VerifyNidInformationsTypeOne {

    protected VerifyNidInfoTypeOneServiceRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyNidInfoTypeOneServiceRequest }
     *     
     */
    public VerifyNidInfoTypeOneServiceRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyNidInfoTypeOneServiceRequest }
     *     
     */
    public void setRequest(VerifyNidInfoTypeOneServiceRequest value) {
        this.request = value;
    }

}
