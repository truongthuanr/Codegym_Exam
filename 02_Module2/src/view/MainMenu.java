package view;


import input.Input;

public class MainMenu {
    public void showMenu(){
        int choice;


        do {
            System.out.println("========== Chương trình quản lý danh bạ ==========");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Them mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");

            System.out.print("Chọn chức năng: ");
            choice = Input.inputNumber();
            System.out.println();
        } while(choice != 8);

    }


}
