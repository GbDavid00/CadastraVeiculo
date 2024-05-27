
package projeto.Aplicação;

import java.util.Scanner;

import projeto.Entidades.Aviao;
import projeto.Entidades.Carreta;
import projeto.Entidades.Moto;
import projeto.Entidades.Trem;
import projeto.Entidades.Veiculo;

/**
 * @email gb-david@outlook.com
 * @author Gabriel David
 * @ver 0.1
 */
public class App {

    //Menu
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0, opc2 = 0;
        char aux;

        Veiculo veiculo; //Referencia s classe mae
        //Instacias
        //Nome, Cor, Combustivel, portas, rodas, cilindradas, flex
        Moto moto = new Moto("", "", "", 0, 0, 0, false);
        //Nome, Cor, Combustivel, portas, rodas, eixos
        Carreta carreta = new Carreta("", "", "", 0, 0, 0);
        //Nome, Cor, Combustivel, portas, rodas, motores, carga
        Aviao aviao = new Aviao("", "", "", 0, 0, 0, "");
        //Nome, Cor, Combustivel, portas, rodas, carga, vagão
        Trem trem = new Trem("", "", "", 0, 0, "", 0);

        System.out.println("============== W E L C O M E ================");
        do {
            System.out.println("Escolha uma opção abaixo");
            System.out.println("1 = Cadastrar uma moto");
            System.out.println("2 = Cadastrar uma carreta");
            System.out.println("3 = Cadastrar um aviao");
            System.out.println("4 = Cadastrar um trem");
            System.out.println("5 = Verificar veiculo");
            System.out.println("6 = Sair");
            opc = sc.nextInt();
            switch (opc) {
                //moto
                case 1:
                    System.out.println("Defina um nome: ");
                    moto.setNome(sc.next());
                    System.out.println("Digite uma cor: ");
                    moto.setCor(sc.next());
                    System.out.println("Defina combustivel: ");
                    moto.setCombustivel(sc.next());
                    System.out.println("Defina o numero de portas: ");
                    moto.setPortas(sc.nextInt());
                    System.out.println("Defina o numero de rodas: ");
                    moto.setRodas(sc.nextInt());
                    System.out.println("Defina o numero de cilindradas: ");
                    moto.setCilindrada(sc.nextInt());
                    System.out.println("veiculo Flex? S/N: ");
                    aux = sc.next().charAt(0);
                    if (aux == 's' || aux == 'S') {
                        moto.setFlex(true);
                    } else {
                        moto.setFlex(false);
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    //carreta
                    System.out.println("Defina um nome: ");
                    carreta.setNome(sc.next());
                    System.out.println("Digite uma cor: ");
                    carreta.setCor(sc.next());
                    System.out.println("Defina combustivel: ");
                    carreta.setCombustivel(sc.next());
                    System.out.println("Defina o numero de portas: ");
                    carreta.setPortas(sc.nextInt());
                    System.out.println("Defina o numero de rodas: ");
                    carreta.setRodas(sc.nextInt());
                    System.out.println("Defina o numero de eixos");
                    carreta.setEixos(sc.nextInt());
                    System.out.println("\n");
                    break;
                case 3:
                    //aviao
                    System.out.println("Defina um nome: ");
                    aviao.setNome(sc.next());
                    System.out.println("Digite uma cor: ");
                    aviao.setCor(sc.next());
                    System.out.println("Defina combustivel: ");
                    aviao.setCombustivel(sc.next());
                    System.out.println("Defina o numero de portas: ");
                    aviao.setPortas(sc.nextInt());
                    System.out.println("Defina o numero de rodas: ");
                    aviao.setRodas(sc.nextInt());
                    System.out.println("Defina quantidade de motores");
                    aviao.setMotores(sc.nextInt());
                    System.out.println("Defina tipo de carga");
                    aviao.setCarga(sc.next());
                    System.out.println("\n");
                    break;
                case 4:
                    //trem
                    System.out.println("Defina um nome: ");
                    trem.setNome(sc.next());
                    System.out.println("Digite uma cor: ");
                    trem.setCor(sc.next());
                    System.out.println("Defina combustivel: ");
                    trem.setCombustivel(sc.next());
                    System.out.println("Defina o numero de portas: ");
                    trem.setPortas(sc.nextInt());
                    System.out.println("Defina o numero de rodas: ");
                    trem.setRodas(sc.nextInt());
                    System.out.println("Defina tipo de carga");
                    trem.setCarga(sc.next());
                    System.out.println("Defina numero de vagoes");
                    trem.setVagao(sc.nextInt());
                    System.out.println("\n");
                    break;
                case 5:
                    //verificar
                    do {
                        System.out.println("Escolha uma opção abaixo");
                        System.out.println("1 = Moto");
                        System.out.println("2 = Carreta");
                        System.out.println("3 = Aviao");
                        System.out.println("4 = Trem");
                        System.out.println("5 = Voltar ao menu");
                        opc2 = sc.nextInt();
                        switch (opc2) {
                            case 1:
                                //moto
                                System.out.println("Nome: " + moto.getNome());
                                System.out.println("Cor: " + moto.getCor());
                                System.out.println("Combustivel: " + moto.getCombustivel());
                                System.out.println("Quantidade de portas :" + moto.getPortas());
                                System.out.println("Quantidade de rodas: " + moto.getRodas());
                                System.out.println("Quantidade de cilindradas: " + moto.getCilindrada());
                                if (moto.getFlex() == true) {
                                    System.out.println("Veiculo flex.");
                                    System.out.println("\n");
                                } else {
                                    System.out.println("veiculo nao flex.");
                                    System.out.println("\n");
                                }
                                break;
                            case 2:
                                //carreta
                                System.out.println("Nome: " + carreta.getNome());
                                System.out.println("Cor: " + carreta.getCor());
                                System.out.println("Combustivel: " + carreta.getCombustivel());
                                System.out.println("Quantidade de portas :" + carreta.getPortas());
                                System.out.println("Quantidade de rodas: " + carreta.getRodas());
                                System.out.println("Quantidade de eixos: " + carreta.getEixos());
                                System.out.println("\n");
                                break;
                            case 3:
                                //aviao
                                System.out.println("Nome: " + aviao.getNome());
                                System.out.println("Cor: " + aviao.getCor());
                                System.out.println("Combustivel: " + aviao.getCombustivel());
                                System.out.println("Quantidade de portas :" + aviao.getPortas());
                                System.out.println("Quantidade de rodas: " + aviao.getRodas());
                                System.out.println("Quantidade de Motores: " + aviao.getMotores());
                                System.out.println("Tipo de Carga: " + aviao.getCarga());
                                System.out.println("\n");
                                break;
                            case 4:
                                //trem
                                System.out.println("Nome: " + trem.getNome());
                                System.out.println("Cor: " + trem.getCor());
                                System.out.println("Combustivel: " + trem.getCombustivel());
                                System.out.println("Quantidade de portas :" + trem.getPortas());
                                System.out.println("Quantidade de rodas: " + trem.getRodas());
                                System.out.println("Tipo de Carga: " + trem.getCarga());
                                System.out.println("Quantidade de Vagoes: " + trem.getVagao());
                                System.out.println("\n");
                                break;
                            case 5:
                                System.out.println("\n");
                                break;
                            default:
                                System.out.println("Opção invalida!");
                        }
                    } while (opc2 != 5);
                case 6:
                    System.out.println("=========== ATE MAIS =============");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        } while (opc != 6);


        sc.close();
    }
}
