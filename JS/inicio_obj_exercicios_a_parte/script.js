class Pessoa{
    nome;
    altura;
    peso
    constructor(nome ,altura,peso) {
        this.nome = nome;
        this.altura= altura;
        this.peso=peso;
    } 
    somaImc(){   
      console.log('senhor, seu imc eh', + (this.peso / (this.altura * this.altura)));
    }

}
const p1 = new Pessoa("thiago",1.75,85)
const p2 = new Pessoa("thiago",1.75,95)

p1.somaImc ();

    
class Carro{
    marca;
    cor;
    gastoMerdio;

    constructor(marca,cor,gastoMerdio) {
        this.marca = marca;
        this.cor = cor;
        this.gastoMerdio = gastoMerdio;
}

calcGastoMerdio(distanciaKm,valorCombustivel) { 
    return distanciaKm * this.gastoMerdio* valorCombustivel; 
   
}

}
const corsa = new Carro("chevrole", "vermelho",1/5);
console.log( corsa.calcGastoMerdio(90,5));












