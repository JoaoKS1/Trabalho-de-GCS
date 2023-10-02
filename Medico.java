import java.util.Scanner;
public class Medico extends Usuario {
    private Scanner in;
    private final String[] exames = {"Raio-X","Colonoscopia","Mamografia","Eletrocardiograma","Hemograma"
            ,"Endoscopia","Biópsia","Ressonância Magnética","Exame de Urina","Eletroencefalografia"};

    //Autorizacao autorizacao;

    public Medico (String nome, int identificador, String senha){
        super(nome, identificador, senha);
    }
    
    public void addAutorizacao(){
        in = new Scanner(System.in);
        System.out.println("Digite o código da autorização: ");
        int codigo = in.nextInt();
        System.out.println("Digite a data de cadastro (Formato: dd/mm/aaaa): ");
        String data = in.nextLine();
        System.out.println("Escolha o exame solicitado: ");
        for (int i = 0; i < exames.length; i++) {
            System.out.println(exames[i]);
        }
        String exameEscolhido = exames[in.nextInt()];
        System.out.println("Digite o identificador do paciente: ");
        int identificadorPaciente = in.nextInt();
        // Criar lista de usuários a partir da classe administrador,
        // e comparar os identificadores para botar como parametro na autorizacao abaixo
        System.out.println("Digite o identificador do médico: ");
        int identificadorMedico = in.nextInt();
        Autorizacao x = new Autorizacao(codigo, data,exameEscolhido); //adicionar parametros restantes
        System.out.println("Autorização criada com sucesso!");
    }
}
