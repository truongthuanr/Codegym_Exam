package input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static int inputNumber() {
        do {
            try {
                String dataInput = input.nextLine();
                int number = Integer.parseInt(dataInput);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng. Vui lòng nhập lại số!");
            }
        } while (true);
    }

    public static String inputString() {
        String dataInput = input.nextLine();
        return dataInput;
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String reg = "^((0[1-9]{10})|(0[1-9]{9}))$";
        boolean checked = phoneNumber.matches(reg);
        if (!checked){
            System.out.println("Không đúng định dạng");
        }

        return checked;
    }

    public static boolean validateName(String name) {
        String reg = "^((0[1-9]{10})|(0[1-9]{9}))$";
        boolean checked = name  .matches(reg);
        if (!checked){
            System.out.println("Không đúng định dạng");
        }

        return checked;
    }
}
