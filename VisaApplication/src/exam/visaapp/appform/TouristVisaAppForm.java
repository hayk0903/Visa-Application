package exam.visaapp.appform;
import java.util.Date;

import exam.visaapp.company.StayPlace;
import exam.visaapp.person.Person;

public class TouristVisaAppForm extends VisaAppForm {
	
	private StayPlace stayplace;

	public TouristVisaAppForm(Person applicant, Date entryDate, Date exitDate, boolean hadVisa, String countryFrom,
			String countryTo, String firstEntryCountry, StayPlace stayplace, int cash) {
		super(applicant, entryDate, exitDate, hadVisa, countryFrom, countryTo, firstEntryCountry, cash);
		this.stayplace = stayplace;
	}

	public StayPlace getStayplace() {
		return stayplace;
	}
	
	
}
