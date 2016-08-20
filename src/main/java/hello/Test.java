package main.java.hello;


import org.joda.time.LocalTime;

public class Test {
  public static void main(String[] args) {

    System.out.println("greeter.sayHello()");
    
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
  }
}

//make jar of your project
/*jar {
    baseName = 'gs-gradle'
    version =  '0.1.0'
}*/