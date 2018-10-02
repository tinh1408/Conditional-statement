package com.company;

import java.util.Scanner;

public class ungdungsoso {
    public static void ungdungsoso() {
        String lottery = "21";
        int so = Integer.parseInt(lottery);
        //biến string , hàm Integer.parseInt(tên biến ) hỗ trợ chuyển đổi string thành int
        //tạo số ngẫu nhiên dùng hàm randoom
        //Random rd =; new Randowm();
        // int rds = rd.nextInt(bound:99);
        //System.out.println(" rds = " +rds);
        //

        Scanner scanner = new Scanner(System.in);
        int guessDigit1;
        int guessDigit2;
        boolean gtri;
        do {
            System.out.println("Nhập vào guessDigit1");
            guessDigit1 = scanner.nextInt();
            System.out.println("Nhập vào guessDigit2");
            guessDigit2 = scanner.nextInt();
            gtri= true;
            if ((guessDigit1 < 10 && guessDigit1 >= 0) && (guessDigit2 < 10 && guessDigit2 >= 0)) {
                int n = guessDigit1 * 10 + guessDigit2;
                if (n == 21) {
                    System.out.println("Chúc Bạn đã trúng số đặc biệt !");
                    System.out.println(" Giải thưởng của bạn là : 10000 USD");
                }
                if (n == 12) {
                    System.out.println("Chúc mừng bạn đã trúng giải nhì !");
                    System.out.println("Tiền thưởng của bạn là : 3000 USD");
                }
                if (guessDigit1 == 2 || guessDigit2 == 1) {
                    System.out.println("Chúc mừng bạn đã trúng giải ba , số có 1 chữ số ");
                    System.out.println("Tiền thưởng của bạn là 1000 USD");
                }
            } else {
                gtri = false;
                System.out.println("Giá trị vừa nhập không hợp lệ , yêu cầu nhập lại");
            }
        }
        while (gtri = true);
    }}
