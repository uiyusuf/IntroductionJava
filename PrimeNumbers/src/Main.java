import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //find prime numbers
        Scanner entry = new Scanner(System.in);
        int number = entry.nextInt();
        String prime = "Asaldir";


        for(int i =2; i<number; i++){
            if(number%i==0){
                prime = "Asal Degildir";
                System.out.println(prime);
                break;
            }
        }
        if(prime == "Asaldir"){
            System.out.println(number + " Sayisi Asaldir");
        }

    }
}