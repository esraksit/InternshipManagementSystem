
public class ApplicationForm {
		
	public String InternshipCode ;
	public String InternshipPeriod ;
	public String StudentsFaculty;	
	public String StudentDepartment;	
	public String MinorDoubleMajor ;
	public String InternshipStartDate;
	public String InternshipEndDate;
	public String InternshipCompanyName;
	public String InternshipStatus;
	public boolean frozen=false;
	

	public String getStudentDepartment() {
		return StudentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		StudentDepartment = studentDepartment;
	}
	public boolean isFrozen() {
		return frozen;
	}
	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}
	
	public String getInternshipCode() {
		return InternshipCode;
	}
	public void setInternshipCode(String internshipCode) {
		InternshipCode = internshipCode;
	}
	public String getInternshipPeriod() {
		return InternshipPeriod;
	}
	public void setInternshipPeriod(String internshipPeriod) {
		InternshipPeriod = internshipPeriod;
	}
	public String getStudentsFaculty() {
		return StudentsFaculty;
	}
	public void setStudentsFaculty(String studentsFaculty) {
		StudentsFaculty = studentsFaculty;
	}
	public String getMinorDoubleMajor() {
		return MinorDoubleMajor;
	}
	public void setMinorDoubleMajor(String minorDoubleMajor) {
		MinorDoubleMajor = minorDoubleMajor;
	}
	public String getInternshipStartDate() {
		return InternshipStartDate;
	}
	public void setInternshipStartDate(String internshipStartDate) {
		InternshipStartDate = internshipStartDate;
	}
	public String getInternshipEndDate() {
		return InternshipEndDate;
	}
	public void setInternshipEndDate(String internshipEndDate) {
		InternshipEndDate = internshipEndDate;
	}
	public String getInternshipCompanyName() {
		return InternshipCompanyName;
	}
	public void setInternshipCompanyName(String internshipCompanyName) {
		InternshipCompanyName = internshipCompanyName;
	}
	public ApplicationForm(String internshipCode, String internshipPeriod, String studentsFaculty,
			String studentDepartment, String minorDoubleMajor, String internshipStartDate, String internshipEndDate,
			String internshipCompanyName) {
		super();
		InternshipCode = internshipCode;
		InternshipPeriod = internshipPeriod;
		StudentsFaculty = studentsFaculty;
		StudentDepartment = studentDepartment;
		MinorDoubleMajor = minorDoubleMajor;
		InternshipStartDate = internshipStartDate;
		InternshipEndDate = internshipEndDate;
		InternshipCompanyName = internshipCompanyName;
	}


	public static ApplicationForm uploadInternshipAcceptanceCertificate (ApplicationForm af) {
		return af;
	}
	public static ApplicationForm uploadInsuranceEntryForm (ApplicationForm af) {
		return af;
	}
	public static ApplicationForm uploadCertificateofObligation (ApplicationForm af) {
		return af;
	}
	public static ApplicationForm uploadMandatoryInternshipCommitment (ApplicationForm af) {
		return af;
	}

}
