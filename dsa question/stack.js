class Stack {
    constructor() {
      this.stack = [];
    }
  
    push(e) {
      this.stack.push(e);
      console.log(`element is ${e}`);
    }
  
    pop() {
      if (this.stack.length === 0) {
        return undefined;
      }
      return this.stack.pop();
    }
  
    peek() {
      if (this.stack.length === 0) {
        return undefined;
      }
      return this.stack[this.stack.length - 1];
    }
  
    isEmpty() {
      return this.stack.length === 0;
    }
  
    size() {
      return this.stack.length;
    }
  }
  
  const stack = new Stack();
  stack.push(10);
  stack.push(11);
  stack.push(12);
  stack.push(13);
  stack.push(14);
  stack.push(15);
  
  console.log(stack.peek()); // This will show the new top element (14)
  console.log(stack.pop()); // This will remove the top element (15) and print it
  