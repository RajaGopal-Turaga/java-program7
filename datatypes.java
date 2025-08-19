import java.util.*;
import java.math.BigInteger;

public class datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());  // Number of test cases
        
        // Define boundaries as BigInteger for each data type
        BigInteger shortMin = BigInteger.valueOf(Short.MIN_VALUE);
        BigInteger shortMax = BigInteger.valueOf(Short.MAX_VALUE);
        
        BigInteger intMin = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        
        BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);
        
        for (int i = 0; i < t; i++) {
            String numberStr = sc.nextLine();
            BigInteger num;
            
            try {
                num = new BigInteger(numberStr);
            } catch (Exception e) {
                // Not a valid number input
                System.out.println(numberStr + " can't be fitted anywhere.");
                continue;
            }
            
            boolean canFit = false;
            StringBuilder result = new StringBuilder();
            
            if (num.compareTo(shortMin) >= 0 && num.compareTo(shortMax) <= 0) {
                if (!canFit) {
                    result.append(numberStr).append(" can be fitted in:\n");
                    canFit = true;
                }
                result.append("* short\n");
            }
            
            if (num.compareTo(intMin) >= 0 && num.compareTo(intMax) <= 0) {
                if (!canFit) {
                    result.append(numberStr).append(" can be fitted in:\n");
                    canFit = true;
                }
                result.append("* int\n");
            }
            
            if (num.compareTo(longMin) >= 0 && num.compareTo(longMax) <= 0) {
                if (!canFit) {
                    result.append(numberStr).append(" can be fitted in:\n");
                    canFit = true;
                }
                result.append("* long\n");
            }
            
            if (canFit) {
                System.out.print(result);
            } else {
                System.out.println(numberStr + " can't be fitted anywhere.");
            }
        }
        
        sc.close();
    }
}
