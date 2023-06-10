import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        entradaData();
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String mostra2() {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
                "outubro", "novembro", "dezembro"};
        return String.format("%02d/%s/%04d", dia, meses[mes - 1], ano);
    }

    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    public int diasTranscorridos() {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasTranscorridos = dia;

        for (int i = 1; i < mes; i++) {
            diasTranscorridos += diasPorMes[i - 1];
        }

        if (mes > 2 && bissexto()) {
            diasTranscorridos++;
        }

        return diasTranscorridos;
    }

    public void apresentaDataAtual() {
        Date dataAtual = Calendar.getInstance().getTime();
        DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatoData.format(dataAtual);
        System.out.println("Data atual: " + dataFormatada);
    }

    private void entradaData() {
        boolean dataValida = false;

        while (!dataValida) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o dia: ");
            int dia = scanner.nextInt();
            System.out.print("Digite o mês: ");
            int mes = scanner.nextInt();
            System.out.print("Digite o ano: ");
            int ano = scanner.nextInt();

            if (dataValida(dia, mes, ano)) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
                dataValida = true;
            } else {
                System.out.println("Data inválida. Digite novamente.");
            }
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (bissexto(ano)) {
            diasPorMes[1] = 29;
        }

        return dia <= diasPorMes[mes - 1];
    }

    private boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }
}
