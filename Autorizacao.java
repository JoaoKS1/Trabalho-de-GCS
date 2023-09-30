import java.util.ArrayList;
public class Autorizacao {

    ArrayList<Autorizacao> listaAutorizacao = new ArrayList<>();
    private int codigo;

    private String data;
    
    private int exameEscolhido;

    private final String[] exames = {"Raio-X","Colonoscopia","Mamografia","Eletrocardiograma","Hemograma"
                             ,"Endoscopia","Biópsia","Ressonância Magnética","Exame de Urina","Eletroencefalografia"};

    private Paciente paciente;

    private Medico medico;

    public Autorizacao(int codigo, String data, int exameEscolhido, Paciente paciente, Medico medico) {
        this.codigo = codigo;
        this.data = data;
        this.exameEscolhido = exameEscolhido;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public String getExame() {
        return exame;
    }

    public String getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }
}
