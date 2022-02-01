/**public class PasswordGenerator{

   private int length;
   private String prefix;
   private static int count=0;
  
   public PasswordGenerator(int length){
       this.length = length;
       this.prefix = "A";
   }
  
   public PasswordGenerator(int length, String prefix){
       this.length = length;
       this.prefix = prefix;
   }

   public int pwCount(){
       return this.count;
   }

   public String pwGen(){
       //Random class object to generate random integers in range 0 to 9
       Random random = new Random();

       // String password created and added prefix and a dot
       String password = this.prefix+".";
       int value;

       // Using for loop we generate random numbers for length number of times
       for(int i=1;i<=length;i++){
           value = random.nextInt(10);
           password=password+String.valueOf(value);
       }

       // Increment the count by 1
       this.count++;
       return password;
   }
}
**/