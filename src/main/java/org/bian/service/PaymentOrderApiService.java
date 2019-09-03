/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PaymentOrderApiService {

	SDPaymentOrderActivateOutputModel activate(SDPaymentOrderActivateInputModel request);
	
	SDPaymentOrderConfigureOutputModel configure(String sdReferenceId, SDPaymentOrderConfigureInputModel request);
	
	BQExecutionInitiationControlOutputModel controlExecutioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionInitiationControlInputModel request);
	
	SDPaymentOrderFeedbackOutputModel feedback(String sdReferenceId, SDPaymentOrderFeedbackInputModel request);
	
	CRPaymentOrderProcedureInitiateOutputModel initiate(String sdReferenceId, CRPaymentOrderProcedureInitiateInputModel request);
	
	CRPaymentOrderProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQExecutionInitiationRetrieveOutputModel retrieveExecutioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOrderConfirmationRetrieveOutputModel retrieveOrderconfirmation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPaymentOrderRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPaymentOrderProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPaymentOrderProcedureUpdateInputModel request);
	
}
