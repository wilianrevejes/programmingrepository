// ex002 - Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.

#include <iostream>
using namespace std;
int main()
{
  char name[20];
  cout << "Digite seu nome: ";
  cin >> name;
  cout << "É um prazer te conhecer, " << name << "!" << endl;
}