# Number Guessing game project
A simple number guessing game made within java with Net Beans

## Information
This project is a simple Number guessing game built on java throughout a course at my university
Its a basic program that allows you to guess between the numbers 1 and 100 and then tells you back
on the command prompt if you are either too high or too low and continues to narrow it down until
you get the right number. Throughout the game it counts your tries so once you eventually guess
the right number you will be told how many tries it took you to guess it. The game can be used for
a short burst of entertainment as its very short and basic, soon i will update it and add a desktop window
and possibly make a standalone application.

## The Code
The code here is basic but it accomplishes what it needs to do in a small form factor so this game can be carried virtually anywhere youd like it to be
The program revolves around a while loop that runs through a if and else to figure out if your input matches the random number the program makes from the Math.Random operator and each time it prints if you hit too close to the number or you were to high from the number and eventually once you get it right it prints out the amount of tries and the correct number.
### 


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        int a = 1 + (int) (Math.random()* 99);
        int guess = 0;
        
        System.out.println("i am thinking of a number between 1 and 100");
        
        while(guess !=a) { .nextInt();
            count++;
            if(guess >a){
                System.out.println("Too High")
            }  else if(guess < a){
                System.out.println("Too low");
            }
            }
        System.out.println("Congratulations. You guessed the number in " + count + " tries");
    }
    
}


## Technologies
The project was created with Net Beans IDE
Using Java 8.
So it should run on any computer as long as you have Java 8 installed
## Setup
To run simply just run the .java file provided and enjoy the game
