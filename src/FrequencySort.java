import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencySort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 3, 1, 2, 5, 2};
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        HashMap<Integer, Integer> printMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], freqMap.get(arr[i])+1);
            }else{
                freqMap.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            int maxKey = Integer.MIN_VALUE;
            int maxValue = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> max: freqMap.entrySet()){
                if(max.getValue() > maxValue && max.getValue() != 0){
                    maxValue = max.getValue();
                    maxKey = max.getKey();
                }
            }
            for(int i = 0; i < maxValue; i++){
                System.out.print(maxKey);
            }
            freqMap.put(maxKey, 0);
        }

    }
}
