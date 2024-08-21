package ifsc.pps.hospital.medico;

public class MedicoAdapter {
    private final Medico medico;

    public MedicoAdapter(Medico medico) {
        this.medico = medico;
    }

    public String getMedicoInfo() {
        return "Nome: " + medico.getNome() + ", Especialidade: " + medico.getEspecialidade();
    }
}
