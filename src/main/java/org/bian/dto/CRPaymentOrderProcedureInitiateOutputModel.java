package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentOrderProcedureInitiateOutputModelPaymentOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureInitiateOutputModel
 */
public class CRPaymentOrderProcedureInitiateOutputModel   {
  private String paymentOrderProcedureInstanceReference = null;

  private String paymentOrderProcedureInitiateActionReference = null;

  private Object paymentOrderProcedureInitiateActionRecord = null;

  private String paymentOrderProcedureInstanceStatus = null;

  private CRPaymentOrderProcedureInitiateOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment Order Procedure instance 
   * @return paymentOrderProcedureInstanceReference
  **/

  public String getPaymentOrderProcedureInstanceReference() {
    return paymentOrderProcedureInstanceReference;
  }

  public void setPaymentOrderProcedureInstanceReference(String paymentOrderProcedureInstanceReference) {
    this.paymentOrderProcedureInstanceReference = paymentOrderProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return paymentOrderProcedureInitiateActionReference
  **/

  public String getPaymentOrderProcedureInitiateActionReference() {
    return paymentOrderProcedureInitiateActionReference;
  }

  public void setPaymentOrderProcedureInitiateActionReference(String paymentOrderProcedureInitiateActionReference) {
    this.paymentOrderProcedureInitiateActionReference = paymentOrderProcedureInitiateActionReference;
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

  public CRPaymentOrderProcedureInitiateOutputModelPaymentOrderProcedureInstanceRecord getPaymentOrderProcedureInstanceRecord() {
    return paymentOrderProcedureInstanceRecord;
  }

  public void setPaymentOrderProcedureInstanceRecord(CRPaymentOrderProcedureInitiateOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord) {
    this.paymentOrderProcedureInstanceRecord = paymentOrderProcedureInstanceRecord;
  }


}

