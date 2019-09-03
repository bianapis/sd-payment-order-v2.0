package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceReport
 */
public class BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceReport   {
  private Object executionInitiationInstanceReportRecord = null;

  private String executionInitiationInstanceReportType = null;

  private String executionInitiationInstanceReportParameters = null;

  private Object executionInitiationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return executionInitiationInstanceReportRecord
  **/

  public Object getExecutionInitiationInstanceReportRecord() {
    return executionInitiationInstanceReportRecord;
  }

  public void setExecutionInitiationInstanceReportRecord(Object executionInitiationInstanceReportRecord) {
    this.executionInitiationInstanceReportRecord = executionInitiationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return executionInitiationInstanceReportType
  **/

  public String getExecutionInitiationInstanceReportType() {
    return executionInitiationInstanceReportType;
  }

  public void setExecutionInitiationInstanceReportType(String executionInitiationInstanceReportType) {
    this.executionInitiationInstanceReportType = executionInitiationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return executionInitiationInstanceReportParameters
  **/

  public String getExecutionInitiationInstanceReportParameters() {
    return executionInitiationInstanceReportParameters;
  }

  public void setExecutionInitiationInstanceReportParameters(String executionInitiationInstanceReportParameters) {
    this.executionInitiationInstanceReportParameters = executionInitiationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return executionInitiationInstanceReport
  **/

  public Object getExecutionInitiationInstanceReport() {
    return executionInitiationInstanceReport;
  }

  public void setExecutionInitiationInstanceReport(Object executionInitiationInstanceReport) {
    this.executionInitiationInstanceReport = executionInitiationInstanceReport;
  }


}

