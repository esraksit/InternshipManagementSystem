
public class Student{
			
	private int StudentId;
	private String Name;
	private String Surname;
	private String Email;
	private int TR_Identity_Number; 
	private int phoneNumber;
	private String Password;
	public String comment;
	ApplicationForm af;
	
	
	
	
	public int getStudentId() {
		return StudentId;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getSurname() {
		return Surname;
	}
	
	public int getTR_Identity_Number() {
		return TR_Identity_Number;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private void register(int StudentId,String Name,String Surname,String Email,int TR_Identity_Number,int phoneNumber,String Password) {
		this.StudentId=StudentId;
		this.Name=Name;
		this.Surname=Surname;
		this.Email=Email;
		this.TR_Identity_Number=TR_Identity_Number;
		this.phoneNumber=phoneNumber;
		this.Password=Password;
		
	}
	private void updateUserInfo(int StudentId,String Name,String Surname,String Email,int TR_Identity_Number,int phoneNumber,String Password) {}
	private void resetPassword(String newPassword) {
		this.Password=newPassword;
		
	}
	private void downloadInternshipObligationDocument(ApplicationForm af) {}
	private void fillInTheInternshipApplicationForm () {
		af = new ApplicationForm("SENG 200","Summer","Faculty of Engineering","Software Eng.","No","12/07/2000","12/08/2000","Tübitak");	
	}
	private void listtheInternshipApplications () {
		
	}
	private void updateAnInternshipApplication () {
		if(af.frozen==false) {
		af.MinorDoubleMajor="yes";}
	}
	private void deleteAnInternshipApplication () {
		if(af.frozen==false) {
			System.out.println("Deleted");}
	}
	
	public void freezeAnnternshipApplication () {
		af.frozen=true;
	}

}
