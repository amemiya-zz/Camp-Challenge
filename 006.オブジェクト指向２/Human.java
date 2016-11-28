/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challemge7;

/**
 *
 * @author shuhei
 */
import java.util.ArrayList;
abstract class Human {
    abstract public int open();
//    ArrayList <Integer> al=new ArrayList();
    abstract public void setCard(ArrayList al);
    abstract public boolean checkSum();
    ArrayList<Integer> myCard=new ArrayList();
}
