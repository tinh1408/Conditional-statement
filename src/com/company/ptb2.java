package com.company;

import java.util.Scanner;

public class ptb2 {
    public static void giaiPhuongTrinhBacHai(){
        float a,b,c;
        char tieptuc;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào hệ số a ");
            a = scanner.nextFloat();
            System.out.println("Nhập vào hệ số b ");
            b = scanner.nextFloat();
            System.out.println("Nhập vào hệ số c ");
            c = scanner.nextFloat();
            if(a == 0)
            {
                System.out.println("Phương trình vừa nhập có dạng ax + b = 0 ");
                if(b == 0)
                {
                    if(c==0)
                    {
                        System.out.println("Phương trình có vô số nghiệm");
                    }
                    else
                    {
                        System.out.println("Phương trình đã cho vô nghiệm ");
                    }
                }
                else
                {
                    if(c==0)
                    {
                        System.out.println("Phương trình đã cho có nghiệm x = 0");
                    }
                    else
                    {
                        System.out.println("Phương trình đã cho có nghiệm x = " +(-c/b));
                    }
                }
            }
            else
            {
                float denta = b*b - 4*a*c ;
                float x1 = (float)((-b+ Math.sqrt(a))/2*a);
                float x2 = (float)((-b+ Math.sqrt(a))/2*a);
                float x = -b/2*a;
                if(denta >0)
                {
                    System.out.println("Phương trình đã cho có 2 nghiệm x1 , x2 ");
                    System.out.println(+ x1);
                    System.out.println(+ x2);
                }
                if (denta == 0)
                {
                    System.out.println("Phương trình có duy nhất một nghiệm x = " +x);
                }
                if ( denta <0)
                {
                    System.out.println("Phương trình vừa nhập vô nghiệm ");
                }
            }
            System.out.println(" Done !");
            System.out.println("Bạn có muốn tiếp tục (yes or no ? )");
            tieptuc = scanner.next().charAt(0);
        }
        while ( tieptuc == 'y');        }
        }

