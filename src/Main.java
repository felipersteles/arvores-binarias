public class Main {
    public static void main(String[] args) {
        // Para melhorar na programação tens de pensar que estás programando pra algum psicopata que sabe onde tu mora ;)
        System.out.println("Programa desenvolvido por Felipe Teles para estudar Árvores AVL!");

        ArvoreAVL<Carro> teste = new ArvoreAVL<Carro>();

        Carro bmw = new Carro(8, "x1");
        Carro ford = new Carro(10, "focus");
        Carro toyota = new Carro(2, "etios");
        Carro mercedes = new Carro(4, "caminhao");
        Carro cherry = new Carro(11, "qq");
        Carro hyundai = new Carro(9, "hb20");
        Carro nissan = new Carro(6, "march");

        teste.inserir(bmw.placa, bmw);
        teste.inserir(ford.placa, ford);
        teste.inserir(mercedes.placa, mercedes);
        teste.inserir(cherry.placa, cherry);
        teste.inserir(hyundai.placa, hyundai);
        teste.inserir(toyota.placa, toyota);
        teste.inserir(nissan.placa, nissan);


        System.out.println(teste);

    }
}