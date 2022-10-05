public class Functions {
    public static void main(String[] args) {
        int random = random(15);    
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite: " + isPrime(random));
    }

    public static int random(int range) {
        double random = Math.random() * range+1;
        return (int) random;
    }
    public static String isPrime(int random) {
        if(random==1){
            String one = "COMPOSITE";
            return one;
        }
        String isPrime = "";
        for (int i = random-1; i > 1; i--) {
            isPrime = (random % i == 0) ? "COMPOSITE" : "PRIME";
            if(isPrime.equals("COMPOSITE")){
                break;
            }
        }
        return isPrime;
    }
}
