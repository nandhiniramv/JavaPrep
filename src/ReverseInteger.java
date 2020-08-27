public class ReverseInteger {
        public int reverse(int x) {
            int r =0;
            //x!=0 is important not >0 to solve for -ve cases
            while(x!=0){
                int pop = x % 10;

                //TIL that max min checks are good
                // but the edge case of pop being the 7 or 8
                // and when added to r, can tip the scale should be handled as well
                if (r > Integer.MAX_VALUE/10 || (r == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (r < Integer.MIN_VALUE/10 || (r == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

                r=10*r+ pop;
                x/=10;
            }
            return r;
        }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(123));
        System.out.println(r.reverse(-123));
        System.out.println(r.reverse(120));
        System.out.println(r.reverse(1534236469));
    }
}
