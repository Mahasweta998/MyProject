package collection_pgm;
import java.util.*; 
public class TestJavaCollection5 {

	public static void main(String[] args) {
		
		//to sort string objects in reverse order
		
	 
		  ArrayList<String> al=new ArrayList<String>();  
		        al.add("Viru");    
		        al.add("Saurav");    
		        al.add("Mukesh");    
		        al.add("Tahir");   
		          
		        Collections.sort(al,Collections.reverseOrder());  
		        Iterator i=al.iterator();  
		        while(i.hasNext())  
		        {  
		            System.out.println(i.next());  
		        }  
		}  
		 
		
		
		
		

	}


