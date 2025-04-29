import java.util.*;

public class circle_area {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        float rad = scn.nextFloat();
        float area = 3.14f * rad *rad;
        System.out.println(area);
        scn.close(); 
    }
}
