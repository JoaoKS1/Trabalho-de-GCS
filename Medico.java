public class Autorizacao {
    private int codigo;

    private String data;

    private String exame;

    private String paciente;

    private Medico medico;

    public Autorizacao(int codigo, String data, String exame, String paciente, Medico medico) {
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
