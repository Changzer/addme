package Principal;

public class Users {
    private long idUser;
    private String name;

    public Users(long idUser, String name) {
        this.idUser = idUser;
        this.name = name;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Users{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                '}';
    }
}