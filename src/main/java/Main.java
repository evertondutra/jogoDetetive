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



        while (true){
            vitima.dicaLocalCrime(crime.getLocal());

            localEscolhido = game.escolherLocal(game.getLocais());

            game.verificandoLocalEscolhido(localEscolhido, crime);

            if (crime.toString().contains(localEscolhido)){break;}
        }


        while (true){
            vitima.dicaEstadoCorporal(crime.getArma());

            armaEscolhida = game.escolherArma(vitima.getArmas());

            game.verificandoArmaEscolhida(armaEscolhida, crime);

            if (crime.toString().contains(armaEscolhida)){break;}
        }

        while (true){

            suspeitoEscolhido = game.escolherSuspeito(game.getSuspeitos());

            game.verificandoSuspeitoEscolhido(suspeitoEscolhido, crime);

            if (crime.toString().contains(suspeitoEscolhido)){break;}
        }

        System.out.println(crime);


    }

}
