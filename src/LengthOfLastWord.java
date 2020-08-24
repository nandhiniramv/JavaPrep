class LengthOfLastWord {
    public static void main(String a[]){
        LengthOfLastWord s = new LengthOfLastWord();
        String st ="Happy Life ";
        System.out.println(st.trim());
        System.out.println(s.lengthOfLastWord(st));
    }

    public int lengthOfLastWord(String s) {
        String ts = s.trim();
        String last = ts.substring(ts.lastIndexOf(" ")+1);
        return last.length();
    }
}