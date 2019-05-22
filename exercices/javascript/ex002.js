// ex002 - Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boass-vindas.

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite seu nome: ', (answer) => {
  // TODO: Log the aswer in a database
  console.log(`É um prazer te conhecer, ${answer}!`);

  rl.close();
});