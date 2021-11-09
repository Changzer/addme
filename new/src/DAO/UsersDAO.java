package DAO;

import Model.Users;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO {


    public void cadastrar(List<Users> users){

        File usersFile = new File("users.txt");
        if(!usersFile.isFile()){
            try{
                usersFile.createNewFile();
            }   catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fw = new FileWriter(usersFile, true);
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i < users.size(); i++){
                pw.println(users.get(i));
            }
            fw.close();
        }   catch (IOException e){
            e.printStackTrace();
        }

    }



    public List<Users> usersList() throws IOException {
        List<String> listaUsersFile = new ArrayList<>();
        List<Users> UsersList = new ArrayList<>();
        Path path = Paths.get("users.txt");
        listaUsersFile = Files.readAllLines(path);
        for(int i = 0; i < UsersList.size(); i++){
            String usersString = listaUsersFile.get(i);
            String[] dataUsers = usersString.split("; ");
            if(isNumeric(dataUsers[0])){
                long idUser = (Long.parseLong(dataUsers[0]));
                Users users = new Users();
                users.setIdUser(idUser);
                users.setUsername(dataUsers[1]);
                users.setFirstName(dataUsers[2]);
                users.setLastName(dataUsers[3]);
                UsersList.add(users);
            }
        }
        return UsersList;
    }

    public static boolean isNumeric(String strNum){
        if(strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
