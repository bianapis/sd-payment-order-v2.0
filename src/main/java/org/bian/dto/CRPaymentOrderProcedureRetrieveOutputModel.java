package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceAnalysis;
import org.bian.dto.CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceRecord;
import org.bian.dto.CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureRetrieveOutputModel
 */
public class CRPaymentOrderProcedureRetrieveOutputModel   {
  private CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord = null;

  private String paymentOrderProcedureRetrieveActionTaskReference = null;

  private Object paymentOrderProcedureRetrieveActionTaskRecord = null;

  private String paymentOrderProcedureRetrieveActionResponse = null;

  private CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceReportRecord paymentOrderProcedureInstanceReportRecord = null;

  private CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceAnalysis paymentOrderProcedureInstanceAnalysis = null;


  /**
   * Get paymentOrderProcedureInstanceRecord
   * @return paymentOrderProcedureInstanceRecord
  **/

  public CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceRecord getPaymentOrderProcedureInstanceRecord() {
    return paymentOrderProcedureInstanceRecord;
  }

  public void setPaymentOrderProcedureInstanceRecord(CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord) {
    this.paymentOrderProcedureInstanceRecord = paymentOrderProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Order Procedure instance retrieve service call 
   * @return paymentOrderProcedureRetrieveActionTaskReference
  **/

  public String getPaymentOrderProcedureRetrieveActionTaskReference() {
    return paymentOrderProcedureRetrieveActionTaskReference;
  }

  public void setPaymentOrderProcedureRetrieveActionTaskReference(String paymentOrderProcedureRetrieveActionTaskReference) {
    this.paymentOrderProcedureRetrieveActionTaskReference = paymentOrderProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentOrderProcedureRetrieveActionResponse
  **/

  public String getPaymentOrderProcedureRetrieveActionResponse() {
    return paymentOrderProcedureRetrieveActionResponse;
  }

  public void setPaymentOrderProcedureRetrieveActionResponse(String paymentOrderProcedureRetrieveActionResponse) {
    this.paymentOrderProcedureRetrieveActionResponse = paymentOrderProcedureRetrieveActionResponse;
  }


  /**
   * Get paymentOrderProcedureInstanceReportRecord
   * @return paymentOrderProcedureInstanceReportRecord
  **/

  public CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceReportRecord getPaymentOrderProcedureInstanceReportRecord() {
    return paymentOrderProcedureInstanceReportRecord;
  }

  public void setPaymentOrderProcedureInstanceReportRecord(CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceReportRecord paymentOrderProcedureInstanceReportRecord) {
    this.paymentOrderProcedureInstanceReportRecord = paymentOrderProcedureInstanceReportRecord;
  }


  /**
   * Get paymentOrderProcedureInstanceAnalysis
   * @return paymentOrderProcedureInstanceAnalysis
  **/

  public CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceAnalysis getPaymentOrderProcedureInstanceAnalysis() {
    return paymentOrderProcedureInstanceAnalysis;
  }

  public void setPaymentOrderProcedureInstanceAnalysis(CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceAnalysis paymentOrderProcedureInstanceAnalysis) {
    this.paymentOrderProcedureInstanceAnalysis = paymentOrderProcedureInstanceAnalysis;
  }


}

