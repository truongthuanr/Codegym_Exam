package view;


import Manager.ContactManager;
import input.Input;
import model.*;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    ContactManager contactManager = new ContactManager();

    public void showMenu(){

        int choice;


        do {
            System.out.println("========== Chương trình quản lý danh bạ ==========");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");

            System.out.print("Chọn chức năng: ");
            choice = Input.inputNumber();
            System.out.println();


            switch(choice) {
                case 1:
                    showAllContacts();
                    break;
                case 2:
                    addNewContact();
            }

        } while (choice !=8 );

    }

    public void showAllContacts(){
        Scanner scanner = new Scanner(System.in);
        List<Contact> contacts = this.contactManager.getAllContacts();
        for (Contact contact : contacts) {
            System.out.println(contact);
            scanner.nextLine();
        }

    }

    public void addNewContact(){
        String phoneNumber;
        String name;
        do {
            System.out.print("Nhập số điện thoại*: ");
            phoneNumber = Input.inputString();
        } while (!Input.validatePhoneNumber(phoneNumber));
        do {
            System.out.print("Nhập số điện thoại*: ");
            name = Input.inputString();
        } while (!Input.validateName(name));


    }


}
