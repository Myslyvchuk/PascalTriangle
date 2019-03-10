package com.myslyv4uk.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascaleTriangle {

  public int[][] pascalTriangle(int numberOfRows) {
    int arrayOfValues[][] = new int[numberOfRows + 1][numberOfRows + 1];
    for (int i = 0; i <= numberOfRows; i++) {
      arrayOfValues[i][0] = arrayOfValues[i][i] = 1;
      for (int k = 1; k < i; k++) {
        arrayOfValues[i][k] = arrayOfValues[i - 1][k - 1] + arrayOfValues[i - 1][k];

      }
    }
    return arrayOfValues;
  }

  public void printTriangle(int[][] triangle, int numberOfRows) throws IllegalArgumentException {
    for (int n = 0; n <= numberOfRows; n++) {
      for (int j = n; j < numberOfRows; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= n; k++) {
        System.out.format("%3d", triangle[n][k]);
        System.out.print("  ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number of rows");
    int numberOfRows = Integer.parseInt(reader.readLine());
    PascaleTriangle newObj = new PascaleTriangle();
    newObj.printTriangle(newObj.pascalTriangle(numberOfRows), numberOfRows);
  }
}
