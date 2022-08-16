public class PosterRepository {
    private Poster [] films = new Poster[0];

    public void save (Poster film){
        Poster [] tmp = new Poster[films.length + 1];
        for (int i = 0;i < films.length;i++){
            tmp [i] = films [i];

        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }
    public Poster [] getFilms(){
        return films;

    }
}
