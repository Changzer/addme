package Controller;

import DAO.UsersDAO;
import Model.Users;
import View.UsersView;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import static java.lang.Math.max;

public class UsersController {

    private UsersView view;
    private List<Users> models;
    private UsersDAO usersDAO = new UsersDAO();

    public UsersController() {
        this.models = new ArrayList<>();
        this.view = new UsersView(this);
    }


    public void start(){
        usersList();
        view.userMenu();
    }

   public Users cadastrar(String username, String firstName, String lastName) {
   Users newUser = new Users(username,firstName,lastName);
   newUser.setIdUser(getNewId());
   this.models.add(newUser);
   usersDAO.cadastrar(models);
   return newUser;
    }



    public long getNewId(){
        long idMax = 0;
        for(Users users : models){
            idMax = max(idMax, users.getIdUser());
        }
        return idMax + 1;
    }

    public List<Users> getModels(){ return this.models;}


    public List<Users> usersList() throws IOException {
        this.models = usersDAO.usersList();
        return models;
    }
}
