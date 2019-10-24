package br.edu.ifpb;

import java.util.NavigableSet;
import java.util.TreeSet;

    public class Universidade {

    private static TreeSet<Professor> ListaDeProfessores;
    //restrição**   ?   (tipo)*(classe)  **   (variavel)   *********Assim quem se declara uma colection. Ex. ArrayList *******
    //linha 8  Static pois não precisa de um objeto. Exemplo Não precisa instanciar com new.

        public static void main( String[] args ) {

        ListaDeProfessores = new TreeSet<>();
        // Linha 14. Instanciamos o professor Joaquim
        // linha 15. Instaciamos a Lista de professores criada anteriormente usando o TreeSet
        Menu menu = new Menu((TreeSet<Professor>) ListaDeProfessores);
        menu.ExibirMenu();
        }


        public static void CadastraFunc(String[] funcionario){
            int idade = Integer.parseInt(funcionario[0]);
            // Linha 25 Convertemos uma String para um inteiro, usando o interger.parseInt.
            String nome = (funcionario[1]);
            int matricula = Integer.parseInt(funcionario[2]);
            double salario = Double.parseDouble(funcionario[3]);
            int numHoras = Integer.parseInt(funcionario[4]);
            Professor novo = new Professor (idade, nome, matricula, salario, numHoras);
            System.out.println(novo.toString());



        }

        public static void RemoverFunc(int matricula){

        }
        public static void AtualizaFunc(String[] funcionario){

        }



}
