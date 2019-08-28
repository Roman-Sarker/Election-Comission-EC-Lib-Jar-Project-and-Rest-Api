
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verifyNidDobResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifyNidDobResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="voterInfo" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}voterInfoExtra" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyNidDobResponse", propOrder = {
    "voterInfo"
})
public class VerifyNidDobResponse
    extends ServiceResponse
{

    protected VoterInfoExtra voterInfo;

    /**
     * Gets the value of the voterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VoterInfoExtra }
     *     
     */
    public VoterInfoExtra getVoterInfo() {
        return voterInfo;
    }

    /**
     * Sets the value of the voterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterInfoExtra }
     *     
     */
    public void setVoterInfo(VoterInfoExtra value) {
        this.voterInfo = value;
    }

}
