/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author admin
 */
public class Msg {

    //var
    private int id;
    private String msg;

    public Msg() {
    }

    public Msg(String msg) {
        this.msg = msg;
    }

    public Msg(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" + "id=" + id + ", msg=" + msg + '}';
    }

 
    

   
}