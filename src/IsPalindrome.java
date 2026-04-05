package src;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x < 0){return false;}
        return x == invertNumber(x, 0);
    }

    public static int invertNumber(int x, int inverted){

        if(x < 10){
            return inverted * 10 + x;
        }
        else{
            return invertNumber(x/10, inverted * 10 + x%10);
        }
    }
    
    public static void main(String[] args){
        System.out.println(invertNumber(102102, 0));
    }
}
