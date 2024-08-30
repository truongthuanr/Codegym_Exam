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
        String reg = "^[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMN+" +
                "OÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ+" +
                "aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjkl+" +
                "mnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz ]{1,30}$";
        boolean checked = name  .matches(reg);
        if (!checked){
            System.out.println("Không đúng định dạng");
        }

        return checked;
    }

    public static boolean validateGroup(String group) {
        String reg = "^[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMN+" +
                "OÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ+" +
                "aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjkl+" +
                "mnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz0-9 ]{0,15}$";
        boolean checked = group.matches(reg);
        if (!checked){
            System.out.println("Không đúng định dạng");
        }
        return checked;
    }

    public static boolean validateGender(String gender) {
        String reg = "^([12])$";
        boolean checked = gender.matches(reg);
        if (!checked){
            System.out.println("Không đúng định dạng");
        }
        return checked;
    }
    public static boolean validateEmail(String gender) {
        String reg = "^[^ @]+@[^ @]+\\.[^ @]+$";
        boolean checked = gender.matches(reg);
        if (!checked){
            System.out.println("Không đúng định dạng");
        }
        return checked;
    }

    public static boolean validateBirthday(String birthday) {
        String reg = "^(19|20)\\d\\d-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$" ;
        boolean checked = birthday.matches(reg);
        if (!checked){
            System.out.println("Không đúng định dạng");
        }
        return checked;
    }
}
