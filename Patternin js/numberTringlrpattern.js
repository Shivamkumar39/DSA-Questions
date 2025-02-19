const numberTriangle = () => {
    const n = 4;
    let num = 1;

    for (let i = 0; i < n; i++) {
        let row = ""; // Create a string to hold the numbers in the current row
        for (let j = 0; j < i + 1; j++) {
            row += num + " "; // Append the number and a space to the row
            num++;
        }
        console.log(row.trim()); // Print the row and remove any extra space at the end
    }
    return 0;
};

numberTriangle();
