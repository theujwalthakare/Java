package Collection;

import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter size : ");
        n = sc.nextInt();
        System.out.println("Enter String :");
        for(int i=0;i<n;i++){
            System.out.println(list.add(sc.next()));
        }
        System.out.println("Entered List :) ");
        for(String li :list){
            System.out.println(li);
        }
    }
}
