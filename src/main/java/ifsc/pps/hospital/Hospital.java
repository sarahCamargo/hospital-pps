package ifsc.pps.hospital;

import ifsc.pps.hospital.medico.Medico;
import ifsc.pps.hospital.paciente.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final List<Paciente> pacientes = new ArrayList<>();
    private final List<Medico> medicos = new ArrayList<>();

    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void addMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}

