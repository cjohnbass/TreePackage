/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreePackage;

/**
 *
 * @author Christopher Bass
 */
import java.util.Iterator;

public interface TreeIteratorInterface<T> {

    public Iterator<T> getPreorderIterator();

    public Iterator<T> getPostorderIterator();

    public Iterator<T> getInorderIterator();

    public Iterator<T> getLevelOrderIterator();

}
