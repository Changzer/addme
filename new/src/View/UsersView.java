package View;
import Controller.UsersController;
import Model.Users;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class UsersView {

    private UsersController controller;

    public UsersView(UsersController controller){
        this.controller = controller;
    }

    public void userMenu(){
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("Menu Usuario");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");

            int escolha = ler.nextInt();
            ler.nextLine();

            switch(escolha) {
                case 0:
                    return;
                case 1:
                    menuCadastrar();
                    break;
                case 2:
                    listarUser();
                    break;

            }
        }
    }


    public void menuCadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um nome de usuario");
        String username = ler.nextLine();

        System.out.println("digite um nome");
        String firstName = ler.nextLine();

        System.out.println("Digite seu sobrenome");
        String lastName = ler.nextLine();

        Users newUser = controller.cadastrar(username,firstName,lastName);

        try{
            File file = new File("arquivo.txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(newUser.getUsername() + ", " + newUser.getFirstName() + ", " + newUser.getLastName());
            br.newLine();
            br.close();
            fr.close();
            System.out.println("Usuario <" + newUser.getUsername() + "> foi cadastrado\n");
        }   catch (IOException e){
            System.out.println("deu errado");
            e.printStackTrace();
        }
    }

    private void listarUser() {
        for (Users users: controller.getModels()){
            System.out.printf("ID: %d | Username: %s \n", users.getIdUser(), users.getUsername());
        }
    }

    public void usersList() throws IOException {
        System.out.println(controller.usersList());
    }

}
