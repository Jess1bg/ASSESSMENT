public class Veiculos {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculos(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("\nDetalhes do Veículo:");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("\nViagem de " + km + " km registrada para o veículo " + placa);
        } else {
            System.out.println("\nQuilometragem inválida! A viagem não foi registrada.");
        }
    }

    public static void main(String[] args) {
        Veiculos carro1 = new Veiculos("SVG8545", "HAVAL H6 PHEV34", 2023, 45000.0);
        Veiculos carro2 = new Veiculos("XYZ9876", "ORA GT", 2024, 17000.0);

        System.out.println("VEÍCULOS DA LOCADORA");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        carro1.registrarViagem(150.5);
        carro2.registrarViagem(320.0);

        System.out.println("\nVEÍCULOS APÓS A ENTREGA DA LOCAÇÃO");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}