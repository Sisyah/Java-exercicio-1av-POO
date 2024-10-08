package src.Data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }

    public static void main(String[] args) {
        Data data = new Data(5, 11, 2024);
        System.out.println(data.toString());
    }
}