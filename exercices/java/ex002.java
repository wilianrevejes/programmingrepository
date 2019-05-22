// ex002 - Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.

import java.util.Scanner;

public class ex002{
  public static void main(String[] args){
    System.out.print("Digite seu nome: ");
    Scanner read = new Scanner(System.in);
    String msg = read.nextLine();
    System.out.println("É um prazer te conhecer, "+ msg +"!");
  }
}