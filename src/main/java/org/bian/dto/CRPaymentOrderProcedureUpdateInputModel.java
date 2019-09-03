package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentOrderProcedureUpdateInputModelPaymentOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureUpdateInputModel
 */
public class CRPaymentOrderProcedureUpdateInputModel   {
  private String paymentOrderServicingSessionReference = null;

  private String paymentOrderProcedureInstanceReference = null;

  private CRPaymentOrderProcedureUpdateInputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord = null;

  private Object paymentOrderProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get paymentOrderProcedureInstanceRecord
   * @return paymentOrderProcedureInstanceRecord
  **/

  public CRPaymentOrderProcedureUpdateInputModelPaymentOrderProcedureInstanceRecord getPaymentOrderProcedureInstanceRecord() {
    return paymentOrderProcedureInstanceRecord;
  }

  public void setPaymentOrderProcedureInstanceRecord(CRPaymentOrderProcedureUpdateInputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord) {
    this.paymentOrderProcedureInstanceRecord = paymentOrderProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentOrderProcedureUpdateActionTaskRecord
  **/

  public Object getPaymentOrderProcedureUpdateActionTaskRecord() {
    return paymentOrderProcedureUpdateActionTaskRecord;
  }

  public void setPaymentOrderProcedureUpdateActionTaskRecord(Object paymentOrderProcedureUpdateActionTaskRecord) {
    this.paymentOrderProcedureUpdateActionTaskRecord = paymentOrderProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

