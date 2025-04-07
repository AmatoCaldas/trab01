package trab01;

import java.util.*;

public class GeradorDeGrade {

    // Método principal para gerar aulas com base nas disponibilidades dos
    // professores
    public void gerarAulas(List<Professor> professores) {
        for (Professor professor : professores) {
            // Agrupar horários disponíveis por dia da semana
            Map<DiaSemana, List<Horario>> horariosPorDia = new HashMap<>();

            // Preencher o mapa com os horários disponíveis do professor
            for (Horario h : professor.getDisponibilidades()) {
                horariosPorDia
                        .computeIfAbsent(h.getDia(), k -> new ArrayList<>())
                        .add(h);
            }

            // Tentar alocar blocos de horários consecutivos no mesmo dia
            for (Map.Entry<DiaSemana, List<Horario>> entry : horariosPorDia.entrySet()) {
                List<Horario> horarios = entry.getValue();

                // Ordenar os horários por hora de início para facilitar a alocação sequencial
                horarios.sort(Comparator.comparing(Horario::getHoraInicio));

                // Alocar os horários ordenados, verificando conflitos
                for (Horario h : horarios) {
                    if (!conflita(professor.getHorarios(), h)) {
                        professor.adicionarHorario(h); // Adicionar horário ao professor se não houver conflito
                    }
                }
            }
        }
    }

    // Método auxiliar para verificar se um novo horário entra em conflito com os já
    // alocados
    private boolean conflita(List<Horario> alocados, Horario novo) {
        for (Horario h : alocados) {
            // Verifica se o dia e a hora de início coincidem
            if (h.getDia() == novo.getDia() &&
                    h.getHoraInicio().equals(novo.getHoraInicio())) {
                return true; // Conflito encontrado
            }
        }
        return false; // Sem conflitos
    }
}
