public class Main {
    public static void main(String[] args) {
//bold and thin
        char letter = 'a';

        switch(letter){
            case 'a' :
            case 'o' :
            case 'ı' :
            case 'u' :
                System.out.println("Kalın Harftir");
                break;
            default:
                System.out.println("İnce Harftir");
                break;
        }
    }
}