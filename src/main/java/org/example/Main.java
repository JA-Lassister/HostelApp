package org.example;

public class Main {
    public static void main(String[] args) {

        Guest xyz = new Guest();
        xyz.setTitle("Mister");

        String resposta = xyz.getTitle();
        System.out.println(resposta);

        xyz.setFirstName("Atticus");

    }
}