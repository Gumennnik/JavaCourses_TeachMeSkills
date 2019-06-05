package Classwork10;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

//        File file = new File("REEADME.md");
//        System.out.println("File exists : " + file.exists());


//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return;
//        }

//        try (PrintWriter printWriter = new PrintWriter("fromPrintWriter.txt") ;
//             FileReader fileReader = new FileReader("fromPrintWriter.txt")){
//
//            printWriter.println("test");
//            printWriter.println("test2");
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        try (FileWriter fileWriter = new FileWriter("fromPrintWriter.txt", true)) {
//            fileWriter.write("\ncheck");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        String defaultString = "default";
//        char[] mass = defaultString.toCharArray();
//        System.out.println(mass);
//
//        String string = "bla-bla-bla";
//
//        StringBuffer stringBuffer = new StringBuffer(string);
//        stringBuffer.deleteCharAt();
//
//        return;


        List<String> namesList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
            String singleName;
            while ((singleName = bufferedReader.readLine()) != null) {
                String[] namesStrings = singleName.split(" ");
                namesList.addAll(Arrays.asList(namesStrings));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(namesList);
        Collections.sort(namesList);
        System.out.println(namesList);

        try (PrintWriter printWriter = new PrintWriter("input2.txt")) {

            namesList.forEach(singleName -> {
                printWriter.println(singleName);
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
