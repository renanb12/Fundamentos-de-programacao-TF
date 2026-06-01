import java.util.Scanner;

public class Prato {
    private String nome;
    private double valor;
    private Ingrediente vetIngredientes[] = new Ingrediente[10];
    private int index;

    public Prato(String nome, double valor, Ingrediente[] vetIngredientes, int index) {
        this.nome = nome;
        this.valor = valor;
        this.vetIngredientes = vetIngredientes;
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

    public void adicionarIngrediente(Ingrediente ingredientes[]){
        if (index < this.vetIngredientes.length){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome do ingrediente: ");
            String nome = input.nextLine();

            System.out.println("Digite ");
        } else {
            System.out.println("Número máximo de ingredientes adicionado. ");
        }
    }
}
