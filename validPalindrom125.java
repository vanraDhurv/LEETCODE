class validpanlindrom125{

    public static boolean isPalindrome(String s) {
        boolean ispalinDrom = false;
        String newStr = "";
        String newStr1 = "";

        s = s.toLowerCase();
        for(int i = 0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                newStr+=s.charAt(i);
                newStr1 = s.charAt(i) + newStr1;
            }
        }
        if(newStr.equals(newStr1)){
            ispalinDrom = true;
        }        
        return ispalinDrom;
    }
    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}