public class count_number {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;

        int num = n;

        if(n==0){
            count = 1; 
        }else{
            while(n!=0){
                n = n/10;
                count++;
            }
        }
        System.out.println("Number of digits in " + num + " is: " + count);

    }
}
