public class PosterManager {
    private Poster [] films = new Poster[0];
    public int quantity;
    public PosterManager () {
        this.quantity = 10;

    }
    public PosterManager (int quantity){
        this.quantity = quantity;
    }

    public void addFilms (Poster film){
        Poster [] tmp = new Poster[films.length + 1];
        for (int i = 0;i < films.length;i++){
            tmp [i] = films [i];

        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }
    public Poster[] findAll() {
        return films;
    }


    public Poster[] findLast() {
        int resultLength;
        if (films.length >= quantity) {
        resultLength = quantity;
        } else {
            resultLength = films.length;
        }
        Poster [] last = new Poster[resultLength];
        for (int i = 0; i < last.length; i++) {
            last[i] = films[films.length - 1 - i];
        }
        return last;
    }

 }
