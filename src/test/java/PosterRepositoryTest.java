import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

    Poster film1 = new Poster(" Бладшот ");
    Poster film2 = new Poster(" Вперёд ");
    Poster film3 = new Poster(" Отель 'Белград' ");
    Poster film4 = new Poster(" Джентельмены ");
    Poster film5 = new Poster(" Человек-невидимка ");
    Poster film6 = new Poster(" Тролли. Мировой тур");
    Poster film7 = new Poster(" Номер один ");
    Poster film8 = new Poster(" Человек паук ");
    Poster film9 = new Poster(" Матрица ");
    Poster film10 = new Poster(" Джентельмены удачи ");
    Poster film11 = new Poster(" Форрест Гамп ");
    Poster film12 = new Poster(" Король Лев ");
    Poster film13 = new Poster(" ВАЛЛИ ");
    Poster film14 = new Poster(" Шрэк-3 ");
    Poster film15 = new Poster(" Титаник ");
    Poster film16 = new Poster(" Гарри потер ");


    @Test
    public void add0Film() {
        PosterManager manager = new PosterManager();
        Poster[] expected = {};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void add6Film() {
        PosterManager manager = new PosterManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        Poster[] expected = {film1, film2, film3, film4, film5, film6};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void last10Films() {
        PosterManager manager = new PosterManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);
        manager.addFilms(film11);
        manager.addFilms(film12);
        manager.addFilms(film13);
        manager.addFilms(film14);
        manager.addFilms(film15);
        manager.addFilms(film16);
        Poster[] expected = {film16, film15, film14, film13, film12, film11, film10, film9, film8, film7};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void last5Films() {
        PosterManager manager = new PosterManager(5);
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);
        manager.addFilms(film8);
        manager.addFilms(film9);
        manager.addFilms(film10);
        manager.addFilms(film11);
        manager.addFilms(film12);
        manager.addFilms(film13);
        Poster[] expected = {film13, film12, film11, film10, film9};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }


}
