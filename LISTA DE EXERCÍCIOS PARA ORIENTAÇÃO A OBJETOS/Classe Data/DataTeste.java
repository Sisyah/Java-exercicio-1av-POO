public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data(12, 7, 2022);

        System.out.println("Data formatada:");
        data.displayData();

        data.setDia(15);
        data.setMes(8);
        data.setAno(2023);

        System.out.println("Data formatada após alteração:");
        data.displayData();
    }
}