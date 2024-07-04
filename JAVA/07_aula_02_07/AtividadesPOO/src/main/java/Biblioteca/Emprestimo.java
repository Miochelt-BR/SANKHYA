package Biblioteca;

import java.util.Date;


    interface Emprestimo {
        void emprestar(Date dataEmprestimo);
        void devolver(Date dataDevolucao);
    }


