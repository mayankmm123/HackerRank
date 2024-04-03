 public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int min=scores.get(0);
    int max=scores.get(0);
    int maxcount=0;
    int mincount=0;
    ArrayList list = new ArrayList<>();
    for(int i=0;i<scores.size();i++){
        if(max<scores.get(i)){
            maxcount++;
            max=scores.get(i);
        
        }
        
        if(min>scores.get(i)){
            mincount++;
            min=scores.get(i);
        }
    
    }
    list.add(maxcount);
 list.add(mincount);

    return list;
    }

}
