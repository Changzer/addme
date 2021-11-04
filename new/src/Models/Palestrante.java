package Models;

public class Palestrante extends User{
    private long idPalestra;
    private String nomePalestra;

    public Palestrante(){

    }

    public Palestrante(long idPalestra, String nomePalestra) {
        this.idPalestra = idPalestra;
        this.nomePalestra = nomePalestra;
    }

    public Palestrante(long id, String username, String firstName, String lastName, long idPalestra, String nomePalestra) {
        super(id, username, firstName, lastName);
        this.idPalestra = idPalestra;
        this.nomePalestra = nomePalestra;
    }

    public Palestrante(String username, String firstName, String lastName, long idPalestra, String nomePalestra) {
        super(username, firstName, lastName);
        this.idPalestra = idPalestra;
        this.nomePalestra = nomePalestra;
    }

}


