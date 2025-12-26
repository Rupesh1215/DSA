package arrays;
import java.util.*;

class ListOfAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ansMap = new HashMap<>();

        int []count = new int [26];

        for(String s : strs){
            Arrays.fill(count,0);
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder(" ");

            for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();
            if(!ansMap.containsKey(key)){
                ansMap.put(key,new ArrayList<>());
            }
            ansMap.get(key).add(s);
        }
        return new ArrayList<>(ansMap.values());
    }
}

class GroupAnagrams49 {
    public static void main(String[] args) {
        ListOfAnagrams solution = new ListOfAnagrams();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + result);
        scanner.close();
    }
}
