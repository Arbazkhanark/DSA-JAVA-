package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkRough {
    public static void main(String[] args) {
        
    }
}


class Linkk{
	public static void main(String[] args) {

		// Creating a LinkedList of Integer Type
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Inserting some Integer values to our LinkedList
		linkedList.add(5);
		linkedList.add(100);
		linkedList.add(41);
		linkedList.add(40);
		linkedList.add(7);

		// LinkedList after insertions : [5, 100, 41, 40, 7]

		// Calling the function to iterate our LinkedList
		iterateUsingIterator(linkedList);
	}

	public static void iterateUsingIterator(LinkedList<Integer> linkedList){

		System.out.print("Iterating the LinkedList using Iterator : ");


		Iterator it = linkedList.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}

	}
}
