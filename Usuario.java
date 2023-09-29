public class Usuario {
    protected String nome;

    protected int identificador;

    protected String tipos;

    public Usuario(String nome, int identificador, String tipos) {
        this.nome = nome;
        this.identificador = identificador;
        this.tipos = tipos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getTipos() {
        return tipos;
    }
}
