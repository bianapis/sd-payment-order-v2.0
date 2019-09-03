package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceAnalysis;
import org.bian.dto.BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceRecord;
import org.bian.dto.BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceReport;
import org.bian.dto.BQExecutionInitiationRetrieveOutputModelPaymentOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiationRetrieveOutputModel
 */
public class BQExecutionInitiationRetrieveOutputModel   {
  private BQExecutionInitiationRetrieveOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord = null;

  private BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceRecord executionInitiationInstanceRecord = null;

  private String executionInitiationRetrieveActionTaskReference = null;

  private Object executionInitiationRetrieveActionTaskRecord = null;

  private String executionInitiationRetrieveActionResponse = null;

  private BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceReport executionInitiationInstanceReport = null;

  private BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceAnalysis executionInitiationInstanceAnalysis = null;


  /**
   * Get paymentOrderProcedureInstanceRecord
   * @return paymentOrderProcedureInstanceRecord
  **/

  public BQExecutionInitiationRetrieveOutputModelPaymentOrderProcedureInstanceRecord getPaymentOrderProcedureInstanceRecord() {
    return paymentOrderProcedureInstanceRecord;
  }

  public void setPaymentOrderProcedureInstanceRecord(BQExecutionInitiationRetrieveOutputModelPaymentOrderProcedureInstanceRecord paymentOrderProcedureInstanceRecord) {
    this.paymentOrderProcedureInstanceRecord = paymentOrderProcedureInstanceRecord;
  }


  /**
   * Get executionInitiationInstanceRecord
   * @return executionInitiationInstanceRecord
  **/

  public BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceRecord getExecutionInitiationInstanceRecord() {
    return executionInitiationInstanceRecord;
  }

  public void setExecutionInitiationInstanceRecord(BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceRecord executionInitiationInstanceRecord) {
    this.executionInitiationInstanceRecord = executionInitiationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution Initiation instance retrieve service call 
   * @return executionInitiationRetrieveActionTaskReference
  **/

  public String getExecutionInitiationRetrieveActionTaskReference() {
    return executionInitiationRetrieveActionTaskReference;
  }

  public void setExecutionInitiationRetrieveActionTaskReference(String executionInitiationRetrieveActionTaskReference) {
    this.executionInitiationRetrieveActionTaskReference = executionInitiationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return executionInitiationRetrieveActionResponse
  **/

  public String getExecutionInitiationRetrieveActionResponse() {
    return executionInitiationRetrieveActionResponse;
  }

  public void setExecutionInitiationRetrieveActionResponse(String executionInitiationRetrieveActionResponse) {
    this.executionInitiationRetrieveActionResponse = executionInitiationRetrieveActionResponse;
  }


  /**
   * Get executionInitiationInstanceReport
   * @return executionInitiationInstanceReport
  **/

  public BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceReport getExecutionInitiationInstanceReport() {
    return executionInitiationInstanceReport;
  }

  public void setExecutionInitiationInstanceReport(BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceReport executionInitiationInstanceReport) {
    this.executionInitiationInstanceReport = executionInitiationInstanceReport;
  }


  /**
   * Get executionInitiationInstanceAnalysis
   * @return executionInitiationInstanceAnalysis
  **/

  public BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceAnalysis getExecutionInitiationInstanceAnalysis() {
    return executionInitiationInstanceAnalysis;
  }

  public void setExecutionInitiationInstanceAnalysis(BQExecutionInitiationRetrieveOutputModelExecutionInitiationInstanceAnalysis executionInitiationInstanceAnalysis) {
    this.executionInitiationInstanceAnalysis = executionInitiationInstanceAnalysis;
  }


}

