// ex001 - Crie um programa que escreva "Olá Mundo!" na tela.

#include <iostream>
using namespace std;
int main()
{
  int n1, n2;
  cout << "Digite um número: ";
  cin >> n1;
  cout << "Digite outro: ";
  cin >> n2;
  int s = n1 + n2;
  cout << "A soma entre " << n1 << " e " << n2 << " resulta em " << s << "." << endl;
}