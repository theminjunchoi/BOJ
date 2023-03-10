// Created on iPhone.

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    int[]A = new int[n];    
    int[]ans = new int[n]; 
    String[] str = bf.readLine().split(" ");
    for (int i = 0; i < n; i++) {
        A[i] = Integer.parseInt(str[i]);
    }
    Stack<Integer> myStack = new Stack<>();
    myStack.push(0); 
    for (int i = 1; i < n; i++) {
        while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {  
            ans[myStack.pop()] = A[i];  
        }
        myStack.push(i); 
    }
    while (!myStack.empty()) {
        ans[myStack.pop()] = -1;
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int i = 0; i < n; i++) {
        bw.write(ans[i] + " ");
    }
    bw.write("\n");
    bw.flush();
  }
}
