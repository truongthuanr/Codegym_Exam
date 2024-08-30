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
                    break;
                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;
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
        String group;
        String gender;
        String address;
        String email;
        String birthday;
        do {
            System.out.print("Nhập số điện thoại*: ");
            phoneNumber = Input.inputString();
        } while (!Input.validatePhoneNumber(phoneNumber));
        do {
            System.out.print("Nhập tên liên hệ*: ");
            name = Input.inputString();
        } while (!Input.validateName(name));


        do {
            System.out.print("Nhập tên nhóm: ");
            group = Input.inputString();
        } while (!Input.validateGroup(group));

        do {
            System.out.print("Nhập giới tính(1.Nam 2.Nữ)*: ");
            gender = Input.inputString();
        } while (!Input.validateGender(gender));
        gender = (gender.equals("1")) ? "Nam" : "Nữ";

        System.out.print("Nhập địa chỉ: ");
        address = Input.inputString();

        do{
            System.out.print("Nhập ngày sinh (yyyy-mm-dd): ");
            birthday = Input.inputString();
        } while(!Input.validateBirthday(birthday));

        do {
            System.out.print("Nhập email*: ");
            email = Input.inputString();
        } while (!Input.validateEmail(email));




        Contact contact = new Contact(phoneNumber, group, name, address, gender, birthday, email);
        contactManager.addContact(contact);
    }

    void updateContact(){
        String phoneNumber;
        String name;
        String group;
        String gender;
        String address;
        String email;
        String birthday;

        do { // Loop till find valid phone number
            System.out.print("Nhập số điện thoại(hoặc nhấn Enter để thoát): ");
            phoneNumber = Input.inputString();
            // Thoát nếu không nhập gì
            if (phoneNumber.isEmpty()) {return;}
        }while(!contactManager.checkPhoneNumberToUpdate(phoneNumber));

        // Ask for update info
        do {
            System.out.print("Nhập tên liên hệ(Enter nếu không đổi): ");
            name = Input.inputString();
            if (name.isEmpty()){break;}
        } while (!Input.validateName(name));


        do {
            System.out.print("Nhập tên nhóm(Enter nếu không đổi): ");
            group = Input.inputString();
            if (group.isEmpty()){break;}
        } while (!Input.validateGroup(group));

        do {
            System.out.print("Nhập giới tính(1.Nam 2.Nữ)(Enter nếu không đổi): ");
            gender = Input.inputString();
            if (gender.isEmpty()){break;}
        } while (!Input.validateGender(gender));
        if (!gender.isEmpty()) {
            gender = (gender.equals("1")) ? "Nam" : "Nữ";
        }

        System.out.print("Nhập địa chỉ(Enter nếu không đổi): ");
        address = Input.inputString();

        do{
            System.out.print("Nhập ngày sinh (yyyy-mm-dd) (Enter nếu không đổi): ");
            birthday = Input.inputString();
            if (birthday.isEmpty()){break;}
        } while(!Input.validateBirthday(birthday));

        do {
            System.out.print("Nhập email(Enter nếu không đổi): ");
            email = Input.inputString();
            if (email.isEmpty()){break;}
        } while (!Input.validateEmail(email));



        contactManager.updateContact(phoneNumber, name, group, address, gender, birthday, email);
    }

    public void removeContact(){
        String phoneNumber;
        do { // Loop till find valid phone number
            System.out.print("Nhập số điện thoại(hoặc nhấn Enter để thoát): ");
            phoneNumber = Input.inputString();
            // Thoát nếu không nhập gì
            if (phoneNumber.isEmpty()) {return;}
        }while(!contactManager.checkPhoneNumberToUpdate(phoneNumber));

        Contact contact = contactManager.getContactByPhoneNumber(phoneNumber);
        String choice;
        System.out.print("Xác nhận xóa (Y/N)?: ");
        choice = Input.inputString();
        if (choice.equalsIgnoreCase("Y")) {
            contactManager.removeContact(contact);
        }
    }

}
