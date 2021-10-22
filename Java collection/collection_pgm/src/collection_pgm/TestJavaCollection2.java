package collection_pgm;
import java.util.*;  

public class TestJavaCollection2 {

	public static void main(String[] args) {
		
/*The stack contains all of the methods of Vector class and also provides 
its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.
*/
		// A sample example using  stack
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		

	}

}
