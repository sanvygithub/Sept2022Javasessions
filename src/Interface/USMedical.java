package Interface;

public interface USMedical extends WHO,UNHG {
	//Vars in interface are static and final by default.
	//vars can be accessed using Interface name or implemented class name(here Fortis)
	int bill_amount=100;
	
	public void orthoServices();
	
	public void cardioServices();

	public void eyeServices();

	public void allServices();
	
	default void medicalKit(){
		System.out.println("fh----medicalKit");
		
	}
	

}
