import Controller.UsersController;
import DAO.UsersDAO;
import Model.Users;
import View.UsersView;

import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws Exception {

        UsersDAO listar = new UsersDAO();
        listar.listar();

        UsersController controller = new UsersController();
        controller.start();


    }
}
