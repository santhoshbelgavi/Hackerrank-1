import java.util.*;
import java.io.*;

class TowerBreakers {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println((m == 1 || n % 2 == 0) ? 2 : 1);
        }
    }
}