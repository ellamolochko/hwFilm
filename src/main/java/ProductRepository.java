public class ProductRepository {
    int sizeLast = 5;
    private PurchaseFilm[] films = new PurchaseFilm[0];

    public ProductRepository() {
    }

    public ProductRepository(int size) {
        sizeLast = size;
    }

    public void add(PurchaseFilm item) {
        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = item;
        films = tmp;
    }

    public PurchaseFilm[] findAll() {
        return films;
    }

    public PurchaseFilm[] findLast() {
        if(films.length < sizeLast) {
           sizeLast = films.length;
        }
        PurchaseFilm[] reversed = new PurchaseFilm[sizeLast];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }
}
