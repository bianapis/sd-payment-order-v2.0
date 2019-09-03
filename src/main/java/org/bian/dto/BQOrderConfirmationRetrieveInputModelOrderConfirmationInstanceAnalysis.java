package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceAnalysis
 */
public class BQOrderConfirmationRetrieveInputModelOrderConfirmationInstanceAnalysis   {
  private String orderConfirmationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return orderConfirmationInstanceAnalysisReference
  **/

  public String getOrderConfirmationInstanceAnalysisReference() {
    return orderConfirmationInstanceAnalysisReference;
  }

  public void setOrderConfirmationInstanceAnalysisReference(String orderConfirmationInstanceAnalysisReference) {
    this.orderConfirmationInstanceAnalysisReference = orderConfirmationInstanceAnalysisReference;
  }


}

