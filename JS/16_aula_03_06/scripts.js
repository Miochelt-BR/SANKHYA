// arrow functions
// Corpo de Função com Multiplas linhas
const soma = (a, b) => {
    const resultado = a + b;
    return resultado;
};
console.log(soma(2, 3));
// Funções sem retorno (void functions)
const logMensagem = mensagem => {
    console.log(mensagem);
};
logMensagem('Olá, mundo!');

// Funções com Objetos como Retorno
const criarObjeto = (chave, valor) => ({ [chave]: valor });
console.log(criarObjeto('nome', 'João')); 

//  Funções Anônimas
const numeros = [1, 2, 3, 4, 5];
const dobrados = numeros.map(n => n * 2);
console.log(dobrados); //[2,4,6,8,10]

const pares = numeros.filter(n => n % 2 === 0);
console.log(pares); // [2,4]

const somaTotal = numeros.reduce((acumulador, n) => acumulador + n, 0); 
console.log(somaTotal);//15

//Funções como Propriedades de Objetos
const objeto = {
    valor: 42,
    mostrarValor: () => console.log(objeto.valor)
};
objeto.mostrarValor(); //42

//Funções de Ordem Superior
const multiplicarPor = fator => numero => numero * fator;
const multiplicarPorDois = multiplicarPor(2);
//numero => numero * 2;
console.log(multiplicarPorDois(5)); //10
//5 * 2

//Declaraçãp com async
async function minhaFuncao() {
    return "Hello, World!";
}
minhaFuncao().then(console.log);

//
async function buscarDados() {
    let dados = await fetch("https://api.example.com/dados");
    let json = await dados.json();
    return json;
}
buscarDados().then(dados => console.log(dados));