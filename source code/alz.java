import com.google.common.collect.ImmutableMap;
import java.util.Collection;

public interface alz {
  Collection<amo> a();
  
  <T extends Comparable<T>> T b(amo<T> paramamo);
  
  <T extends Comparable<T>, V extends T> alz a(amo<T> paramamo, V paramV);
  
  <T extends Comparable<T>> alz a(amo<T> paramamo);
  
  ImmutableMap<amo, Comparable> b();
  
  afh c();
}


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */