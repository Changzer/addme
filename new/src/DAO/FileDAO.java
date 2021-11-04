package DAO;

import Models.DAOUser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileDAO<T extends DAOUser> {
    private String filename;
    private List<T> models;

    public FileDAO(String filename){
        this.filename = filename;
        this.models = load();
    }

    public boolean save(){
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream outfile = new ObjectOutputStream(file);
            outfile.writeObject(models);

            outfile.flush();
            outfile.close();
        }   catch (Exception e){
            return false;
        }   return true;
    }

    public List<T> load() {
       try {
           FileInputStream file = new FileInputStream(filename);
           ObjectInputStream infile = new ObjectInputStream(file);

           List<T> models = (ArrayList<T>) infile.readObject();

           infile.close();
           file.close();

           return models;
       }    catch(Exception e){
           return new ArrayList<>();
       }
    }

    public List<T> getModels() {
        return this.models;
    }
}
