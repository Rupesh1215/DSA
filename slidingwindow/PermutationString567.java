package slidingwindow;

public class PermutationString567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbcooo";
        PermutationString solution = new PermutationString();
        boolean result = solution.checkInclusion(s1, s2);
        System.out.println("Permutation exists: " + result);
    }
}

class PermutationString{
    public boolean checkInclusion(String s1, String s2){

        if(s1.length() > s2.length()) return false;

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for(int i=0; i<s1.length(); i++){
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }

        for(int i=0; i < s2.length() - s1.length(); i++){
            if(matches(s1Map, s2Map)){
                return true;
            }
            s2Map[s2.charAt(i+s1.length()) - 'a']++;
            s2Map[s2.charAt(i) - 'a']--;
        }

        return matches(s1Map, s2Map);
    }

    private boolean matches(int[] s1, int[] s2){
        for(int i=0; i < s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }
}
