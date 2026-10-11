class leetcode50 {
    public double myPow(double x, int n) {
        long exp = n;
        
        if (exp < 0) {
            exp = -exp;
        }
        
        double result = 1.0;
        double currentProduct = x;
        
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            exp >>= 1;
        }
        
        return n < 0 ? 1.0 / result : result;
    }
}