package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Vitima {

    final Random random = new Random();

    private final List<String> armas = new ArrayList<>(Arrays.asList("Faca", "Veneno", "Espingarda", "Gás", "Pá",
            "Tesoura", "Pé de Cabra","Soco Inglês"));
    private final char sexo;
    private final String horaMorte;
    private final int idade;
    private final String armaUtilizada;

    final int randomIndex = random.nextInt(2);

    public Vitima() {
        Collections.shuffle(armas);
        List<String> periodoMorte = new ArrayList<>(Arrays.asList("Manhã", "Tarde", "Noite", "Madrugada"));
        Collections.shuffle(periodoMorte);
        this.sexo = (randomIndex == 0) ? 'M' : 'F';
        this.idade = random.nextInt(31) + 20;
        this.horaMorte = periodoMorte.get(0);
        this.armaUtilizada = armas.get(0);
    }

    public String getArmaUtilizada() {
        return armaUtilizada;
    }

    public List<String> getArmas() {
        return armas;
    }

    public void dicaLocalCrime(String local){
        System.out.println("DICA: ");
        switch (local) {
            case "Cemitério":
            case "Floricultura":
            case "Praça":
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("O local não tem cobertura e esta exposto ao sol e chuva, isso dificulta encontrar evidências.");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            case "Boate":
            case "Hospital":
            case "Hotel":
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("O local também pode funcionar durante a madrugada.");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            case "Banco":
            case "Prefeitura":
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Ninguém gosta de ir a este local, mas as vezes é preciso ir até lá.");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Neste local, sempre há movimentação de pessoas durante o dia e à noite, mas nunca de madrugada!");
                System.out.println("-------------------------------------------------------------------------------");
                break;
        }

    }

    public void dicaEstadoCorporal(String arma){
        System.out.println("DICA: ");
        if (arma.equals("Faca") || arma.equals("Espingarda") || arma.equals("Tesoura")) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("No corpo da vítima foram encontrados perfurações e sangue espalhados pelo local.");
            System.out.println("-------------------------------------------------------------------------------");
        } else if (arma.equals("Veneno") || arma.equals("Gás")) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("No corpo da vítima não foram encontrados perfurações nem marcas de agressões.");
            System.out.println("-------------------------------------------------------------------------------");
        }else {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("A vítima estava com marcas de agressões por todo o corpo.");
            System.out.println("-------------------------------------------------------------------------------");
        }

    }

    public void dicaAutorCrime(String autor){
        System.out.println("DICA: ");
        switch (autor) {
            case "Coveiro - Sérgio Soturno":
            case "Florista - Dona Branca":
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("O local onde o autor do crime passa mais tempo, o ar circula livremente.");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            case "Dançarina - Srta Rosa":
            case "Médica - Dona Violeta":
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("O autor do crime também trabalha na durante a madrugada.");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            case "Sarjento - Bigode":
            case "Chef de Cozinha - Tony Gourmet":
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("O autor do crime tem o ar, o tom de mandão.");
                System.out.println("-------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("O autor do crime esta sempre disposto a ajudar, mas recebe para isso.");
                System.out.println("-------------------------------------------------------------------------------");
                break;
        }

    }




    @Override
    public String toString() {
        return "Vitima{" +
                "sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", horaMorte='" + horaMorte + '\'' +
                ", armaUtilizada='" + armaUtilizada + '\'' +
                '}';
    }
}
