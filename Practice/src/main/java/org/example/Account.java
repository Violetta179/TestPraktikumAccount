package org.example;


import io.qameta.allure.Step;

public class Account {
    private final String name;
    public Account(String name) {
        this.name = name;
    }

    @Step("Проверка условий для печати Имени и Фамилии")
    public boolean checkNameToEmboss() {
        if (name == null || name.length() < 3 || name.length() > 19) {
            return false;
        }
        int spaceIndex = name.indexOf(' ');
        if (spaceIndex == -1 || spaceIndex != name.lastIndexOf(' ')) {
            return false;
        }
        if (!name.equals(name.trim())) {
            return false;
        }
        return true;
    }
}
