import java.util.*;
public class wordfind{
  public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your string: ");
    String s=scan.nextLine();
    System.out.println("Your Inputted string: "+s);
    
    System.out.println("Enter search string: ");
    String b=scan.nextLine();
    
    int i=s.indexOf(b);
    System.out.println("String find by indexOf() method result: ");
    if(i>0)
    	System.out.println("found string: "+b);
    else
    	System.out.println("Not found: "+b);
        
    
    System.out.println("String find by contains() method result: ");
  	boolean z=s.contains(b);
    if(z)
    	System.out.println("found string: "+b);
    else
    	System.out.println("Not found: "+b);
  }
}
