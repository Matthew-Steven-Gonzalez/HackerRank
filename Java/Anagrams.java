
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        //Check if character amount is the same. 
       if(a.length() == b.length()){
            //LowerCase the first string then add to its own sorted array.
            a = a.toLowerCase();
            char[] c1 = a.toCharArray();
            java.util.Arrays.sort(c1);
            //rinse and repeat for second string
            b = b.toLowerCase();
            char[] c2 = b.toCharArray();
            java.util.Arrays.sort(c2);
            //go through both char arrays checking to see if each indices match. 
            for(int i=0; i<a.length();i++){
                if(c1[i] != c2[i]){
                    return false;
                }
            }
        return true;
    } else {
        return false;
    }

    }d

}
