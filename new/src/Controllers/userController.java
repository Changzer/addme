package Controllers;

import DAO.UserDAO;
import Models.User;
import Views.userView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;


public class userController {

    private userView view;
    private List<User> models;

    private UserDAO dao;

    public userController(){
        this.dao = new UserDAO();
        this.models = new ArrayList<>();
        this.view = new userView(this);

    }

    public void start() {

        view.userMenu();

    }

    public User cadastrar(String username, String firstName, String lastName){
        User newUser = new User(username,firstName,lastName);
        newUser.setId(getNewId());
        this.models.add(newUser);
        return newUser;

    }


    public long getNewId() {
        long idMax = 0;
        for (User user : models) {
            idMax = max(idMax, user.getId());
        }
        return idMax + 1;
    }


    public List<User> getModels() {
        return this.models;
    }





}
