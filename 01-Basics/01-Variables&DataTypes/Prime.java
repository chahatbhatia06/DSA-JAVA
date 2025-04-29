//brute force approach
// public class Prime {

//         public boolean isPrime(int n) {
//             int count = 0;
    
//             for (int i = 1; i <= n; i++) {
//                 if (n % i == 0) {
//                     count = count + 1;
//                 }
//             }
    
//             if (count == 2) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }

//     }
    
// optimised approach

public class Prime {

    static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;

        for (int i = 2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 171;

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
