<?php
    $result = 0;

    if(isset($_GET['num1']) && isset($_GET['num2'])){
        $num1 = intval($_GET['num1']);
        $num2 = intval($_GET['num2']);

        if($num1 <= $num2){
            $result = $num1 * $num2;
        }else {
            $result = $num1 / $num2;
        }
    }
?>
<form>
    N:<input type="text" name="num1"/>
    M:<input type="text" name="num2"/>
    <input type="submit"> <br>
    <?=$result ?>
</form>