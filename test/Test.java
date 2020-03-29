import java.util.HashMap;
import java.util.Map;

/**
 * @author xuc
 * @create 2020-03-29 23:02
 */
public class Test {
    public static void main( String[] args ) {

        Map<String,Double> hashMap = new HashMap<>();

        hashMap.put( "k1", 0.1 );
        hashMap.put( "k2", 0.2 );
        hashMap.put( "k3", 0.3 );
        hashMap.put( "k4", 0.4 );

        for ( Map.Entry<String,Double> entry : hashMap.entrySet() ) {
            System.out.println( entry.getKey() +"：" + entry.getValue());
        }

    }
}
