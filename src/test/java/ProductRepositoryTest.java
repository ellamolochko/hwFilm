import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    PurchaseFilm film1 = new PurchaseFilm("Начало", "Научная фантастика", 2010);
    PurchaseFilm film2 = new PurchaseFilm("Дюнкерк", "Боевик", 2017);
    PurchaseFilm film3 = new PurchaseFilm("Интерстеллар", "Научная фантастика", 2014);
    PurchaseFilm film4 = new PurchaseFilm("Престиж", "Триллер", 2006);
    PurchaseFilm film5 = new PurchaseFilm("Элла и медведь", "Мультфильм", 2024);
    PurchaseFilm film6 = new PurchaseFilm("Чупапимунянья", "Мем", 2022);
    ProductRepository repo = new ProductRepository();
    ProductRepository repoSet = new ProductRepository(3);

    @Test
    public void addFilm() {
        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);
        repo.add(film5);
        repo.add(film6);

        PurchaseFilm[] expected = {film1, film2, film3, film4, film5, film6};
        PurchaseFilm[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilm() {
        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);
        repo.add(film5);
        repo.add(film6);

        PurchaseFilm[] expected = {film6, film5, film4, film3, film2};
        PurchaseFilm[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmSet() {
        repoSet.add(film1);
        repoSet.add(film2);
        repoSet.add(film3);
        repoSet.add(film4);
        repoSet.add(film5);
        repoSet.add(film6);

        PurchaseFilm[] expected = {film6, film5, film4};
        PurchaseFilm[] actual = repoSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmSetExactly() {
        repoSet.add(film4);
        repoSet.add(film5);
        repoSet.add(film6);

        PurchaseFilm[] expected = {film6, film5, film4};
        PurchaseFilm[] actual = repoSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmSetLess() {
        repoSet.add(film5);
        repoSet.add(film6);

        PurchaseFilm[] expected = {film6, film5};
        PurchaseFilm[] actual = repoSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmSetLess2() {
        repoSet.add(film5);

        PurchaseFilm[] expected = {film5};
        PurchaseFilm[] actual = repoSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}