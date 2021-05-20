public class RepeatTheFront {

  /*
  Given a string and an int n, return a string made of the first n characters of the string,
  followed by the first n-1 characters of the string, and so on.
  You may assume that n is between 0 and the length of the string,
  inclusive (i.e. n >= 0 and n <= str.length()).
   */

  public static void main(String[] args) {
      RepeatTheFront repeatTheFront = new RepeatTheFront();

    System.out.printf("The String with outcome %s and integer %d gives " +
        repeatTheFront.repeatFront("Chocolate", 4) + " as outcome.\n\n", "Chocolate", 4);
    System.out.printf("The String with outcome %s and integer %d gives " +
        repeatTheFront.repeatFront("Chocolate", 3) + " as outcome.\n\n", "Chocolate", 3);
    System.out.printf("The String with outcome %s and integer %d gives " +
        repeatTheFront.repeatFront("Ice cream", 2) + " as outcome.\n\n", "ice cream", 2);

  }

  public String repeatFront(String str, int n) {
    String result = "";

    for (int i = n; n > 0; n--) {
      result += str.substring(0, n);
    }
    return result;
  }

}
