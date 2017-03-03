package com.barrenland;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {
  public List<Rectangle> parse(String input){
    return Arrays.stream(input.substring(1, input.length() - 1).split(", ")) //drop the braces and split
      .map(r -> r.substring(1, r.length() - 1).split(" ")) //drop the quotes and split
      .map(r2 -> new Rectangle(Integer.parseInt(r2[0]), Integer.parseInt(r2[1]),Integer.parseInt(r2[2]), Integer.parseInt(r2[3])))
      .collect(Collectors.toList());
  }
}
