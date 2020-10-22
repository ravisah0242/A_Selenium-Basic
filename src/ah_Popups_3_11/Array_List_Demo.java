package ah_Popups_3_11;

import java.util.ArrayList;

public class Array_List_Demo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi");
		al.add("Pawan");
		al.add("Pusha");
		al.add("Richa");
		al.add("Dolly");
		al.add("Ravi");
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(4));
		
		//ArrayList<String> al1=new ArrayList<>();
		//
		ArrayList<String> al1=new ArrayList<>(al);
		al1.add("Ravi");
		al1.add("Pawan");
		al1.add("Amit");
		al1.add("kk");
		al1.add("chote");
		al1.add(null);
		System.out.println(al1);
		System.out.println(al1.size());
		System.out.println(al1.get(4));
		
		/*al1.addAll(al);
		System.out.println(al1);
		System.out.println(al1.size());*/
	}

}
