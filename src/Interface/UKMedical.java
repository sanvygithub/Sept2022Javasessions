package Interface;

public interface UKMedical {

	public void GynaeoicServices();

	public void specialServices();

	public void ENTServices();
	
	public void allServices();
	
	public static void medicalTraning() {
		System.out.println("fh.Medical training");
	}
	default void emergecyMedicalKit(){
		System.out.println("fh----EmergencymedicalKit");
		
	}
}
