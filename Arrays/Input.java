package Arrays;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        int marks[]= new int[100];
        Scanner sc =new Scanner (System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();

        System.out.println("phy:"+marks[0]);
        System.out.println("chy:"+marks[1]);
        System.out.println("math:"+marks[2]);
        System.out.println("eng:"+marks[3]);
    }
    
}
