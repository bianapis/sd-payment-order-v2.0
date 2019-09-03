package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceRecord
 */
public class BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceRecord   {
  private String paymentExecutionProcedureInstanceReference = null;

  private String paymentExecutionProcedureInstanceStatus = null;

  private String executionInitiationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The reference to the payment execution processing task 
   * @return paymentExecutionProcedureInstanceReference
  **/

  public String getPaymentExecutionProcedureInstanceReference() {
    return paymentExecutionProcedureInstanceReference;
  }

  public void setPaymentExecutionProcedureInstanceReference(String paymentExecutionProcedureInstanceReference) {
    this.paymentExecutionProcedureInstanceReference = paymentExecutionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The returned status of the payment execution processing 
   * @return paymentExecutionProcedureInstanceStatus
  **/

  public String getPaymentExecutionProcedureInstanceStatus() {
    return paymentExecutionProcedureInstanceStatus;
  }

  public void setPaymentExecutionProcedureInstanceStatus(String paymentExecutionProcedureInstanceStatus) {
    this.paymentExecutionProcedureInstanceStatus = paymentExecutionProcedureInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the execution initiation task 
   * @return executionInitiationTaskResult
  **/

  public String getExecutionInitiationTaskResult() {
    return executionInitiationTaskResult;
  }

  public void setExecutionInitiationTaskResult(String executionInitiationTaskResult) {
    this.executionInitiationTaskResult = executionInitiationTaskResult;
  }


}

