package Collection;
import java.util.*;
public class Array_vs_Linked {
    public static void main(String args[]) {
        int n;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter type");
            System.out.println("1. String");
            System.out.println("2. Integer");
            n = sc.nextInt();
            if (n == 1) {
                ArrayList<String> list = new ArrayList<String>();
                System.out.println("Enter size");
                int s = sc.nextInt();
                for (int i = 0; i < s; i++) {
                    list.add(sc.next());
                }
                System.out.println(list);
            } else if (n == 2) {
                ArrayList<Integer> data = new ArrayList<Integer>();
                System.out.println("Enter size");
                int s = sc.nextInt();
                for (int i = 0; i < s; i++) {
                    data.add(sc.nextInt());
                }
//			for(Integer num:data) {
//				System.out.println(num);
//			}
                System.out.println(data);
            } else {
                System.out.println("Invalid");
            }
        } while (n != 0);

    }
}
