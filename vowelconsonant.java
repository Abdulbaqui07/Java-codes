import java.util.Scanner;
public class vowelconsonant{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = read.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is vowel");
        }
        else{
            System.out.println(ch + " is not vowel");
        }
    }
}