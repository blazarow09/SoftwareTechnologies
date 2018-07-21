<?php

$countOdd = 0;
$result = "";

if (isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])) {

    $num1 = intval($_GET['num1']);
    $num2 = intval($_GET['num2']);
    $num3 = intval($_GET['num3']);



    if ($num1 < 0) {
        $countOdd++;
    }

    if ($num2 < 0) {
        $countOdd++;
    }

    if ($num3 < 0) {
        $countOdd++;
    }

    if ($num1 == 0 || $num2 == 0 || $num3 == 0){
        $result = "Positive";
    }
    else if ($countOdd % 2 == 1){
        $result = "Negative";
    }
    else if ($countOdd % 2 == 0) {
        $result = "Positive";
    }

}
?>
<form>
    NUM1:<input type="text" name="num1"/>
    NUM2:<input type="text" name="num2"/>
    NUM3:<input type="text" name="num3"/>
    <input type="submit"/> <br>
    <?=$result?>
</form>