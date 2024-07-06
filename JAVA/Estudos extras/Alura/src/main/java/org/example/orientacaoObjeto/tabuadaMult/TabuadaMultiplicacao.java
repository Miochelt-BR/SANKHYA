package org.example.orientacaoObjeto.tabuadaMult;

public class TabuadaMultiplicacao  implements Tabuada {



    @Override
    public void mostrarTabuada(int num) {

        for (int i = 1; i <= 10; i++) {

            int resultado = num * i;

            System.out.println(num + " x " + i + " = " + resultado);
        }
    }



}

