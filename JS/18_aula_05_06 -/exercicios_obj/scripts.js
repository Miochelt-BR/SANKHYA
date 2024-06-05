//1. Calculadora de Geometria:
//- Crie uma classe `Forma` que tenha métodos para calcular a área e o perímetro.
//- Crie subclasses para formas geométricas como `Retângulo`, `Círculo`, `Triângulo`, etc., cada uma com métodos para calcular sua área e perímetro específicos.
class Forma {
    calcularArea(){
        return 0.0  
    }
    calcularPerimetro(){
        return 0.0
    } 
      
}

class retangulo extends Forma{
    constructor(base, altura){
        super();
        this.base=base
        this.altura=altura
        
    }
    calcularArea(){
         return this.base*this.altura;
    }
    calcularPerimetro(){
        return (this.base+this.altura)*2;
    }
}

// let xy = new  retangulo(10,20)
// console.log("Perímetro do Retângulo:", xy.calcularPerimetro());
// console.log("Área do Retângulo:", xy.calcularArea());


class circulo extends Forma{
    constructor(raio){
        super();
        this.raio=raio;
        
        
    }
    calcularArea(){
        return Math.PI * this.raio * this.raio;
    }
    calcularPerimetro(){
        return 2 * Math.PI * this.raio;
    }
}
// let circ = new circulo(10);
// console.log("Perimetro do circulo" , circ.calcularPerimetro());
// console.log("Area do circulo", circ.calcularArea());

class triangulo extends Forma{
 constructor(ladoA, base, ladoC, altura){
    super()
    this.ladoA = ladoA;
    this.base = base;
    this.ladoC = ladoC;
    this.altura = altura;
 }   
 calcularArea(){
    return (this.base * this.altura)/2;
 }
calcularPerimetro(){
    return this.ladoA + this.ladoC + this.base;
}
}
let tria = new triangulo(15,20,15,8);
console.log('perimetro do triangulo', tria.calcularPerimetro());
console.log('area de um triangulo', tria.calcularArea());



//2. Jogo da Velha:
//- Crie uma classe `JogoDaVelha` que represente o tabuleiro e as regras do jogo.
//- Implemente métodos para marcar uma posição no tabuleiro, verificar se há um vencedor e reiniciar o jogo.



class JogoDaVelha {
    constructor() {
        this.reiniciar();
    }

    // Reinicia o jogo
    reiniciar() {
        this.tabuleiro = Array(3).fill().map(() => Array(3).fill(''));
        this.jogadorAtual = 'X';
    }

    // Marca uma posição no tabuleiro
    marcarPosicao(linha, coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || this.tabuleiro[linha][coluna] !== '') {
            return false;
        }
        this.tabuleiro[linha][coluna] = this.jogadorAtual;
        this.jogadorAtual = this.jogadorAtual === 'X' ? 'O' : 'X';
        return true;
    }

    // Verifica se há um vencedor
    verificarVencedor() {
        const combinacoesVencedoras = [
            // Linhas
            [[0, 0], [0, 1], [0, 2]],
            [[1, 0], [1, 1], [1, 2]],
            [[2, 0], [2, 1], [2, 2]],
            // Colunas
            [[0, 0], [1, 0], [2, 0]],
            [[0, 1], [1, 1], [2, 1]],
            [[0, 2], [1, 2], [2, 2]],
            // Diagonais
            [[0, 0], [1, 1], [2, 2]],
            [[0, 2], [1, 1], [2, 0]]
        ];

        for (let combinacao of combinacoesVencedoras) {
            const [a, b, c] = combinacao;
            if (this.tabuleiro[a[0]][a[1]] && 
                this.tabuleiro[a[0]][a[1]] === this.tabuleiro[b[0]][b[1]] && 
                this.tabuleiro[a[0]][a[1]] === this.tabuleiro[c[0]][c[1]]) {
                return this.tabuleiro[a[0]][a[1]];
            }
        }

        return this.tabuleiro.flat().includes('') ? null : 'E';
    }

    imprimirTabuleiro() {
        this.tabuleiro.forEach(row => console.log(row.join(' | ')));
    }
}


const jogo = new JogoDaVelha();

jogo.marcarPosicao(0, 0); // X marca a posição (0, 0)
jogo.marcarPosicao(1, 1); // O marca a posição (1, 1)
jogo.marcarPosicao(0, 1); // X marca a posição (0, 1)

jogo.imprimirTabuleiro();

const vencedor = jogo.verificarVencedor();
console.log(`Vencedor: ${vencedor}`);

jogo.reiniciar();
console.log("Jogo reiniciado.");
jogo.imprimirTabuleiro();


//Gestão de Contatos:
//- Crie uma classe `Contato` com propriedades como nome, telefone e email.
//- Crie uma classe `Agenda` que possa adicionar, remover e pesquisar contatos.


class Contato {
    constructor(nome, telefone, email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
}

class Agenda {
    constructor() {
        this.contatos = [];
    }

    adicionarContato(contato) {
        this.contatos.push(contato);
    }

    removerContato(nome) {
        this.contatos = this.contatos.filter(contato => contato.nome !== nome);
    }

    pesquisarContato(nome) {
        return this.contatos.find(contato => contato.nome === nome);
    }
}

let c1 = new Contato("Doug", 2393832, "douglas.anao@gmail.com");
let c2 = new Contato("Dennys", 565465465, "andrade1fudido@gmail.com");
let c3 = new Contato("Ani", 75564654, "anajara@gmail.com");

let agenda = new Agenda();
agenda.adicionarContato(c1);
agenda.adicionarContato(c2);
agenda.adicionarContato(c3);

console.log("Contato pesquisado:", agenda.pesquisarContato("Ani")); 

agenda.removerContato("Doug");

console.log(agenda.contatos); 

//Sistema Bancário:
//    - Crie uma classe `ContaBancaria` com propriedades como saldo e número da conta.
//    - Implemente métodos para depositar, sacar e verificar o saldo da conta.

class ContaBancaria {
    constructor(numero,saldo = 0){
        this.numero=numero;
        this.saldo = saldo;
    }
    depositar(valor){
        this.saldo += valor;
    }
    sacar(valor){
        if (valor <= this.saldo){
            this.saldo -= valor;}
        else{
            console.log('saldo insuficiente, tente novamente')
        }
    }
    olharSaldo(){
        return this.saldo
    }
}
let minhaConta = new ContaBancaria(1000);
console.log('Saldo inicial:', minhaConta.olharSaldo());
minhaConta.depositar(1000);
console.log('Saldo após depósito:', minhaConta.olharSaldo());
minhaConta.sacar(1500);
minhaConta.sacar(500);
console.log('Saldo após saque:', minhaConta.olharSaldo());



// Loja Online:
//    - Crie uma classe `Produto` com propriedades como nome, preço e quantidade em estoque.
//    - Crie uma classe `CarrinhoDeCompras` que possa adicionar produtos, calcular o total da compra e finalizar a compra.


class Produtor {
    constructor(nome,preco,quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
        
    }
}

class CarrinhoDeCompras {
    constructor(){
        this.itens =[];
    }


adicionarProduto(produto){
    this.itens.push(produto)
}
calcularTotalCompra(){
    return this.itens.reduce((total, produto) => total + (produto.preco * produto.quantidade), 0);
 
}
finalizarCompra() {
    console.log('Compra finalizada!');
}
}
    
let produto1 = new Produtor('Camiseta', 20, 2);
let produto2 = new Produtor('Calça', 50, 1);
let carrinho = new CarrinhoDeCompras();
carrinho.adicionarProduto(produto1);
carrinho.adicionarProduto(produto2);
console.log('Total da compra:', carrinho.calcularTotalCompra());
carrinho.finalizarCompra();

