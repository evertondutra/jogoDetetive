package game;

public class Crime {

    Vitima vitima = new Vitima();
    Game game = new Game();

    private String local;
    private String autor;
    private String arma;

    public Crime() {
        this.local = game.getLocalCrime();
        this.autor = game.getAutorCrime();
        this.arma = vitima.getArmaUtilizada();
    }

    public String getLocal() {
        return local;
    }

    public String getAutor() {
        return autor;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "local='" + local + '\'' +
                ", autor='" + autor + '\'' +
                ", arma='" + arma + '\'' +
                '}';
    }
}
