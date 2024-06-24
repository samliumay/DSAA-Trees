
public class BinarySearchTree {

  private Node root;

  public BinarySearchTree(int value) {
    Node newNode = new Node(value);
    this.root = newNode;
  }

  public BinarySearchTree() {
    this.root = null;
  }

  public boolean insert(int value){
    Node newNode = new Node(value);
    Node temp = root;
    
    if(root == null){
      root = newNode;
      return true;
    }

    while(true){
      if(temp.getValue() > value){
        if(temp.getLeft() == null){
          temp.setLeft(newNode);
          return true;
        }else{
          temp = temp.getLeft();
        }
      }else if(temp.getValue() < value){
        if(temp.getRight() == null){
          temp.setRight(newNode);
          return true;
        }else{
          temp = temp.getRight();
        }
      }else{
        return false;
      }
    }

    
  }

  public boolean contains(int value){
    Node temp = root;
    
    while(temp != null){
      
     if(temp.getValue() > value)
     {
        temp = temp.getLeft();
      }
     else if(temp.getValue() < value)
     {
        temp = temp.getRight();
     }else
     {
        return true;  
     }
    }
    return false;
    
  }
  
  public boolean printTree(){
    return printTree(root);      
  }

  private boolean printTree(Node temp){

    
    while(true){
      if(temp == null){
        return true;
      }else{
      System.out.println(temp.getValue());
      printTree(temp.getLeft());
      printTree(temp.getRight());
      return true;
      }
    }
}
}