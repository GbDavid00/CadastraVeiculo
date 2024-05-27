
package projeto.Entidades;

/**
 *
 * @author gabri
 */
public class Veiculo {

    //Atributos
    private String nome;
    private String cor;
    private String combustivel;
    private int portas;
    private int rodas;

    // Get Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    //Construtor

    public Veiculo(String nome, String cor, String combustivel, int portas, int rodas) {
        setNome(nome);
        setCor(cor);
        setCombustivel(combustivel);
        setPortas(portas);
        setRodas(rodas);
    }
}
