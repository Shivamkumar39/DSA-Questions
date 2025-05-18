// You are using GCC
#include<bits/stdc++.h>
using namespace std;


class node{
    public:    
        int data;
        node* left;
        node* right;
    node(int d){
        this->data =d;
        this->left =NULL;
        this->right =NULL;
    }
};

node* createBinaray(node* root){


    int data;
    cin>>data;
    cout<<"inderting data "<<data<<endl;
   //base case
    root = new node(data);
    
    if(data == -1){
        return NULL;
    }
    //insertinf left
    root->left = createBinaray(root->left);
    cout<<"Inserting left of "<<data<<endl;
    //inserting right
    root->right = createBinaray(root->right);
    cout<<"Inserting right of "<<data<<endl;
    return root;

};

void lavelOrder(node* root){
    queue<node*> q;
    q.push(root);
    q.push(NULL);
    
    while(!q.empty()){
        node* temp = q.front();
        q.pop();
        
        if(temp == NULL){
            cout<<endl;
            if(!q.empty()){
                q.push(NULL);
            }
        }
        else{
            cout<<temp->data<<" ";
            if(temp->left){
                q.push(temp->left);
            }
            if(temp->right){
                q.push(temp->right);
            }
        }
    }
}


void inorder(node* root){
    if(root == NULL){
        return;
    }


    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}


void preorder(node* root){
    if(root == NULL){
        return;
    }

    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}


void postorder(node* root){
    if(root == NULL){
        return;
    }

    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" ";
}

int main(){
    node *root = NULL;
    
    root = createBinaray(root);
    lavelOrder(root);


    cout<<"Inorder Traversal: ";
    inorder(root);
    cout<<endl;

    cout<<"Preorder Traversal: ";
    preorder(root);
    cout<<endl;

    cout<<"Postorder Traversal: ";
    postorder(root);
    cout<<endl;
    return 0;
}