package javasessions;

import java.util.Arrays;

public class ArrayMethod {
	// AC:
	// WAF:
	// getEmployeeDevices()
	// input param: employeeName(String)
	// return: all the devices -- Array -- devicename(string)

	public String[] getEmployeeDevices(String empName) {
		System.out.println("get emplyee devices");

		// String br[]=null;

		if (empName.equals("Kishore")) {
			String br[] = { "Macbook", "iphone", "ipad", "keyboard", "Mouse" };
			return br;

		} else if (empName.equals("Sandy")) {
			String br[] = { "Macbook", "iphone", "ipad" };
			return br;

		} else if (empName.equals("Nidhi")) {
			String br[] = { "Macbook" };
			return br;

		} else {
			System.out.println("employee not found:" + empName);
			String br[] = {};
			return br;

		}

	}

	public static void main(String[] args) {
		ArrayMethod t = new ArrayMethod();
		String K[] = t.getEmployeeDevices("Sandy");
		System.out.println(Arrays.toString(K));
		System.out.println(K.length);

	}

}
