<?php
$result = 0;
if(isset($_GET['num1']) && isset($_GET['num2'])){
    $num1 =  $_GET['num1'];
    $num2 = $_GET['num2'];
    $result = intval($num1) * intval($num2);
}
?>
<form>
    N:<input type="text" name="num1"/>
    M:<input type="text" name="num2"/>
    <input type="submit"/> <br>
    <?=$result?>
</form>
