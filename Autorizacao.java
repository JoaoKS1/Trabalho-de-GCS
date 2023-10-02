import java.util.ArrayList;
public class Autorizacao {

    ArrayList<Autorizacao> listaAutorizacao = new ArrayList<>();
    private int codigo;

    private String data;

    private String exameEscolhido;
    
    private Paciente paciente;

    private Medico medico;

    private boolean exameRealizado;

    public Autorizacao(int codigo, String data, String exameEscolhido, Paciente paciente, Medico medico, boolean exameRealizado) {
        this.codigo = codigo;
        this.data = data;
        this.exameEscolhido = exameEscolhido;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Autorizacao() {

    }

    public void addAutorizacao(){
        Autorizacao x = new Autorizacao(codigo, data,exameEscolhido, paciente, medico, exameRealizado);
        listaAutorizacao.add(x);
        System.out.println("Autorização criada com sucesso!");
    }

    public void setListaAutorizacao(ArrayList<Autorizacao> listaAutorizacao) {
        this.listaAutorizacao = listaAutorizacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setExameEscolhido(String exameEscolhido) {
        this.exameEscolhido = exameEscolhido;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
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

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public boolean isExameRealizado() {
        return exameRealizado;
    }

    public void setExameRealizado(boolean exameRealizado) {
        this.exameRealizado = exameRealizado;
    }
}
