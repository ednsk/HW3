package view;

import java.util.Scanner;

public class View {
    public String CreateUser(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter user data in the following format: Surname Name Patronymic PhoneNumber (10) : ");
        return inp.nextLine();
    }

    public void Exception(Exception e){
        Exception(e.getMessage());
    }

    public void Exception(String str){
        System.out.println(str);
    }
}
