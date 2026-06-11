void main(){
    // String name = "vetias-college-arts";
    // String sub = name.substring(0,6);
    // System.out.println(" ".isBlank());
    //System.out.println(name.split("-")[2]);
    // String name = "    a~ra-~-vi-~ndh   ";
    System.out.println("Enter you name :");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    String clean = name
            .strip()
            .replaceAll("~","")
            .replaceAll("-","");
    System.out.println(clean);
    System.out.println("Enter your age : ");
    int age = Integer.parseInt(scanner.nextLine());
    System.out.println(age);
};