package org.example.orientacaoObjeto.Escola;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EscolaApp {

        public static void main(String[] args) {
            ArrayList<Aluno> alunos = new ArrayList<>();
            alunos.add(new Aluno("NETO", 20, "Av. Paulista, 1000", 1, 9.0));
            alunos.add(new Aluno("Douglas", 20, "Av. Paulista, 1000", 1, 9.0));

            Aluno aluno = new Aluno("Thiago", 20, "Av. Paulista, 1000", 1, 9.0);
            aluno.setNota(aluno.getNota(9.0, 9.0, 9.0, 9.0));

            for (Aluno a : alunos) {
                System.out.println(a.getNome());
                System.out.println(a.getIdade());
                System.out.println(a.getEndereco());
                System.out.println(a.getSala());
                System.out.println("Resultado do aluno do semestre: " + a.getNota());
            }

            // Additionally, print details for the individual aluno object
            System.out.println(aluno.getNome());
            System.out.println(aluno.getIdade());
            System.out.println(aluno.getEndereco());
            System.out.println(aluno.getSala());
            System.out.println("Resultado do aluno do semestre: " + aluno.getNota());
        }
    }
