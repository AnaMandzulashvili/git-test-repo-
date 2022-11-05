package org;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class other {


        public static void main(String[] args){
            int number = 3;
            Integer number3 = 3;
            char symbol = 'ქ';
            int number2;

            double db = 2.1;
            Double db2 = 2.0;
            String doubleString = "9.9";
            int someInt = 10;
            long someLong = (long) someInt;
            int numberOfStudents = 2;
            int number_of_students = 2;

            boolean value = true;
            boolean value2 = false;
            //

            String str = "something";

            for (int i = 0; i < str.length(); i++){
                Character symbol2 = str.toCharArray()[i];
                System.out.println(symbol2.getClass());
            }
            number2 = 2;

            String[] array = {"name", "surname", "address"};
            Integer[] arrayInt = {1, 3, 4, 4};
            List<Object> listOfObjects = new ArrayList<>(){
                {
                    add(2); // Integer
                    add("something");
                    add(true); // Boolean
                }
            };

            int x = 11;
            while (x < 10){
                System.out.println(x);
                x = x + 100;
            }

//        int k = 11;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k < 10);


            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }

            for (String element :
                    array) {
                System.out.println(element + "!");
            }

            String name = "misha";
            int b = 5;
            if (name.length() < 5){
                System.out.println(b); // არაა წვდომადი
                System.out.println(name + " length is less than 5");
                if (true){

                    if (false){
                        System.out.println(b); // წვდომადია
                    }
                }
            }
            else if (name.length() == 5){
                System.out.println(name + " length equals 5");
            }
            else {
                System.out.println(name + " length is not less than 5");
            }


            var someVariable2 = 2.0;
            String someVariable = someFunction(12);
        }

        public static String someFunction(int y){
            return String.valueOf(y);
        }
    }

