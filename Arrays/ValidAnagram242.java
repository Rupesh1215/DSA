package arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();
        System.out.println(solution.isAnagram(s, t));
        scanner.close();
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int []charCount = new int[26];
        for(int i=0; i<s.length();i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for(int count : charCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
