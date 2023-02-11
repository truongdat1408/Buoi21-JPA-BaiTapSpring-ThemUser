package com.cybersoft.DemoJPA.payload;

public class UsersResponse {
    private int id;

    private String email;

    private String fullname;

    private String avatar;

    private int roleId;

    public UsersResponse(int id, String email, String fullname, String avatar, int roleId) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.avatar = avatar;
        this.roleId = roleId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
