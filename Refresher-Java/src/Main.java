// Encapsulation
class Person {
    private String name;
    private int age;

    // constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }
    public int getAge(){ return this.age; }
    public void setAge(int age){this.age = age;}
}

// Inheritance
class Student extends Person{
    private int studentId;

    public Student(String name, int age, int studentId){
    super(name,age); // setting the values in parent class constructor
    this.studentId = studentId;
    }
}

// Polymorphism
class Calculator{
    // method overloading
    public int add(int a, int b){ return a+b; }
    public double add(double a, double b){ return a+b; }
}

// Abstraction
abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound() { System.out.println("Woof!"); }
}

class Bank{
    // static for bank details
    private static int totalAccountsCreated = 0;
    private static double totalBankBalance = 0.0;

    private int accountNumber;
    private String username;
    private double balance;

    public Bank(String username, double initialDeposit){
        totalAccountsCreated++;
        this.accountNumber = totalAccountsCreated;
        this.username = username;
        this.balance = initialDeposit;

        totalBankBalance += initialDeposit;
        System.out.println("New Account created with account number : "+ accountNumber +" for "+username);
        System.out.println("Initial balance : " + this.balance);
        System.out.println("Total accounts in the bank (not to be showed to the user) : "+totalAccountsCreated);
        System.out.println("Total bank balance (not to be showed to the user) : "+totalBankBalance);
        System.out.println();
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            totalBankBalance += amount;
            System.out.println(amount + " deposited successfully");
            System.out.println("Your current bank balance is : "+this.balance);
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
            System.out.println(amount + " withdrawal successful");
            System.out.println("Your current bank balance is : "+this.balance);
        }else{
            System.out.println("Invalid amount or insufficient bank balance");
        }
    }

    public static int getTotalAccounts(){
        return totalAccountsCreated;
    }

    public static double getTotalBankBalance(){
        return totalBankBalance;
    }
}

public class Main{
    public static void main(String[] args){
        System.out.println("Hello Java");
        String name = "user47";
        int age = 19;
        System.out.println("Name: "+name+" Age: "+age);
        System.out.println(++age + age);

        Bank account = new Bank("Elliot",500);
        System.out.println("Total Bank Account Numbers : "+ Bank.getTotalBankBalance());
        System.out.println("Total Bank Balance : "+ Bank.getTotalBankBalance());
        account.withdraw(100);
        account.deposit(10000);


        // Datatypes
        int newAge = 20;
        double salary = 3000.50;
        char grade = 'A';
        boolean isLoggedIn = true;
        System.out.println(newAge);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isLoggedIn);

        String str = "anything containing a list of characters";
        int[] numbers = {1,2,3,4,5};
        System.out.println(str);
        System.out.println(numbers[0]); // first value of numbers at zeroth index

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Operators
        int a = 10, b = 6;
        System.out.println(a+b);
        System.out.println(++a);
        System.out.println(a>b);
        System.out.println(a>b && a> 5);
        System.out.println(a>b || a>20);
        System.out.println(a != b);
        System.out.println(a&b); // bitwise and
        System.out.println(a|b); // bitwise or
        System.out.println(a^b); // bitwise xor
        System.out.println(a>>2); // right shift
        System.out.println(a<<2); // left shift
        System.out.println(a>>>1); // shifts bits to the right, filling the left with zeros

        boolean isAdmin = true;
        boolean isSignedIn = true;

        String result = isAdmin && isSignedIn ? "Access Granted!" : "Access Denied!";
        System.out.println(result);

        // Control Flow
        int number = 23;
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("zero");
        }

        // switch case
        char character = 'j';
        String type;
        switch(character){
            case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U':
                type = "Vowel!";
                break;
            default:
                type = "Consonants";
        }
        System.out.println(type);

        // for loop
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // while loop
        int j = 1;
        int val = 1;
        while(j<=10){
            val *= j;
            System.out.println(val);
            j++;
        }
        System.out.println(val);

        // Arrays
        int[] nums = {1,2,3,4,5};
        System.out.println("First Number : "+nums[0]); // value at the first index
        for(int i=0;i<nums.length;i++){
        System.out.println("Element at index "+i+" is "+nums[i]);
        }

        // enhanced for loop
        for(int n : nums){
            System.out.print(n + " ");
        }
        System.out.println();

        // multidimensional array
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int row = 0; row<matrix.length;row++){
            for(int col = 0;col<matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int[] n : matrix){
            for( int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


        // Strings -- array of characters
        String str1 = "Hello";
        String str2 = "World!";

        // concatenation
        String res = str1 + " " + str2;
        System.out.println(res);

        // String Methods
        System.out.println("length: "+ res.length());
        System.out.println("Uppercase: "+ res.toUpperCase());
        System.out.println("Lowercase: "+res.toLowerCase());
        System.out.println("Substring: "+res.substring(0,5)); // index 0 to 4
        System.out.println("Contains 'World': "+res.contains("World"));
        System.out.println("Replace: "+res.replace("World","Java")); // replace World with Java

        // String comparison
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println("s1 == s2: "+(s1 == s2)); // true -- string pool
        System.out.println("s1 == s3: "+(s1 == s3)); // false -- different object
        System.out.println("s1.equals(s3): "+ s1.equals(s3)); // true -- only content comparison
        




    }
}












