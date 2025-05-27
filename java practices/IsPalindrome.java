public class IsPalindrome {

        public boolean isPalindrome(int x) {
            if (x < 0 || x%10 == 0 && x != 0){
                return false;
            }

            int halved = 0;

            while( x < halved){
                int digit = x % 10;
                halved = halved * 10 + digit;
                x /= 10;
            }

        return halved == x || halved == x/10;
    }
}
