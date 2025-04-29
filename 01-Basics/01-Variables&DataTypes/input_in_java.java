import java.util.*;

public class input_in_java {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//   individualy if we want to input a integer we need to use scn.nextInt()
//   int n = scn.nextInt();

//   same for a string in string we need to use scn.nextLine()
//   String name = scn.nextline();

//   but if we want to use int and string we need to use parse the string into int  
        String candidate = scn.nextLine();
        int marks = Integer.parseInt(scn.nextLine());
        System.out.println("Dear " + candidate + " this is your " + marks ); 


        
    }
}
