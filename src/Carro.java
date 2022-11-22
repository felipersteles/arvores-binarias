public class Carro {
    public int placa;
    public String modelo;

    Carro(int placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
    }

    public String toString() {
        String out = "";

        out += "Placa: " + this.placa + " e Modelo: " + this.modelo;

        return out;
    }
}
