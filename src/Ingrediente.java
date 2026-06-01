public class Ingrediente {
    private String nome;
    private String medida;
    private double quantidade;

    public Ingrediente(String nome, String medida, double quantidade) {
        this.nome = nome;
        this.medida = medida;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getMedida() {
        return medida;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
