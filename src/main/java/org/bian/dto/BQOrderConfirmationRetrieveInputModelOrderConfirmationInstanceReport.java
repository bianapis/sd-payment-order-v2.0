package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceReport
 */
public class BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceReport   {
  private String orderConfirmationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return orderConfirmationInstanceReportReference
  **/

  public String getOrderConfirmationInstanceReportReference() {
    return orderConfirmationInstanceReportReference;
  }

  public void setOrderConfirmationInstanceReportReference(String orderConfirmationInstanceReportReference) {
    this.orderConfirmationInstanceReportReference = orderConfirmationInstanceReportReference;
  }


}

