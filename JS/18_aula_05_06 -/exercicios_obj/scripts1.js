//Gestão de Contatos:
//- Crie uma classe `Contato` com propriedades como nome, telefone e email.
//- Crie uma classe `Agenda` que possa adicionar, remover e pesquisar contatos.
class Contato (){
    constructor(nome,telefone,email){
 this.nome = nome;
 this.telefone = telefone;
this.email= email;
    }
}
class agenda{
    constructor(){
        this.Contato
    }
adicionarContato(contato){
    this.contato.push(contato)
}

removerContato(nome) {
    this.contato = this.contato.filter(contato => contato.nome !== nome);
  }
  pesquisarContato(nome) {
    return this.contato.find(contato => contato.nome === nome);
  }

}


//Sistema Bancário:
//    - Crie uma classe `ContaBancaria` com propriedades como saldo e número da conta.
//    - Implemente métodos para depositar, sacar e verificar o saldo da conta.
class ContaBancaria {
    constructor(numero,saldo = 0){
        this.numero=numero;
        this.saldo = saldo;
    }
    depositar(valor){
        this.saldo =+ valor;
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
// Loja Online:
//    - Crie uma classe `Produto` com propriedades como nome, preço e quantidade em estoque.
//    - Crie uma classe `CarrinhoDeCompras` que possa adicionar produtos, calcular o total da compra e finalizar a compra.
class Produtor (){
    constructor(nome,preço,quantidade){
        this.nome=nome
    }
}