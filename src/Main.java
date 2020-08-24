class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int space=s.trim().lastIndexOf(" ");
        System.out.println(space);
       // if (space==s.length()-1)
        String last = s.trim().substring(space+1);
        System.out.println(last);
        return last.length();
    }
    public static void main(String a[]){
        LengthOfLastWord s = new LengthOfLastWord();
        String st ="Happy Life ";
        System.out.println(st.trim());
        System.out.println(s.lengthOfLastWord(st));
    }

    public int lengthOfLastWord1(String s) {
        String ts = s.trim();
        String last = ts.substring(ts.lastIndexOf(" ")+1);
        return last.length();
    }
}