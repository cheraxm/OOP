/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_78
 */
public class Bank {
    private Account acct[];
    private int numAcct;
    public Bank(){
        acct = new Account[10];
    }
    public void addAccount(Account ac){
        for(int i =0; i<10; i++){
            acct[i] = ac;
        }
        numAcct++;
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
}
