package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer>MarksList=new ArrayList<Integer>();
		System.out.println(MarksList.size());
		
		MarksList.add(100);
		MarksList.add(101);
		MarksList.add(102);
		MarksList.add(103);
		MarksList.add(104);
		
		
		System.out.println(MarksList.size());
		//MarksList.add(null);
		MarksList.add(1000);
		System.out.println(MarksList.size());
		System.out.println(MarksList.get(5));
		System.out.println(MarksList);
		
		MarksList.remove(3);
		System.out.println(MarksList);
		MarksList.add(0, 1500);
		System.out.println(MarksList);
		
		Collections.sort(MarksList);
		System.out.println(MarksList);
		
		Collections.swap(MarksList, 0, 1);
		System.out.println(MarksList);
		
		ArrayList<String> stNames = new ArrayList<String>();
		stNames.add("Tom");
		stNames.add("Peter");
		stNames.add("Ravi");
		stNames.add("Naveen");
		stNames.add("Mukta");
		
		//Collections.sort(stNames);
		System.out.println(stNames);
		
		ArrayList<String> subjectNames = new ArrayList<String>();
		subjectNames.add("Java");
		subjectNames.add("Py");
		subjectNames.add("Ruby");
		subjectNames.add("C#");
		subjectNames.add("GO");
		
		stNames.addAll(subjectNames);
		System.out.println(stNames);
		
		
		
		
		
		//Top Casting
		List<String> ar=new ArrayList<String>();
		
		List<String> CurrList=Arrays.asList("INR","USD","JPY","EUR");
		System.out.println(CurrList.size());
		System.out.println(CurrList.get(1));
		System.out.println(CurrList);
		
		String[]Lang= {"Java","Python","Ruby","C#"};
		
		List<String>Langlist=Arrays.asList(Lang);
		System.out.println(Langlist);
		System.out.println(Langlist.size());
		
		
		
		
		
		


	}

}
