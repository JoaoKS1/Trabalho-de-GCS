import java.util.ArrayList;
public class Autorizacao {

    ArrayList<Autorizacao> listaAutorizacao = new ArrayList<>();
    private int codigo;

    private String data;

    private String exame;

    private Paciente paciente;

    private Medico medico;

    public Autorizacao(int codigo, String data, String exame, Paciente paciente, Medico medico) {
        this.codigo = codigo;
        this.data = data;
        this.exame = exame;
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
