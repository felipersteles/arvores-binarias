public class Main {
    public static void main(String[] args) {
        // Para melhorar na programação tens de pensar que estás programando pra algum psicopata que sabe onde tu mora ;)
        System.out.println("Programa desenvolvido por Felipe Teles para estudar Árvores AVL!");

        ArvoreAVL<Carro> teste = new ArvoreAVL<Carro>();

        Carro bmw = new Carro(8, "x1");
        Carro ford = new Carro(10, "focus");
        Carro toyota = new Carro(2, "etios");

        teste.inserir(bmw.placa, bmw); // no raiz
        teste.inserir(ford.placa, ford); // no raiz
        teste.inserir(toyota.placa, toyota); // no raiz


        System.out.println(teste);

    }
}