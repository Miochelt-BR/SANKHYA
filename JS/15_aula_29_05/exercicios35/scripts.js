// // //Soma dos Números: Crie um programa que solicita ao usuário um número inteiro positivo N e, em seguida, calcula a soma dos números de 1 a N utilizando um loop.


// // function calcularSoma() {
// //     let n = parseInt(document.getElementById('numero').value);
    
// //     if (isNaN(n) || n <= 0) {
// //         document.getElementById('resultado').innerText = "Por favor, insira um número inteiro positivo.";
// //         return;
// //     }
    
// //     let soma = 0;
// //     for (let i = 1; i <= n; i++) {
// //         soma += i;
// //     }
    
// //     document.getElementById('resultado').innerText = `A soma dos números de 1 a ${n} é: ${soma}`;
// // }
// // // tabuada
// // function calcularTabuada() {
// //     let t = parseInt(document.getElementById('numeroT').value);

// //     if (isNaN(t) || t <= 0) {
// //         document.getElementById('resultado').innerText = "Por favor, insira um número inteiro positivo.";
// //         return;
// //     }

// //     let tabuada = '';
// //     for (let i = 1; i<=10; i++) {
// //         tabuada += `${t} x ${i} = ${t * i}<br>`;
// //     }

// //     document.getElementById('resultado').innerHTML = `A tabuada de ${t} é:<br>${tabuada}`;
// // }

// // // Fatorial: Implemente um programa que solicita um número inteiro não negativo e calcula o fatorial desse número usando um loop. 

    

// // function fatorial() {
// //     let fat1 = parseInt(document.getElementById('fat').value);

// //     if (isNaN(fat1) || fat1 <= 0) {
// //         document.getElementById('resultado').innerText = "Por favor, insira um número inteiro positivo.";
// //         return;
// //     } else {
// //         let fatorial = 1;
// //         for (let i = 1; i <= fat1; i++) {
// //             fatorial *= i;
// //         }
// //         document.getElementById('resultadof').innerText = `O fatorial de ${fat1} é ${fatorial}`;
// //     }
// // }

// // // Números Primos: Desenvolva um programa que recebe um número inteiro positivo e verifica se é um número primo
    
// // function numPrimo(numero) {
// //     if (isNaN(numero) || numero <= 1 || !Number.isInteger(numero)) {
// //         return false;
// //     }

// //     for (let i = 2; i <= Math.sqrt(numero); i++) {
// //         if (numero % i === 0) {
// //             return false;
// //         }
// //     }
// //     return true;
// // }

// // function verificarNumeroPrimo() {
// //     let inputNum = parseInt(document.getElementById('primo').value);

// //     if (inputNum <= 1 || isNaN(inputNum) || !Number.isInteger(inputNum)) {
// //         document.getElementById('resultado').innerText = "Por favor, insira um número inteiro positivo maior que 1.";
// //         return;
// //     }

// //     if (numPrimo(inputNum)) {
// //         document.getElementById('resultado').innerText = `O número ${inputNum} é primo.`;
// //     } else {
// //         document.getElementById('resultado').innerText = `O número ${inputNum} não é primo.`;
// //     }
// // }

// // // Série Fibonacci: Crie um programa que gera os primeiros N termos da série Fibonacci, onde N é fornecido pelo usuário.
// // // Função para gerar os primeiros N termos da série Fibonacci
// // function fibonacci(N) {
// //     let fibonacciSeries = [];
// //     let termo1 = 0;
// //     let termo2 = 1;

// //     if (N >= 1) {
// //         fibonacciSeries.push(termo1);
// //     }

// //     if (N >= 2) {
// //         fibonacciSeries.push(termo2);
// //     }

// //     for (let i = 3; i <= N; i++) {
// //         let proximoTermo = termo1 + termo2;
// //         fibonacciSeries.push(proximoTermo);
// //         termo1 = termo2;
// //         termo2 = proximoTermo;
// //     }

// //     return fibonacciSeries;
// // }

// // document.getElementById('btnGerar').addEventListener('click', function() {
// //     let N = parseInt(document.getElementById('termos').value);

// //     if (isNaN(N) || N <= 0) {
// //         document.getElementById('resultadof1').innerText = "Por favor, digite um número inteiro positivo válido.";
// //     } else {
// //         let termos = fibonacci(N);
// //         document.getElementById('resultadof1').innerText = "Os primeiros " + N + " termos da série Fibonacci são: " + termos.join(", ");
// //     }
// // });

// // // Média de Notas: Faça um programa que solicita ao usuário que insira as notas de alunos em uma disciplina e calcula a média dessas notas. O programa deve continuar pedindo notas até que o usuário decida parar.
// // let notas = [];

// // document.getElementById('btnAdicionar').addEventListener('click', function() {
// //     let nota = document.getElementById('nota').value.trim();

// //     if (nota === '') {
// //         alert("Por favor, insira uma nota.");
// //         return;
// //     }

// //     if (nota.toLowerCase() === 'fim') {
// //         return;
// //     }

// //     nota = parseFloat(nota);

// //     if (isNaN(nota) || nota < 0 || nota > 10) {
// //         alert("Por favor, insira uma nota válida entre 0 e 10.");
// //         return;
// //     }

// //     notas.push(nota);
// //     document.getElementById('nota').value = '';
// // });

// // document.getElementById('btnCalcular').addEventListener('click', function() {
// //     if (notas.length === 0) {
// //         alert("Por favor, insira pelo menos uma nota antes de calcular a média.");
// //         return;
// //     }

// //     let soma = notas.reduce((total, nota) => total + nota, 0);
// //     let media = soma / notas.length;

// //     document.getElementById('resultado').innerText = "A média das notas é: " + media.toFixed(2);
// // });

// // // Adivinhe o Número: Implemente um jogo onde o computador escolhe um número aleatório entre 1 e 100, e o jogador tem que adivinhar. O programa deve fornecer dicas sobre se o número é maior ou menor.


// //  const numeroAleatorio = Math.floor(Math.random() * 100) + 1;
// //  console.log(numeroAleatorio); // Apenas para teste, pode ser removido

// //  function adivinharNumero() {
   
// //      const palpite = parseInt(document.getElementById('guessInput').value); 

  
// //      if (isNaN(palpite) || palpite < 1 || palpite > 100) {
// //          document.getElementById('feedback').innerText = "Por favor, insira um número entre 1 e 100.";
// //          return;
// //      }

   
// //      if (palpite === numeroAleatorio) {
// //          document.getElementById('feedback').innerText = "Parabéns! Você acertou!";
// //      } else if (palpite < numeroAleatorio) {
// //          document.getElementById('feedback').innerText = "O número é maior. Tente novamente!";
// //      } else {
// //          document.getElementById('feedback').innerText = "O número é menor. Tente novamente!";
// //      }
// //  }

// // // Contador de Dígitos: Escreva um programa que pede ao usuário para inserir um número inteiro e conta quantos dígitos há nesse número.
// // function contarDigitos() {
// //     var numero = document.getElementById('numero').value;
// //     var contador = 0;

// //     while (numero != 0) {
// //         numero = Math.floor(numero / 10);
// //         contador++;
// //     }

// //     document.getElementById('resultadoc').innerText = 'O número de dígitos é: ' + contador;
// // }
// // // Números Pares e Ímpares: Crie um programa que solicita ao usuário para inserir um número e, em seguida, exibe a contagem de números pares e ímpares até esse número.
// // function contarParesEImpares() {
// //     const numero = parseInt(document.getElementById('num').value);
    
// //     if (isNaN(numero) || numero <= 0) {
// //         document.getElementById('resultadopa').innerText = "Por favor, insira um número inteiro positivo.";
// //         return;
// //     }

// //     let pares = 0;
// //     let impares = 0;

// //     for (let i = 1; i <= numero; i++) {
// //         if (i % 2 === 0) {
// //             pares++;
// //         } else {
// //             impares++;
// //         }
// //     }

// //     const resultadoElement = document.getElementById('resultadopa');
// //     resultadoElement.innerHTML = `
// //         <p>Números pares até ${numero}: ${pares}</p>
// //         <p>Números ímpares até ${numero}: ${impares}</p>
// //     `;
// // }




// // // Cálculo de Média Ponderada: Desenvolva um programa que pede ao usuário para inserir as notas e os pesos de várias disciplinas e calcula a média ponderada.  
// // function calcularMedia() {
// //     let totalPontos = 0;
// //     let totalPesos = 0;

// //     document.querySelectorAll('.nota-input').forEach((notaInput, index) => {
// //         const nota = parseFloat(notaInput.value);
// //         const peso = parseFloat(document.getElementById(`peso${index}`).value);

// //         if (!isNaN(nota) && !isNaN(peso)) {
// //             totalPontos += nota * peso;
// //             totalPesos += peso;
// //         }
// //     });

// //     const resultadoElement = document.getElementById('resultadom');
// //     if (totalPesos === 0) {
// //         resultadoElement.innerText = 'Por favor, insira notas e pesos válidos.';
// //     } else {
// //         const mediaPonderada = totalPontos / totalPesos;
// //         resultadoElement.innerText = `A média ponderada é: ${mediaPonderada.toFixed(2)}`;
// //     }
// // }

// // function adicionarNota() {
// //     const notasContainer = document.getElementById('notas-container');
// //     const notaIndex = notasContainer.children.length;

// //     const novaNotaDiv = document.createElement('div');
// //     novaNotaDiv.innerHTML = `
// //         <label for="nota${notaIndex}">Nota ${notaIndex + 1}:</label>
// //         <input type="number" id="nota${notaIndex}" class="nota-input">
// //         <label for="peso${notaIndex}">Peso ${notaIndex + 1}:</label>
// //         <input type="number" id="peso${notaIndex}" class="peso-input">
// //     `;

// //     notasContainer.appendChild(novaNotaDiv);
// // }



// // atvidade de quinta
// // **Função de Saudação**:
// //- Crie uma função chamada `saudacao` que receba um nome como argumento e exiba uma mensagem de saudação no console.

// // function saudacao() {
// //     let msg = "olá, tudo bem?!";
// //     console.log(`${msg}`);
// //     return msg;
// // }
// // saudacao();

// // // . **Função de Subtração**:
// // //- Crie uma função chamada `subtracao` que receba dois números como argumentos e retorne a subtração do segundo número pelo primeiro.
// // function subtracao() {
// //     let num = 2;
// //     let num1 = 3;
// // return console.log (`"O resultado da subtração é:"${num1 - num}`);
// // }
// // subtracao();


// // //  **Função de Multiplicação**:
// // //- Crie uma função chamada `multiplicacao` que receba dois números como argumentos e retorne a multiplicação deles.

// // function multiplicacao() {
// //     let num = 2;
// //     let num1 = 3;
// // return console.log (`O resultado da multiplicação é:${num1 * num}`);
// // }
// // multiplicacao();

// // //  **Função de Divisão**:
// // //- Crie uma função chamada `divisao` que receba dois números como argumentos e retorne a divisão do primeiro pelo segundo.

// // function divisao() {
// //     let num = 2;
// //     let num1 = 3;
// // return console.log (`O resultado da divisão é:${num1 / num}`);
// // }
// // divisao();

// // //**Função de Fatorial**:
// // // - Crie uma função chamada `fatorial` que receba um número como argumento e retorne o fatorial desse número.
// // function fatorial (){
// //     let fat = 1
// //     let fat1 = 8
// //     for (let i = 1; i <= fat1; i++) {
// //         fat *= i;
// //     }
// //     return console.log (`O fatorial do seu número é: ${fat}`)
// // }

// // fatorial ()
 
// // // 8. **Função para Calcular Média**:
// // //- Crie uma função chamada `media` que receba um array de números como argumento e retorne a média dos números.

// // function media() {
// //     let num = [1, 5, 5, 5];
// //     let soma = 0;
    
// //     for (let i = 0; i < num.length; i++) {
// //         soma += num[i];
// //     }
    
// //     let media = soma / num.length;
// //     return media;
// // }

// // console.log(media()); 

// // //**Função para Inverter String**:
// // //- Crie uma função chamada `inverterString` retorne a string invertida.

// // // Inicializa uma variável strInvertida como uma string vazia.
// // // Usa um loop for que começa no final da string (str.length - 1) e itera até o início (índice 0), adicionando cada caractere de str à variável strInvertida.
// // // Retorna a string invertida.
// // // Esse código inverte corretamente a string fornecida como entrada.

// // function inverterString(str){
// //     let doug = ""
// //  for (let i = str.length -1; i>= 0; i-- ){
// //     doug += str[i]
// //  } 
// //  return doug

// // }
// // console.log(inverterString("OLA"))

// //**Função para Contar Caracteres**:
//     //- Crie uma função chamada `contarCaracteres` que receba uma string e um caractere como argumentos e retorne o número de vezes que o caractere aparece na string.
    
// //     let caractere = "a"
// //     let nome = "anajara"

// //     function contarCaracteres(nome,caractere){
// //     let thiago = 0
// //      for (let i = 0; i < nome.length ; i++ ){
// //         if (nome[i] === caractere) {
// //             thiago++;
// //         }
// //      } return  thiago
// //     }   
// //     console.log(contarCaracteres(nome,caractere))

// // // **Função Anônima**:
// // // - Crie uma função anônima e atribua-a a uma variável chamada `multiplicar`. A função deve receber dois números como argumentos e retornar a multiplicação deles.
// // function anonima(x,y) {
// //   return x*y;
// // }
// // console.log(anonima(5,2));

// // **Função de Ordem Superior**:
// //     - Crie uma função chamada `operacao` que receba dois números e uma função como argumentos. A função deve aplicar a função fornecida aos dois números e retornar o resultado.
    
//         // function operacao(n1, n2){
       
//         //     return   n1 + n2

//         // }

//         // function operacaoNegativa(n1, n2){
       
//         //     return   n1 - n2

//         // }

//         // function resultado(n1,n2,f){  
            
//         //     return f(n1,n2)
//         // }
//         // console.log(resultado(5,4,operacaoNegativa))

//         // function operacao(num1, num2, func) {
//         //     return func(num1, num2);
//         // }
//         // function adicao(a, b) {
//         //     return a + b;}

//         // let resultadoAdicao = operacao(5, 3, adicao);
//         // console.log(`Resultado da adição: ${resultadoAdicao}`);
        
// // **Função Recursiva**:
// //- Crie uma função chamada `contagemRegressiva` que receba um número como argumento e exiba uma contagem regressiva a partir desse número até 0, usando recursão.
//             // function contagemRegressiva(valor){
//             //     for (let i = valor; i>=0; i--){ 
//             //         console.log(i);
//             //         }
//             // }
//             // contagemRegressiva(15)

        
// // **Função para Verificar Paridade**:
// //- Crie uma função chamada `ePar` que receba um número como argumento e retorne `true` se o número for par e `false` caso contrário.

// // function verifcarEpar(valorVerificar){
// //         return valorVerificar % 2 === 0;            
// // }
// // console.log (verifcarEpar(13))
// // console.log (verifcarEpar(14))

        
//    //19. **Função para Calcular Quadrado**:
// //- Crie uma função chamada `quadrado` que receba um número como argumento e retorne o quadrado desse número.

//     // function quadrado(valor){
//     //     return valor*valor
//     // }
//     // console.log(quadrado(8))

    
// // **Função para Calcular Raiz Quadrada**:
// //- Crie uma função chamada `raizQuadrada` que receba um número como argumento e retorne a raiz quadrada desse número.
// // function raizQuadrada(numero) {
// //     return Math.sqrt(numero);
// // }
// // console.log(raizQuadrada(9))

// // **Função para Contar Vogais**:
// //- Crie uma função chamada `contarVogais` que receba uma string como argumento e retorne o número de vogais na string.
  

//     // function contarVogais(str) {
//     //     const vogais = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'];
//     //     let contador = 0;
        
//     //     for (let char of str) {
//     //         if (vogais.includes(char)) {
//     //             contador++;
//     //         }
//     //     }
        
//     //     return contador;
//     // }
    
//     // let resultado = contarVogais("e ai cambada");
//     // console.log("Número de vogais:", resultado); 

// //**Função para Verificar Palíndromo**:
//   //  - Crie uma função chamada `ePalindromo` que receba uma string como argumento e retorne `true` se a string for um palíndromo e `false` caso contrário.


// // function calcularPalindromo(str){
// //     let doug = ""
// //  for (let i = str.length -1; i>= 0; i-- ){
// //     doug += str[i]  
// // }
// //  return doug===str


// // }

// // console.log(calcularPalindromo("rir"))



// /*Função para Encontrar o Maior Número em um Array**:
// //- Crie uma função chamada `maiorNumero` que receba um array de números como argumento e retorne o maior número do array.

// // function maiorNumero(numeros) {

    
// //     let maior = numeros[0];
// //     for (let i = 1; i < numeros.length; i++) {
// //         if (numeros[i] > maior) {
// //             maior = numeros[i];
// //         }
// //     }
// //     return maior;
// // }

// // let a = [3, 4, 7, 40000, 70];
// // let maior = maiorNumero(a);
// // console.log(maior);




// //**Função para Ordenar um Array em Ordem Crescente**:
// //- Crie uma função chamada `ordenarArray` que receba um array de números como argumento e retorne o array ordenado em ordem crescente.

// function maiorNumero(numeros) {

    
//     let maior = numeros[numeros.length];
//     for (let i = 1; i < numeros.length; i++) {
//         if (numeros[i] > maior) {
//             maior = numeros[i];
//         }
//     }
//     return maior;
// }

// let a = [3, 4, 7, 40000, 70];
// let maior = maiorNumero(a);
// console.log(maior);
// */

// // Função para Ordenar um Array em Ordem Crescente**:
// //     - Crie uma função chamada `ordenarArray` que receba um array de números como argumento e retorne o array ordenado em ordem crescente.




// // function ordenarArray(array) {
// //     for (let i = 0; i < array.length; i++) {
// //         for (let j = i + 1; j < array.length; j++) {
// //             if (array[j] < array[i]) {

// //                 [array[i], array[j]] = [array[j], array[i]];
// //             }
// //         }
// //     }
// //     return array;
// // }

// // 25. **Função para Filtrar Números Pares**:
// //     - Crie uma função chamada `filtrarPares` que receba um array de números como argumento e retorne um novo array contendo apenas os números pares.

// // function ordenarArray(array) {
// //     let x = []
// //     for (let i = 0; i < array.length; i++) {
// //             if (array[i] % 2 ==0){
// //                 x.push(array[i])
// //             }
// //     }
// //     return  x;
// // }
    
// // ordenarArray(2,4,3,5,6)

// //**Função para Concatenar Arrays**:
// //- Crie uma função chamada `concatenarArrays` que receba dois arrays como argumentos e retorne um novo array que seja a concatenação dos dois arrays.


// // function concatenarArrays (a , b){
// //     return a.concat (b);
// //    }
// // let a = [a,b,c,d];
// // let b = [e,f,g,h];
   

// // var resultado = concatenarArrays(a, b);
// // console.log(resultado);

// //**Função para Verificar Substring**:
//    // - Crie uma função chamada `contemSubstring` que receba duas strings como argumentos e retorne `true` se a primeira string contiver a segunda string, e `false` caso contrário.
// // function contemSubstring (str1, str3){
// //     return str1.indexOf(str2) !== -1;
// // }
// // console.log(contemSubstring("oi tudo bem","oi"))

// // **Função de Curry**:
// // //- Crie uma função chamada `currySoma` que usa currying para somar três números. A função deve ser chamada assim: `currySoma(a)(b)(c)`.

// // function currySoma(a){
// //     return function (b){
// //         return function (c){
// //             return a + b + c
// //     }
// //     }
// // }
// // console.log(currySoma(2)(3)(4)); 


// //**Função para Reduzir um Array**:
//     //- Crie uma função chamada `reduzirArray` que receba um array de números e uma função de redução (callback) como argumentos e retorne o valor reduzido.

// //     function reduzirArray ( array, callback, initialvalue){
// //         return array.reduce(callback,initialvalue)
// //     }
// //     let num = [1,2,3,4,5,6,7,8]
// // function somar (total, valorautal){
// //     return total+valorautal
// // }
// // function multiplicar (total, valorautal){
// //     return total*valorautal
// // }
// // console.log(reduzirArray(num,somar,0))
// // console.log(reduzirArray(  num, multiplicar,1))

// //**Função para Remover Duplicatas de um Array**:
// //- Crie uma função chamada `removerDuplicatas` que receba um array como argumento e retorne um novo array sem duplicatas.

// // function removerDuplicatas(){
// //     let arrayDuplicatas =[1,2,3,3,3,4,6];
// //     arrayDuplicatas=[]
// //     return arrayDuplicatas
// // }
// // console.log(removerDuplicatas())

// //**Função de Composição**:
// //- Crie uma função chamada `compor` que receba duas funções como argumentos e retorne uma nova função que é a composição das duas.
// // function compor (fun1, fun2){
// //  return function (...a){
// //     return fun1(fun2(...a))
// //  }
// // }
// // function somar (numero){
// // return numero + 2
// // }
// // function mult (numero){
// // return numero * 2
// // }
// // console.log(somar())

// // let funcaoComposta = compor(somar, mult);
// // console.log(funcaoComposta(3)); 

// //**Função para Mapear um Array**:
//     //- Crie uma função chamada `mapearArray` que receba um array e uma função de mapeamento (callback) como argumentos e retorne um novo array com os resultados da função de mapeamento aplicada a cada elemento.

//     // let numeros = [1, 2, 6, 8, 9, 10];

//     // function mapearArray(numeros) {
//     //     const result = numeros.map((novoNumero) => {
//     //         console.log("Número sendo atualizado:", novoNumero);
//     //         return novoNumero * 2;
//     //     });
//     //     return result;
//     // }
    
//     // const numerosDobrados = mapearArray(numeros);
    
//     // console.log("Array original:", numeros); 
//     // console.log("Array dobrado:", numerosDobrados); 
     


// //**Função de Ordenação Personalizada**:
// // - Crie uma função chamada `ordenarPersonalizado` que receba um array de objetos e uma função de comparação (callback) como argumentos e retorne o array ordenado.

// // function ordenarPersonalizado(array,comparacao){
// //     const costomizacao= (a,b)=>comparacao(a,b)
// //     return array.sort(costomizacao) 

// // }
// // const pessoas = [
// //     {nome:'maria',  idade: 21},
// //     {nome:'anajara',  idade: 18},
// //     {nome: 'dennys', idade: 10},
// //     {nome: 'tiago', idade: 15},
// //     {nome: 'douglas', idade: 15}
        
// // ]
// // function comparaIdade(a , b){
// // return a.idade - b.idade
// //         }
// //     const pessoasOrdenas = ordenarPersonalizado(pessoas , comparaIdade)
// //     console.log(pessoasOrdenas)

// // **Função para Encontrar a Intersecção de Dois Arrays**:
// //- Crie uma função chamada `intersecaoArrays` que receba dois arrays como argumentos e retorne um novo array contendo os elementos que são comuns aos dois arrays.

// // const num1 = [,1,2,4,9];
// // const num2= [1,4,8,7,3];
// // function intersecaoArrays(num1 , num2){
// //     return num1.filter(elemento => num2.includes(elemento))
 
// // }
// // console.log(intersecaoArrays(num1,num2));