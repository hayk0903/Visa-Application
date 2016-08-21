package exam.visaapp.appform;
import java.util.Date;

import exam.visaapp.person.Person;

public abstract class VisaAppForm {
	
	
	private Person applicant;
	private Date entryDate;
	private Date exitDate;
	private boolean hadVisa;
	private String countryFrom;
	private String countryTo;
	private String firstEntryCountry;
	private int cash;
	private int id;
	private int days;
	
	public VisaAppForm(Person applicant, Date entryDate, Date exitDate, boolean hadVisa, String countryFrom,
			String countryTo, String firstEntryCountry, int cash) {
		this.applicant = applicant;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
		this.hadVisa = hadVisa;
		this.countryFrom = countryFrom;
		this.countryTo = countryTo;
		this.firstEntryCountry = firstEntryCountry;
		this.cash = cash;
	}
	
	public Person getApplicant() {
		return applicant;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public boolean hadVisa() {
		return hadVisa;
	}

	public String getCountryFrom() {
		return countryFrom;
	}

	public String getCountryTo() {
		return countryTo;
	}

	public String getFirstEntryCountry() {
		return firstEntryCountry;
	}
	
	public int getDays() {
		return days;
	}
	public int getCash() {
		return cash;
	}
}
