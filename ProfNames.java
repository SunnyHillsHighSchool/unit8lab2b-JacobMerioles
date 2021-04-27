//Programmer: Jacob Merioles Period 2 APCSA
public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
    for (String[] row: nameArray)
      for (String name: row)
        if (name.contains("Smith"))
          count++;
    return count;
  }
}