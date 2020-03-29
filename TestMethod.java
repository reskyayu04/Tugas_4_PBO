public class TestMethod{
   
   public static void main(String[] args){
      int o = 4;
      int p = 8;
      int q = minFunction(o,p);
      System.out.println("nilai terkecil = " + q);
   }

   public static int minFunction(int nilai1, int nilai2) {
      int min;
      if (nilai1 > nilai2)
         min = nilai2;
      else
         min = nilai1;
      return min; 
   }

}