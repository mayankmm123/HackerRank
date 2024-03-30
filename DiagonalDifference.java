 public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum=0;
    int sum1=0;
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr.size();j++){
            if(arr.get(i)==arr.get(j)){
                sum+=arr.get(i).get(j);
            }
            if(i+j==arr.size()-1){
                sum1+=arr.get(i).get(j);
            }
        }
    }
    return (Math.abs(sum-sum1));

    }

}
