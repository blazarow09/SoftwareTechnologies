<?php
function celsiusToF(float $celsius) {
        return $celsius * 1.8 + 32;
}

    function fahrenheitToC(float $fahrenheit) {
        return ($fahrenheit - 32) / 1.8;
}
    $msgAfterCelsius = "";

    if (isset($_GET['cel'])){
        $celsius = floatval($_GET['cel']);
        $fahrenheit = celsiusToF($celsius);
        $msgAfterCelsius = "$celsius &deg;C = $fahrenheit &deg;F";
    }

    $msgAfterFahrenheit = "";

    if (isset($_GET['fah'])){
        $fahrenheit = floatval($_GET['fah']);
        $celsius = fahrenheitToC($fahrenheit);
        $msgAfterFahrenheit = "$fahrenheit &deg;F = $celsius &deg;C";
    }
?>
<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert" />
    <?= $msgAfterCelsius ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
    <?= $msgAfterFahrenheit ?>
</form>
