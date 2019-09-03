package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentOrderProcedureUpdateInputModelPaymentOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureUpdateOutputModel
 */
public class CRPaymentOrderProcedureUpdateOutputModel   {
  private CRPaymentOrderProcedureUpdateInputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord = null;

  private String paymentOrderProcedureUpdateActionTaskReference = null;

  private Object paymentOrderProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return paymentOrderProcedureUpdateActionTaskReference
  **/

  public String getPaymentOrderProcedureUpdateActionTaskReference() {
    return paymentOrderProcedureUpdateActionTaskReference;
  }

  public void setPaymentOrderProcedureUpdateActionTaskReference(String paymentOrderProcedureUpdateActionTaskReference) {
    this.paymentOrderProcedureUpdateActionTaskReference = paymentOrderProcedureUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

