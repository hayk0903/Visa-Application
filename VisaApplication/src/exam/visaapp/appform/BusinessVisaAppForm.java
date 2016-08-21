package exam.visaapp.appform;

import java.util.Date;

import exam.visaapp.company.Organisation;
import exam.visaapp.company.StayPlace;
import exam.visaapp.person.Person;

public class BusinessVisaAppForm extends VisaAppForm {
	
	private Organisation inviterCompany;
	private StayPlace stayplace;
	private String purpose;
	private boolean hasInviteLetter;
	
	public BusinessVisaAppForm(Person applicant, Date entryDate, Date exitDate, boolean hadVisa, String countryFrom,
			String countryTo, String firstEntryCountry, Organisation inviterCompany, StayPlace stayplace,
			String purpose, int cash) {
		super(applicant, entryDate, exitDate, hadVisa, countryFrom, countryTo, firstEntryCountry, cash);
		this.inviterCompany = inviterCompany;
		this.stayplace = stayplace;
		this.purpose = purpose;
	}

	public Organisation getInviterCompany() {
		return inviterCompany;
	}

	public StayPlace getStayplace() {
		return stayplace;
	}

	public String getPurpose() {
		return purpose;
	}

	public boolean hasInviteLetter() {
		return hasInviteLetter;
	}
	
	
	

}
