 class GetBit {
    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int pos = 2;

        int bit = (n & (1 << pos));

        if (bit != 0)
            System.out.println("Bit at position " + pos + " is 1 and bit value="+bit);
        else
            System.out.println("Bit at position " + pos + " is 0");
    }
}
