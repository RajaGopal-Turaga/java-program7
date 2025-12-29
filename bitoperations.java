import java.util.*;

class bit2 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sin.nextInt();
        System.out.println("enter pos value;");
        int pos = sin.nextInt();
        System.out.println("1.getbit");
        System.out.println("2.setbit");
        System.out.println("3.clearbit");
        System.out.println("4.updatebit");
        int ch = sin.nextInt();
        do {
            switch (ch) {
                case 1:
                    int bm1 = (n & (1 << pos));
                    if (bm1 != 0) {
                        System.out.println("bit at p o s " + pos + "is 1 and bit   value=" + bm1);
                    } else {
                        System.out.println("bit at p o s " + pos + "is 0 and bit   value=" + bm1);
                    }
                    break;
                case 2:
                    int bm2 = (n | (1 << pos));
                    if (bm2 != 0) {
                        System.out.println("bit at p o s " + pos + "is 1 and bit   value=" + bm2);
                    } else {
                        System.out.println("bit at p o s " + pos + "is 0 and bit   value=" + bm2);
                    }
                    break;
                case 3:
                    int bm3 = (n & ~(1 << pos));
                    if (bm3 != 0) {
                        System.out.println("bit at p o s " + pos + "is 1 and bit   val ue=" + bm3);
                    } {
                    System.out.println("bit at p o s " + pos + "is 0 and bit   value=" + bm3);
                }
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println("do u want again enter,1 for yes and 0 for no");
            int ch1 = sin.nextInt();
        } while (ch == 1);
    }
}
