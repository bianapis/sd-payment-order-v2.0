package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionInitiationControlInputModelExecutionInitiationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationControlInputModel
 */
public class BQExecutionInitiationControlInputModel   {
  private String paymentOrderProcedureInstanceReference = null;

  private String executionInitiationInstanceReference = null;

  private Object executionInitiationControlActionTaskRecord = null;

  private BQExecutionInitiationControlInputModelExecutionInitiationControlActionRequest executionInitiationControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Payment Order Procedure instance 
   * @return paymentOrderProcedureInstanceReference
  **/

  public String getPaymentOrderProcedureInstanceReference() {
    return paymentOrderProcedureInstanceReference;
  }

  public void setPaymentOrderProcedureInstanceReference(String paymentOrderProcedureInstanceReference) {
    this.paymentOrderProcedureInstanceReference = paymentOrderProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution Initiation instance 
   * @return executionInitiationInstanceReference
  **/

  public String getExecutionInitiationInstanceReference() {
    return executionInitiationInstanceReference;
  }

  public void setExecutionInitiationInstanceReference(String executionInitiationInstanceReference) {
    this.executionInitiationInstanceReference = executionInitiationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return executionInitiationControlActionTaskRecord
  **/

  public Object getExecutionInitiationControlActionTaskRecord() {
    return executionInitiationControlActionTaskRecord;
  }

  public void setExecutionInitiationControlActionTaskRecord(Object executionInitiationControlActionTaskRecord) {
    this.executionInitiationControlActionTaskRecord = executionInitiationControlActionTaskRecord;
  }


  /**
   * Get executionInitiationControlActionRequest
   * @return executionInitiationControlActionRequest
  **/

  public BQExecutionInitiationControlInputModelExecutionInitiationControlActionRequest getExecutionInitiationControlActionRequest() {
    return executionInitiationControlActionRequest;
  }

  public void setExecutionInitiationControlActionRequest(BQExecutionInitiationControlInputModelExecutionInitiationControlActionRequest executionInitiationControlActionRequest) {
    this.executionInitiationControlActionRequest = executionInitiationControlActionRequest;
  }


}

