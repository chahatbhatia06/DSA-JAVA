public class Palindrome {
    
    static boolean palindrome(int n){

        int RevNum=0;

        int dup = n;

        while(n!=0){

            int ld = n % 10;

            RevNum = (RevNum * 10) + ld;

            n = n/10;

        }

        if(dup == RevNum){

            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        int number = 3443;
        if(palindrome(number)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }

}

