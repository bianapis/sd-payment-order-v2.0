package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceReportRecord
 */
public class CRPaymentOrderProcedureRetrieveInputModelPaymentOrderProcedureInstanceReportRecord   {
  private String paymentOrderProcedureInstanceReportReference = null;

  private String paymentOrderProcedureInstanceReportType = null;

  private String paymentOrderProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return paymentOrderProcedureInstanceReportReference
  **/

  public String getPaymentOrderProcedureInstanceReportReference() {
    return paymentOrderProcedureInstanceReportReference;
  }

  public void setPaymentOrderProcedureInstanceReportReference(String paymentOrderProcedureInstanceReportReference) {
    this.paymentOrderProcedureInstanceReportReference = paymentOrderProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentOrderProcedureInstanceReportParameters
  **/

  public String getPaymentOrderProcedureInstanceReportParameters() {
    return paymentOrderProcedureInstanceReportParameters;
  }

  public void setPaymentOrderProcedureInstanceReportParameters(String paymentOrderProcedureInstanceReportParameters) {
    this.paymentOrderProcedureInstanceReportParameters = paymentOrderProcedureInstanceReportParameters;
  }


}

