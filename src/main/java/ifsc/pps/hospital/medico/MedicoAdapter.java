package ifsc.pps.hospital.medico;

public class MedicoAdapter implements SistemaExternoMedico{
    private final Medico medico;

    public MedicoAdapter(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String getMedicoInfo() {
        return "Nome: " + medico.getNome() + ", Especialidade: " + medico.getEspecialidade();
    }
}
