package main.java.hello;


import org.joda.time.LocalTime;

public class Test {
  public static void main(String[] args) {

    System.out.println("==============================Result of test program");
    
    LocalTime currentTime = new LocalTime();
    System.out.println("==========================================Current local time is: " + currentTime);
  }
}

//make jar of your project
/*jar {
    baseName = 'gs-gradle'
    version =  '0.1.0'
}

gradle tasks
gradle build
gradle run
gradle cleano run a specific task
gradle taskname - t
apply plugin: 'eclipse' -->To create the Eclipse-specific descriptor files, like .projects
gradle init --type=java-library --> to setup gradle java project
*/