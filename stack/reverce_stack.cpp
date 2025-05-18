#include<bits/stdc++.h>
using namespace std;




int main(){
    stack<int> st;
    st.push(2); 
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);

    if(!st.empty()){
        int x = st.top();
        st.pop();
    }
    //recursive all
    while(!st.empty()){
        cout<<st.top()<<" ";
        st.pop();
    }

    st.push(x);
    //recursive all
    while(!st.empty()){
        cout<<st.push()<<" ";
    }
}