package Interface;

public class TestFortis {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.medicalTraining();
		System.out.println(USMedical.bill_amount);
		System.out.println(FortisHospital.bill_amount);
		System.out.println("---------------------------");

		fh.Medicines();
		fh.WHoCovidVaccine();
		fh.releaseFunds();

		// all methods available in IndiaMedicals interface and common method can be
		// called/accessed for(IndiaMedicals i=new FortisHospital();).
		// individual methods cannot be called:Type check will be failed
		
		
		//System.out.println("-----------------------------");
		//IndiaMedicals i = new FortisHospital();
		//i.emergencyServices();
		//i.NeuroServices();
		//i.pysioServices();
		//i.allServices();
		
		UNHG ug=new FortisHospital();
		ug.releaseFunds();
		//ug is grandparent interface reference variable
		UKMedical.medicalTraning();
		FortisHospital.medicalTraning();
		fh.medicalKit();
		fh.emergecyMedicalKit();
		UKMedical uk= new FortisHospital();
		uk.allServices();
		

	}

}
