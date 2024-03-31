  public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    
    ArrayList<Integer> list = new ArrayList<>();
    
for(int i=0;i<grades.size();i++){
    int x=grades.get(i);
    int rem = x%5;
    if(x>=38&& rem>=3){
        list.add(x+5-rem);
    }
    else{
        list.add(x);
    }
}
return list;
    }

}
