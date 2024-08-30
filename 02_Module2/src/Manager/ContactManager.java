package Manager;
import DataIO.*;
import model.*;

import java.util.ArrayList;
import java.util.List;


public class ContactManager {

    DataReadWrite dataReadWrite = new DataReadWrite();
    private List<Contact> contacts;

    public ContactManager() {
        // this.contacts = this.dataReadWrite.readData();
    }

    public List<Contact> getAllContacts() {
        // this.contacts = this.dataReadWrite.readData();
        List<Contact> contacts = new ArrayList<Contact>();
        try {
            this.contacts.remove(0);
            contacts = this.contacts;
        } catch (NullPointerException e) {
            System.out.println("Danh bạ chưa có liên hệ!");
        }
        return contacts;

    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
        dataReadWrite.writeData(this.contacts);
        System.out.println("Thêm liên lạc thành công!!!");
    }

    public boolean checkPhoneNumberToUpdate(String phoneNumber) {
        for (Contact contact : this.contacts) {
            if(contact.getPhoneNum().equals(phoneNumber)){
                return true;
            }
        }
        System.out.println("Không tìm thấy số điện thoại trong danh bạ, vui lòng nhập lại!");
        return false;
    }

    public Contact getContactByPhoneNumber(String phoneNumber){
        for (Contact contact : this.contacts) {
            if(contact.getPhoneNum().equals(phoneNumber)){
                return contact;
            }
        }
        System.out.println("Không tìm thấy số liên lạc trong danh bạ!");
        return null;

    }

    public void updateContact(String phoneNumber,
                              String name,
                              String group,
                              String address,
                              String gender,
                              String birthday,
                              String email){
        Contact contact = getContactByPhoneNumber(phoneNumber);
        if(contact != null){
            if(!group.isEmpty()){contact.setGroup(group);}
            if(!name.isEmpty()){contact.setName(name);}
            if(!address.isEmpty()){contact.setAddress(address);}
            if(!gender.isEmpty()){contact.setGender(gender);}
            if(!birthday.isEmpty()){contact.setBirthday(birthday);}
            if(!email.isEmpty()){contact.setEmail(email);}
            System.out.println("Cập nhật thành công!");
            System.out.println(contact);

            dataReadWrite.writeData(this.contacts);
        }

    }

    public void removeContact(Contact contact){
        this.contacts.remove(contact);
        dataReadWrite.writeData(this.contacts);
        System.out.println("Xóa liên hệ thành công!");
    }

    public void readFromFile(){
        DataStorage dataStorage = new DataStorage();
        this.contacts = dataStorage.readData();
        System.out.println("Đọc thành công!!!");

    }

    public void writeToFile() {
        DataStorage dataStorage = new DataStorage();
        dataStorage.writeData(this.contacts);
        System.out.println("Ghi thành công!!");
    }
}
