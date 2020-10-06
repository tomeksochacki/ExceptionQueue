package pl.mypack;

class QExcDemo {
    public static void main(String arg[]){
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            for (i = 0; i<11; i++){
                System.out.println("Try to insert into queue: " + (char)('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" -- OK");
            }
            System.out.println();
        } catch (QueueFullException ex){
            System.out.println(ex);
        }
        System.out.println();

        try {
            for (i = 0; i<11; i++){
                System.out.println("Gets the next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException ex){
            System.out.println(ex);
        }
    }
}
