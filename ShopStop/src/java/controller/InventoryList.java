///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import bean.InvModel;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.HashMap;
//import org.quickconnectfamily.json.JSONException;
//import org.quickconnectfamily.json.JSONInputStream;
//import org.quickconnectfamily.json.JSONOutputStream;
//import org.quickconnectfamily.json.JSONUtilities;
//
///**
// *
// * @author benjaminlangston
// */
//public class InventoryList {
//    
//    /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//  /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // Nice Way - Write Object Out To File
//
//        System.out.println("This creates an object string:");
//        
//        
//      
//        InvModel current = new InvModel();
//        
//        
//       
//        int iId = current.getInvId();
//        int cId = current.getCategoryId();
//        String iName = current.getItemName();
//        String iDesc = current.getItemDesc();
//        String iPrice = current.getItemPrice();
//        String iStock = current.getItemStock();
//        
////        current = bean.InvModel();
//        
////        current = InvModel();
//
//        try {
//            String jsonString = JSONUtilities.stringify(current);
//            System.out.println(jsonString);
//        } catch (JSONException e) {
//            System.out.println("Error Creating File");
//        }
//
//        System.out.println("\nThis Writes the object string out to a file:");
//        InvModel jim = new InvModel(2, 2, "Jim", "Langston", "5423", "64");
//
//        File employeeFile = new File("employeeFile.json");
//
//        System.out.println(jim + " has been written to a file.");
//
////        try {
////            FileOutputStream fileStream = new FileOutputStream(employeeFile);
////            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
////            jsonOut.writeObject(jim);
////            jsonOut.close();
////        } catch (Exception e) {
////            System.out.println("Error Writing File Out");
////        }
////
////        // Read Object from file
////        System.out.println("\nThis reads the object string in from a file:");
////
////        try {
////            FileInputStream employeeIn = new FileInputStream(employeeFile);
////            JSONInputStream jsonIn = new JSONInputStream(employeeIn);
////            HashMap jsonMap = (HashMap) jsonIn.readObject();
////            jsonIn.close();
////
////            InvModel getInfo = new InvModel();
////            long id = (long) jsonMap.get("invId");
////            long catId = (long) jsonMap.get("categoryId");
////            getInfo.setAge((int) age);
////            getInfo.setEmpId((int) empId);
////            getInfo.setFirstName((String) jsonMap.get("firstName"));
////            getInfo.setLastName((String) jsonMap.get("lastName"));
////
////            String outputString = JSONUtilities.stringify(getInfo);
////            System.out.println(outputString);
////        } catch (Exception e) {
////            System.out.println("Error Reading File Input");
////
////        }
////
////        // Error formats - image files -- AKA The nasty path
////        try {
////            FileInputStream fileOut = new FileInputStream("img.jpg");
////            JSONInputStream jsonIn = new JSONInputStream(fileOut);
////            jsonIn.close();
////
////        } catch (Exception e) {
////            System.out.println("\nCannot Read File: IMG");
////
////        }
////        // Null Obects
////        try {
////            FileInputStream fileInput = new FileInputStream("test1.txt");
////            JSONInputStream jsonIn = new JSONInputStream(fileInput);
////
////            HashMap jsonMap = (HashMap) jsonIn.readObject();
////            jsonIn.close();
////        } catch (Exception e) {
////            System.out.println("\nCannot Read an Empty File");
////
////        }
////    }
//
//}
//
//    
//}
//
