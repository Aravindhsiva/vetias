void main(){
    /*
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * */
    /*int n=5;
    // row loop
    for(int row = 1;row <= n;row++){
        // column loop
        for(int column=1;column <= row;column++){
            System.out.print("* ");
        }
        System.out.println();
    }*/
    /*
        *
       **
      ***
     ****
    *****
    */

/*    int n=5;
    // row loop
    for(int row = 1;row <= n;row++){
        //space loop
        for (int space=1;space<=n-row;space++){
            System.out.print(" ");
        }

        // column loop
        for(int column=1;column <= row;column++){
            System.out.print("*");
        }
        System.out.println();
    }
*/

    int[] marks = {78,34,23,57,66};
    // int[] marks = new int[5];
    // 0 1 2 3 4
    int lastMark = marks[4];
    marks[4] = 99;
    for(int mark:marks){
        System.out.println(mark);
    }
    // length

    int total = 0;
    for(int mark:marks){
        total+=mark;
    }
    System.out.println("Total : "+total);
    System.out.println("Average : "+((int) total/marks.length));

    /*
    * Loop array
    * for loop
    * know the search value
    * compare loop item with search value
    * {78,34,23,57,99};
    * */
    int searchValue = 34;
    int found = -1;
    for (int i=0;i<marks.length;i++){
        if(marks[i]==searchValue){
            found = i;
        }
    }
    if(found!=-1){
        System.out.println("Found Value : "+marks[found]);
    } else{
        System.out.println("Item not found");
    }
}