package Basic;

public class UpperAndLowerCase {
    public static void main(String[] args) {
         Character('r');


    }

    public static void Character(char Case) {

        if(Case >= 'A' && Case <= 'Z') {
            System.out.println("It is Uppercase");
        }
        if(Case >= 'a' && Case <= 'z') {
            System.out.println("It is Lowercase");
        }

    }


}
