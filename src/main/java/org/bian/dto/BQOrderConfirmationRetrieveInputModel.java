package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceAnalysis;
import org.bian.dto.BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOrderConfirmationRetrieveInputModel
 */
public class BQOrderConfirmationRetrieveInputModel   {
  private Object orderConfirmationRetrieveActionTaskRecord = null;

  private String orderConfirmationRetrieveActionRequest = null;

  private BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceReport orderConfirmationInstanceReport = null;

  private BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceAnalysis orderConfirmationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return orderConfirmationRetrieveActionRequest
  **/

  public String getOrderConfirmationRetrieveActionRequest() {
    return orderConfirmationRetrieveActionRequest;
  }

  public void setOrderConfirmationRetrieveActionRequest(String orderConfirmationRetrieveActionRequest) {
    this.orderConfirmationRetrieveActionRequest = orderConfirmationRetrieveActionRequest;
  }


  /**
   * Get orderConfirmationInstanceReport
   * @return orderConfirmationInstanceReport
  **/

  public BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceReport getOrderConfirmationInstanceReport() {
    return orderConfirmationInstanceReport;
  }

  public void setOrderConfirmationInstanceReport(BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceReport orderConfirmationInstanceReport) {
    this.orderConfirmationInstanceReport = orderConfirmationInstanceReport;
  }


  /**
   * Get orderConfirmationInstanceAnalysis
   * @return orderConfirmationInstanceAnalysis
  **/

  public BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceAnalysis getOrderConfirmationInstanceAnalysis() {
    return orderConfirmationInstanceAnalysis;
  }

  public void setOrderConfirmationInstanceAnalysis(BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceAnalysis orderConfirmationInstanceAnalysis) {
    this.orderConfirmationInstanceAnalysis = orderConfirmationInstanceAnalysis;
  }


}

