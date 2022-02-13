package graph;

import java.util.HashSet;
import java.util.Set;

public class DirectedGraph<T>{
    private Set<Node<T>> incommingNode;
    private Set<Node<T>> outgoingNode;
    
    public DirectedGraph(){
        incommingNode = new HashSet<Node<T>>();
        outgoingNode = new HashSet<Node<T>>();
    }
    
    class Node<T>{
        Node nextNode;
        T data;
        
        Node(){
             nextNode = null;
             data = null;
        }
    }
    
    public void addIncommingNode(Node<T> node){
        
    }
        
}