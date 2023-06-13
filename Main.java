import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
System.out.println("What is your name?");
String n = new String();
System.out.print("> ");
n = sc.nextLine();
System.out.println("Hello, " + n + "!");
System.out.println("Rolling dice...");
int[] a = new int[2];
for(int i = 0; i < 2; i++) a[i] = (int)(Math.random() * 6) + 1;
System.out.println("Die 1: " + a[0]);
System.out.println("Die 2: " + a[1]);
System.out.println("Total value: " + (a[0] + a[1]));
if(a[0] + a[1] >= 7) System.out.println("You won!");
        else System.out.println("You lost!");
    }
}
