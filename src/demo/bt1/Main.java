package demo.bt1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String value = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        // chuỗi có độ dài lớn nhất
        for (int i = 0; i < value.length(); i++) {
            // khai báo một linked list trung gian các kí tự của chuỗi tăng dần
            LinkedList<Character> list = new LinkedList<>();
            // thêm kí tự thứ i vào trong list
            list.add(value.charAt(i));
            for (int j = 0; j < value.length(); j++) {
                // kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối cùng trong list hay không
                if (value.charAt(j) > list.getLast()) {
                    // nếu có thì thêm vào list
                    list.add(value.charAt(j));
                }
            }

            // so sánh kích cỡ của list trung gian và list chữa chuỗi tăng dần có kích thước lớn nhất
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // hiển thị chuỗi tăng dần dài nhất
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();

//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter String:");
//        String string =scanner.nextLine();
//        LinkedList<Character> max = new LinkedList<>();
//
//        for (int i = 0; i < string.length(); i++) {
//            LinkedList<Character> list =new LinkedList<>();
//            list.add(string.charAt(i));
//            for (int j = 0; j < string.length(); j++) {
//                if (string.charAt(j)>list.getLast())
//                    list.add(string.charAt(j));
//            }
//            if (list.size()>max.size()) {
//                max.clear();
//                max.addAll(list);
//            }
//            list.clear();
//        }
//
//        for (Character ch: max
//        ) {
//            System.out.print(ch);
//
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String string = sc.nextLine();
//        LinkedList<Character> maxList = new LinkedList<>();
//        for (int i = 0; i < string.length(); i++) {
//            LinkedList<Character> charList = new LinkedList<>();
//            charList.add(string.charAt(i));
//            for (int j = i + 1; j < string.length(); j++) {
//                if (charList.getLast() < string.charAt(j)){
//                    charList.add(string.charAt(j));
//                }
//            }
//            if (charList.size() > maxList.size()) {
//                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
//                maxList.clear();
//                maxList.addAll(charList);
//            }
//            charList.clear();
//        }
//        for (Character ch: maxList) {
//            System.out.print(ch);
//        }
//        System.out.println();
    }
}
