public class ArvoreAVL<Tipo> {
    private NoAVL<Tipo> raiz;
    private int altura;

    public void inserir(int chave, Tipo k) {
        NoAVL novoNo = new NoAVL(chave, k);
        inserirAVL(this.raiz, novoNo);
    }

    public void inserirAVL(NoAVL aComparar, NoAVL aInserir) {

        if (aComparar == null) {
            this.raiz = aInserir;
        }else{
            if (aInserir.getChave() < aComparar.getChave()) {

                if (aComparar.getEsquerda() == null) {
                    aComparar.setEsquerda(aInserir);
                    aInserir.setPai(aComparar);
                    //verificarBalanceamento(aComparar);

                } else {
                    inserirAVL(aComparar.getEsquerda(), aInserir);
                }

            } else if (aInserir.getChave() > aComparar.getChave()) {

                if (aComparar.getDireita() == null) {
                    aComparar.setDireita(aInserir);
                    aInserir.setPai(aComparar);
                    //verificarBalanceamento(aComparar);

                } else {
                    inserirAVL(aComparar.getDireita(), aInserir);
                }

            } else {
                // O nó já existe
            }
        }
    }

    //print stuffs
    public String toString() {              // Sobrescreve o metodo toString
        String out = "";                    // Cria uma string vazia para retorno
        NoAVL no = raiz;                    // Vai para a raiz
        out += "Direita:\n";
        while (no != null) {                // Enquanto o no for diferente de nulo
            out += no.getElemento() + "\n";           // Adiciona a string a informacao
            no = no.getDireita();                // Vai para o proximo no a direita
        }
        out += "Esquerda:\n";
        no = raiz.getEsquerda();
        while (no != null) {
            out += no.getElemento() + "\n";
            no = no.getEsquerda();                // Vai para o proximo no a esquerda
        }

        return out;                         // Retorna a string
    }
}
