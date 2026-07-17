/**
 * @author: Sagar Kirtakar
 * @date: 2026-07-17
 */

public abstract class Vehicle {

    int no_of_tyers;

   abstract void start(); // abstract method

   void displayOfTyers() {
    System.out.println("Vehicle has "+no_of_tyers+ " tyers");
   }

   void honk() {
    System.out.println("Beep Beep..."); // concrete methods
   }

   static void m1() {
        System.out.println("static vehicle m1");
   }

   public static void main(String[] args) {
    Vehicle.m1();
   }



}