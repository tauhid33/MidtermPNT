package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<String> codingLang = new ArrayList<String>();
		codingLang.add("C++");
		codingLang.add("Java");
		codingLang.add("Python");
		codingLang.add("C#");
		codingLang.add("Javascript");

		System.out.println("list of coding languages:\n"+codingLang);
		System.out.println("Peek into first language:\n" + codingLang.get(0));
		System.out.println("Remove first language:\n" + codingLang.remove(0));
		System.out.println("Retrieve Current language:\n"+codingLang);

		System.out.println("    For Each loop to Retrieve Data:     ");
		for (String lang : codingLang) {    //for each loop
			System.out.println(lang);
		}

		System.out.println("     While loop to Retrieve Data:      ");
		Iterator b = codingLang.iterator();		//while loop
		while (b.hasNext()) {
			System.out.println(b.next());
		}

		System.out.println("     sorting the languages           ");
		Collections.sort(codingLang); // sorts the language array list
		Iterator c= codingLang.iterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}


		// store the Arraylist in MYSQL database
	}

}
