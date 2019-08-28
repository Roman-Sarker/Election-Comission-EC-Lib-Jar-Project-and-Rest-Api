
package testsoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regenerateBulkOperationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regenerateBulkOperationServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="bulkOperationidList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regenerateBulkOperationServiceRequest", propOrder = {
    "bulkOperationidList"
})
public class RegenerateBulkOperationServiceRequest
    extends ServiceRequest
{

    @XmlElement(nillable = true)
    protected List<Long> bulkOperationidList;

    /**
     * Gets the value of the bulkOperationidList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulkOperationidList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulkOperationidList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getBulkOperationidList() {
        if (bulkOperationidList == null) {
            bulkOperationidList = new ArrayList<Long>();
        }
        return this.bulkOperationidList;
    }

}
