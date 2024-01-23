public class PurchaseFilm {
    private String filmName;
    private String filmGenre;
    private int filmYear;

    public PurchaseFilm(String name, String genre, int year) {
        this.filmName = name;
        this.filmGenre = genre;
        this.filmYear = year;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public int getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(int filmYear) {
        this.filmYear = filmYear;
    }
}