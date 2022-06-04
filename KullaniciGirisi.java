package Hesaplamalar;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, yenisifre;
        int karar;


        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz :");
        userName = input.nextLine();

        System.out.print("Sifrenizi Giriniz :");
        password = input.nextLine();

        if (userName.equals("btabir") && password.equals("123456")) {
            System.out.println("Basariyla Giris Yaptiniz");
        } else if (password != ("123456")) {
            System.out.println("Kullanici Adi veya Sifre Yanlis");
            System.out.println("Sifrenizi Sifirlamak Ister Misiniz ? ");
            System.out.println("1-Evet" + " 2-Hayir");
        }
        karar = input.nextInt();
        input.nextLine();

            switch (karar) {
                case 1:
                    System.out.println(" Lutfen Yeni Bir Sifre Belirleyiniz : ");
                    yenisifre = input.nextLine();

                    if (yenisifre.equals("123456")) {
                        System.out.println("Yeni sifreniz bir onceki sifreniz ile ayni olamaz.");
                        break;
                    } else {
                        System.out.println("Sifreniz basari ile degistilidi.");
                        System.out.println("Yeni sifreniz :" + yenisifre);
                    }
                    break;
                case 2:
                    System.out.println("Sifre degistirme islemini iptal ettiniz.");
                    break;
            }
            {

            }

        }
    }


