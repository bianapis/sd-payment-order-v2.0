package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceRecord
 */
public class BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceRecord   {
  private String paymentOrderComplianceCheckType = null;

  private String paymentOrderComplianceCheckResult = null;

  private String orderConfirmationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of compliance check performed (e.g. AML, Watchlists) 
   * @return paymentOrderComplianceCheckType
  **/

  public String getPaymentOrderComplianceCheckType() {
    return paymentOrderComplianceCheckType;
  }

  public void setPaymentOrderComplianceCheckType(String paymentOrderComplianceCheckType) {
    this.paymentOrderComplianceCheckType = paymentOrderComplianceCheckType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the compliance check 
   * @return paymentOrderComplianceCheckResult
  **/

  public String getPaymentOrderComplianceCheckResult() {
    return paymentOrderComplianceCheckResult;
  }

  public void setPaymentOrderComplianceCheckResult(String paymentOrderComplianceCheckResult) {
    this.paymentOrderComplianceCheckResult = paymentOrderComplianceCheckResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the overall confirmation checking process 
   * @return orderConfirmationTaskResult
  **/

  public String getOrderConfirmationTaskResult() {
    return orderConfirmationTaskResult;
  }

  public void setOrderConfirmationTaskResult(String orderConfirmationTaskResult) {
    this.orderConfirmationTaskResult = orderConfirmationTaskResult;
  }


}

