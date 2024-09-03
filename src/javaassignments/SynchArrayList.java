package javaassignments;

import java.util.concurrent.CopyOnWriteArrayList;

public class SynchArrayList {

	public static void main(String[] args) {

//		List<String> num = Collections.synchronizedList(new ArrayList<>());
//
//		num.add("Shruti");
//		num.add("John");
//		num.add("peter");
//		num.add("Peter");
//
//		synchronized (num) {
//
//			Iterator<String> it = num.iterator();
//			
//			while(it.hasNext()) {
//				System.out.println(it.next());
//			}
//		}

		CopyOnWriteArrayList<String> cp = new CopyOnWriteArrayList<String>();
		cp.add("Kiran");
		cp.add("Aarya");
		cp.add("Mukta");
		
		System.out.println(cp.get(0));

	}
}
