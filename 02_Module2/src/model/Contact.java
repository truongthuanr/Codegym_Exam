package model;

import java.time.LocalDate;

public class Contact {
    private String phoneNum;
    private String group;
    private String name;
    private String address;
    private String gender;
    private String birthday;
    private String email;

    public Contact(String phoneNum,
                   String group,
                   String name,
                   String address,
                   String gender,
                   String birthday,
                   String email) {

        this.phoneNum = phoneNum;
        this.group = group;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(   "Số điện thoại: %20s \n" +
                                "Nhóm:          %20s \n" +
                                "Họ và tên:     %20s \n" +
                                "Địa chỉ:       %20s \n" +
                                "Giới tính :    %20s \n" +
                                "Ngày sinh:     %20s \n" +
                                "Email:         %20s",
                                this.phoneNum,
                                this.group,
                                this.name,
                this.gender,
                this.address,
                this.birthday,
                this.email);
    }

    public String toCsvString(){
        return this.phoneNum + "," + this.group + "," + this.name + "," + this.address +
                "," + this.gender + "," + this.birthday + "," + this.email + ",";
    };


}
