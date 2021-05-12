package views;

import controller.PhoneBookManager;

public class Client {
    static PhoneBookManager phoneBookManager = new PhoneBookManager();
public static void main(String[] args) {
        phoneBookManager.phoneBookMenu();
    }
}
