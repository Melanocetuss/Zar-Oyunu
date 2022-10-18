import java.util.Random;
import java.util.Scanner;
public class Zar {
    public static void oyunuBaslat(){
        Scanner sc = new Scanner(System.in);
        int userWin=0,pcWin=0,draw =0;
        boolean cikisKontrol=true;
        while(cikisKontrol){
            menuYazdir();
            int secim= sc.nextInt();

            switch (secim){
                case 1:
                    int sonuc=zarAt();
                    if(sonuc==0){draw++;}
                    if(sonuc==1){userWin++;}
                    if(sonuc==2){pcWin++;}
                    break;
                case 2:
                    sonucYaz(userWin,pcWin,draw);
                    break;
                case 3:
                    cikisKontrol=false;
                    break;
                default:
                    System.out.println("Yanlis secim yaptiniz");
                    break;
            }
        }
    }

    public static void menuYazdir(){
        System.out.println("1)Zar At");
        System.out.println("2)Skorlari goster");
        System.out.println("3)Cikis");
    }

    public static int zarAt(){
        Random random = new Random();

        int oyuncuZari = random.nextInt(6)+1;
        int pcZari = random.nextInt(6)+1;

        System.out.println("Oyuncu: "+oyuncuZari+"\n"+"PC: "+pcZari);

        if(oyuncuZari==pcZari){
            System.out.println("Durum:beraberlik");
            return 0;
        }
        else if(oyuncuZari>pcZari){
            System.out.println("Durum:oyuncu kazandi");
            return 1;
        }
        else {
            System.out.println("Durum: Pc kazandi");
            return 2;
        }
    }

    public static void sonucYaz(int userWin, int pcWin,int draw){
        System.out.println("Oyuncu zaferi: "+userWin);
        System.out.println("Pc zaferi: "+pcWin);
        System.out.println("Beraberlik: "+draw);
    }

    public static void main(String[] args) {
        oyunuBaslat();
    }
}
