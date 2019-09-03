package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceAnalysis;
import org.bian.dto.CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureRetrieveInputModel
 */
public class CRPaymentOrderProcedureRetrieveInputModel   {
  private Object paymentOrderProcedureRetrieveActionTaskRecord = null;

  private String paymentOrderProcedureRetrieveActionRequest = null;

  private CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceReportRecord paymentOrderProcedureInstanceReportRecord = null;

  private CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceAnalysis paymentOrderProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentOrderProcedureRetrieveActionTaskRecord
  **/

  public Object getPaymentOrderProcedureRetrieveActionTaskRecord() {
    return paymentOrderProcedureRetrieveActionTaskRecord;
  }

  public void setPaymentOrderProcedureRetrieveActionTaskRecord(Object paymentOrderProcedureRetrieveActionTaskRecord) {
    this.paymentOrderProcedureRetrieveActionTaskRecord = paymentOrderProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentOrderProcedureRetrieveActionRequest
  **/

  public String getPaymentOrderProcedureRetrieveActionRequest() {
    return paymentOrderProcedureRetrieveActionRequest;
  }

  public void setPaymentOrderProcedureRetrieveActionRequest(String paymentOrderProcedureRetrieveActionRequest) {
    this.paymentOrderProcedureRetrieveActionRequest = paymentOrderProcedureRetrieveActionRequest;
  }


  /**
   * Get paymentOrderProcedureInstanceReportRecord
   * @return paymentOrderProcedureInstanceReportRecord
  **/

  public CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceReportRecord getPaymentOrderProcedureInstanceReportRecord() {
    return paymentOrderProcedureInstanceReportRecord;
  }

  public void setPaymentOrderProcedureInstanceReportRecord(CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceReportRecord paymentOrderProcedureInstanceReportRecord) {
    this.paymentOrderProcedureInstanceReportRecord = paymentOrderProcedureInstanceReportRecord;
  }


  /**
   * Get paymentOrderProcedureInstanceAnalysis
   * @return paymentOrderProcedureInstanceAnalysis
  **/

  public CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceAnalysis getPaymentOrderProcedureInstanceAnalysis() {
    return paymentOrderProcedureInstanceAnalysis;
  }

  public void setPaymentOrderProcedureInstanceAnalysis(CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceAnalysis paymentOrderProcedureInstanceAnalysis) {
    this.paymentOrderProcedureInstanceAnalysis = paymentOrderProcedureInstanceAnalysis;
  }


}

