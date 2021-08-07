package org.hetao.domain;

public class Role {
    private int ro_id;
    private int rid;
    private int uid;
    private String ro_name;

    public Role(int uid, String ro_name) {
        this.uid = uid;
        this.ro_name = ro_name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Role{" +
                "ro_id=" + ro_id +
                ", rid=" + rid +
                ", uid=" + uid +
                ", ro_name='" + ro_name + '\'' +
                '}';
    }

    public Role(int ro_id, int rid, int uid, String ro_name) {
        this.ro_id = ro_id;
        this.rid = rid;
        this.uid = uid;
        this.ro_name = ro_name;
    }



    public int getRo_id() {
        return ro_id;
    }

    public void setRo_id(int ro_id) {
        this.ro_id = ro_id;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRo_name() {
        return ro_name;
    }

    public void setRo_name(String ro_name) {
        this.ro_name = ro_name;
    }


}
