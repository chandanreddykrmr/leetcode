class Solution {
    public int romanToInt(String s) {
        
        HashMap<String, Integer> allVals = new HashMap<>();
        allVals.put("I",1);
        allVals.put("V",5);
        allVals.put("X",10);
        allVals.put("L",50);
        allVals.put("C",100);
        allVals.put("D",500);
        allVals.put("M",1000);
        int result = 0;
        int i = 0;
         while(i < s.length()){
             int currentValue = allVals.get(String.valueOf(s.charAt(i)));
        
        if (i + 1 < s.length()) {
            int nextValue = allVals.get(String.valueOf(s.charAt(i + 1)));
            
            if (currentValue >= nextValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
        } else {
            result += currentValue;
        }
        
        i++;
            }
        return result;
    }
}