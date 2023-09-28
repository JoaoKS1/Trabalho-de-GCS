public class Usuario {
    protected String nome;

    protected String tipos;

    Public Usuario() {

    }

    Public Usuario(String nome, String tipos) {
        this.nome = nome;
        this.tipos = tipos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
}