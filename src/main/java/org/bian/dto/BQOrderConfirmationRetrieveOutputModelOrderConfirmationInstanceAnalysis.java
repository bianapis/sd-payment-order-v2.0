package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceAnalysis
 */
public class BQOrderConfirmationRetrieveOutputModelOrderConfirmationInstanceAnalysis   {
  private Object orderConfirmationInstanceAnalysisRecord = null;

  private String orderConfirmationInstanceAnalysisReportType = null;

  private String orderConfirmationInstanceAnalysisParameters = null;

  private Object orderConfirmationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return orderConfirmationInstanceAnalysisRecord
  **/

  public Object getOrderConfirmationInstanceAnalysisRecord() {
    return orderConfirmationInstanceAnalysisRecord;
  }

  public void setOrderConfirmationInstanceAnalysisRecord(Object orderConfirmationInstanceAnalysisRecord) {
    this.orderConfirmationInstanceAnalysisRecord = orderConfirmationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return orderConfirmationInstanceAnalysisReportType
  **/

  public String getOrderConfirmationInstanceAnalysisReportType() {
    return orderConfirmationInstanceAnalysisReportType;
  }

  public void setOrderConfirmationInstanceAnalysisReportType(String orderConfirmationInstanceAnalysisReportType) {
    this.orderConfirmationInstanceAnalysisReportType = orderConfirmationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return orderConfirmationInstanceAnalysisParameters
  **/

  public String getOrderConfirmationInstanceAnalysisParameters() {
    return orderConfirmationInstanceAnalysisParameters;
  }

  public void setOrderConfirmationInstanceAnalysisParameters(String orderConfirmationInstanceAnalysisParameters) {
    this.orderConfirmationInstanceAnalysisParameters = orderConfirmationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return orderConfirmationInstanceAnalysisReport
  **/

  public Object getOrderConfirmationInstanceAnalysisReport() {
    return orderConfirmationInstanceAnalysisReport;
  }

  public void setOrderConfirmationInstanceAnalysisReport(Object orderConfirmationInstanceAnalysisReport) {
    this.orderConfirmationInstanceAnalysisReport = orderConfirmationInstanceAnalysisReport;
  }


}

