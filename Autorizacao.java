import java.util.ArrayList;
public class Autorizacao {

    ArrayList<Autorizacao> listaAutorizacao = new ArrayList<>();
    private int codigo;

    private String data;

    private String exameEscolhido;
    
    private Paciente paciente;

    private Medico medico;

    public Autorizacao(int codigo, String data, String exameEscolhido, Paciente paciente, Medico medico) {
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

    public ArrayList<Autorizacao> getListaAutorizacao() {
        return listaAutorizacao;
    }

    public String getExameEscolhido() {
        return exameEscolhido;
    }

    public String getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }
}
