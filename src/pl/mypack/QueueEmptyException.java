package pl.mypack;

class QueueEmptyException extends Exception {
    public String toString(){
        return "Queue is empty.";
    }
}
