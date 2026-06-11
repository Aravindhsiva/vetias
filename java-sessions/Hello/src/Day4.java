void main(){
    /*
    // int[] marks = new int[5];
    int[][] marks = new int[5][3];
    int[][] studentMarks = {
            {78, 90, 34},
            {89, 65, 89},
            {12, 34, 56},
            {66, 12, 89},
            {33, 77, 88}
    };
    for(int row = 0; row < studentMarks.length; row++){
        // 0{78, 90, 34},
        // 1{89, 65, 89},
        // 2{12, 34, 56},
        // 3{66, 12, 89},
        // 4{33, 77, 88}
        for(int col = 0; col < studentMarks[row].length; col++){
            //row=0
            // 78 90 34
            // row=1
            // 89 65 89
            System.out.print(studentMarks[row][col] + " ");
        }
        System.out.println();
    }
    */

    //greetUser("Aravindh");
    //greetUser("Raj");
    //greetUser("Manager");
    int result = add(5, 4);
    System.out.println(result);
    System.out.println(add(5, 5));
}

public void greetUser(String name){
    System.out.println("Hello World, "+name);
}

// +,- *, /, %

public int add(int a, int b){
    return a+b;
}