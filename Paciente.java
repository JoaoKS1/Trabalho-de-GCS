import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.PriorityQueue;

public class Paciente extends Usuario {
    private List<Autorizacao> autorizacoes_exame;

    public Paciente(String nome, int identificador, String senha) {
        super(nome, identificador, senha);
        this.autorizacoes_exame = new ArrayList<>();
    }

    public void marcarExameRealizado(Autorizacao autorizacao, String dataRealizacao) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        long dias = 0;
        long dias_2 = 0;

        try {
            Date data = dateFormat.parse(dataRealizacao);
            dias = data.getTime() / (1000 * 60 * 60 * 24);
            String dia_Autorizacao = autorizacao.getData();
            Date data2 = dateFormat.parse(dia_Autorizacao);
            dias_2 = data2.getTime() / (1000 * 60 * 60 * 24);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < autorizacoes_exame.size(); i++) {
            if (dias < dias_2 || dias_2 > dias_2 + 30) {
                autorizacao.setExameRealizado(false);

            } else {
                autorizacao.setExameRealizado(true);
                autorizacao.setData(dataRealizacao);
            }

        }
    }

    public List<Autorizacao> listarAutorizacoesExame() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        PriorityQueue<Long> lista_dias = new PriorityQueue<>();
        ArrayList<Long> lista_resultante_Int = new ArrayList<>();
        ArrayList<String> lista_resultante_String = new ArrayList<>();

        for (int i = 0; i < autorizacoes_exame.size(); i++) {
            try {
                String datas_autorizacoes = autorizacoes_exame.get(i).getData();
                Date data = dateFormat.parse(datas_autorizacoes);
                long dias = data.getTime() / (1000 * 60 * 60 * 24);
                lista_dias.add(dias);
                lista_resultante_Int.addAll(lista_dias);

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < lista_resultante_Int.size(); i++) {
            LocalDate dataReferencia = LocalDate.of(3000, 1, 1);
            Long numero_dias = lista_resultante_Int.get(i);
            LocalDate novaData = dataReferencia.plusDays(numero_dias);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataEmString = novaData.format(formatter);
            lista_resultante_String.add(dataEmString);
        }

        for(int i = 0;i< autorizacoes_exame.size();i++){
           for(int j = 0;j< lista_resultante_String.size();j++){
               autorizacoes_exame.get(i).setData(lista_resultante_String.get(j));
           }
       }
        return autorizacoes_exame;
    }

    public List<Autorizacao> getAutorizacoes_exame() {
        return autorizacoes_exame;
    }

    public void setAutorizacoes_exame(List<Autorizacao> autorizacoes_exame) {
        this.autorizacoes_exame = autorizacoes_exame;
    }
}
