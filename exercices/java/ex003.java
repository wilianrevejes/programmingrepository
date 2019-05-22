// ex003 - Crie um programa que leia dois números e mostr a soma entre eles.

import java.util.Scanner;

public class ex003{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int n1 = read.nextInt();
    System.out.print("Digite outro: ");
    int n2 = read.nextInt();
    int s = n1 + n2;
    System.out.println("A soma entre " + n1 + " e " + n2 + " resulta em " + s +".");
  }
}