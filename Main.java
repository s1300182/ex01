import java.util.Random;
import java.lang.Math;
public class Main{
    public static void main(String[] args) throws Exception{
System.out.println("Rolling dice...");
int[] a = new int[2];
for(int i = 0; i < 2; i++) a[i] = (int)(Math.random() * 6) + 1;
System.out.println("Die 1: " + a[0]);
System.out.println("Die 2: " + a[1]);
System.out.println("Total value: " + (a[0] + a[1]));
    }
}
