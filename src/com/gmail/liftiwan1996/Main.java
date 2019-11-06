package com.gmail.liftiwan1996;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Zyfral zyfral = new Zyfral();
    zyfral.addSymvols();
    zyfral.inputText();
    ArrayList<String> list3 = new ArrayList<>();
    list3 = zyfral.getList(zyfral.getList1());
    for (String text : zyfral.getList(zyfral.getList1())) {
      System.out.print(text);
    }
    System.out.println();
    for (String text : zyfral.getList(list3)) {
      System.out.print(text);
    }
  }
}
