package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceAnalysis;
import org.bian.dto.BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationRetrieveInputModel
 */
public class BQExecutionInitiationRetrieveInputModel   {
  private Object executionInitiationRetrieveActionTaskRecord = null;

  private String executionInitiationRetrieveActionRequest = null;

  private BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceReport executionInitiationInstanceReport = null;

  private BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceAnalysis executionInitiationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return executionInitiationRetrieveActionTaskRecord
  **/

  public Object getExecutionInitiationRetrieveActionTaskRecord() {
    return executionInitiationRetrieveActionTaskRecord;
  }

  public void setExecutionInitiationRetrieveActionTaskRecord(Object executionInitiationRetrieveActionTaskRecord) {
    this.executionInitiationRetrieveActionTaskRecord = executionInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return executionInitiationRetrieveActionRequest
  **/

  public String getExecutionInitiationRetrieveActionRequest() {
    return executionInitiationRetrieveActionRequest;
  }

  public void setExecutionInitiationRetrieveActionRequest(String executionInitiationRetrieveActionRequest) {
    this.executionInitiationRetrieveActionRequest = executionInitiationRetrieveActionRequest;
  }


  /**
   * Get executionInitiationInstanceReport
   * @return executionInitiationInstanceReport
  **/

  public BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceReport getExecutionInitiationInstanceReport() {
    return executionInitiationInstanceReport;
  }

  public void setExecutionInitiationInstanceReport(BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceReport executionInitiationInstanceReport) {
    this.executionInitiationInstanceReport = executionInitiationInstanceReport;
  }


  /**
   * Get executionInitiationInstanceAnalysis
   * @return executionInitiationInstanceAnalysis
  **/

  public BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceAnalysis getExecutionInitiationInstanceAnalysis() {
    return executionInitiationInstanceAnalysis;
  }

  public void setExecutionInitiationInstanceAnalysis(BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceAnalysis executionInitiationInstanceAnalysis) {
    this.executionInitiationInstanceAnalysis = executionInitiationInstanceAnalysis;
  }


}

