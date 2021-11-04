package DAO;

import Models.User;

public class UserDAO extends FileDAO<User> {
    public UserDAO(){ super("users.txt"); }
    public UserDAO(String filename) { super(filename);}
}
