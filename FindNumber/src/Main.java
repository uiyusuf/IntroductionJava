public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1 , 3 , 5 , 8 , 6};
        int aranacak = 18;
        boolean varMi = false;

        for (int s: sayilar) {
            if (s == aranacak) {
                varMi = true;
                break;
            }
        }
        if(varMi)
            System.out.println("Sayi Mevcuttur");
        else
            System.out.println("Sayi Mevcut Degildir");

    }
}