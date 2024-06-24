

public class Main {
  public static void main(String[] args) {

    BinarySearchTree binarySearchTree = new BinarySearchTree(3);
    binarySearchTree.insert(4);
    binarySearchTree.insert(5);
    binarySearchTree.insert(2);
    binarySearchTree.printTree();

    boolean control = binarySearchTree.contains(5);

    System.out.print(control);
    
  }


}