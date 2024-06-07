//  * }
//  */

// const pessoa = {
//     nome: 'Douglas',
//     idade: 30
// };
// console.log(pessoa.nome);
// pessoa.idade = 31;
// console.log(pessoa['idade']);
// pessoa.salario = 5000;
// console.log(pessoa.salario);

// pessoa['cidade'] = "São Paulo";

// Object.assign(pessoa, {profissao: "Desenvolvedor", telefone: '(11)99999990'});
// console.log(pessoa);

// const novaPessoa = {
//     ...pessoa,
//     email: 'douglas@dev.com.br',
//     linkedin: "link"
// };
// console.log(novaPessoa);

// // REMOVENDO PROPRIEDADES
// delete novaPessoa.linkedin;
// const {email, ...novaPessoa2} = novaPessoa;
// console.log(novaPessoa2)

// const _ = require('lodash');
// const novaPessoa3 = _.omit(novaPessoa2, ['idade']);
// console.log(novaPessoa3);
// // npm install lodash
// delete pessoa.salario;

// const novaPessoa4 = Object.fromEntries(
//     Object.entries(novaPessoa3).filter(([key]) => key !== 'profissao')
// );
// console.log(novaPessoa4);

// function removerPropriedade(obj, prop){
//     const {[prop]: _, ...resto} = obj;
//     return resto;
// }
// const novaPessoa5 = removerPropriedade(novaPessoa4,'salario');
// console.log(novaPessoa5.salario);

// /**
//  * ...Spread Operator
//  */

// // MÉTODOS
// const alunos = {
//     nome: 'Anajara',
//     curso: 'Java Full',
//     cumprimentar: function(){
//         console.log("Olá " + this.nome + "!");
//     }
// }
// alunos.cumprimentar();
// class Pessoa{
//     constructor(nome, altura, idade){
        // this.nome = nome;
        // this.altura = altura;
        // this.idade = idade;
//     }
// }

// function Pessoa(nome, altura, idade){
//     this.nome = nome;
//     this.altura = altura;
//     this.idade = idade;
// // Método falar
//     this.falar=function(){
//         console.log(`Olá, meu nome é ${this.nome}`);
//     }
//     // Método crescer
//     this.crescer = function(centimetros) {
//         this.altura += centimetros / 100; // Convertendo para metros
//     };
// }

// // Adicionando método usando Object.defineProperty
// Object.defineProperty(Pessoa.prototype, 'andar', {
//     value: function(){
//         console.log("Pessoa andando.");
//     },
//     enumerable:false, //
//     configurable:true
// });

// const aluno = new Pessoa('Thiago', 1.75, 33);
// // ADICIONANDO MÉTODOS AO CONSTRUTOR (PROTOTYPE)
// Pessoa.prototype.falar=function(){
//     console.log(`Olá, meu nome é ${this.nome}`);
// }
// Pessoa.prototype.crescer=function(centimentros){
//     this.altura += centimentros/100;
// }
// Pessoa.prototype.envelhecer=function(anos){
//     this.idade += anos;
// }

// const aluno2 = new Pessoa('Adriano', 1.75, 41);
// aluno.falar();
// aluno.crescer(3);
// aluno.envelhecer(2);
// console.log(aluno.idade)
// aluno.andar();
// const alunos = {
//     aluno1: aluno,
//     aluno2: aluno2
// };

// console.log(alunos.aluno2.idade);

//CLASSES
// class Pessoa{
//     constructor(nome, altura, idade){
//         this.nome = nome;
//         this.altura = altura;
//         this.idade = idade;
//     }
//     //Método
//     crescer(centimetros){
//         this.altura += centimetros/100;
//     }
// }

// Definindo uma classe abstrata Pessoa
class Pessoa {
    constructor(nome, altura, idade) {
        if (this.constructor === Pessoa) {
            throw new Error('Não é possível instanciar uma classe abstrata');
        }
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    // Método abstrato falar
    falar() {
        throw new Error('O método abstrato "falar" deve ser implementado');
    }

    // Métodos concretos
    crescer(centimetros) {
        this.altura += centimetros / 100; // Convertendo para metros
    }

    envelhecer(anos) {
        this.idade += anos;
    }
}

// Classe concreta Aluno que estende Pessoa
class Aluno extends Pessoa {
    constructor(nome, altura, idade, turma) {
        super(nome, altura, idade);
        this.turma = turma;
    }

    // Implementação do método falar
    falar() {
        console.log(`Olá, meu nome é ${this.nome} e eu sou da turma ${this.turma}`);
    }
}

// Criando uma instância de Aluno
const aluno = new Aluno('Thiago', 1.75, 33, 'A');

// Usando o método falar
aluno.falar(); // 'Olá, meu nome é Thiago e eu sou da turma A'

// Tentando instanciar a classe Pessoa diretamente (vai lançar um erro)
// const pessoa = new Pessoa('João', 1.80, 28); // Error: Não é possível instanciar uma classe abstrata
