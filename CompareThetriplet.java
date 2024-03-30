public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int cnt =0;
        int cnt1=0;
            for(int i=0;i<a.size();i++){
                
                    if(a.get(i)>b.get(i)){
                        cnt++;
                    }
                    if(a.get(i)<b.get(i)){
                        cnt1++;
                    }
                    
                
            }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(cnt);
        list.add(cnt1);
       
       
        return list;
            
    }

}
