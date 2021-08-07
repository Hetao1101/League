package org.hetao.domain;

public class User {
    private int id;
    private String user_id;
    private String password;
    private String name;

    public User(String user_id, String password) {
        this.user_id = user_id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public User(int id, String user_id, String password, String name) {
        this.id = id;
        this.user_id = user_id;
        this.password = password;
        this.name = name;
    }
    public User(int id, String user_id, String password) {
        this.id = id;
        this.user_id = user_id;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
