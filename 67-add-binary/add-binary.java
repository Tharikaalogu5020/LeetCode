import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger b2=new BigInteger(a,2);
        BigInteger b1=new BigInteger(b,2);
        BigInteger sum=b2.add(b1);
        return sum.toString(2);
    }
}