public class Usuario {
    protected String nome;

    protected int identificador;

    protected String senha;

    public Usuario(String nome, int identificador, String senha) {
        this.nome = nome;
        this.identificador = identificador;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }


}
