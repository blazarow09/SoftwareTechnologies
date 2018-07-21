function ProductOf3Numbers(input) {

    let firstNum = input[0];
    let secondNum = input[1];
    let thirdNum = input[2];

    let sumOfThree = firstNum * secondNum * thirdNum;

    if (sumOfThree < 0){
        return 'Negative'
    }
    else {
        return 'Positive'
    }
}

console.log(ProductOf3Numbers(5, 4, 3));