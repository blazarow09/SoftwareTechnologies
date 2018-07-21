function solve(input) {

    let n = Number(input[0]);
    let arr = new Array;

    for (let i = 1; i < n.length; i++) {
                let tokens = arr[i].split(' ');
                let index = Number(tokens[0]);
                let value = Number(tokens[2]);
                arr[index] = value;
    }
for (let num of arr){
    console.log(num);
}

}
