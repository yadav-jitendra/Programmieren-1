package ex01;

import java.io.IOException;
import java.util.Scanner;

public class KVSMain {
    private static Scanner sc = new Scanner(System.in);
    private static KeyValueStore kvs = new KeyValueStore();


    public static void main(String[] args) throws KeyExistsException, KeyNotExistsException {
        System.out.println("Enter new / get / update / delete / exit");
        boolean exit = false;

        while (!exit) {
            String command = sc.nextLine();

            switch (command) {
                case "new" -> newPair();
                case "get" -> getValue();
                case "update" -> update();
                case "delete" -> delete();
                case "exit" -> {
                    System.out.println("Bye bye");
                    exit = true;
                }
            }
            System.out.println("");

        }
    }

    private static void newPair() {
        System.out.println("enter key");
        String key = sc.next();
        System.out.println("enter value");
        String value = sc.next();

        try {
            kvs.newKVP(key, value);
            System.out.println("ok");
        } catch (KeyExistsException | IOException e) {
            System.out.println("key already there");
        }
    }

    private static void getValue() {
        System.out.println("enter key");
        String key = sc.next();

        try {
            String value = kvs.getKVP(key);
            System.out.println("ok : value = " + value);
        } catch (KeyNotExistsException e) {
            System.out.println("key not present");
        }
    }

    private static void update() {
        System.out.println("enter key");
        String key = sc.next();
        System.out.println("enter new value");
        String newValue = sc.next();

        try {
            kvs.updateKVP(key, newValue);
            System.out.println("ok");
        } catch (KeyNotExistsException | IOException e) {
            System.out.println("key not found");
        }
    }

    private static void delete() {
        System.out.println("enter key");
        String key = sc.next();

        try {
            kvs.deleteKVP(key);
            System.out.println("ok");
        } catch (KeyNotExistsException | IOException e) {
            System.out.println("key not found");
        }
    }


}
