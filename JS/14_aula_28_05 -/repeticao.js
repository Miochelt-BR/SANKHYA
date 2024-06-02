/**ESTRUTURAS DE REPETIÇÃO
 * While-loop
 * do...while
 */
// let idade = 15;
// while (idade < 18){
//     console.log(idade);
//     // idade = idade + 1; 
//     idade++;
// }
// let count = 0;
// while(count <5){
//     // String Template Literal
//     console.log(`O contador atual é ${count}`);
//     count++;
// }
// do{
//     console.log(`O contador atual é ${count}`);
//     count++;
// }while(count < 5);


// let num1 = 5;
// let num2 = 10;
// let sum = num1 + num2;
// console.log('A soma de ' + num1 + ' e ' + num2 + ' é ' + sum + '.');
// console.log(`A soma de ${num1} + ${num2} é ${sum}.`);

// For--loop
// for(let i = 0; i < 10; i++){
//     console.log(`Contador atual é ${i}`)
// }
// const frutas = ['Maçã', 'Banana', 'Laranja', 'Uva'];
// for(let i=0; i< frutas.length; i++){
//     console.log(`A fruta é ${frutas[i]}`)
// }
/*
const frutas = ['Maçã', 'Banana', 'Laranja', 'Uva'];
// for...of
for (const x of frutas){
    console.log(`A fruta é ${x}`)
}
*/

/**FOR...IN
 * 
 */
// const pessoas = {nome: 'Adriano', idade: 41, cidade: 'Mossoró-RN'};
// for (const y in pessoas){
//     console.log(`${y}: ${pessoas[y]}`)
// }

// const sala = [
//     {nome: 'Adriano', idade: 41, cidade: 'Mossoró-RN'},
//     {nome: 'Neto', idade: 36, cidade: 'Uberlândia-MG'},
//     {nome: 'Luciana', idade: 42, cidade: 'Rio de Janeiro - RJ'}
// ];

// for(const pcd of sala){
//     for(const key in pcd){
//         console.log(`${key}: ${pcd[key]}`);
//     }
//     console.log("-------");
// }

// Método forEach
// Sintaxe array.forEach(callback(elemento, index, array), thisArg);

// const numeros = [1,2,3,4,5,6,7,8,9,10];
// numeros.forEach(function(number){
//     console.log(number);
// });

// numeros.forEach(function(number, index){
//     console.log(`Index: ${index}, Número: ${number}`);
// });

const sala = [
    {nome: 'Adriano', idade: 41, cidade: 'Mossoró-RN'},
    {nome: 'Neto', idade: 36, cidade: 'Uberlândia-MG'},
    {nome: 'Luciana', idade: 42, cidade: 'Rio de Janeiro - RJ'}
];
sala.forEach(function(alunos){
    console.log(`${alunos.nome} tem ${alunos.idade} e mora em ${alunos.cidade}`);
})