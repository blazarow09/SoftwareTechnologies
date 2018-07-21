<?php
    $result = 0;
    if(isset($_GET['num1'])){
        $num1 =  $_GET['num1'];
        $result = intval($num1) * 2;
    }
?>
<form>
    N:<input type="text" name="num1"/>
    <input type="submit"/> <br>
    <?=$result?>
</form>
