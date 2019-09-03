/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PaymentOrderApiServiceImpl implements PaymentOrderApiService {

	public SDPaymentOrderActivateOutputModel activate(SDPaymentOrderActivateInputModel request){
		return JsonReader.read("activate-SDPaymentOrderActivateOutputModel.json",new TypeReference<SDPaymentOrderActivateOutputModel>(){});
	}
	
	public SDPaymentOrderConfigureOutputModel configure(String sdReferenceId, SDPaymentOrderConfigureInputModel request){
		return JsonReader.read("configure-SDPaymentOrderConfigureOutputModel.json",new TypeReference<SDPaymentOrderConfigureOutputModel>(){});
	}
	
	public BQExecutionInitiationControlOutputModel controlExecutioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionInitiationControlInputModel request){
		return JsonReader.read("control-BQExecutionInitiationControlOutputModel.json",new TypeReference<BQExecutionInitiationControlOutputModel>(){});
	}
	
	public SDPaymentOrderFeedbackOutputModel feedback(String sdReferenceId, SDPaymentOrderFeedbackInputModel request){
		return JsonReader.read("feedback-SDPaymentOrderFeedbackOutputModel.json",new TypeReference<SDPaymentOrderFeedbackOutputModel>(){});
	}
	
	public CRPaymentOrderProcedureInitiateOutputModel initiate(String sdReferenceId, CRPaymentOrderProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRPaymentOrderProcedureInitiateOutputModel.json",new TypeReference<CRPaymentOrderProcedureInitiateOutputModel>(){});
	}
	
	public CRPaymentOrderProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPaymentOrderProcedureRetrieveOutputModel.json",new TypeReference<CRPaymentOrderProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQExecutionInitiationRetrieveOutputModel retrieveExecutioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQExecutionInitiationRetrieveOutputModel.json",new TypeReference<BQExecutionInitiationRetrieveOutputModel>(){});
	}
	
	public BQOrderConfirmationRetrieveOutputModel retrieveOrderconfirmation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOrderConfirmationRetrieveOutputModel.json",new TypeReference<BQOrderConfirmationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPaymentOrderRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPaymentOrderRetrieveOutputModel.json",new TypeReference<SDPaymentOrderRetrieveOutputModel>(){});
	}
	
	public CRPaymentOrderProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPaymentOrderProcedureUpdateInputModel request){
		return JsonReader.read("update-CRPaymentOrderProcedureUpdateOutputModel.json",new TypeReference<CRPaymentOrderProcedureUpdateOutputModel>(){});
	}
	
}
