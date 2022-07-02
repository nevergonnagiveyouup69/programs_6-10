<?php
$f=fopen("count.txt","r+");
$line=fgets($f);
fseek($f,0);
$line++;
echo "Number of times visited the website is : ".$line;
fwrite($f,$line);
fclose($f);
?>
