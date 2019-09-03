package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceAnalysis
 */
public class CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceAnalysis   {
  private String paymentOrderProcedureInstanceAnalysisData = null;

  private String paymentOrderProcedureInstanceAnalysisReportType = null;

  private Object paymentOrderProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentOrderProcedureInstanceAnalysisData
  **/

  public String getPaymentOrderProcedureInstanceAnalysisData() {
    return paymentOrderProcedureInstanceAnalysisData;
  }

  public void setPaymentOrderProcedureInstanceAnalysisData(String paymentOrderProcedureInstanceAnalysisData) {
    this.paymentOrderProcedureInstanceAnalysisData = paymentOrderProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentOrderProcedureInstanceAnalysisReport
  **/

  public Object getPaymentOrderProcedureInstanceAnalysisReport() {
    return paymentOrderProcedureInstanceAnalysisReport;
  }

  public void setPaymentOrderProcedureInstanceAnalysisReport(Object paymentOrderProcedureInstanceAnalysisReport) {
    this.paymentOrderProcedureInstanceAnalysisReport = paymentOrderProcedureInstanceAnalysisReport;
  }


}

