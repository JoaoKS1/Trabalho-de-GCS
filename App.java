public class App {

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private ArrayList<Exames> lista;
    private Scanner in;

    public App() {
        in = new Scanner(System.in);
        lista = new ArrayList<Livro>();
    }

    public void inicializa() {
        Medico m1 = new Medico("João", "1111", "Cirurgiao");
    }

    public void executa() {
        int opcao = 0;
        do {
            System.out.println("===================");
            System.out.println("Opcoes:");
            System.out.println("[0] Sair");
            System.out.println("[1] Se indentificar");
            System.out.print("Digite a opcao desejada: ");
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    Indetificar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    public void Indetificar (){
        System.out.println("===================");
        System.out.println("Opcoes:");
        System.out.println("[1] Sou Médico");
        System.out.println("[2] Sou Administrador");
        System.out.println("[3] Sou Paciente");
        System.out.println("[0] Sair.");
        System.out.print("Digite a opcao desejada: ");

        opcao = in.nextInt();
        switch (opcao) {

                case 2:
                    System.out.println("Digite seu nome:");
                    String nome = in.nextLine();
                    System.out.println("Digite sua senha:");
                    String senha = in.nextLine();
                    if (nome.equals(m1.getNome()) && senha.equals(m1.getCodigo())){
                        do {
                            System.out.println("===================");
                            System.out.println("Opcoes:");
                            System.out.println("[0] Sair");
                            System.out.println("[1] Adicionar Usuario");
                            System.out.println("[2] Listar autorizações ");
                            System.out.println("[3] Ver estatisticas do hospital ");
                            System.out.print("Digite a opcao desejada: ");
                            opcao = in.nextInt();

                            switch (opcao) {

                                case 1:
                                    addUsuario();
                                    break;
                                case 2:
                                    listarAutorizacaoAdiministardor();
                                    break;
                                case 3:
                                    mostrarEstatisticas();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida.");
                            }
                        } while (opcao != 0);
                        
                    }
                    else {System.out.println("Senha nome ou errado");}
                    break;
                case 1:
                    System.out.println("Digite seu nome:");
                    String nome = in.nextLine();
                    System.out.println("Digite sua senha:");
                    String senha = in.nextLine();
                    if (nome.equals(m1.getNome()) && senha.equals(m1.getCodigo())){
                         do {
                            System.out.println("===================");
                            System.out.println("Opcoes:");
                            System.out.println("[0] Sair");
                            System.out.println("[1] Adicionar autorizações");
                            System.out.println("[2] Listar autorizações");
                            System.out.print("Digite a opcao desejada: ");
                            opcao = in.nextInt();

                            switch (opcao) {

                                case 1:
                                    addAutorizacao();
                                    break;
                                case 2:
                                    listarAutorizacao();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida.");
                            }
                        } while (opcao != 0);
                    }
                    else {System.out.println("Senha nome ou errado");}

                    break;
                case 3:
                    System.out.println("Digite seu nome:");
                    String nome = in.nextLine();
                    System.out.println("Digite sua senha:");
                    String senha = in.nextLine();
                    if (nome.equals(m1.getNome()) && senha.equals(m1.getCodigo())){
                         do {
                            System.out.println("===================");
                            System.out.println("Opcoes:");
                            System.out.println("[0] Sair");
                            System.out.println("[1] Adicionar data de realização do exame: ");
                            System.out.println("[2] Listar autorizações");
                            System.out.print("Digite a opcao desejada: ");
                            opcao = in.nextInt();

                            switch (opcao) {

                                case 1:
                                    addExame();
                                    break;
                                case 2:
                                    listarAutorizacao();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida.");
                            }
                        } while (opcao != 0);
                    }
                    else {System.out.println("Senha nome ou errado");}

                    break;

                case 0:

                    break;

                default:
                    System.out.println("Opcao invalida.");
            } while (opcao != 0);
    }
}
