package ifsc.pps.hospital.medico;

public class Medico {
    private final String nome;
    private final String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return "Médico: " + nome + "\n" +
                "Especialidade: " + especialidade;
    }
}
