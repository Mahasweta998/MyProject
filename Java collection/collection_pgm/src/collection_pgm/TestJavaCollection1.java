package collection_pgm;
import java.util.*;  



/*ArrayList class maintains the insertion order and is non-synchronized. 
The elements stored in the ArrayList class can be randomly accessed. Consider the following example.
*/

//A sample example using  arraylist
public class TestJavaCollection1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		

	}

}
