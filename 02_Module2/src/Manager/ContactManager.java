package Manager;
import DataIO.*;
import model.*;

import java.util.ArrayList;
import java.util.List;


public class ContactManager {

    DataReadWrite dataReadWrite = new DataReadWrite();
    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = this.dataReadWrite.readData();
    }

    public List<Contact> getAllContacts() {
        this.contacts = this.dataReadWrite.readData();
        this.contacts.remove(0);
        return this.contacts;
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


}
