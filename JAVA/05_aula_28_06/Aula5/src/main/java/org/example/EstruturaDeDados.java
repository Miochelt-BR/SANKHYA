package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EstruturaDeDados {


            public static void main(String[] args) {
                  //FIFO (First In First Out) - FILA
                //LIFO (Last In First Out) - PILHA

                //Queue (Interface) para FIFO
            /*
            * Métodos principais
            add() - adiciona um elemento a lista
            poll() - remove o elemento do início da fila
            peek() - retorna o elemento do inicio da fila.
            */
                Queue<String> fifo = new LinkedList<>();
                Deque<String> fifo2 = new LinkedList<>();
                //Adicionando elementos na fila
                //Inserção (enqueue)
                fifo.add("Elemento A");
                fifo.add("Elemento B");
                fifo.add("Elemento C");
                fifo2.addFirst("asdfsda");
                fifo2.addLast("asdfsdf");
                //Imprimindo
                for(String x : fifo){
                    System.out.println(x);
                }
                //Removendo elementos da fila
                //Remoção  (dequeue)
                System.out.println("Removendo: " + fifo.poll()); //Elemento 1
                System.out.println("Quem é o próximo: " + fifo.peek());
                System.out.println("Removendo: " + fifo.poll()); //Elemento 2
                for(String x : fifo){
                    System.out.println(x);
                }
                //Stack (Classe) para LIFO
        /*
            * Métodos principais
            push() - adiciona um elemento ao topo da pilha
            pop() - remove o elemento do topo da pilha
            peek() - retorna o elemento do inicio da pilha.
            */
                Stack<String> lifo = new Stack<>();
                //Adicionando elementos na pilha
                //Inserção (push)
                lifo.push("Elemento 1");
                lifo.push("Elemento 2");
                lifo.push("Elemento 3");

                //imprimindo a lista
                for(String x : lifo){
                    System.out.println(x);
                }
                //Removendo elementos da pilha
                //Remoção (pop)
                System.out.println("Removendo: " + lifo.pop()); //Elemento 3
                System.out.println("Removendo: " + lifo.pop()); //Elemento 2

                //HashMap
                //TreeMap
                //HashSet
                //TreeSet
                //PriorityQueue
                //Deque
                //ArrayDeque
                //LinkedHashMap
            }
    }

