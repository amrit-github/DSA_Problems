package RecursionPrograms;

public class CheckStringIsPalindrome {

    public static void main(String[] args) {
        
        String str = "abcdba";
        int n = str.length();
        int end = n - 1;
        System.out.println(check(str, 0, end));
    }

    static boolean check(String str, int start, int end){
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        if(end - start == 1 || end == start) return true;
        return check(str, start + 1, end - 1);
    }
}