// ให้นิสิตเขียนคลาสชื่อ AddRandom ซึ่งสุ่มค่าทศนิยมมา 2 จํานวนในช่วง 0.0-50.0
// และแสดงค่าท้ังสองพร้อมผลบวก และให้แสดงผลถ้าจำนวนที่บวกกันมีค่ามากกว่า 50 ให้แสดงข้อความ PASS
// ถ้าน้อยกว่า 50 ให้แสดง Not PASS

//========================================================
//        Phattaraphon Chomchaiyaphum
//        Study ID : 5930300585
//        Sec : 832
//        HW01_5930300585
//========================================================

import java.util.* ;
import java.util.Random ;

public class AddRandomClass
{
  public static void main(String[] args)
  {
    Random random = new Random();

    //50 is the maximum and the 1 is our minimum
    double a = -1.0 + random.nextDouble() * 50.0;
    double b = -1.0 + random.nextDouble() * 50.0;
    double c = a + b ;

    System.out.println("\nSum of " + a + " + " + b + " = " + c );

    //============= Output =============
    /*
    Khawoat6:HW01_5930300585 Apple$ javac *.java
    Khawoat6:HW01_5930300585 Apple$ java AddRandomClass
    Sum of 4.853786028274538 + 1.2531924321316343 = 6.106978460406172
    Khawoat6:HW01_5930300585 Apple$ javac *.java
    Khawoat6:HW01_5930300585 Apple$ java AddRandomClass
    Sum of 18.480984494402055 + 20.346521573754256 = 38.82750606815631
    Khawoat6:HW01_5930300585 Apple$ javac *.java
    Khawoat6:HW01_5930300585 Apple$ java AddRandomClass
    Sum of 13.262016630296243 + -0.8024108109511809 = 12.459605819345061
    */

    if ( c >= 50.0 )
    {
      System.out.println("Value = PASS\n");
    }
    else
    {
      System.out.println("Value = Not PASS\n");
    }

    //============= Output =============
    /*
    Khawoat6:HW01_5930300585 Apple$ javac *.java
    Khawoat6:HW01_5930300585 Apple$ java AddRandomClass
    Sum of 9.787938694515786 + 25.197090397779554 = 34.98502909229534
    Value = Not PASS
    Khawoat6:HW01_5930300585 Apple$ javac *.java
    Khawoat6:HW01_5930300585 Apple$ java AddRandomClass
    Sum of 32.17512151445835 + 47.9167086065967 = 80.09183012105504
    Value = PASS
    */

  }
}

// Souce : https://stackoverflow.com/questions/2230814/getting-a-random-number-between-0-and-0-06-in-java
// Souce : https://www.javatpoint.com/java-if-else
