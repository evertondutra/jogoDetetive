package game;

import java.util.*;

public class Game {
    Scanner scan = new Scanner(System.in);
    private final String localCrime;
    private final String autorCrime;

    List<String> locais = new ArrayList<>(Arrays.asList("Banco","Boate","Cemitério","Estação de Trem","Floricultura",
            "Hospital","Hotel","Mansão","Praça","Prefeitura","Restaurante"));
    List<String> suspeitos = new ArrayList<>(Arrays.asList("Sarjento - Bigode", "Florista - Dona Branca", "Chef de " +
            "Cozinha - Tony Gourmet", "Mordomo - James", "Médica - Dona Violeta", "Dançarina - Srta Rosa",
            "Coveiro - Sérgio Soturno", "Advogado - Sr Marinho"));

    public Game() {
        Collections.shuffle(locais);
        Collections.shuffle(suspeitos);
        this.localCrime = locais.get(0);
        this.autorCrime = suspeitos.get(0);
    }

    public String getLocalCrime() {
        return localCrime;
    }

    public String getAutorCrime() {
        return autorCrime;
    }

    public List<String> getLocais() {
        return locais;
    }

    public List<String> getSuspeitos() {
        return suspeitos;
    }

    public void apresentacaoInicial(){
        System.out.println("----------------------------");
        System.out.println("    Desvende o crime em     ");
        System.out.println("X-------X CITYLAND X-------X");
        System.out.println("----------------------------");
        System.out.println("     Vamos Começar !!!     ");
        System.out.println("----------------------------\n");
    }

    public String nomeUsuario(){
        String nome;
        do {
            System.out.println("Qual o seu nome detetive? ");
            nome = scan.nextLine().trim();
            if (nome.length() < 2){
                System.out.println("Nome deve ser maior que uma letra!!!");
                System.out.println("------------------------------------");
            }
        }while (nome.length() < 2);
        return nome;
    }

    public void  boasVindas(String detetive){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Bem vindo a nossa cidade detetive " + detetive + ".");
        System.out.println("Recebemos a informação anônima de um assassinato em nossa cidade\n" +
                "A informação indica alguns locais possíveis.");
        System.out.println("------------------------------------------------------------------");
    }

    public String escolherLocal(List<String> locais){
        while (true) {
            int resposta;
            String localEscolhido;
            try{
                System.out.println("Os locais informados são:");
                System.out.println("Escolha pelo número o local para a sua investigação!");
                for (int i = 0; i < locais.size(); i++){
                    String local = locais.get(i);
                    System.out.println((i + 1) + " - " + local );
                }
                resposta = scan.nextInt();
                if (resposta >= 1 && resposta <= locais.size()) {
                    localEscolhido = locais.get(resposta - 1);
                    return  localEscolhido;
                } else {
                    System.out.println("Escolha entre os locais suspeitos");
                }
            }catch (Throwable e){
                System.out.println("!!! APENAS NÚMEROS DOS LOCAIS SUSPEITOS !!!");
                scan.nextLine();
            }
        }
    }

    public void verificandoLocalEscolhido(String local, Object crime){
        System.out.println("*****- " + local + " -*****");
        boolean contem = crime.toString().contains(local);
        if (contem == true){
            System.out.println("********---------------------------------------------*********");
            System.out.println("Ótimo, encontramos o lugar do crime, estamos no caminho certo!");
            System.out.println("Após encontrar-mos o corpo, precisamos descobrir a causa da morte!");


        }else {
            System.out.println("Neste local esta tudo normal, não há nada de suspeito por aqui !!!");
            System.out.println("Tudo tranquilo por aqui, devemos procurar em outro lugar");
        }
    }

    public String escolherArma(List<String> armas){
        while (true) {
            int resposta;
            String armaEscolhida;
            try{
                System.out.println("Escolha pelo número a possível arma usado no crime!");
                for (int i = 0; i < armas.size(); i++){
                    String arma = armas.get(i);
                    System.out.println((i + 1) + " - " + arma );
                }
                resposta = scan.nextInt();
                if (resposta >= 1 && resposta <= armas.size()) {
                    armaEscolhida = armas.get(resposta - 1);
                    return  armaEscolhida;
                } else {
                    System.out.println("Escolha entre as armas suspeitas");
                }
            }catch (Throwable e){
                System.out.println("!!! APENAS NÚMEROS DAS ARMAS SUSPEITAS !!!");
                scan.nextLine();
            }
        }
    }


    public void verificandoArmaEscolhida(String arma, Object crime) {
        System.out.println("*****- " + arma + " -*****");
        boolean contem = crime.toString().contains(arma);
        if (contem == true){
            System.out.println("********---------------------------------------------*********");
            System.out.println("- Ótimo, encontramos a arma do crime, mais uma etapa concluída");
            System.out.println("- Agora só nos falta descubrir o assassino, já estamos quase desvendando este caso!");


        }else {
            System.out.println("- Não é provável que seja esta arma, não à encontramos por aqui !!!");
            System.out.println("- Procure um pouco mais, que ela deve estar ainda neste local.");
        }
    }

    public String escolherSuspeito(List<String> suspeitos){
        while (true) {
            int resposta;
            String suspeitoEscolhido;
            try{
                System.out.println("Escolha pelo número o possível suspeito!");
                for (int i = 0; i < suspeitos.size(); i++){
                    String suspeito = suspeitos.get(i);
                    System.out.println((i + 1) + " - " + suspeito );
                }
                resposta = scan.nextInt();
                if (resposta >= 1 && resposta <= suspeitos.size()) {
                    suspeitoEscolhido = suspeitos.get(resposta - 1);
                    return  suspeitoEscolhido;
                } else {
                    System.out.println("Escolha entre os suspeitos na lista");
                }
            }catch (Throwable e){
                System.out.println("!!! APENAS NÚMEROS DOS SUSPEITOS !!!");
                scan.nextLine();
            }
        }
    }

    public void verificandoSuspeitoEscolhido(String suspeito, Object crime) {
        System.out.println("*****- " + suspeito + " -*****");
        boolean contem = crime.toString().contains(suspeito);
        if (contem == true){
            System.out.println("********---------------------------------------------*********");
            System.out.println("- Ótimo, encontramos o autor do crime, finalizamos o caso !!!");
            System.out.println("- Agora prendemos o criminoso!");


        }else {
            System.out.println("- Este suspeito tem álibi, então não foi ele !!!");
            System.out.println("- Procure por outro, estamos quase lá !!!!");
        }
    }

}
