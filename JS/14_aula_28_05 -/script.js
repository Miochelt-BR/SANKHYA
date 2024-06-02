function verificarIdade() {
    var idade = document.getElementById('idade').value;
    var resultado = document.getElementById('resultado');
    if (idade >= 0 && idade <= 12) {
        resultado.textContent = "Criança";
    } else if (idade > 12 && idade < 18) {
        resultado.textContent = "Adolescente";
    } else if (idade >= 18 && idade < 60) {
        resultado.textContent = "Adulto";
    } else if (idade >= 60 && idade <= 120) {
        resultado.textContent = "Idoso";
    } else {
        resultado.textContent = "Idade Inválida";
    }
}

function verificarMes() {
    var mes = document.getElementById('mes').value;
    var resultado = document.getElementById('resultado2');
    switch (mes) {
        case "1":
            resultado.textContent = "Janeiro: Um novo ano começa com novas oportunidades. Faça de janeiro o melhor mês do ano!";
            break;
        case "2":
            resultado.textContent = "Fevereiro: O mês do amor e da alegria. Aproveite cada momento!";
            break;
        case "3":
            resultado.textContent = "Março: A primavera começa a florescer e com ela, novas esperanças.";
            break;
        case "4":
            resultado.textContent = "Abril: Tempo de renovação e crescimento. Deixe-se inspirar!";
            break;
        case "5":
            resultado.textContent = "Maio: Mês das flores e da beleza. Que maio traga cores e alegria para sua vida.";
            break;
        case "6":
            resultado.textContent = "Junho: Mês de festas e celebrações. Que seu junho seja repleto de felicidade!";
            break;
        case "7":
            resultado.textContent = "Julho: Mês de férias e diversão. Aproveite cada instante!";
            break;
        case "8":
            resultado.textContent = "Agosto: Um mês para conquistas e realizações. Vá em frente e brilhe!";
            break;
        case "9":
            resultado.textContent = "Setembro: A primavera retorna, trazendo consigo novas oportunidades e sonhos.";
            break;
        case "10":
            resultado.textContent = "Outubro: Mês das crianças e das cores vibrantes. Que outubro seja doce e encantador!";
            break;
        case "11":
            resultado.textContent = "Novembro: Tempo de reflexão e gratidão. Agradeça por tudo que alcançou até agora.";
            break;
        case "12":
            resultado.textContent = "Dezembro: O ano termina, mas as memórias e conquistas permanecem. Que dezembro seja mágico!";
            break;
        default:
            resultado.textContent = "Mês Inválido. Por favor, insira um número de 1 a 12.";
    }
}
// Questão 1 verificar media

function verificarMedia() {
    // Obtendo os valores das notas como strings a partir dos inputs
    var nota1 = document.getElementById('nota1').value;
    var nota2 = document.getElementById('nota2').value;
    var nota3 = document.getElementById('nota3').value;

    // Convertendo as strings para números de ponto flutuante
    nota1 = parseFloat(nota1);
    nota2 = parseFloat(nota2);
    nota3 = parseFloat(nota3);




    // Calculando a média das três notas
    var mediaGeral = (nota1 + nota2 + nota3) / 3;

    // Exibindo a média no elemento <p> com id "mediaGeral"
    // toFixed(2) formata o número com duas casas decimais
    document.getElementById('mediaGeral').innerText = "A média geral é: " + mediaGeral.toFixed(2);
}

// Questão 2 verificar IMC
function verificarImc() {

    var peso = document.getElementById('peso').value;
    var altura = document.getElementById('altura').value;

    // Convertendo as strings para números de ponto flutuante
    peso = parseFloat(peso);
    altura = parseFloat(altura);

    var resultadoImc = (peso) / (altura * altura)

    document.getElementById('resultadoImc').innerText = "O seu IMC é de: " + resultadoImc.toFixed(2);
}
//Questao 3 verificar ano de nascimento
function verificarAno(){
    var idade1 = document.getElementById('idade1').value;
    var ano = document.getElementById('ano').value;
    
        idade1 = parseFloat(idade1);
        ano = parseFloat(ano);
        
        var resultadoAno = (ano-idade1)
    
        document.getElementById('resultadoAno').innerText = "O ano que você nasceu: " + resultadoAno;
    }
    