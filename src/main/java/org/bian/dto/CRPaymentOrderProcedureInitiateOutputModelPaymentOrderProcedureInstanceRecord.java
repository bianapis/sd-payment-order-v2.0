package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureInitiateOutputModelPaymentOrderProcedureInstanceRecord
 */
public class CRPaymentOrderProcedureInitiateOutputModelPaymentOrderProcedureInstanceRecord   {
  private CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecordDateType dateType = null;

  private String paymentMechanismType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRPaymentOrderProcedureInitiateInputModelPaymentOrderProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Requested payment mechanism (e.g. ACH, SWIFT) 
   * @return paymentMechanismType
  **/

  public String getPaymentMechanismType() {
    return paymentMechanismType;
  }

  public void setPaymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
  }


}

