<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);
    $factorial = 1;

    for ($i = 1; $i <= $num; $i++){
        $factorial *= $i;
    }
}
?>
<form>
    N:<input type="text" name="num"/>
    <input type="submit"/> <br>
    <?=$factorial?>
</form>