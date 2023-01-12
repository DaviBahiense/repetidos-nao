import java.util.*;

public class App {
    public static void main(String[] args)  {
        String[] arr1 = new String[]{"morango","uva","kiwi", "abacaxi",};
        String[] arr2 = new String[]{"caju","morango","pera","kiwi"};

        List<String> repeated =new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j]==arr2[i]) {
                    repeated.add(arr2[i]);
                }
            }
            
        }
        System.out.println("O nome repetido entre as duas arrays são: "+ repeated);

    }
}
