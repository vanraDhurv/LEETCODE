class stringComparision {
    public static int compress(char[] chars) {
        StringBuilder temp = new StringBuilder();
        int count = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                temp.append(chars[i]);
                if (count > 1) {
                    temp.append(count);
                }
                count = 1;
            }
        }

        temp.append(chars[chars.length - 1]);
        if (count > 1) {
            temp.append(count);
        }

        for(int i =0;i<temp.length();i++){
            chars[i] = temp.charAt(i);
        }
        return temp.length();
    }

    public static void main(String[] args) {
        char char1[] = {'a','a','b','b','b','b','a','a','a'};
        System.out.println(compress(char1));
    }
}