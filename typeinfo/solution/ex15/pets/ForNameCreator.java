//: typeinfo/pets/ForNameCreator.java
package typeinfo.solution.ex15.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "typeinfo.solution.ex15.pets.Mutt",
    "typeinfo.solution.ex15.pets.Pug",
    "typeinfo.solution.ex15.pets.EgyptianMau",
    "typeinfo.solution.ex15.pets.Manx",
    "typeinfo.solution.ex15.pets.Cymric",
    "typeinfo.solution.ex15.pets.Rat",
    "typeinfo.solution.ex15.pets.Mouse",
    "typeinfo.solution.ex15.pets.Hamster",
    "typeinfo.solution.ex15.pets.Gerbil"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
