abstract class Aquatic 
{
  public int getNumberOfGills(int input) {
  return input;
  }
}
public class ClownFish extends  Aquatic {
  public String getNumberOfGills() { return "4"; }
  public int getNumberOfGills(int input) { return 6; }
  public static void main(String[] argv) {
   System.out.println(new ClownFish().getNumberOfGills(-1));
  }
}