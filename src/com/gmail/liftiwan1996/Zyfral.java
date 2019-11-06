package com.gmail.liftiwan1996;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Zyfral {

  private String inputTxt = " ";
  private List<String> list1 = new ArrayList<>();
  private HashMap<String, String> map = new HashMap<>();
  private String a = "a";
  private String b = "b";
  private String c = "c";
  private String d = "d";
  private String e = "e";
  private String f = "f";
  private String g = "g";
  private String h = "h";
  private String i = "i";
  private String j = "j";
  private String k = "k";
  private String l = "l";
  private String m = "m";
  private String n = "n";
  private String p = "p";
  private String q = "q";
  private String r = "r";
  private String s = "s";
  private String t = "t";
  private String u = "u";
  private String v = "v";
  private String w = "w";
  private String x = "x";
  private String y = "y";
  private String z = "z";
  private String probel = " ";

  public void addSymvols() {
    map.put(a, z);
    map.put(b, y);
    map.put(c, x);
    map.put(d, w);
    map.put(e, v);
    map.put(f, u);
    map.put(g, t);
    map.put(h, s);
    map.put(i, r);
    map.put(j, q);
    map.put(k, p);
    map.put(l, n);
    map.put(n, l);
    map.put(p, k);
    map.put(q, j);
    map.put(r, i);
    map.put(s, h);
    map.put(t, g);
    map.put(u, f);
    map.put(v, e);
    map.put(w, d);
    map.put(x, c);
    map.put(y, b);
    map.put(z, a);
    map.put(probel, probel);
  }

  public void inputText() {
    Scanner sc = new Scanner(System.in);
    inputTxt = sc.nextLine();
    char[] charToArray = inputTxt.toCharArray();
    for (char ch : charToArray) {
      String symvol = Character.toString(ch);
      list1.add(symvol);
    }
  }

  public ArrayList<String> getList(List<String> list) {
    ArrayList<String> list3 = new ArrayList<>();
    for (String text : list) {
      list3.add(map.get(text));
    }
    return list3;
  }

  public List<String> getList1() {
    return list1;
  }
}


