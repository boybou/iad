package week6;

// Klasse voor een knoop voor een binaire boom
public class BKnoop<E> {
  private BKnoop<E> parent, leftChild, rightChild;
  private E userObject;
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  
  // Constructors
  public BKnoop() {
    this( null );
  }

  public void printPreOrder(BKnoop bKnoop){

    System.out.print(bKnoop);
    if(bKnoop.leftChild != null){
      printPreOrder(bKnoop.leftChild);
    }
    if(bKnoop.rightChild!= null){
      printPreOrder(bKnoop.rightChild);
    }


  }

  public int aantalKnopen(){
    int aantalKnopen = 0;
    if(leftChild != null){
      aantalKnopen += leftChild.aantalKnopen();
    }
    if(rightChild != null){
      aantalKnopen += rightChild.aantalKnopen();
    }
    aantalKnopen++;
    return aantalKnopen;
  }

  public int aantalBladeren(){
    int aantalBladeren = 0;
    if(leftChild != null){
      aantalBladeren += leftChild.aantalBladeren();
    }
    if(rightChild != null){
      aantalBladeren += rightChild.aantalBladeren();
    }
    if(rightChild == null && leftChild == null){
      aantalBladeren += 1;
    }
    return aantalBladeren;
  }

  public int diepte(){
    int diepteLeftChild = 0;
    int diepteRightChild = 0;
    if(rightChild != null){
      diepteRightChild++;
      diepteRightChild += rightChild.diepte();
    }
    if(leftChild != null){
      diepteLeftChild++;
      diepteLeftChild += leftChild.diepte();
    }
    if(diepteLeftChild >= diepteRightChild){
      return diepteLeftChild;
    }
    else if(diepteRightChild>= diepteLeftChild){
      return diepteRightChild;
    }
    return 0;
  }

  public int hoogte(){
    return diepte()+1;
  }

  public void printPostOrder(BKnoop bKnoop){
    if(bKnoop.leftChild != null){
      printPostOrder(bKnoop.leftChild);
    }
    if(bKnoop.rightChild != null){
      printPostOrder(bKnoop.rightChild);
    }
    System.out.print(bKnoop);
  }

  public void printInOrder(BKnoop bKnoop){
    if(bKnoop.leftChild != null){
      printInOrder(bKnoop.leftChild);
    }
    System.out.print(bKnoop);
    if(bKnoop.rightChild != null){
      printInOrder(bKnoop.rightChild);
    }
  }

  public BKnoop( E userObject ) {
    parent = null;
    leftChild = null;
    rightChild = null;
    this.userObject = userObject;
  }

  // Methoden
  public void add( BKnoop<E> newChild ) {
    if( leftChild == null ) 
      insert( newChild, LEFT );
    else
      if( rightChild == null )
        insert( newChild, RIGHT );
      else
        throw new IllegalArgumentException( 
                         "Meer dan 2 kinderen" );
  }

  public E get() {
    return userObject;
  }

  public BKnoop<E> getLeftChild() {
    return leftChild;
  }

  public BKnoop<E> getRightChild() {
    return rightChild;
  }

  public BKnoop<E> getParent() {
    return parent;
  }

  public void insert( BKnoop<E> newChild, int childIndex ) {
    if( isAncestor( newChild ) )
      throw new IllegalArgumentException( 
                "Nieuw kind is voorouder" );
    if( childIndex != LEFT && 
        childIndex != RIGHT )
      throw new IllegalArgumentException(
                "Index moet 0 of 1 zijn" );

     if( newChild != null ) {
      BKnoop<E> oldParent = newChild.getParent();
      if( oldParent != null )
        oldParent.remove( newChild );
    }

    newChild.parent = this;
    if( childIndex == LEFT )
      leftChild = newChild;
    else
      rightChild = newChild;
  }
  
  public boolean isChild( BKnoop<E> aNode ) {
    return aNode == null? 
           false :
           aNode.getParent() == this;
  }

  public boolean isAncestor( BKnoop<E> aNode ) {
    BKnoop<E> ancestor = this;
    while( ancestor != null && ancestor != aNode )
      ancestor = ancestor.getParent();
    return ancestor != null;
  }

  public void remove( BKnoop<E> aChild ) {
    if( aChild == null )
      throw new IllegalArgumentException(
                "Argument is null" );

    if( !isChild( aChild ) )
      throw new IllegalArgumentException(
                "Argument is geen kind" );

    if( aChild == leftChild ) {
      leftChild.parent = null;
      leftChild = null;
    }
    else {
      rightChild.parent = null;
      rightChild = null;
    }
  }

  public String toString() {
    return userObject.toString();
  }
}
