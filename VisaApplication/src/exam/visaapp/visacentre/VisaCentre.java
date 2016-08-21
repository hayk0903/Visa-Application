package exam.visaapp.visacentre;


import exam.visaapp.appform.BusinessVisaAppForm;
import exam.visaapp.appform.TouristVisaAppForm;
import exam.visaapp.appform.VisaAppForm;

public class VisaCentre implements VisaFormProcessor {
	
	private static final int minCash = 70;

	@Override
	public boolean applyToVisa(VisaAppForm visaApp) {
		if(allFieldsFilled(visaApp) && visaApp.getDays() * minCash <= visaApp.getCash()) return true;
		else return false;
	}
	
	
	private boolean allFieldsFilled(VisaAppForm businessForm){
		return false;}
	
	private boolean allFieldsFilled(BusinessVisaAppForm businessForm){
		if(businessForm.getApplicant() != null && businessForm.getCountryFrom() != "" && businessForm.getCountryTo() 
				!= "" && businessForm.getEntryDate() != null && businessForm.getExitDate() != null && businessForm.getInviterCompany()
				!= null && businessForm.getStayplace() != null && businessForm.hasInviteLetter() == true){
			return true;
		}else{
			return false;
		}
	}
		
		private boolean allFieldsFilled(TouristVisaAppForm touristForm){
			if(touristForm.getApplicant() != null && touristForm.getCountryFrom() != "" && touristForm.getCountryTo() 
					!= "" && touristForm.getEntryDate() != null && touristForm.getExitDate() != null && touristForm.getStayplace() != null ){
				return true;
			}else{
				return false;
			}
		}
		
	}







