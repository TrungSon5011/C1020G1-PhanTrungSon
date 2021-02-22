package C1020G1.dsa_stack_queue.bai_tap.queue_lien_ket_vong;

public class Test {
    public static void main(String[] args) {
        Queue  q = new Queue();
        q .front = q .rear =  null;
        Solution solution = new Solution();

        // Inserting elements in Circular Queue
        solution.enQueue(q, 14);
        solution.enQueue(q, 22);
        solution.enQueue(q, 6);

        // Display elements present in Circular Queue
        solution.displayQueue(q);
        solution.deQueue(q);

        // Deleting elements from Circular Queue
//        System.out.println(" Deleted value: "+ solution.deQueue(q));
//        System.out.printf(" Deleted value = %d", deQueue(q));

        // Remaining elements in Circular Queue
        solution.displayQueue(q);

        solution.enQueue(q, 9);
        solution.enQueue(q, 20);
        solution.displayQueue(q);

    }

}
