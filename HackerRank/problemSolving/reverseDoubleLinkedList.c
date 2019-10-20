/*
 * For  reference:
 *
 * DoublyLinkedListNode {
 *     int data;
 *     DoublyLinkedListNode* next;
 *     DoublyLinkedListNode* prev;
 * };
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
 */
DoublyLinkedListNode* reverse(DoublyLinkedListNode* head) {
    DoublyLinkedListNode* temp1=head,*end=head;
    while(end->next!=NULL)
    {
        end=end->next;
    }
     while( temp1!=end)
    {
        int d=temp1->data;
        temp1->data=end->data;
        end->data=d;
        end=end->prev;
        temp1=temp1->next;
        if(temp1->prev==end)
            break;
    }
    
    return head;


}

