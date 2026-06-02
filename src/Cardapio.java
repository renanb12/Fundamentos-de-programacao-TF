public class Cardapio {
    private Prato vetPratos[];
    private int index;

    public Cardapio(int quantidadePratos) {
        this.vetPratos = new Prato[quantidadePratos];
        this.index = 0;
    }

    public Prato[] getVetPratos() {
        return vetPratos;
    }

    public int getIndex() {
        return index;
    }

    public boolean adicionarPrato(Prato prato){
        if (index < vetPratos.length){
            vetPratos[index] = prato;
            index++;
            return true;
        } else {
            return false;
        }
    }

    public int buscarPosicao(String nomePrato){
        for (int i = 0; i < index; i++) {
            if (vetPratos[i].getNome().equalsIgnoreCase(nomePrato)){
                return i;
            }
        }
        return -1;
    }

    public Prato buscarPratoPorNome(String nomePrato){
        int posicao = buscarPosicao(nomePrato);

        if (posicao >= 0){
            return vetPratos[posicao];
        }

        return null;
    }

    public boolean removerPrato(String nomePrato){
        int posicao = buscarPosicao(nomePrato);

        if (posicao >= 0){
            for (int i = posicao; i < index - 1; i++) {
                vetPratos[i] = vetPratos[i + 1];
            }
            vetPratos[index - 1] = null;
            index--;
            return true;
        }

        return false;
    }

    public Prato[] buscarPratoIngrediente(String nomeIngrediente){
        int quantidade = 0;

        for (int i = 0; i < index; i++) {
            if (vetPratos[i].consultarIngrediente(nomeIngrediente) != null){
                quantidade++;
            }
        }

        if (quantidade == 0){
            return null;
        }

        Prato pratosIngredientes[] = new Prato[quantidade];
        int posicaoResultado = 0;

        for (int i = 0; i < index; i++) {
            if (vetPratos[i].consultarIngrediente(nomeIngrediente) != null){
                pratosIngredientes[posicaoResultado] = vetPratos[i];
                posicaoResultado++;
            }
        }

        return pratosIngredientes;
    }

    public double buscarValorCardapio(){
        double somatorio = 0;
        for (int i = 0; i < index; i++) {
            somatorio += vetPratos[i].getValor();
        }
        return somatorio;
    }

    public Prato buscarPratoEconomico(){
        double menor = Double.MAX_VALUE;
        int posicao = -1;

        for (int i = 0; i < index; i++) {
            if (vetPratos[i].getValor() < menor){
                menor = vetPratos[i].getValor();
                posicao = i;
            }
        }

        if (posicao >= 0){
            return vetPratos[posicao];
        }

        return null;
    }

    public void mostrarPratos(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String retorno = "";

        retorno += "===== CARDÁPIO =====\n";

        if (index == 0) {
            retorno += "Nenhum prato cadastrado.\n";
        } else {
            for (int i = 0; i < index; i++) {
                retorno += vetPratos[i] + "\n";
                retorno += "-------------------\n";
            }
        }

        retorno += "Total de pratos: " + index;

        return retorno;
    }
}