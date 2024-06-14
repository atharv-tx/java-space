public class MergingorNotOptimized {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode tempa = headA;
        ListNode tempb = headB;

        while(tempa != tempb){
            tempa = tempa.next;
            tempb = tempb.next;

            if(tempa == null && tempb== null)
            {
                return null;

            }
            if(tempa==null){
                tempa = headB;
            }
            if(tempb == null)
            {
                tempb=headA;
            }
            return tempa;
        }
    }
    
}
