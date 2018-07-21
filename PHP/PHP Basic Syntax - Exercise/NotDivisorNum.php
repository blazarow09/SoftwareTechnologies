<form>
    N:<input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])){
    $num = intval($_GET['num']);
    $result = 0;

    for ($i = $num; $i >= 1; $i--){
        if ($num % $i != 0){
            echo "$i ";
        }
    }
}
?>