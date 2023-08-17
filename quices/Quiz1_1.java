import java.util.Scanner;

public class Quiz1_1{
public clas static void main(String[]args){
Scanner sc=new Scanner(System.in);
  System.out.print("Escriba un numero n:");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++){
  if (i % 3==0 && i%5==0){
  System.out.println("Fizzbuzz");
  }
  }
}
}
