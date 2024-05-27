//Exercício 1) Crie um trecho de código que calcula a média de 3 notas. Crie três variáveis para representar as três notas e outra para guardar o resultado do cálculo;
let media1 = 5
let media2 = 5
let media3 = 6
let result = (media1 + media2 + media3) / 3
console.log(result)

//Exercício 2) Crie um trecho de código que calcula o IMC de uma pessoa. Crie uma variável para armazenar o peso em kg e uma para armazenar a altura em metros. O cálculo do IMC é: PESO / ALTURA ^ 2;
let peso = 80
let altura = 1.80
let imc = peso / (altura ** 2);
console.log("imc corporal " + imc)

// //Exercício 3) Crie um trecho de código que lê a idade de uma pessoa e mostra o ano em que ela nasceu. O cálculo é ANO ATUAL - IDADE inserida;
// let  idade =33
// let anoAtual =2024
// anoDeNascimento=(anoAtual-idade)
// console.log( " ano de nascimento " +   anoDeNascimento)

// Exercício 4) Crie um trecho de código que me diga quanto cobrar para vender um notebook usado: o seu custo foi R$3000, por quanto devo vendê-lo descontando 25%?
let custo = 3000
let calculo = custo * (25 / 100)
console.log("o preço de desconto: " + calculo)

//Exercício 5) Escreva um programa que leia um valor em metros e o exiba no console convertido em milímetros.
let metros = 500
let convercao = metros * 1000
console.log("a quantidade de metos convertida é" + convercao)

//Exercício 6) Escreva um programa que leia um valor de uma temperatura em CELSIUS e converte para FAHRENHEIT. O cálculo é: CELSIUS * 1,8 + 32.
let temperatura = 35
let converter = (temperatura * 1, 8) + 32
console.log(" a converção dos numero é " + converter)

//EXERCICIS BASICOS
//1. Verificação de Números:   - Crie um programa que verifica se um número é positivo, negativo ou zero.
 let numero = 300
if(numero < 0 ){
     console.log("negativo")
 }else if( numero > 0){
     console.log("positivo")
}else if (numero == 0){
     console.log("zero")
 }else{
     console.log("Número inválido")
 }


//2. Verificação de Par ou Ímpar:   - Escreva um programa que determina se um número é par ou ímpar.
let num = 3
if (num % 2 == 0) {
    console.log("par")
} else {
    console.log("impar")
}

//3. Calculadora Simples:   - Implemente uma calculadora que recebe dois números e uma operação (adição, subtração, multiplicação, divisão) e retorna o resultado.
let num1 = 20
let num2 = 30
let soma = num1 + num2
let sub = num1 - num2
console.log("A soma é " + soma)



//Exercícios Intermediários:
//4. Idade e Categoria:   - Crie um programa que determina a categoria de uma pessoa baseada na idade (criança, adolescente, adulto, idoso).

let idade = 45;

if (idade >= 0 && idade <= 90) {
    if (idade <= 10) {
        console.log("criança");
    } else if (idade > 10 && idade < 18) {
        console.log("adolescente");
    } else if (idade >= 18 && idade < 65) {
        console.log("adulto");
    } else {
        console.log("idoso");
    }
} else {
    console.log("Idade inválida. Por favor, insira um valor entre 0 e 100.");
}





//5. Conversor de Notas:   - Escreva um programa que converte notas numéricas em conceitos (A, B, C, D, F) baseado em um sistema de pontuação.
let nota = 81
if (nota >= 90 && nota <= 100) {
    console.log("A")
}
else if (nota >= 80) {
    console.log("B")
}
else if (nota >= 70) {
    console.log("C")
}
else if (nota >= 60) {
    console.log("D")
}
else if (nota < 0) {
    console.log("Número inválido")
}
else {
    console.log("F")
}



//6. Cálculo de Desconto:   - Desenvolva um programa que calcula o valor final após aplicar um desconto a um determinado preço.

let x = 35
let custos = 8700
let calculos = custo * (x / 100)
console.log("o preço de desconto: " + calculo)

// //Exercícios Avançados:
// //7. Validação de Triângulo:   - Crie um programa que verifica se três segmentos formam um triângulo e, se sim, determina seu tipo (equilátero, isósceles, escaleno).

let a = 40
let y = 3
let z = 5
if (a + y > z && y + z > a && a + z > y) {
    console.log("É um triângulo");
    if (a == y && y == z && z == a) {
        console.log("equilátero")
    } else if (a == y || y == z || z == a) {
        console.log("isósceles")
    }
    else { console.log("escaleno") }
} else {
    console.log("nao e um triagulo")
}



//8. Verificador de Ano Bissexto:   - Implemente um programa que verifica se um ano é bissexto ou não.
 let year=2032
if (year % 4 === 0 && year % 100 !== 0) {
    console.log(  year +"ano bissexto") ;
} else {
    console.log(  year +"nao é ano bissexto") ;
}



//9. Jogo de Adivinhação:   - Crie um jogo onde o programa escolhe um número aleatório e o jogador tem que adivinhar qual é. O programa deve fornecer dicas se o número fornecido é maior ou menor.

const numeroAleatorio = Math.floor(Math.random() * 100) + 1;

console.log("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100.");

let tentativas = 0;

while (true) {
    const palpite = parseInt(prompt("Digite seu palpite:"));

    if (isNaN(palpite)) {
        console.log("Por favor, insira um número válido.");
        continue;
    }

    tentativas++;

    if (palpite === numeroAleatorio) {
        console.log(`Parabéns! Você acertou o número ${numeroAleatorio} em ${tentativas} tentativa(s).`);
        break;
    }

    console.log(palpite < numeroAleatorio ? "Tente novamente! O número é maior." : "Tente novamente! O número é menor.");
}


//10. Simulador de Empréstimo:    - Desenvolva um programa que simula um sistema de empréstimo, determinando se um cliente é elegível com base na renda, idade e histórico de crédito.
let rendaDoCliente=1000.000
let idadeDoCliente=14
let scoreDoCliente=800

const rendaMinima=600
const idadeMinima=18
const score=300
if(rendaDoCliente>=rendaMinima && idadeDoCliente>=idadeMinima && scoreDoCliente>=score) {
    console.log("simulação de emprestimo aceita ");
}else{
    console.log("simulação de emprestimo negada ");
}