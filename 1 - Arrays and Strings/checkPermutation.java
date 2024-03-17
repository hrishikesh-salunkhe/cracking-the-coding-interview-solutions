// Check Permutation: Given two strings, write a method to decide if one is a permutation of the other



public class checkPermutation{

    private String check(String a, String b){

        if(a.length() != b.length()){
            return "False";
        }
        else{
            for(int i=0; i<a.length(); i++){
                Boolean isPresent = false;
                for(int j=0; j<b.length(); j++){
                    if(a.charAt(i) == b.charAt(j)){
                        isPresent = true;
                        b = b.substring(0, j) + b.substring(j+1);
                        break;
                    }
                }
                if(!isPresent){
                    return "False";
                }
            }
            return "True";
        }
    }

    public static void main(String[] args){
        checkPermutation cp = new checkPermutation();
        String output = cp.check("abcd", "bcad");
        System.out.println(output);
    }
}