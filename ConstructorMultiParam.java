public class ConstructorMultiParam {
  int modelYear;
  String modelName;

  public ConstructorMultiParam(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args){
    ConstructorMultiParam myCar = new ConstructorMultiParam(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
