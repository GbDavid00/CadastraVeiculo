
package projeto.Entidades;

/**
 *
 * @author gabri
 */
public class Moto extends Veiculo {
    //Atributo

    private int cilindrada;
    private boolean flex;

    //Get Set
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean getFlex() {
        return flex;
    }

    public void setFlex(boolean flex) {
        this.flex = flex;
    }

    //Construtor
    public Moto(String nome, String cor, String combustivel, int portas, int rodas, int cilindrada, boolean flex) {
        super(nome, cor, combustivel, portas, rodas);
        setCilindrada(cilindrada);
        setFlex(flex);
    }
}
