 public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    int ar []= new int[5];
    for(int i=0;i<arr.size();i++){
        ar[arr.get(i)-1]++;
    }
    int max =0;
    int ans =0;
    for(int i=0;i<ar.length;i++){
        if(ar[i]>max){
            max=ar[i];
            ans=i+1;
        }
    }
    return ans;
    }

}
