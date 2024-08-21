package ifsc.pps.hospital.consulta;

import java.util.ArrayList;
import java.util.List;

public class ConsultaManager {

    private final List<Observer> observers = new ArrayList<>();
    private final List<Consulta> consultas = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
        consulta.getPaciente().adicionarConsultaHistorico(consulta);
        notifyObservers(consulta);
        logConsulta("agendada", consulta);
    }

    public void cancelarConsulta(Consulta consulta) {
        if (consultas.remove(consulta)) {
            consulta.getPaciente().removerConsultaHistorico(consulta);
            logConsulta("cancelada", consulta);
        } else {
            System.out.println("Consulta não encontrada para cancelamento.");
        }
    }

    private void notifyObservers(Consulta consulta) {
        for (Observer observer : observers) {
            observer.update(consulta);
        }
    }

    private void logConsulta(String acao, Consulta consulta) {
        System.out.println("Consulta " + acao + ":\n" + consulta + "\n");
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}
