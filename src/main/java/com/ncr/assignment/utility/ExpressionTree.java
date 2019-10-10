package com.ncr.assignment.utility;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 * Expression Tree class to build and traverse tree
 */
public class ExpressionTree {

    /**
     * class TreeNode
     **/
    class TreeNode {
        String data;
        TreeNode left, right;


        /**
         * constructor
         * @param data
         */
        public TreeNode(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * class StackNode
     **/
    class StackNode {
        TreeNode treeNode;
        StackNode next;


        /**
         * constructor
         * @param treeNode
         */
        public StackNode(TreeNode treeNode) {
            this.treeNode = treeNode;
            next = null;
        }
    }

    private static StackNode top;


    /**
     * constructor
     */
    public ExpressionTree() {
        top = null;
    }

    /**
     * function to clear tree
     **/
    public void clear() {
        top = null;
    }

    /**
     * function to push a node
     **/
    private void push(TreeNode ptr) {
        if (top == null)
            top = new StackNode(ptr);
        else {
            StackNode nptr = new StackNode(ptr);
            nptr.next = top;
            top = nptr;
        }
    }

    /**
     * function to pop a node
     **/
    private TreeNode pop() {
        if (top == null)
            throw new RuntimeException("Underflow");
        else {
            TreeNode ptr = top.treeNode;
            top = top.next;
            return ptr;
        }
    }

    /**
     * function to get top node
     **/
    private TreeNode peek() {
        return top.treeNode;
    }

    /**
     * function to insert character
     **/
    private void insert(String val) {
        try {
            if (isDigit(val)) {
                TreeNode nptr = new TreeNode(val);
                push(nptr);
            } else if (isOperator(val)) {
                TreeNode nptr = new TreeNode(val);
                nptr.left = pop();
                nptr.right = pop();
                push(nptr);
            }
        } catch (Exception e) {
            System.out.println("Invalid Expression");
        }
    }

    /**
     * function to check if digit
     * @param String
     **/
    private boolean isDigit(String str) {
        try {
            int i = Integer.parseInt(str);
            return i >= 0 && i <= 10;
        } catch (Exception e) {
            //do nothing
        }
        return false;
    }

    /**
     * function to check if operator
     * @param String
     **/
    private boolean isOperator(String str) {
        return str.equalsIgnoreCase("+") || str.equalsIgnoreCase("-") || str.equalsIgnoreCase("*") || str.equalsIgnoreCase("/");
    }

    /**
     * function to convert character to digit
     * @param String
     **/
    private int toDigit(String str) {
        return Integer.parseInt(str);
    }

    /**
     * function to build tree from input
     * @param eqnList
     */
    public void buildTree(ArrayList<String> eqnList) {
        for (int i = eqnList.size() - 1; i >= 0; i--)
            insert(eqnList.get(i));
    }

    /**
     * function to evaluate tree
     */
    public double evaluate() {
        return evaluate(peek());
    }

    /**
     * function to evaluate tree
     * @param ptr
     */
    public double evaluate(TreeNode ptr) {
        if (ptr.left == null && ptr.right == null)
            return toDigit(ptr.data);
        else {
            double result = 0.0;
            double left = evaluate(ptr.left);
            double right = evaluate(ptr.right);
            String operator = ptr.data;

            switch (operator) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                case "*":
                    result = left * right;
                    break;
                case "/":
                    result = left / right;
                    break;
                default:
                    result = left + right;
                    break;
            }
            return customRound(result, 2);
        }
    }

    /**
     * @param doubleNum
     * @param numOfDigits
     * @return doubleNum
     */
    public double customRound(double doubleNum, int numOfDigits) {
        if (doubleNum != Infinity) {
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(numOfDigits);
            doubleNum = Double.parseDouble(df.format(doubleNum));
            return doubleNum;
        } else {
            return doubleNum;
        }
    }


    /**
     * function to get infix expression
     */
    public void infix() {
        inOrder(peek());
    }

    /**
     * in order traversal
     */
    private void inOrder(TreeNode ptr) {
        if (ptr != null) {
            inOrder(ptr.left);
            System.out.print(ptr.data);
            inOrder(ptr.right);
        }
    }




}
