function searchelement(arr, taget){
    if(arr.length == 0){
        return undefined;
    }
    for(let i=0; i<arr.length; i++){
        if(arr[i] ==  taget){
            return i;
        }
    }
}

function removeelement(arrs, target){
    if(arrs.length == 0){
        return undefined;
    }
    let i = searchelement(arrs, target);
    arrs.splice(i, 1);
    return arrs;
}

function maxelement(arr1){
    if(arr1.length == 0){
        return undefined;
    }
    var max= arr1[0];
    for(let i=1; i<arr1.length; i++){
        if(arr1[i] > max){
            max = arr1[i];
        }
        
    }
    return max;

}
function minelement(arr1){
    if(arr1.length == 0){
        return undefined;
    }
    var min= arr1[0];
    for(let i=1; i<arr1.length; i++){
        if(arr1[i] < min){
            min = arr1[i];
        }
        
    }
    return min;

}

let arr = [1, 3, 5, 6];
let taget = 5;
console.log(searchelement(arr, taget)); // 4



let arrs = [1, 3, 5, 6, 8,9,10];
let target = 6;
console.log(removeelement(arrs, target)); // [1, 3, 6]


let arr1 = [1, 3, 5, 6, 1,9,2];
console.log(maxelement(arr1));
console.log(minelement(arr1)); // [1, 3, 5, 5, 1, 5, 2]