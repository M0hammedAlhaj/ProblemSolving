package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}