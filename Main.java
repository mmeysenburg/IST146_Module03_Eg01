/* Two-dimensional Array of Cell Phone Bills
   Anderson, Franceschi
*/
public class Main {

  public static void main(String[] args) {
    // declare constants for the number of rows and columns
    final int NUMBER_OF_MONTHS = 3;
    final int NUMBER_OF_PERSONS = 4;

    // declare and instantiate the array
    double[][] familyCellBills = new double[NUMBER_OF_MONTHS][NUMBER_OF_PERSONS];

    // assign values to array elements
    familyCellBills[0][0] = 45.24; // row 0
    familyCellBills[0][1] = 54.67;
    familyCellBills[0][2] = 32.55;
    familyCellBills[0][3] = 25.61;

    familyCellBills[1][0] = 65.29; // row 1
    familyCellBills[1][1] = 49.75;
    familyCellBills[1][2] = 32.08;
    familyCellBills[1][3] = 26.11;

    familyCellBills[2][0] = 75.24; // row 2
    familyCellBills[2][1] = 54.53;
    familyCellBills[2][2] = 34.55;
    familyCellBills[2][3] = 28.16;

    System.out.println("The first monthly cell bill for the first " + "family member is\n" + familyCellBills[0][0]);
    System.out.println("The last monthly cell bill for the last " + "family member is\n"
        + familyCellBills[NUMBER_OF_MONTHS - 1][NUMBER_OF_PERSONS - 1]);

    int numRows = familyCellBills.length;
    System.out.println("\nThe number of rows is " + numRows);

    for (int i = 0; i < numRows; i++) {
      System.out.print("The number of columns in row " + i + " is ");
      System.out.println(familyCellBills[i].length);
    }

    ///////////////////////////////////////////////////////////////
    // code below is not from the text's example
    ///////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////
    // calculate sum for all family members, all months
    ///////////////////////////////////////////////////////////////

    // here we need to access all elements of the array,
    // using an accumulator pattern
    double sum = 0.0;
    for (int row = 0; row < familyCellBills.length; row++) {
      for (int col = 0; col < familyCellBills[row].length; col++) {
        sum += familyCellBills[row][col];
      } // inner loop
    } // outer loop

    System.out.println();
    System.out.printf("Total family cell bill: $%.2f\n", sum);

    ///////////////////////////////////////////////////////////////
    // calculate sum for Joe
    ///////////////////////////////////////////////////////////////

    // here, we keep the column number fixed, and iterate
    // through the rows
    sum = 0.0;
    for (int row = 0; row < familyCellBills.length; row++) {
      sum += familyCellBills[row][0];
    } // for i

    System.out.printf("Joe's cell bill: $%.2f\n", sum);

    ///////////////////////////////////////////////////////////////
    // calculate sum for August
    ///////////////////////////////////////////////////////////////

    // similar, except here we fix the row number and
    // iterate through the columns
    sum = 0.0;
    for (int col = 0; col < familyCellBills[1].length; col++) {
      sum += familyCellBills[1][col];
    } // for i

    System.out.printf("Family's cell bill for August: $%.2f\n", sum);

  }
}