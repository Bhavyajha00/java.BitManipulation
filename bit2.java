import java.util.Scanner;

public class bit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        
        //oper =1, set oper = 0 , clear
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        if (oper == 1){
          //set
        int newNumber = bitmask | n;
         System.out.println(newNumber);
        } else {
            // clear
            int newbitmask = ~(bitmask);
            int newnumber = bitmask & n;
            System.out.println(newnumber);
        }

    }
}
