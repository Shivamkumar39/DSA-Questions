//stack:- it work with LIFO 
//operation in STL:- Push, Pop, Top, empty, size, 
//queue:- it work with FIFO
//top >= 0 it mean stack is not empty and if (top = -1) stack is mepty;

#include<bits/stdc++.h>
using namespace std;

int main(){
    stack<int> st;
    
    st.push(20);
    st.push(90);
    st.push(10);
    st.push(30);
    st.push(50);
    
    st.pop();
    st.pop();
    

   //deleting middle element of stack
    int n = st.size();
    int mid = n/2;
    for(int i=0; i<mid; i++){
        st.pop();
    }


    if(!st.empty()){
        cout<< "first top elemnt " <<st.top();
        
    }else{
        cout<<"stack is empty "<<endl;
    }
    return 0;
}

//delete middle element of stack
