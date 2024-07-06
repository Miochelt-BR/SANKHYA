package org.example.orientacaoObjeto.AricaFlixOne.calculadora;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel){
        if(classificavel.getclassificacao() >=4){
            System.out.println("Esta entre os preferidos dos momentos");
        } else if (classificavel.getclassificacao() >=3){
            System.out.println("Esta entre os preferidos dos momentos");
        } else if (classificavel.getclassificacao() >=2){
            System.out.println("Esta entre os preferidos dos momentos");


        }

        else {
            System.out.println("nao  esta entre os preferidos mas vale a pena a dar changed");
        }
    }
        {
    }
}
