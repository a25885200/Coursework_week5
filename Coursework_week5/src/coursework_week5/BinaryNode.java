/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week5;

/**
 *
 * @author leung
 */
public class BinaryNode {

    int data;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int d) {
        data = d;
        left = right = null;
    }

    public int getData() {
        return data;
    }
}
