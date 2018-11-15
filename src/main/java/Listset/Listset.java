package Listset;

import sun.net.www.content.text.Generic;

import javax.swing.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Listset {public static void main(String[] args) {
    Set<String> names = new HashSet<>();
          names.add  ("Taras");
          names.add("Oleg");
          names.add("Oksana");
          names.add("Bogdan");
          names.add("Anna");
          names.add("Cemen");
          names.add("Olena");
          names.add("Vova");
          names.add("Pavlo");
          names.add("Taras");
          names.add("Olena");
          names.add("Vova");
          names.add("Oksana");
          names.add("Cemen");
          names.add("Mariya");
    System.out.println(names);
    System.out.println(names.size());
    Set<String> names1 = new HashSet<>();

    for (String i : names){if (((i.startsWith("A"))==false)&&((i.startsWith("B"))==false)&&
            ((i.startsWith("C"))==false)&&((i.startsWith("V"))==false)&&((i.startsWith("P"))==false)){names1.add(i);} }
    System.out.println(names1);
}}
