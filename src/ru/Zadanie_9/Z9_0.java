package ru.Zadanie_9;

import java.util.Scanner;

class Exception1 {

    public void getKey() /*throws Exception*/ {
        Scanner myScanner = new Scanner( System.in );
        boolean flg = false;
        while (!flg){
            System.out.println("Enter Key ");
            try{
                String key = myScanner.nextLine();
                printDetails(key);
                flg = true;
            } catch (EmptyException e){
                System.err.println(e);
            }
        }
    }

    public void printDetails(String key) throws EmptyException {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws EmptyException {
        if(key.equals("")) {
            throw new EmptyException( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        Exception1 ex = new Exception1();
        ex.getKey();
    }
}