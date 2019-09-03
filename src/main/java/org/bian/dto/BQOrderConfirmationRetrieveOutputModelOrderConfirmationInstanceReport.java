package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceReport
 */
public class BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceReport   {
  private Object orderConfirmationInstanceReportRecord = null;

  private String orderConfirmationInstanceReportType = null;

  private String orderConfirmationInstanceReportParameters = null;

  private Object orderConfirmationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return orderConfirmationInstanceReportRecord
  **/

  public Object getOrderConfirmationInstanceReportRecord() {
    return orderConfirmationInstanceReportRecord;
  }

  public void setOrderConfirmationInstanceReportRecord(Object orderConfirmationInstanceReportRecord) {
    this.orderConfirmationInstanceReportRecord = orderConfirmationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return orderConfirmationInstanceReportType
  **/

  public String getOrderConfirmationInstanceReportType() {
    return orderConfirmationInstanceReportType;
  }

  public void setOrderConfirmationInstanceReportType(String orderConfirmationInstanceReportType) {
    this.orderConfirmationInstanceReportType = orderConfirmationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return orderConfirmationInstanceReportParameters
  **/

  public String getOrderConfirmationInstanceReportParameters() {
    return orderConfirmationInstanceReportParameters;
  }

  public void setOrderConfirmationInstanceReportParameters(String orderConfirmationInstanceReportParameters) {
    this.orderConfirmationInstanceReportParameters = orderConfirmationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return orderConfirmationInstanceReport
  **/

  public Object getOrderConfirmationInstanceReport() {
    return orderConfirmationInstanceReport;
  }

  public void setOrderConfirmationInstanceReport(Object orderConfirmationInstanceReport) {
    this.orderConfirmationInstanceReport = orderConfirmationInstanceReport;
  }


}

