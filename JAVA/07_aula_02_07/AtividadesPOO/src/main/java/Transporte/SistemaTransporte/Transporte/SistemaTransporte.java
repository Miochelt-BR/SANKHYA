package Transporte.SistemaTransporte.Transporte;



import Transporte.*;

import static java.lang.System.*;

public class SistemaTransporte {
    public static void main(String[] args) {
        Transporte onibus = new Onibus(40, 60, 3.5);
        Transporte trem = new Trem(100, 200, 5.0);
        Transporte metro = new Metro(150, 300, 4.0);

        onibus.imprimirDetalhes();
        trem.imprimirDetalhes();
        metro.imprimirDetalhes();

        out.println("Tarifa total do ônibus para 50 passageiros: " + onibus.calcularTarifaTotal(50));
        out.println("Tarifa total do trem para 150 passageiros: " + trem.calcularTarifaTotal(150));
        out.println("Tarifa total do metrô para 200 passageiros: " + metro.calcularTarifaTotal(200));

        ((Manutencao) onibus).realizarManutencao();
        ((Manutencao) trem).realizarManutencao();
        ((Manutencao) metro).realizarManutencao();

        out.println("Horário de funcionamento do ônibus: " + ((HorarioDeFuncionamento) onibus).getHorarioDeFuncionamento());
        out.println("Horário de funcionamento do trem: " + ((HorarioDeFuncionamento) trem).getHorarioDeFuncionamento());
        out.println("Horário de funcionamento do metrô: " + ((HorarioDeFuncionamento) metro).getHorarioDeFuncionamento());
    }

    private static Object getHorarioDeFuncionamento() {
        return null;
    }

}
