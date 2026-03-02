# Java Annotations

## Exercise 1 – Override

Create an object hierarchy with three classes: Worker, OnlineWorker, and OnsiteWorker.

The Worker class has the attributes name, surname, and hourlyRate, and a method calculateSalary() that receives the number of hours worked as a parameter and multiplies it by the hourly rate. The child classes must override this method using @Override.

From the main() method in the Main class, make the necessary calls to demonstrate how the @Override annotation works.

For onsite workers, the salary calculation method receives the number of hours worked per month. The salary is calculated by multiplying the hours worked by the hourly rate and adding the value of a static attribute called fuel, which is defined in this class.

For online workers, the salary calculation method also receives the number of hours worked per month. The salary is calculated by multiplying the hours worked by the hourly rate and adding the cost of a flat Internet fee, which is defined as a constant in the OnlineWorker class.

## Exercise 2 – Deprecated

Add some obsolete (deprecated) methods to the child classes and use the appropriate @Deprecated annotation. From an external class, invoke the deprecated methods and suppress the related warnings using the corresponding annotation.

#ITA.S1.07