import game.Crime;
import game.Game;
import game.Vitima;

public class Main {

    public static void main(String[] args) {
        Vitima vitima = new Vitima();
        Game game = new Game();

        Crime crime = new Crime();


        String nomeDetetive;
        String localEscolhido;
        String armaEscolhida;
        String suspeitoEscolhido;

        game.apresentacaoInicial();

        nomeDetetive = game.nomeUsuario();

        game.boasVindas(nomeDetetive);


        do {
            vitima.dicaLocalCrime(crime.getLocal());

            localEscolhido = game.escolherLocal(game.getLocais());

            game.verificandoLocalEscolhido(localEscolhido, crime);

        } while (!crime.toString().contains(localEscolhido));


        do {
            vitima.dicaEstadoCorporal(crime.getArma());

            armaEscolhida = game.escolherArma(vitima.getArmas());

            game.verificandoArmaEscolhida(armaEscolhida, crime);

        } while (!crime.toString().contains(armaEscolhida));

        do {

            suspeitoEscolhido = game.escolherSuspeito(game.getSuspeitos());

            game.verificandoSuspeitoEscolhido(suspeitoEscolhido, crime);

        } while (!crime.toString().contains(suspeitoEscolhido));

        System.out.println(crime);


    }

}
