package DataIO;
import model.Contact;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DataReadWrite {

    private File file = new File("database/contacts.csv");
    public void writeData(List<Contact> contacts) {
        try {
            String data = "Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email\n";
            for (Contact contact: contacts) {
                // Todo
                data += contact.toCsvString() + "\n";
            }
            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Error while writing to file");
            System.out.println(e);
        }
    }

    public List<Contact> readData() {
        List<Contact> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] data = line.split(",");
                // Todo
                Contact contact = new Contact(data[0],
                                            data[1],
                                            data[2],
                                            data[3],
                                            data[4],
                                            data[5],
                                            data[6]
                        );

                list.add(contact);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

}
