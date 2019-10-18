class Solution {
     public int[] numSmallerByFrequency(String[] queries, String[] words) {
        PriorityQueue<FreqInfo> q = new PriorityQueue<>((f1, f2) -> Integer.compare(f1.freq, f2.freq));
        for(int i =0; i<queries.length; i++){
            int fr = f(queries[i]);
            q.add(new FreqInfo(i, fr) );
        }
        
        PriorityQueue<FreqInfo> w = new PriorityQueue<>((f1, f2) -> Integer.compare(f1.freq, f2.freq));
        for(int i =0; i<words.length; i++){
            int fr = f(words[i]);
            w.add(new FreqInfo(i, fr) );
        }
        int[] result = new int[queries.length];
        while (!q.isEmpty() && !w.isEmpty()){
            FreqInfo qInfo = q.peek();
            FreqInfo wInfo = w.peek();

            if(qInfo.freq >= wInfo.freq){
                w.poll();
            } else{
                result[qInfo.index] = w.size();
                q.poll();
            }
        }
        return result;
        
    }
    
    class FreqInfo{
        int index;
        int freq;
        FreqInfo(int index, int freq){
            this.index = index;
            this.freq = freq;
        }
    }
    
    public int f(String str){
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        char min = '0';
        char[] chars = str.toCharArray();
        for(char ch: chars){
            if(min == '0' || ch < min){
                min = ch;
            }
            int f = freq.getOrDefault(ch, 0);
            freq.put(ch, f+1);
        }
        return freq.get(min);
    }
}