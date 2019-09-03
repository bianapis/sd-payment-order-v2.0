package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceAnalysis;
import org.bian.dto.BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceRecord;
import org.bian.dto.BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceReport;
import org.bian.dto.BQOrderConfirmationRetrieveOutputModelPaymentOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOrderConfirmationRetrieveOutputModel
 */
public class BQOrderConfirmationRetrieveOutputModel   {
  private BQOrderConfirmationRetrieveOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord = null;

  private BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceRecord orderConfirmationInstanceRecord = null;

  private String orderConfirmationRetrieveActionTaskReference = null;

  private Object orderConfirmationRetrieveActionTaskRecord = null;

  private String orderConfirmationRetrieveActionResponse = null;

  private BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceReport orderConfirmationInstanceReport = null;

  private BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceAnalysis orderConfirmationInstanceAnalysis = null;


  /**
   * Get paymentOrderProcedureInstanceRecord
   * @return paymentOrderProcedureInstanceRecord
  **/

  public BQOrderConfirmationRetrieveOutputModelPaymentOrderProcedureInstanceRecord getPaymentOrderProcedureInstanceRecord() {
    return paymentOrderProcedureInstanceRecord;
  }

  public void setPaymentOrderProcedureInstanceRecord(BQOrderConfirmationRetrieveOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord) {
    this.paymentOrderProcedureInstanceRecord = paymentOrderProcedureInstanceRecord;
  }


  /**
   * Get orderConfirmationInstanceRecord
   * @return orderConfirmationInstanceRecord
  **/

  public BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceRecord getOrderConfirmationInstanceRecord() {
    return orderConfirmationInstanceRecord;
  }

  public void setOrderConfirmationInstanceRecord(BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceRecord orderConfirmationInstanceRecord) {
    this.orderConfirmationInstanceRecord = orderConfirmationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Order Confirmation instance retrieve service call 
   * @return orderConfirmationRetrieveActionTaskReference
  **/

  public String getOrderConfirmationRetrieveActionTaskReference() {
    return orderConfirmationRetrieveActionTaskReference;
  }

  public void setOrderConfirmationRetrieveActionTaskReference(String orderConfirmationRetrieveActionTaskReference) {
    this.orderConfirmationRetrieveActionTaskReference = orderConfirmationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return orderConfirmationRetrieveActionTaskRecord
  **/

  public Object getOrderConfirmationRetrieveActionTaskRecord() {
    return orderConfirmationRetrieveActionTaskRecord;
  }

  public void setOrderConfirmationRetrieveActionTaskRecord(Object orderConfirmationRetrieveActionTaskRecord) {
    this.orderConfirmationRetrieveActionTaskRecord = orderConfirmationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return orderConfirmationRetrieveActionResponse
  **/

  public String getOrderConfirmationRetrieveActionResponse() {
    return orderConfirmationRetrieveActionResponse;
  }

  public void setOrderConfirmationRetrieveActionResponse(String orderConfirmationRetrieveActionResponse) {
    this.orderConfirmationRetrieveActionResponse = orderConfirmationRetrieveActionResponse;
  }


  /**
   * Get orderConfirmationInstanceReport
   * @return orderConfirmationInstanceReport
  **/

  public BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceReport getOrderConfirmationInstanceReport() {
    return orderConfirmationInstanceReport;
  }

  public void setOrderConfirmationInstanceReport(BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceReport orderConfirmationInstanceReport) {
    this.orderConfirmationInstanceReport = orderConfirmationInstanceReport;
  }


  /**
   * Get orderConfirmationInstanceAnalysis
   * @return orderConfirmationInstanceAnalysis
  **/

  public BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceAnalysis getOrderConfirmationInstanceAnalysis() {
    return orderConfirmationInstanceAnalysis;
  }

  public void setOrderConfirmationInstanceAnalysis(BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceAnalysis orderConfirmationInstanceAnalysis) {
    this.orderConfirmationInstanceAnalysis = orderConfirmationInstanceAnalysis;
  }


}

