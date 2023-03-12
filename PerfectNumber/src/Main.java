import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,bolenler = 0;
        Scanner entry = new Scanner(System.in);
        int number = entry.nextInt();

        for (i = 1 ; i<number ; i++){
            if(number%i==0){
                bolenler = bolenler+i;
            }
        }
        if(bolenler == number){
            System.out.println("Bu Sayi Mükemmel Sayidir");
        }
        else
            System.out.println("Bu Sayi Mükemmel Sayi Degildir.");
    }
}