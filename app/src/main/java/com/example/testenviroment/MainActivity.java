package com.example.testenviroment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Account objetoAccount = new Account();
        objetoAccount.depositCash(500);
        objetoAccount.withdrawCash(50);
        System.out.println(objetoAccount.accountBalance);
        
        /*
        Bird objBird = new Bird();
        Dog objDog = new Dog();
        objDog.run();
        objBird.run();
        objBird.setColor("blue");
        System.out.println(objBird.getColor());
        */

        /*
        Bird objBird = new Bird();
        objBird.sleep();
        objBird.fly();

        Dog objDog = new Dog();
        objDog.bark();
        */

        /*
        Animal myAnimal = new Animal();
        myAnimal.run();
        */

        /*
        Employee myEmployee = new Employee();
        myEmployee.Name = "Mac";
        myEmployee.Salary = 1000.0;

        Double Salary = myEmployee.retrieveSalary(150, 10);
        System.out.println(myEmployee + " salary is " + Salary);
        */

        /*
        Home myHome = new Home(); // myHome = object on memory associated to a class Home
                                  // Can access resources from Home Class from myHome object
                                  // Like Methods and variables using a dot
        myHome.color = "Blue";

        Home mySecondHome = new Home(); // New object associated to Home
        mySecondHome.color = "White";
        mySecondHome.openDoor();
        */



    }
}