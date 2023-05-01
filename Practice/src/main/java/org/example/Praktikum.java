package org.example;

public class Praktikum {
    public static void main(String[] args) {
        String name = "Viola Kot";
        Account account = new Account(name);
        boolean canPrintOnCard = account.checkNameToEmboss();
        if (canPrintOnCard) {
            System.out.println("Имя и фамилия могут быть напечатны на карте");
        } else {
            System.out.println("Имя и фамили не могут быть напечатаны на карте");
        }
    }
}
