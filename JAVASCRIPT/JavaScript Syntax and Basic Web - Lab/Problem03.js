function DivideNumberByGivenSecond(input) {
    var firstNum = input[0];
    var secondNum = input[1];

    if (secondNum >= firstNum){
        return firstNum * secondNum;
    }
    else {
        return firstNum / secondNum;
    }
}

console.log(DivideNumberByGivenSecond([2, 3]));