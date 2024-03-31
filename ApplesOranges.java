public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int cnt=0;
    int cnt1=0;
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<apples.size();i++){
        int dis=apples.get(i)+a;
        if(dis>=s&&dis<=t){
            cnt++;
        }
    }
    for(int i=0;i<oranges.size();i++){
        int dis=oranges.get(i)+b;
        if(dis>=s && dis<=t){
            cnt1++;
        }
    }
    System.out.println(cnt);
    System.out.println(cnt1);
    }

}
