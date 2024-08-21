package ifsc.pps.hospital.paciente;

import ifsc.pps.hospital.consulta.Consulta;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private final String nome;
    private final int idade;
    private final String historicoMedico;
    private final List<Consulta> historicoConsultas;

    public Paciente(String nome, int idade, String historicoMedico) {
        this.nome = nome;
        this.idade = idade;
        this.historicoMedico = historicoMedico;
        this.historicoConsultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void adicionarConsultaHistorico(Consulta consulta) {
        historicoConsultas.add(consulta);
    }

    public void removerConsultaHistorico(Consulta consulta) {
        historicoConsultas.remove(consulta);
    }

    public List<Consulta> getHistoricoConsultas() {
        return historicoConsultas;
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + "\n" +
                "Idade: " + idade + " anos\n" +
                "Histórico Médico: " + historicoMedico;
    }
}
