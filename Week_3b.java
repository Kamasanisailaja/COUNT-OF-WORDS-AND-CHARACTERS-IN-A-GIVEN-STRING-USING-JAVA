
import java.util.Scanner; 
public class Week_3b {

public static void main(String[] args)
 { 
    int i,count=1;
    String st;
    Scanner s=new Scanner(System.in);
     System.out.println("Enter the string :"); 
     st=s.nextLine();
    System.out.println(); 
for(i=0;i<st.length()-1;i++)
{

if((st.charAt(i)==' ')&&(st.charAt(i+1)!=' ')) 
count++;
}

System.out.println("Number of words in the entered string is"+count);
System.out.println("Number of characters in the entered string is"+st.length());
}
}



