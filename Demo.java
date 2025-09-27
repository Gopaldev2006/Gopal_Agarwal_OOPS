class Own {
    void validate(int n) {
        if (n >= 1 && n <= 10) {
            System.out.println(n + " is not valid value");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Own obj = new Own();
        try {
            obj.validate(85);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


// public class Demo {
//     public static void main(String[] args) {
//         if (n>=1&& h <=10)
//         System.out.println(n+" is not valid value");
// }
// class Demo {
//     public static void main(String[] args) {
//         Own obj=new Own();
//         try{
//             obj.validate(85);

//         }
//     }
// }