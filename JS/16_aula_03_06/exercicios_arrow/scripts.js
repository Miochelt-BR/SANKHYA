// *Soma de Dois Números*
//    - Crie uma arrow function que receba dois números e retorne a soma deles.

//    const soma = (a, b) => 5 + 6;
   

// *Quadrado de um Número*
//    - Crie uma arrow function que receba um número e retorne o seu quadrado.
   
//    const quadrado = x => 2 * 2;
   

// *Verificar Maioridade*
//    - Crie uma arrow function que receba uma idade e retorne "Maior de Idade" se a idade for maior ou igual a 18 e "Menor de Idade" caso contrário.
 
//    const verificarMaioridade = idade => idade >= 18 ? "Maior de Idade" : "Menor de Idade";
   

// *Calcular Área do Retângulo*
//    - Crie uma arrow function que receba a largura e a altura de um retângulo e retorne a área.
   
//    const areaRetangulo = (largura, altura) => 5 * 3;
   

//  *Convertendo para Maiúsculas*
//    - Crie uma arrow function que receba uma string e a retorne em maiúsculas.
   
//    const paraMaiusculas = str => str.toUpperCase();
   

// //### Intermediário//

//  *Filtrar Números Pares*
//    - Crie uma arrow function que receba um array de números e retorne um novo array contendo apenas os números pares.

//    const filtrarPares = numeros => numeros.filter(n => n % 2 === 0);
   

//  *Calcular Média*
//    - Crie uma arrow function que receba um array de números e retorne a média dos números.

//    const calcularMedia = numeros => numeros.reduce((acc, num) => acc + num, 0) / numeros.length;
   

//  *Verificar Palíndromo*
//    - Crie uma arrow function que receba uma string e retorne true se for um palíndromo e false caso contrário.

//    const verificarPalindromo = str => str === str.split('').reverse().join('');
   

// *Dobrar Valores*
//    - Crie uma arrow function que receba um array de números e retorne um novo array com cada valor dobrado.

//    const dobrarValores = numeros => numeros.map(n => n * 2);
   

//  *Calcular Fatorial*
//     - Crie uma arrow function que receba um número e retorne o seu fatorial.
 
//     const fatorial = n => n === 0 ? 1 : n * fatorial(n - 1);
    

// ### Avançado

//  *Matriz Transposta*
//     - Crie uma arrow function que receba uma matriz (array de arrays) e retorne a sua transposta.

//     const transposta = matriz => matriz[0].map((_, colIndex) => matriz.map(row => row[colIndex]));
    

//  *Remover Duplicatas*
//     - Crie uma arrow function que receba um array e retorne um novo array sem elementos duplicados.

//     const removerDuplicatas = arr => [...new Set(arr)];
    

//  *Mesclar Arrays*
//     - Crie uma arrow function que receba dois arrays e retorne um novo array contendo todos os elementos dos dois arrays, sem duplicatas.

//     const mesclarArrays = (arr1, arr2) => [...new Set([...arr1, ...arr2])];
    

//  *Contar Ocorrências*
//     - Crie uma arrow function que receba uma string e retorne um objeto com a contagem de cada caractere na string.

//     const contarOcorrencias = str => str.split('').reduce((acc, char) => {
//         acc[char] = acc[char] ? acc[char] + 1 : 1;
//         return acc;
//     }, {});
    

//  *Compor Funções*
//     - Crie uma arrow function que receba duas funções f e g e retorne uma nova função que represente a composição f(g(x)).

//     const comporFuncoes = (f, g) => x => f(g(x));



//*Filtrar Strings por Comprimento**
//Crie uma arrow    function que receba um array de strings que gere número, e retorne um novo array contendo apenas as strings que tenham um comprimento maior que o número fornecido.
// 
// 1  arrow function 
// 2 array de strings e 1 numero
//3 retorne 1 array contendo strings somente q tenha o comprimento maior que o numero fornecido


// retorna [ana, doug] exemplo 


// let filtrarLista (arrays, comprimento) => arrays.filter(str => str.length > comprimento);

// let listaDeFrutas = ["pera","uva","maça", "saladamista"]
// let NumCaract = 3;

// let result = filtrarLista  (listaDeFrutas, NumCaract);

// console.log(result);

// **Remover Elementos Falsos**
//Crie uma arrow function que receba um array e retorne um novo array sem elementos "falsos" (`false`, `null`, `0`, `""`, `undefined`, `NaN`).
// let removeFalse = arrays => arrays.filter(Boolean)
// let listaFalsa=[false, null, undefined, 1, "thiago", "Dennys", 4, Nan]
// let listaVerdadeira=removeFalse(listaFalsa)
// console.log(listaVerdadeira)

        // **Encontrar Máximo em Array**
        //Crie uma arrow function que receba um array de números e retorne o maior número encontrado no array.

// let numeroMaximo = arr => Math.max(...arr);
// let num = [1,2,3,4,5,6,7];
// const maximo = numeroMaximo(num);
// console.log(maximo);


// O Método reduce
// const findMaxNumber = (numbers) =>  numbers.reduce((max, num) => (num > max ? num : max), numbers[0]);
// let listaNum = [1,2,3,4,5,6,7];

// let NumeroMaximo = findMaxNumber(listaNum);

// console.log(NumeroMaximo);

  
// **Concatenar Arrays**
    //Crie uma arrow function que receba múltiplos arrays e retorne um novo array concatenando todos os elementos.
// const multiplosA = (...arrays) =>[].concat(...arrays)

// let lista1=[5,4,1]
// let lista2=[1,2,3]
// let arrayConcat = multiplosA(lista1,lista2)

// console.log(arrayConcat)


    // **Somar Valores em Objeto**
    //Crie uma arrow function que receba um array de objetos, cada um com uma propriedade `valor`, e retorne a soma de todos os valores.
// const recebaSoma = (array) => array.reduce((total,obj) => total+obj.valor,0);

// const objeto=[
// {valor: 5},
// {valor: 10},
// {valor: 11}
// ];
// const somaTotal=recebaSoma(objeto);
// console.log(somaTotal);
    
// **Inverter String**
//Crie uma arrow function que receba uma string e retorne a string invertida.

// let StringInvertida = (strings) => strings.split('').reverse().join('');

// let stringOrdem = "Douglas é um anão de jardim";

// let stringInvert = StringInvertida(stringOrdem);

// console.log(stringInvert);


//**Filtrar Valores Únicos**
//Crie uma arrow function que receba um array de números e retorne um novo array contendo apenas os valores únicos (sem duplicatas).

// const filtrarVlores = (array) => [...new set(array)];
// const arrasy = [1,1,2,2,3,3,4,5,5,6,6]
// const valorFiltrado = filtrarVlores(arrasy)

//   console.log(arrasy); 
  


//   // **Contar Palavras em String**
//   //Crie uma arrow function que receba uma string e retorne o número de palavras na string.
// const contarPalavras = (string) => string.trim().split(' ').length;

// const string ="Olá este é um exemplo de string com algumas palavras";
// const numeroDePalavras = contarPalavras(string);
// console.log(numeroDePalavras);


// //**Calcular Produto de Array**
// //Crie uma arrow function que receba um array de números e retorne o produto de todos os números.
// const recebaProduto = (array) => array.reduce((total,obj) => total*obj.valor,1);

// const objeto=[
// {valor: 5},
// {valor: 10},
// {valor: 11}
// ];
// const produtoTotal=recebaProduto(objeto);
// console.log(produtoTotal);

// //*Combinar Propriedades de Objetos**
// //Crie uma arrow function que receba dois objetos e retorne um novo objeto combinando todas as propriedades dos dois objetos.



// const combinarObjetos = (objeto1, objeto2) => ({ ...objeto1, ...objeto2 }); 

  
//   // Exemplo de uso:
//   const obj1 = { a: 1, b: 2 };
//   const obj2 = { b: 3, c: 4 };
//   const combinado = combinarObjetos(obj1, obj2);
//   console.log(combinado);

// **Converter Array para Objeto**
//Crie uma arrow function que receba um array de pares chave-valor e retorne um objeto.

// const arrayParaObjeto = (array) => {     
//     return array.reduce((objeto, parChaveValor) => {
//         const [chave, valor] = parChaveValor;
//         objeto[chave] = valor;
//         return objeto;
//     }, {});
// }
// let listaValor = [['valor1', 1], ['valor2', 2], ['valor3', 3]]; 
// let resultado = arrayParaObjeto(listaValor);
// console.log(resultado);

  //**Obter Chaves de Objeto**
  //Crie uma arrow function que receba um objeto e retorne um array contendo todas as suas chaves.
  const obterChavesObjeto = (objeto) => {
    return Object.keys(objeto);}

    let obj = {l1:1, l2:2, l3:3, l4:4}
    let resultado = obterChavesObjeto(obj)
    console.log(resultado);
  
//   // **Obter Valores de Objeto**
// //Crie uma arrow function que receba um objeto e retorne um array contendo todos os seus valores.

const obterValoresObjeto = (objeto) => {
    return Object.values(objeto);
  };

  
// // **Filtrar Números Ímpares**
// //Crie uma arrow function que receba um array de números e retorne um novo array contendo apenas os números ímpares.
const numero=[1,2,3,4,2,5,6,7]
const  impares=numero.filter(numero =>numero % 2 !== 0)
console.log(impares)
  
//   // **Agrupar Elementos por Propriedade**
//   //Crie uma arrow function que receba um array de objetos e uma propriedade, e retorne um objeto agrupando os elementos por essa propriedade.

//   const agruparPorPropriedade = (array, propriedade) => {
//     return array.reduce((objetoAgrupado, objeto) => {
//       const valorPropriedade = objeto[propriedade];
//       if (!objetoAgrupado[valorPropriedade]) {
//         objetoAgrupado[valorPropriedade] = [];
//       }
//       objetoAgrupado[valorPropriedade].push(objeto);
//       return objetoAgrupado;
//     }, {});
//   };
   