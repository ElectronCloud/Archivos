/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author jcarrero
 */
public class DAO {

    //Simular base de datos
    
    private ArrayList<Integer> bd;

    public DAO() {
        this.bd = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getBd() {
        return bd;
    }

    public void AddBd(Integer data) {
        this.bd.add(data);
    }
    
    public boolean modificar (int value, int pos){
        this.bd.set(pos, value);
        return true;
    }
    
    
}
