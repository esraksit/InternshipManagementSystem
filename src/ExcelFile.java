
public class ExcelFile<T> {

private Object[] columns = new Object[100];
private int []row;
private String fileName;
private String academicYear;
private String note;

ApplicationForm af;
Student st;


public void createExcel(ApplicationForm af,Student st) {
	fileName=af.InternshipCode+"_"+academicYear+"_"+af.InternshipPeriod;
	columns[0]= academicYear;
	columns[1]=af.InternshipCode;
	columns[2]=st.getStudentId();	
	columns[3]=st.getTR_Identity_Number();
	columns[4]=st.getName();
	columns[5]=st.getSurname();
	columns[6]=st.getSurname();
	columns[7]=st.getPhoneNumber();
	columns[8]=af.StudentsFaculty;
	columns[9]=af.StudentDepartment;
	columns[10]=af.MinorDoubleMajor;
	columns[11]= af.InternshipStatus;
	columns[12]=af.InternshipStartDate;
	columns[13]=af.InternshipEndDate;
	columns[14]=af.InternshipCompanyName;
	columns[15]=note;

	}
}
