package lab1.q1;

public class MyMath {

    public static int findSmallestOf(int x, int y, int z){

        if(y < x && y < z)
            return y;
        else if(z < x && z < y)
            return z;
        else
            return x;
    }

    public static int powerOf(int a, int b) {
        int result = 1, i;

        for(i = 0; i < b; i++){
            result = result*a;
        }
        return result;
    }

    public static int sumOfNumbersFromOneTo(int n){
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int getMultipleOf(int n){
        int multiple = 1;

        for(int i = 1; i <= n; i++){
            multiple = multiple*i;
        }
        return multiple;
    }

    public static boolean isPrimeNumber(int n){

        for(int i = 1; i < n; i++){
            if(i != 1 && n % i == 0)
                return false;
        }
        return true;
    }
}
