package br.com.digitalhouse;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

    Integer umNumeroA;
    Double umNumeroB;
    String umaCadeiaDeTexto;

    umNumeroA = 10;
    umNumeroB = 20.0D;
    umaCadeiaDeTexto = "Cadeia do Texto do Tairo";

    System.out.println(umNumeroA);
    System.out.println(umNumeroB);
    System.out.println(umaCadeiaDeTexto);

    System.out.println("Soma de A + B = " + (umNumeroA + umNumeroB));
    System.out.println("Subtração de A - B = " + (umNumeroA - umNumeroB));

    Scanner scanner = new Scanner(System.in);

    umNumeroA = scanner.nextInt();
        System.out.println("Recebi" + umNumeroA);

    }
}

