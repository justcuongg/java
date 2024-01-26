package baitapthuchanh.src;

import java.util.Scanner;

public class phuongtrinhbac2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double hsA, hsB, hsC, nghiem1, nghiem2, delta;

        System.out.print("Nhap he so a: ");
        hsA = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        hsB = sc.nextDouble();
        System.out.print("Nhap he so c: ");
        hsC = sc.nextDouble();
        System.out.println("Phuong trinh da nhap la: " + hsA + "x*x + " + hsB + "x +" + hsC + " = 0" );

        delta = (hsB *  hsB) - (4 * hsA * hsC);

        if(hsA == 0)
            if(hsB == 0)
                if(hsC == 0)
                    System.out.println("Phuong trinh co vo so nghiem");
                else 
                    System.out.println("Vo ly");
            else 
            {
                nghiem1 = -hsC / hsB;
                System.out.println("Phuong trinh co nghiem la: " + nghiem1);
            }
        else
        {
            if(delta > 0) 
            {
                nghiem1 = (-hsB+Math.sqrt(delta))/(2*hsA);
                nghiem2 = (-hsB-Math.sqrt(delta))/(2*hsA); 
                System.out.println("Phuong trinh co 2 nghiem la: " + nghiem1 + " va " + nghiem2);
            }
            else if(delta == 0 )
            {
                nghiem1 =  nghiem2 = -hsB / (2 * hsA);
                System.out.println("Phuong trinh co nghiem kep: " + nghiem1);
            }
            else System.out.println("Phuong trinh vo nghiem");
        }
        sc.close();
    }
}
