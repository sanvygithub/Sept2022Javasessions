package Interface;

public class FortisHospital extends Medicals implements USMedical, UKMedical, IndiaMedicals {
	

	@Override
	public void emergencyServices() {
		System.out.println("emergency services");
		
	}

	@Override
	public void NeuroServices() {
		System.out.println("Neuro services");
		
	}

	@Override
	public void pysioServices() {
		System.out.println("pysio services");
		
	}
	@Override
	public void WHoCovidVaccine() {
		System.out.println("fh---covid vaccine");
		}
	
	@Override
	public void releaseFunds() {
	System.out.println("fh---Release funds");
		
	}
	//Method hiding
	public static void medicalTraning() {
		System.out.println("Medical training");
	}



	@Override
	public void GynaeoicServices() {
		System.out.println("Gynaeoic services");
		
	}

	@Override
	public void specialServices() {
		System.out.println("special services");
	}

	@Override
	public void ENTServices() {
		System.out.println("ENT services");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("ortho services");
	}

	@Override
	public void cardioServices() {
		System.out.println("cardio services");
		
	}

	@Override
	public void eyeServices() {
		System.out.println("eye services");
		
	}
	public void medicalTraining() {
		System.out.println("Fh--MedicalTraining");
	}

	@Override
	public void allServices() {
		System.out.println("All Services");
		
	}
	@Override
	public void medicalKit(){
		System.out.println("fh----medicalKit");
		
	}
	@Override
	public void emergecyMedicalKit(){
		System.out.println("fh----EmergencymedicalKit");
		
	}

	
	
	

}
