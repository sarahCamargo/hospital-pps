package ifsc.pps.hospital.consulta;

import ifsc.pps.hospital.medico.Medico;
import ifsc.pps.hospital.paciente.Paciente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private final Paciente paciente;
    private final Medico medico;
    private final LocalDateTime dataHora;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Consulta:\n" +
                "Paciente: " + paciente.getNome() + "\n" +
                "Médico: " + medico.getNome() + " (Especialidade: " + medico.getEspecialidade() + ")\n" +
                "Data e Hora: " + dataHora.format(formatter);
    }
}
