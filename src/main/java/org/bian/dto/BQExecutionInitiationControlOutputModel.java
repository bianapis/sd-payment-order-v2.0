package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationControlOutputModel
 */
public class BQExecutionInitiationControlOutputModel   {
  private String executionInitiationControlActionTaskReference = null;

  private Object executionInitiationControlActionTaskRecord = null;

  private String executionInitiationControlActionResponse = null;

  private String executionInitiationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution Initiation instance control processing service call 
   * @return executionInitiationControlActionTaskReference
  **/

  public String getExecutionInitiationControlActionTaskReference() {
    return executionInitiationControlActionTaskReference;
  }

  public void setExecutionInitiationControlActionTaskReference(String executionInitiationControlActionTaskReference) {
    this.executionInitiationControlActionTaskReference = executionInitiationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return executionInitiationControlActionTaskRecord
  **/

  public Object getExecutionInitiationControlActionTaskRecord() {
    return executionInitiationControlActionTaskRecord;
  }

  public void setExecutionInitiationControlActionTaskRecord(Object executionInitiationControlActionTaskRecord) {
    this.executionInitiationControlActionTaskRecord = executionInitiationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return executionInitiationControlActionResponse
  **/

  public String getExecutionInitiationControlActionResponse() {
    return executionInitiationControlActionResponse;
  }

  public void setExecutionInitiationControlActionResponse(String executionInitiationControlActionResponse) {
    this.executionInitiationControlActionResponse = executionInitiationControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Execution Initiation instance (e.g. initialised, pending, active) 
   * @return executionInitiationInstanceStatus
  **/

  public String getExecutionInitiationInstanceStatus() {
    return executionInitiationInstanceStatus;
  }

  public void setExecutionInitiationInstanceStatus(String executionInitiationInstanceStatus) {
    this.executionInitiationInstanceStatus = executionInitiationInstanceStatus;
  }


}

