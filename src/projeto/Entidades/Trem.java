
package projeto.Entidades;

/**
 *
 * @author gabri
 */
public class Trem extends Veiculo {

    //Atributo
    private String carga;
    private int vagao;

    //Get Set
    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public int getVagao() {
        return vagao;
    }

    public void setVagao(int vagao) {
        this.vagao = vagao;
    }

    //Construtor
    public Trem(String nome, String cor, String combustivel, int portas, int rodas, String carga, int vagao) {
        super(nome, cor, combustivel, portas, rodas);
        setCarga(carga);
        setVagao(vagao);
    }
}
