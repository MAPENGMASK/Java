package DataSet;

import java.util.*;

public class synchronizedDema {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        Set<String> stringSet = Collections.synchronizedSet(new HashSet<>());
        Map<String,Integer> stringIntegerMap = Collections.synchronizedMap(new HashMap<>());
    }
}
