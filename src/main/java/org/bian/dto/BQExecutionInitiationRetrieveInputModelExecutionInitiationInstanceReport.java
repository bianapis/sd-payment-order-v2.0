package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceReport
 */
public class BQExecutionInitiationRetrieveInputModelExecutionInitiationInstanceReport   {
  private String executionInitiationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return executionInitiationInstanceReportReference
  **/

  public String getExecutionInitiationInstanceReportReference() {
    return executionInitiationInstanceReportReference;
  }

  public void setExecutionInitiationInstanceReportReference(String executionInitiationInstanceReportReference) {
    this.executionInitiationInstanceReportReference = executionInitiationInstanceReportReference;
  }


}

