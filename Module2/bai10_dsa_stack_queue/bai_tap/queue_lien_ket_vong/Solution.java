package C1020G1.dsa_stack_queue.bai_tap.queue_lien_ket_vong;

public class Solution {
    public void enQueue(Queue q, int value){
        Node temp = new Node();
        temp.data = value;
        if(q.front == null){
            q.front = temp;
        }else{
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }
    public  void deQueue(Queue q){
        if(q.front == null){
            return;
        }
        int value;
        if(q.front == q.rear){
            q.front = null;
            q.rear = null;
            return;
        }else{
            Node  temp = q .front;
            value = temp .data;
            q .front = q .front .link;
            q .rear .link= q .front;
        }
    }
    public void displayQueue(Queue q){
        Node  temp = q.front;
        System.out.printf(" Elements in Circular Queue are: ");
        while (temp .link != q .front)
        {
            System.out.printf("%d ", temp .data);
            temp = temp .link;
        }
        System.out.printf("%d", temp .data);
    }
}
