package Views;

import Controllers.userController;
import Models.User;

import java.util.Scanner;

public class userView {
    private userController controller;
    public userView(userController controller){
        this.controller = controller;
    }

    public void userMenu(){
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("Menu Usuario");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Editar");
            System.out.println("3 - Deletar");
            System.out.println("4 - Listar");
            System.out.println("0 - Sair");

            int escolha = ler.nextInt();
            ler.nextLine();

            switch (escolha) {
                case 0:
                    return;
                case 1:
                    menuCadastrar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: listarUser();
                    break;
            }

        }


    }

    public void menuCadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome de Usuario");
        String username = ler.nextLine();

        System.out.println("Digite seu nome");
        String firstName = ler.nextLine();

        System.out.println("Digite seu sobrenome");
        String lastName = ler.nextLine();

        User newUser = controller.cadastrar(username,firstName,lastName);
        System.out.println("usuario <" + newUser.getUsername() + "> foi cadastrado\n");
    }

    public void listarUser(){
        for (User user: controller.getModels()) {
            System.out.printf("ID: %d | Username: %s\n", user.getId(), user.getUsername());
        }
    }
}
