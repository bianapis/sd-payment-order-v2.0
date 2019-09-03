package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceReportRecord
 */
public class CRPaymentOrderProcedureRetrieveOutputModelPaymentOrderProcedureInstanceReportRecord   {
  private String paymentOrderProcedureInstanceReportData = null;

  private String paymentOrderProcedureInstanceReportType = null;

  private Object paymentOrderProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentOrderProcedureInstanceReportData
  **/

  public String getPaymentOrderProcedureInstanceReportData() {
    return paymentOrderProcedureInstanceReportData;
  }

  public void setPaymentOrderProcedureInstanceReportData(String paymentOrderProcedureInstanceReportData) {
    this.paymentOrderProcedureInstanceReportData = paymentOrderProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentOrderProcedureInstanceReportType
  **/

  public String getPaymentOrderProcedureInstanceReportType() {
    return paymentOrderProcedureInstanceReportType;
  }

  public void setPaymentOrderProcedureInstanceReportType(String paymentOrderProcedureInstanceReportType) {
    this.paymentOrderProcedureInstanceReportType = paymentOrderProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentOrderProcedureInstanceReport
  **/

  public Object getPaymentOrderProcedureInstanceReport() {
    return paymentOrderProcedureInstanceReport;
  }

  public void setPaymentOrderProcedureInstanceReport(Object paymentOrderProcedureInstanceReport) {
    this.paymentOrderProcedureInstanceReport = paymentOrderProcedureInstanceReport;
  }


}

