import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Usuario> listaUsuarios;

    public Administrador(String nome, int identificador) {
        super(nome, identificador, "administrador");
        this.listaUsuarios = new ArrayList<>();
    }

    public void adicionarUsuario(String nome, int identificador, String tipos) {
        Usuario novoUsuario = new Usuario(nome, identificador, tipos);
        listaUsuarios.add(novoUsuario);
    }

    public void buscarUsuarioPorNome(String parteDoNome) {
        for (Usuario usuario : listaUsuarios) {

            if (usuario.getNome().toLowerCase().contains(parteDoNome.toLowerCase())) {
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Identificador: " + usuario.getIdentificador());

                if (usuario instanceof Medico) {
                    listarAutorizacoesMedico((Medico) usuario);
                } else if (usuario instanceof Paciente) {
                    listarAutorizacoesPaciente((Paciente) usuario);
                }
            }
        }
    }

    public void listarAutorizacoesMedico(Medico medico) {
        for (Autorizacao autorizacao : medico.getListaAutorizacao()) {
            System.out.println("Código da Autorização: " + autorizacao.getCodigo());
            System.out.println("Data da Autorização: " + autorizacao.getData());
            System.out.println("Exame Escolhido: " + autorizacao.getExameEscolhido());
            System.out.println("Paciente: " + autorizacao.getPaciente().getNome());
            System.out.println("------------------------");
        }
    }

    public void listarAutorizacoesPaciente(Paciente paciente) {
        for (Autorizacao autorizacao : paciente.getListaAutorizacao()) {
            System.out.println("Código da Autorização: " + autorizacao.getCodigo());
            System.out.println("Data da Autorização: " + autorizacao.getData());
            System.out.println("Exame Escolhido: " + autorizacao.getExameEscolhido());
            System.out.println("Médico: " + autorizacao.getMedico().getNome());
            System.out.println("------------------------");
        }
    }
}


public void mostrarEstatisticas() {
    int numMedicos = 0;
    int numPacientes = 0;
    int numAutorizacoesEmitidas = listaAutorizacao.size();

    for (Usuario usuario : listaUsuarios) {
        if (usuario instanceof Medico) {
            numMedicos++;
        } else if (usuario instanceof Paciente) {
            numPacientes++;
        }
    }

    double percentualExamesRealizados = calcularPercentualExamesRealizados();

    System.out.println("Número de médicos: " + numMedicos);
    System.out.println("Número de pacientes: " + numPacientes);
    System.out.println("Número de autorizações emitidas: " + numAutorizacoesEmitidas);
    System.out.println("Percentual de autorizações com exames já realizados: " + percentualExamesRealizados + "%");
}

private double calcularPercentualExamesRealizados() {
    int totalAutorizacoes = listaAutorizacao.size();
    int autorizacoesComExamesRealizados = 0;

    for (Autorizacao autorizacao : listaAutorizacao) {
        if (autorizacao.isExameRealizado()) {
            autorizacoesComExamesRealizados++;
        }
    }

    if (totalAutorizacoes == 0) {
        return 0.0;
    } else {
        return ((double) autorizacoesComExamesRealizados / totalAutorizacoes) * 100.0;
    }
}

