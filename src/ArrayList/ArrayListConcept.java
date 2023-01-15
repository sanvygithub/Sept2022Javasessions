package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);//0
		ar.add(12.33);//1
		ar.add("java");//2
		ar.add(true);//3
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<String>st=new ArrayList<String>();
		st.add("Sandhya");
		st.add("Kishore");
		st.add("Swathi");
		st.add("Krishna");
		
		System.out.println(st.size());
		System.out.println(st);
		System.out.println("-----------------------");
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
		System.out.println("-----------------------");
		
		for(Object e :st) {
			System.out.println(e);
			}
		System.out.println("-------------");
		ArrayList<Integer>MarksList=new ArrayList<Integer>();
		MarksList.add(100);
		MarksList.add(101);
	
		System.out.println(MarksList.size());
		System.out.println(MarksList.get(1));
		
		ArrayList<Object>empinfo=new ArrayList<Object>();
		empinfo.add("Tom");
		empinfo.add(100);
		empinfo.add(15.88);
		empinfo.add(true);
		
		System.out.println(empinfo.size());
		System.out.println(empinfo);
		
		for(Object emp : empinfo) {
			System.out.println(emp);
			if(emp.equals(15.88)) {
				System.out.println("eligible for hike");
			}
			
		}
		

	}
	

}
