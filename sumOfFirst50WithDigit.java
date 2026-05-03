//mathematcial solution
import java.util.*;
class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int digit = sc.nextInt();
            System.out.print(12250+(50*digit));
    }
}
//Simpler method but not efficient 
import java.util.*;
class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int digit = sc.nextInt();
            int sum = 0;
            int i = 1,count = 0;
            while(count<50){
                if(i%10==digit){
                    sum+=i;
                    count++;
                }
                i++;
            }
            System.out.print(sum);
    }
}
