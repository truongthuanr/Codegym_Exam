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


}
