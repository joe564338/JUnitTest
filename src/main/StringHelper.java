package main;

/**
 * Created by Joe on 5/11/2017.
 */
public class StringHelper {
    String string;
    public StringHelper(String string){
        this.string = string;
    }
    public boolean isPalindrome(){
        String reverse = new StringBuffer(string).reverse().toString();
        if (string.equals(reverse)){
            return true;
        } else {
            return false;
        }
    }
    public boolean isSameLength(String s){
        if(s.length() == string.length()){
            return true;
        } else return false;
    }
}
