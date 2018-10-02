package com.company;

import java.util.Scanner;

public class TinhLuong {
    public static void TinhLuongJava(){
        int salary;
        int year;
        int hs;
        char tieptuc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số lương : ");
        hs= scanner.nextInt();
        System.out.println("Nhập vào số năm làm việc : ");
        year = scanner.nextInt();
        do {
            if ((hs >= 1 && hs <= 5)&& year>0) {
                salary = hs*4000000 +year *500000;
                System.out.println("Số tiền lương của nhân viên là : " +salary );
            }
            else
            {
                System.out.println("Giá trị vừa nhập không hợp lệ ");
            }
            System.out.println("Done !");
            System.out.println("bạn có muốn tiếp tục không (yes or no)");
            tieptuc=scanner.next().charAt(0);
        }while ( tieptuc =='y');
        System.out.println(" Done !");
    }

}
