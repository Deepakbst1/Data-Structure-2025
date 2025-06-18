import java.util.Scanner;


public class StringBasics {
    public static void main(String[] args) {
        // take user input
        Scanner sc=new Scanner(System.in);
        // sc.next only first word
        String name=sc.nextLine();
        String name2=sc.nextLine();
        // sc.nextLine entire
//        String name=sc.nextLine();

//        for concatenation we use string1+""string2
//        System.out.println("ss"+ name);

//      for length of string
//        System.out.println(name.length());

//        for (int i = 0; i < name.length(); i++) {
//            // character matches index
//            if(name.charAt(i) == 'a'){
//                System.out.print(i+" ");
//            }
//        }

        if(name.length()==name2.length()) {
            boolean isEqual=true;
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i) !=name2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
            System.out.println(isEqual);
        }
        else {
            System.out.println("false");
        }

    }
}
