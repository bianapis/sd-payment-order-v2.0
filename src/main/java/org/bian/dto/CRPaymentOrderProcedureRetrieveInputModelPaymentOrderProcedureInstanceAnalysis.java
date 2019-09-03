package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceAnalysis
 */
public class CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceAnalysis   {
  private String paymentOrderProcedureInstanceAnalysisReference = null;

  private String paymentOrderProcedureInstanceAnalysisReportType = null;

  private String paymentOrderProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentOrderProcedureInstanceAnalysisReference
  **/

  public String getPaymentOrderProcedureInstanceAnalysisReference() {
    return paymentOrderProcedureInstanceAnalysisReference;
  }

  public void setPaymentOrderProcedureInstanceAnalysisReference(String paymentOrderProcedureInstanceAnalysisReference) {
    this.paymentOrderProcedureInstanceAnalysisReference = paymentOrderProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentOrderProcedureInstanceAnalysisReportType
  **/

  public String getPaymentOrderProcedureInstanceAnalysisReportType() {
    return paymentOrderProcedureInstanceAnalysisReportType;
  }

  public void setPaymentOrderProcedureInstanceAnalysisReportType(String paymentOrderProcedureInstanceAnalysisReportType) {
    this.paymentOrderProcedureInstanceAnalysisReportType = paymentOrderProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentOrderProcedureInstanceAnalysisParameters
  **/

  public String getPaymentOrderProcedureInstanceAnalysisParameters() {
    return paymentOrderProcedureInstanceAnalysisParameters;
  }

  public void setPaymentOrderProcedureInstanceAnalysisParameters(String paymentOrderProcedureInstanceAnalysisParameters) {
    this.paymentOrderProcedureInstanceAnalysisParameters = paymentOrderProcedureInstanceAnalysisParameters;
  }


}

