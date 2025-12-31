package arrays;
import java.util.*;

class AlienDictionary953{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Verify result = new Verify();
        System.out.println("Enter order : ");
        String order = s.nextLine();
        System.out.println("Enter no.of words : ");
        int n = s.nextInt();
        String[] words = new String[n];
        System.out.println("Enter "+n+" no.of words");
        for(int i=0; i<n;i++){
            words[i]=s.nextLine();
        }
        boolean ans = result.isAlienSorted(words,order);
        System.out.println(ans);

    }
}

 class Verify{
    public boolean isAlienSorted(String[] words, String order){
        Map<Character,Integer> orderMap = new HashMap<>();
        for(int i=0;i<order.length();i++){
            orderMap.put(order.charAt(i),i);
        }

        for(int i=0; i<words.length-1;i++){
            for(int j=0; j<words[i].length(); j++){

                if(j >= words[i+1].length()){
                    return false;
                }

                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int currLetter = orderMap.get(words[i].charAt(j));
                    int nextLetter = orderMap.get(words[i+1].charAt(j));
                    if(nextLetter < currLetter){
                        return false;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return true;
    }
}