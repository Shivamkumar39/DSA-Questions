const pattern1 = ()=>{
    const n=3
    let num = 1
    for(let i=0; i<n; i++){
        for(let j=0; j<n; j++){
            process.stdout.write(num+ ''); // Use process.stdout.write to print on the same line
            num++;
        }
        console.log(""); // Use console.log to print a new line after each row
    }
    return 0;
}
pattern1()