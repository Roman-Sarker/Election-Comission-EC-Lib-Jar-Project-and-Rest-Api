
package testsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://bean.partner.ws.service.bvrs.soa.tigerit.com/}requestHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "requestHeader"
})
@XmlSeeAlso({
    PollingCenterTypeTwoServiceRequest.class,
    MigrateVoterFromPartnerServiceRequest.class,
    GetVoterInformationPartnerTypeFiveRequest.class,
    ChangePasswordServiceRequest.class,
    BankTransactionServiceRequest.class,
    VerifyByNationalIdServiceRequest.class,
    ReportServiceRequest.class,
    GetUserServicesServiceRequest.class,
    ExpireSubUserPasswordServiceRequest.class,
    RegenerateBulkOperationServiceRequest.class,
    UpdateUserInfoServiceRequest.class,
    GetVoterInformationForNTMCServiceRequest.class,
    PollingCenterServiceRequest.class,
    SetInputFilePathBulkOperationServiceRequest.class,
    QueryServiceRequest.class,
    IdentifyByNationalIdServiceRequest.class,
    GetServiceLogDetailServiceRequest.class,
    CheckByNationalIdAndDobRequest.class,
    VerifyServiceRequest.class,
    LogoutServiceRequest.class,
    HeartbeatServiceRequest.class,
    VerifyNidInformationsServiceRequest.class,
    IdentifyServiceRequest.class,
    GetCardIssueApplicationsServiceRequest.class,
    GetVoterInformationTypeOneByFormNoRequest.class,
    CreateBulkOperationServiceRequest.class,
    GetVoterCountFromVoterAreaServiceRequest.class,
    IdentifyByBiometricDataServiceRequest.class,
    GetVoterInformationFromVoterArea.class,
    GetVoterNidServiceRequest.class,
    DeleteSubUserServiceRequest.class,
    GetCardIssueCountServiceRequest.class,
    PollingCenterTypeTwoExtendedServiceRequest.class,
    CreateSubUserServiceRequest.class,
    BulkBankTransactionServiceRequest.class,
    UpdateSubUserServiceRequest.class,
    GetNIDExistsServiceRequest.class,
    GetVerfiyCardChangeTransactionServiceRequest.class,
    GetVoterInformationPartnerRequest.class,
    IdentifyServiceCIDRequest.class,
    GetPartnerCardStatusRequest.class,
    GetBulkOperationServiceRequest.class,
    IssueCardServiceRequest.class,
    GetServiceLogSummaryServiceRequest.class,
    GetVoterInformationByVoterNoServiceRequest.class,
    GetUserInfoServiceRequest.class,
    PollingCenterExtendedServiceRequest.class,
    GetCardDistributionInfoServiceRequest.class,
    VerifyNidInfoTypeOneServiceRequest.class,
    GetVoterInformationServiceRequest.class,
    ListSubUserServiceRequest.class,
    IdentifyByPassportNumberServiceRequest.class,
    UpdateBulkOperationStatusServiceRequest.class,
    DeleteBulkOperationServiceRequest.class
})
public class ServiceRequest {

    protected RequestHeader requestHeader;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

}
