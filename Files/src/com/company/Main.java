package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        File file = new File("d:\\test\\java2.txt");
//
//        if(file.exists()){
//            System.out.println(file.getName());
//            System.out.println(file.length());
//            System.out.println(file.getPath());
//            System.out.println(file.getParent());
//        }else{
//            file.createNewFile();
//        }


//        File dir = new File("d:\\");
//
//        File[] files = dir.listFiles();
//
//        for (File s : files) {
//            if(s.isDirectory()){
//                System.out.println("folder : " + s.getName());
//            }else{
//                System.out.println("file : "+s.getName());
//            }
//        }

//        String folderName = "d:\\test\\1\\2\\3";
//
//        String fileName = "hello.txt";
//
//        File dir = new File(folderName);
//
//        File file = new File(folderName + "\\" + fileName);
//
//        if(!dir.exists()){
//            dir.mkdirs();
//        }else{
//            if(!file.exists()){
//                file.createNewFile();
//            }
//        }


//        File hello = new File("d:\\test\\ahmed.txt");
//
//        if(hello.exists()){
//            System.out.println(hello.getName());
//            System.out.println(hello.getAbsolutePath());
//            System.out.println(hello.getPath());
//            System.out.println(hello.getParent());
//            System.out.println(hello.isFile());
//            System.out.println(hello.isDirectory());
//            System.out.println(hello.length());

//            hello.renameTo(new File("d:\\test\\ahmed.txt"));

//            System.out.println(hello.isHidden());


//        }else{
////            hello.mkdirs();
//            hello.createNewFile();
//        }


//        for (int i = 1; i <= 3; i++) {
//            File d = new File("d:\\test\\" + i);
//
//            d.mkdirs();
//        }

//        File[] folders = d.listFiles();
//
//        if(!d.exists()){
//            d.mkdirs();
//        }

//        for (File s:folders) {
//
//            if(s.isDirectory())
//                System.out.println("Folder : " + s.getName());
//            else
//                System.out.println("File : " + s.getName());
//
//        }


//        File dir = new File("d:\\test\\test2\\");
//
//        if(!dir.exists()){
//            dir.mkdirs();
//        }
//
//        File file = new File(
//                dir.getAbsolutePath()
//                        + "\\hello.txt");
//
//        if(!file.exists()){
//            file.createNewFile();
//        }
//
//        FileOutputStream fo = new FileOutputStream(file
//                , true);
//        PrintWriter pw = new PrintWriter(fo);
//
//        pw.println("hello ahmed3");
//
//
//        pw.close();
//        fo.close();


        //        System.out.println(hello.exists());
//        System.out.println(hello.getName());
//        System.out.println(hello.getPath());
//        System.out.println(hello.getAbsolutePath());
//        System.out.println(hello.getParent());

//        File folders = new File("D:\\test\\1\\2\\3\\");
//
//        File hello = new File(folders.getPath()+"\\hello.txt");
//
//
//        if(!folders.exists()){
//            folders.mkdirs();
//        }
//
//
//        if(!hello.exists()){
//            hello.createNewFile();
//        }else{
//            System.out.println("file name : " + hello.getName());
//        }


//        File d = new File("d:\\");

//        File[] files = d.listFiles();
//
//        for (File f : files) {
//           if(f.isFile()){
//               System.out.println("file : " + f.getName());
//           }
//
//           if(f.isDirectory()){
//               System.out.println("folder : " + f.getName());
//           }
//        }


        File folder = new File("d:\\test\\test2");

        if(!folder.exists()){
            folder.mkdirs();
        }

        File file = new File(folder.getPath() + "\\hello2.txt");

        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fo = new FileOutputStream(file, true);
        PrintWriter pw = new PrintWriter(fo);


        pw.println("hello from java");
        pw.println("hello from java2");

        pw.close();
        fo.close();


    }
}
