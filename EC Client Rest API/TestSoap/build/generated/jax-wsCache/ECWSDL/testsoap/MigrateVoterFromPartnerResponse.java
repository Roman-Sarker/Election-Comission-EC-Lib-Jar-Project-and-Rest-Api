
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for migrateVoterFromPartnerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="migrateVoterFromPartnerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}migrateVoterFromPartnerServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migrateVoterFromPartnerResponse", propOrder = {
    "_return"
})
public class MigrateVoterFromPartnerResponse {

    @XmlElement(name = "return")
    protected MigrateVoterFromPartnerServiceResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link MigrateVoterFromPartnerServiceResponse }
     *     
     */
    public MigrateVoterFromPartnerServiceResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrateVoterFromPartnerServiceResponse }
     *     
     */
    public void setReturn(MigrateVoterFromPartnerServiceResponse value) {
        this._return = value;
    }

}
