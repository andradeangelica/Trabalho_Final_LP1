import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    public ConsultaAgendada() {
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int month, int a, String p, String m) {
        this.data = new Data(d, month, a);
        this.hora = new Hora(h, mi, s);
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    public void setData(int dia, int mes, int ano) {
        this.data = new Data(dia, mes, ano);
    }

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = input.nextInt();
        System.out.print("Digite o mês: ");
        int mes = input.nextInt();
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();
        this.data = new Data(dia, mes, ano);
    }

    public void setHora(int hora, int minutos, int segundos) {
        this.hora = new Hora(hora, minutos, segundos);
    }

    public void setHora() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int hora = input.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = input.nextInt();
        System.out.print("Digite os segundos: ");
        int segundos = input.nextInt();
        this.hora = new Hora(hora, minutos, segundos);
    }

    public void setNomePaciente(String nome) {
        this.nomePaciente = nome;
    }

    public void setNomePaciente() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        String nome = input.nextLine();
        this.nomePaciente = nome;
    }

    public void setNomeMedico(String nome) {
        this.nomeMedico = nome;
    }

    public void setNomeMedico() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        String nome = input.nextLine();
        this.nomeMedico = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getData() {
        return data.toString();
    }

    public String getHora() {
        return hora.toString();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static void main(String[] args) {
        ConsultaAgendada consulta = new ConsultaAgendada();

        Scanner input = new Scanner(System.in);

        consulta.setData();
        consulta.setHora();

        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = input.nextLine();
        consulta.setNomePaciente(nomePaciente);

        System.out.print("Digite o nome do médico: ");
        String nomeMedico = input.nextLine();
        consulta.setNomeMedico(nomeMedico);

        System.out.println("\nDetalhes da Consulta Agendada:");
        System.out.println("Data: " + consulta.getData());
        System.out.println("Hora: " + consulta.getHora());
        System.out.println("Nome do Paciente: " + consulta.getNomePaciente());
        System.out.println("Nome do Médico: " + consulta.getNomeMedico());
        System.out.println("Quantidade de consultas agendadas: " + consulta.getQuantidade());
    }
}
