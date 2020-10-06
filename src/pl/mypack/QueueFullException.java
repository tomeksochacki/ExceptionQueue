package pl.mypack;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nQueue is full. Max size: " + size;
    }
}


