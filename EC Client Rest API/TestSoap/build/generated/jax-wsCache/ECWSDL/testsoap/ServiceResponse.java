
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationResult" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}operationResult" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceResponse", propOrder = {
    "operationResult",
    "requestId",
    "serviceDescription",
    "serviceId"
})
@XmlSeeAlso({
    GetNIDExistsServiceResponse.class,
    GetVoterInfoServiceResponse.class,
    VerifyServiceResponse.class,
    GetPartnerCardStatusResponse.class,
    ListSubUserServiceResponse.class,
    QueryServiceResponse.class,
    VerifyNidInfoTypeOneServiceResponse.class,
    HeartbeatServiceResponse.class,
    PollingCenterExtendedServiceResponse.class,
    DeleteSubUserServiceResponse.class,
    ReportServiceResponse.class,
    ChangePasswordServiceResponse.class,
    IdentifyByBiometricDataServiceResponse.class,
    CreateBulkOperationServiceResponse.class,
    GetServiceLogDetailServiceResponse.class,
    GetCardDistributionInfoServiceResponse.class,
    GetServiceLogSummaryServiceResponse.class,
    GetVoterInformationPartnerResponse.class,
    GetVoterInformationServiceResponse.class,
    GetCardIssueApplicationsServiceResponse.class,
    GetVerfiyCardChangeTransactionServiceResponse.class,
    CreateSubUserServiceResponse.class,
    LoginServiceResponse.class,
    CheckByNationalIdAndDobServiceResponse.class,
    LogoutServiceResponse.class,
    GetDetailVoterInformationResponse.class,
    GetVoterNidServiceResponse.class,
    VerifyNidDobResponse.class,
    RegenerateBulkOperationServiceResponse.class,
    IdentifyByNationalIdServiceResponse.class,
    UpdateSubUserServiceResponse.class,
    ChangeExpiredPasswordServiceResponse.class,
    GetVoterInformationForNTMCServiceResponse.class,
    ExpireSubUserPasswordServiceResponse.class,
    IdentifyByPassportNumberServiceResponse.class,
    VerifyTypeTwoServiceResponse.class,
    BulkBankTransactionServiceResponse.class,
    GetUserServicesServiceResponse.class,
    UpdateBulkOperationStatusServiceResponse.class,
    SetInputFilePathBulkOperationServiceResponse.class,
    GetUserInfoServiceResponse.class,
    GetBulkOperationServiceResponse.class,
    DeleteBulkOperationServiceResponse.class,
    GetVoterInformationTypeFivePartnerResponse.class,
    GetVoterCountFromVoterAreaServiceResponse.class,
    MigrateVoterFromPartnerServiceResponse.class,
    IdentifyServiceResponse.class,
    IssueCardServiceResponse.class,
    VerifyByNationalIdServiceResponse.class,
    PollingCenterServiceResponse.class,
    VerifyNidInformationsServiceResponse.class,
    CidServiceResponse.class,
    GetDetailVoterInformationTypeSixResponse.class,
    BankTransactionServiceResponse.class,
    GetCardIssueCountServiceResponse.class,
    UpdateUserInfoServiceResponse.class
})
public class ServiceResponse {

    protected OperationResult operationResult;
    protected String requestId;
    protected String serviceDescription;
    protected Long serviceId;

    /**
     * Gets the value of the operationResult property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResult }
     *     
     */
    public OperationResult getOperationResult() {
        return operationResult;
    }

    /**
     * Sets the value of the operationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResult }
     *     
     */
    public void setOperationResult(OperationResult value) {
        this.operationResult = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceId(Long value) {
        this.serviceId = value;
    }

}
