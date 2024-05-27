//estruturas condicionais
//if else

//condicionais simples
// 
let idade = 500;

if (idade >= 0 && idade <= 100) {
    if (idade <= 12) {
        console.log("criança");
    } else if (idade > 12 && idade < 18) {
        console.log("adolescente");
    } else if (idade >= 18 && idade < 60) {
        console.log("adulto");
    } else {
        console.log("idoso");
    }
} else {
    console.log("Idade inválida. Por favor, insira um valor entre 0 e 100.");
}

// ternario
 idade = 500;
 console.log((idade >= 0 && idade <= 100) ? (idade <= 12 ? "criança" : (idade <= 17 ? "adolescente" : (idade < 60 ? "adulto" : "idoso"))) : "Idade inválida. Por favor, insira um valor entre 0 e 100.");
 
// estrutura de seleção
//estrutura switch.. case
let dia = 5; 

let nomeDoDia;

switch (dia) {
    case 1:
        nomeDoDia = "Domingo";
        break;
    case 2:
        nomeDoDia = "Segunda-feira";
        break;
    case 3:
        nomeDoDia = "Terça-feira";
        break;
    case 4:
        nomeDoDia = "Quarta-feira";
        break;
    case 5:
        nomeDoDia = "Quinta-feira";
        break;
    case 6:
        nomeDoDia = "Sexta-feira";
        break;
    case 7:
        nomeDoDia = "Sábado";
        break;
    default:
        nomeDoDia = "Número inválido. Por favor, insira um valor entre 1 e 7.";
}

console.log(nomeDoDia);


