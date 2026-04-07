class Anagram{
    public boolean isAnagram(String s){
        StringBuilder trd = new StringBuilder();
        for(int i = s.length()-1; i >= 0 ;i--){
            trd.append(s.charAt(i));
        }
        if(s.equals(trd.toString())){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Anagram tr = new Anagram();
        String s = "sasd";
        Boolean isIt = tr.isAnagram(s);
        System.out.println(isIt ? "True" : "False");
    }
}