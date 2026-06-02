public class Prato {
    private String nome;
    private double valor;
    private Ingrediente vetIngredientes[];
    private int index;

    public Prato(String nome, double valor, int quantidadeIngredientes) {
        this.nome = nome;
        this.valor = valor;
        this.vetIngredientes = new Ingrediente[quantidadeIngredientes];
        this.index = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Ingrediente[] getVetIngredientes() {
        return vetIngredientes;
    }

    public int getIndex() {
        return index;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setVetIngredientes(Ingrediente vetIngredientes) {
        this.vetIngredientes[0] = vetIngredientes;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean adicionarIngrediente(Ingrediente ingrediente){
        if (index < this.vetIngredientes.length){
            vetIngredientes[index] = ingrediente;
            index++;
            return true;
        } else {
            return false;
        }
    }

    public int buscarPosicao(String nomeIngrediente){
        for (int i = 0; i < index; i++) {
            if (vetIngredientes[i].getNome().equalsIgnoreCase(nomeIngrediente)){
                return i;
            }
        }
        return -1;
    }

    public Ingrediente consultarIngrediente(String nomeIngrediente){
        int posicao = buscarPosicao(nomeIngrediente);

        if (posicao >= 0){
            return vetIngredientes[posicao];
        }

        return null;
    }

    public boolean removerIngrediente(String nomeIngrediente){
        int posicao = buscarPosicao(nomeIngrediente);

        if (posicao >= 0){
            for (int i = posicao; i < index - 1; i++) {
                vetIngredientes[i] = vetIngredientes[i + 1];
            }
            vetIngredientes[index - 1] = null;
            index--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String retorno = "";

        retorno += "Nome: " + nome + "\n";
        retorno += "Valor: R$ " + valor + "\n";
        retorno += "Ingredientes:\n";

        for (int i = 0; i < index; i++) {
            retorno += vetIngredientes[i] + "\n";
        }

        return retorno;
    }
}
