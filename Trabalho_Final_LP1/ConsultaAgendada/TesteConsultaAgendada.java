public class TesteConsultaAgendada {
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 5, 6, 2023, "João Silva", "Dr. Carlos");

        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Quantidade de consultas agendadas: " + p1.getQuantidade());

         ConsultaAgendada p2 = new ConsultaAgendada(07, 0, 0, 10, 6, 2023, "Isabelly Barbosa", "Dr. Marco");


        System.out.println("\nPropriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println("Quantidade de consultas agendadas: " + p2.getQuantidade());

        p1.setData(15, 6, 2023);
        p1.setHora(14, 45, 0);
        p1.setNomePaciente("Maria Souza");
        p1.setNomeMedico("Dra. Ana");

        System.out.println("\nPropriedades de p1 após alterações:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Quantidade de consultas agendadas: " + p1.getQuantidade());
    }
}
