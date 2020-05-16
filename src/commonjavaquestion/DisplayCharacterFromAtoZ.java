package commonjavaquestion;
//Write a Java program to display character from A to Z

public class DisplayCharacterFromAtoZ {
    public static void displayingCharacterFromAtoZ(){
        for (char i = 'A'; i<='Z'; i++){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        displayingCharacterFromAtoZ();
    }
}
