package ifsc.pps.hospital.paciente;


public class PacienteBuilder {
    private String nome;
    private int idade;
    private String historicoMedico;

    public PacienteBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PacienteBuilder setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public PacienteBuilder setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
        return this;
    }

    public Paciente build() {
        return new Paciente(nome, idade, historicoMedico);
    }
}