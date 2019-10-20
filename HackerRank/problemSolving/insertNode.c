// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

SinglyLinkedListNode* insertNodeAtPosition(SinglyLinkedListNode* head, int data, int position) {
    int i=0;
    SinglyLinkedListNode* node=(SinglyLinkedListNode*)(malloc(sizeof(SinglyLinkedListNode)));
    SinglyLinkedListNode* temp=head,*prev;
    node->data=data;
    if(position==0)
    {
        node->next=head;
        head=temp;
        return head;
    }
    while(temp!=NULL)
    {
        if(i==position)
        {
            node->next=temp;
            prev->next=node;
        }
        prev=temp;
        temp=temp->next;
        i++;
    }
    return head;



}
