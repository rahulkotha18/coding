// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem

DoublyLinkedListNode* sortedInsert(DoublyLinkedListNode* head, int data) {
    DoublyLinkedListNode* node=(DoublyLinkedListNode*)(malloc(sizeof(DoublyLinkedListNode)));
    node->data=data;
    node->prev=NULL;
    node->next=NULL;
    DoublyLinkedListNode* temp=head,*prev;
    while(temp!=NULL && temp->data<=data)
    {
        prev=temp;
        temp=temp->next;
    }
    if(temp==head)
    {
        node->next=head;
        head->prev=node;
        head=node;

    }
    else if(temp==NULL)
    {
        prev->next=node;
        node->prev=prev;
    }
    else{
        node->next=temp;
        node->prev=temp->prev;
        temp->prev->next=node;
        temp->prev=node;


    }
    return head;

}

