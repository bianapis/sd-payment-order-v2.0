package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureInitiateInputModel
 */
public class CRPaymentOrderProcedureInitiateInputModel   {
  private String paymentOrderServicingSessionReference = null;

  private Object paymentOrderProcedureInitiateActionRecord = null;

  private String paymentOrderProcedureInstanceStatus = null;

  private CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return paymentOrderServicingSessionReference
  **/

  public String getPaymentOrderServicingSessionReference() {
    return paymentOrderServicingSessionReference;
  }

  public void setPaymentOrderServicingSessionReference(String paymentOrderServicingSessionReference) {
    this.paymentOrderServicingSessionReference = paymentOrderServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentOrderProcedureInitiateActionRecord
  **/

  public Object getPaymentOrderProcedureInitiateActionRecord() {
    return paymentOrderProcedureInitiateActionRecord;
  }

  public void setPaymentOrderProcedureInitiateActionRecord(Object paymentOrderProcedureInitiateActionRecord) {
    this.paymentOrderProcedureInitiateActionRecord = paymentOrderProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment Order Procedure instance (e.g. initialised, pending, active) 
   * @return paymentOrderProcedureInstanceStatus
  **/

  public String getPaymentOrderProcedureInstanceStatus() {
    return paymentOrderProcedureInstanceStatus;
  }

  public void setPaymentOrderProcedureInstanceStatus(String paymentOrderProcedureInstanceStatus) {
    this.paymentOrderProcedureInstanceStatus = paymentOrderProcedureInstanceStatus;
  }


  /**
   * Get paymentOrderProcedureInstanceRecord
   * @return paymentOrderProcedureInstanceRecord
  **/

  public CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecord getPaymentOrderProcedureInstanceRecord() {
    return paymentOrderProcedureInstanceRecord;
  }

  public void setPaymentOrderProcedureInstanceRecord(CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord) {
    this.paymentOrderProcedureInstanceRecord = paymentOrderProcedureInstanceRecord;
  }


}

