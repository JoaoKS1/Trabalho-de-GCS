
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private ArrayList<Autorizacao> lista;
    private int opcao;
    private String nome;
    private String senha;
    private Medico m1;
    private Administrador adm1;
    private Paciente p1;
    private Autorizacao a1;
    private Scanner in;

    public App() {
        in = new Scanner(System.in);
        lista = new ArrayList<Autorizacao>();
        m1 = new Medico("João", 1111, "1234");
        adm1 = new Administrador("Maria",2222, "1234");
        p1 = new Paciente("José", 3333, "1234");
        a1 = new Autorizacao(1234, "12/12/2020", "Raio-X", p1, m1);

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
                    Identificar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    public void Identificar (){
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
                    nome = in.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = in.nextLine();
                    if (nome.equals(m1.getNome()) && senha.equals(m1.getSenha())) {
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
                                    System.out.println("Digite o nome do usuario:");
                                    nome = in.nextLine();
                                    System.out.println("Digite o identificador do usuario:");
                                    int identificador = in.nextInt();
                                    System.out.println("Digite o tipo do usuario (Medico, Paciente ou Administrador):");
                                    String tipo = in.nextLine();
                                    System.out.println("Digite a senha do usuario:");
                                    senha = in.nextLine();
                                    adm1.adicionarUsuario(nome,identificador,tipo, senha);
                                    break;
                                case 2:
                                    System.out.println("Digite o nome do usuario:");
                                    nome = in.nextLine();
                                    adm1.buscarUsuarioPorNome(nome);
                                    break;
                                case 3:
                                    adm1.mostrarEstatisticas();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida.");
                            }
                        } while (opcao != 0);
                        
                    }
                    else {System.out.println("Senha ou nome errado!");}
                    break;
                case 1:
                    System.out.println("Digite seu nome:");
                    nome = in.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = in.nextLine();
                    if (nome.equals(m1.getNome()) && senha.equals(m1.getSenha())){
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
                                    m1.addAutorizacao();
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
                    nome = in.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = in.nextLine();
                    if (nome.equals(p1.getNome()) && senha.equals(p1.getSenha())){
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
                                    System.out.println("Digite a data de realização do exame: ");
                                    String data = in.nextLine();
                                    System.out.println("Digite o código da autorização: ");
                                    int codigo = in.nextInt();
                                    for (int i = 0; i < lista.size(); i++) {
                                        if (lista.get(i).getCodigo() == codigo) {
                                            lista.get(i).setData_Exame(data);
                                        }
                                    }
                                    p1.marcarExameRealizado(a1, data);
                                    break;
                                case 2:
                                    p1.listarAutorizacoesExame();
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
