// 2.1 - Remove Dups: Write code to remove duplicates from an unsorted linked list

// FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?

//Inputs: "1>2>3>3>2>4>5", "1>1>1>1", "1>2>3"
//Outputs: "1>2>3>4>5", "1", "1>2>3"

#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

struct Node *head = NULL;
struct Node *current = NULL;

void insertElementAtStart(int x){
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node));
    temp->data = x;
    if(head == NULL){
        head = temp;
        temp->next = NULL;
    }else{
        temp->next = head;
        head = temp;
    }
}

void deleteElementAtStart(){
    if(head == NULL){
        printf("List already empty");
    }else{
        struct Node *temp = head;
        head = head->next;
        free(temp);
    }
}

void printList(){
    if(head == NULL){
        printf("List is empty");
    }else{
        struct Node *temp = head;
        printf("Printing list: \n");
        while(temp){
            printf("%d \n", temp->data);
            temp = temp->next;
        }
    }
}

void main(){
    insertElementAtStart(5);
    insertElementAtStart(4);
    insertElementAtStart(3);
    insertElementAtStart(2);
    printList();
    deleteElementAtStart();
    printList();
}