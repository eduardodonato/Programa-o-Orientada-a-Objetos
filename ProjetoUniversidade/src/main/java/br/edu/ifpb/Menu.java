package br.edu.ifpb;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.TreeSet;

public class Menu {
    public TreeSet<Professor> ListaP;

    public Menu() {

    }

    public Menu(TreeSet<Professor> ListaP) {
//
        this.ListaP = new TreeSet<>();
        this.ListaP = ListaP;
    }

    public void ExibirMenu() {
        System.out.println("Bem vindo ao quadro de novos funcionarios das Industrias Starks");
        String dados;
        String[] funcionario = new String[5];
        Scanner scanner = new Scanner(System.in);
        int entrada = 0;

        while (true) {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("Prima -1- Para cadastrar novo funcionario: ");
            System.out.println("Prima -2- Para remover funcionario: ");
            System.out.println("Prima -3- Para Atualizar: ");
            System.out.println("Prima -4- Para imprimir todos os funcionarios matriculados");
            entrada = scanner.nextInt();
            if (entrada == 1) {
                System.out.println("Prima os dados do novo funcionario");
                dados = scanner.next();
                funcionario = dados.split(" ");
                // linha 36 é o metodo que quebra strings em um array dado um parametro, no caso acima será um espaço.
                Universidade.CadastraFunc(funcionario);
            } else if (entrada == 2) {
                System.out.println("Prima a matricula do funcionario que desejas demitir");
                entrada = scanner.nextInt();
                Universidade.RemoverFunc(entrada);
            } else if (entrada == 3) {
                System.out.println("Prima a matricula do funcioario que se deseja efetuar alteração de dados");
                entrada = scanner.nextInt();
                System.out.println("Prima os novos dados a serem atualizados");
                dados = scanner.next();
                funcionario = dados.split(" ");
                Universidade.AtualizaFunc(funcionario);
            } else if (entrada == 4) {
                //for....
                System.out.println();
            }
            else if (entrada == 5){
                break;
            }

        }
    }
}