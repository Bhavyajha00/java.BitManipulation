 public class bit {
    public static void main(String[] args) {
      //get bit
            int n = 5;
            int pos = 1;
            int bitmask = 1<<pos;

            if((bitmask & n) == 0){
                System.out.println("bit was zero");
            } else 
                System.out.println("bit was one");
        }
    }

    
   
