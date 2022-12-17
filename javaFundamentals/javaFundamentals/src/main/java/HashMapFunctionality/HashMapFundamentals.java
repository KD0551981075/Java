package HashMapFunctionality;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public interface HashMapFundamentals {

  public static void main(String args[]) {

    Map<String, String> Employees = new HashMap<>();

    Employees.put("Datta", "85000");
    Employees.put("Nitin", "135000");

    System.out.println(Employees.get("Datta"));


  }
}
