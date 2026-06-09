void main(){
    int marks[] = {87, 32, 44,89, 23};
    String pass = "";
    String fail = "";
    for (int i=0;i<marks.length;i++){
        // Pass Case
        if(marks[i]>40){
            pass += marks[i]+", "; // 89, 67, 78,
        } else if(marks[i]<40){
            fail += marks[i]+", "; //23, 32,
        }
    }
    System.out.print("Pass Marks : ");
    System.out.print(pass.substring(0, pass.length()-2));
    System.out.print("\nFail Marks : ");
    System.out.print(fail.substring(0, fail.length()-2));
}