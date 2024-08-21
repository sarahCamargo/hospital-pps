import ifsc.pps.hospital.*;
import ifsc.pps.hospital.consulta.Consulta;
import ifsc.pps.hospital.consulta.ConsultaManager;
import ifsc.pps.hospital.consulta.ConsultaObserver;
import ifsc.pps.hospital.medico.Medico;
import ifsc.pps.hospital.medico.MedicoAdapter;
import ifsc.pps.hospital.paciente.Paciente;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = HospitalController.getInstance();

        Paciente paciente1 = new Paciente.PacienteBuilder()
                .setNome("Renato Simões")
                .setIdade(40)
                .setHistoricoMedico("Asma")
                .build();

        Paciente paciente2 = new Paciente.PacienteBuilder()
                .setNome("Sarah Camargo")
                .setIdade(23)
                .setHistoricoMedico("Nenhum")
                .build();

        Medico medico1 = new Medico("Dr. Ricardo", "Cardiologista");
        Medico medico2 = new Medico("Dra. Leila", "Dermatologista");

        hospital.addPaciente(paciente1);
        hospital.addPaciente(paciente2);
        hospital.addMedico(medico1);
        hospital.addMedico(medico2);

        MedicoAdapter medicoAdapter = new MedicoAdapter(medico1);
        System.out.println(medicoAdapter.getMedicoInfo());

        ConsultaManager consultaManager = new ConsultaManager();

        Consulta consulta1 = new Consulta(paciente1, medico1, LocalDateTime.of(2024, 8, 25, 10, 0));
        Consulta consulta2 = new Consulta(paciente2, medico2, LocalDateTime.of(2024, 8, 26, 14, 0));

        consultaManager.addObserver(new ConsultaObserver());

        consultaManager.agendarConsulta(consulta1);
        consultaManager.agendarConsulta(consulta2);

        consultaManager.cancelarConsulta(consulta1);

        System.out.println("\nConsultas Agendadas:");

        for (Consulta consulta : consultaManager.getConsultas()) {
            System.out.println(consulta);
        }

        System.out.println("\nHistórico de Consultas de " + paciente2.getNome() + ":");
        for (Consulta consulta : paciente2.getHistoricoConsultas()) {
            System.out.println(consulta);
        }
    }
}
