package ifsc.pps.hospital.consulta;

import java.time.format.DateTimeFormatter;

public class ConsultaObserver implements Observer {

    @Override
    public void update(Consulta consulta) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataHoraFormatada = consulta.getDataHora().format(formatter);
        System.out.println("Sua consulta com " + consulta.getMedico().getNome() +
                " está marcada para " + dataHoraFormatada + ".");
    }
}
