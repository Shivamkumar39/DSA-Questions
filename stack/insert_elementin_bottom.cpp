#include<bits/stdc++.h>
using namespace std;

void solve(stack<int>& st, int x){
    if(st.empty()){
        st.push(x);
        return;
    }

    int num = st.top();
    st.pop();

    //recursive all
    solve(st,x);

    st.push(num);

}

int main(){

    stack<int> st;
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    int x= 10;

    solve(st,x);
    
    while(!st.empty()){
        cout<<st.top()<<" ";
        st.pop();
    }
    
    return 0;

}