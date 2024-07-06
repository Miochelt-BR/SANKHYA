package org.example.orientacaoObjeto.ExercicioCurso2.carro.carro;

class ModeloCarro extends Carro {
    private String modelo;

    public ModeloCarro(String modelo) {
        super();
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirModelo() {
        System.out.println("Modelo: " + modelo);
    }
}