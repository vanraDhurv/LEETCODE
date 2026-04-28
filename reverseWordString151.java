class reverseWordString{
    public static String reverseWords(String s) {
       s= s.trim();
       String newStr = "";
       String arr[] = s.split("\\s+");
       for(int i =0;i<arr.length;i++){
            if(i==0){
                newStr = arr[i]+newStr;
            }else{
                newStr = arr[i]+" "+newStr;
            }
       }
       return newStr;
    }
    public static void main(String[] args) {
        String s = "a good   example. ";
        System.out.println(reverseWords(s));
    }
}
