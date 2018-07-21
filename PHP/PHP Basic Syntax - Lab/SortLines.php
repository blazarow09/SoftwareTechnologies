<?php
    $sortedLines = "";

    if(isset($_GET['lines'])){

        $lines = explode("\n", $_GET['lines']);
        $lines = array_map('trim', $lines);

        sort($lines,SORT_STRING);

        $sortedLines = implode("\n", $lines);
    }
?>

