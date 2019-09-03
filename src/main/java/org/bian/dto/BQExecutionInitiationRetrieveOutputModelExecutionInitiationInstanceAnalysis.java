package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceAnalysis
 */
public class BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceAnalysis   {
  private Object executionInitiationInstanceAnalysisRecord = null;

  private String executionInitiationInstanceAnalysisReportType = null;

  private String executionInitiationInstanceAnalysisParameters = null;

  private Object executionInitiationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return executionInitiationInstanceAnalysisRecord
  **/

  public Object getExecutionInitiationInstanceAnalysisRecord() {
    return executionInitiationInstanceAnalysisRecord;
  }

  public void setExecutionInitiationInstanceAnalysisRecord(Object executionInitiationInstanceAnalysisRecord) {
    this.executionInitiationInstanceAnalysisRecord = executionInitiationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return executionInitiationInstanceAnalysisReportType
  **/

  public String getExecutionInitiationInstanceAnalysisReportType() {
    return executionInitiationInstanceAnalysisReportType;
  }

  public void setExecutionInitiationInstanceAnalysisReportType(String executionInitiationInstanceAnalysisReportType) {
    this.executionInitiationInstanceAnalysisReportType = executionInitiationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return executionInitiationInstanceAnalysisParameters
  **/

  public String getExecutionInitiationInstanceAnalysisParameters() {
    return executionInitiationInstanceAnalysisParameters;
  }

  public void setExecutionInitiationInstanceAnalysisParameters(String executionInitiationInstanceAnalysisParameters) {
    this.executionInitiationInstanceAnalysisParameters = executionInitiationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return executionInitiationInstanceAnalysisReport
  **/

  public Object getExecutionInitiationInstanceAnalysisReport() {
    return executionInitiationInstanceAnalysisReport;
  }

  public void setExecutionInitiationInstanceAnalysisReport(Object executionInitiationInstanceAnalysisReport) {
    this.executionInitiationInstanceAnalysisReport = executionInitiationInstanceAnalysisReport;
  }


}

