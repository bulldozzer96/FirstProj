package com.ua.RD.lesson27;

import java.io.*;
import java.util.List;



public class Main {

    public static final String OBJECT_FILE_NAME = "test.txt";

    public static void main(String[] args) {

//OutputStream os = null;
//        OutputStreamWriter osw = null;
//      --  try(OutputStream os = new FileOutputStream("test.txt");
//       --     OutputStreamWriter osw = new OutputStreamWriter(os)){
//       --     String data = "Hello World!";
//       --     osw.write(data);
//      --  } catch (IOException e) {
//        --    throw new RuntimeException(e);
//
//     --   }
//        try {
//            String data = "Hello World!";
//            os = new FileOutputStream("test.txt");
//            osw = new OutputStreamWriter(os);
//            os.write(data.getBytes());
//            //osw.write(data,4,data.length()-4);
//            osw.append(data);
//            osw.append(data);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }finally {
//            try {
//                osw.close();
//                os.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }


//        try (InputStream is = new FileInputStream("test.txt")){
//            byte[]data = is.readAllBytes();
//            String dataString = new String(data);
//            System.out.println(dataString);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//
//        }

        Student student1 = new Student("John", 25, "A");
        Student student2 = new Student("John", 25, "A");
        Student student3 = new Student("John", 25, "A");
        Student student4 = new Student("John", 25, "A");


        List<Student> l1 = List.of(student1, student2, student3, student4);


        try(OutputStream os = new FileOutputStream(OBJECT_FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(os)){
            oos.writeObject(l1);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        try(InputStream is = new FileInputStream(OBJECT_FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(is)){
            List<Student> s = (List<Student>) ois.readObject();
            s.forEach(System.out::println);
        }catch (IOException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
