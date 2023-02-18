
public class InternshipCoordinator {

	ApplicationForm af;
	Student s ;
	ExcelFile f;
	private void filterApplications ( ApplicationForm af) {
		if(af.frozen==true) {
			System.out.println("Added in the frozen applications folder.");
			}
	}
	

	
	
	private void viewTheDetailsOfApplication (ApplicationForm af) {}
	
	private void previewDocuments(ApplicationForm af) {
		af.uploadCertificateofObligation(af);
		af.uploadInsuranceEntryForm(af);
		af.uploadMandatoryInternshipCommitment(af);
		af.uploadInsuranceEntryForm(af);
	}
		
	
	
	
	
	private void ApprovetheInternShipApplication  (String FileName) {}
	private void RejectheInternShipApplication (String FileName) {
		s.comment="Your report was rejected";
	}
	private void RequestaRevisionforInternShipApplication (String FileName) {
		s.comment="Please re-write your report";
		
	}
	
	
	
	private static void viewTheExcelFile (String FileName) {}
	private void deleteTheExcelFile (String FileName) {}
	public void approveTheExcelFile (String FileName) {}
	
	
	private void createExcelFile() {
		f.createExcel(af, s);
	}
	
}
