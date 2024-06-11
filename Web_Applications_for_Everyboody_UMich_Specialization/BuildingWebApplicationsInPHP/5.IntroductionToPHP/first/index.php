<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Isai Sanchez PHP</title>
</head>
<body>
    <h1>Isai Sanchez PHP</h1>
    <?php
        echo 'The SHA256 hash of "Isai Sanchez" is  ';
        print hash('sha256','Isai Sanchez');
    ?>
    <pre>
    ASCII ART:

        ***********
            **
            **
            **
            **
            **       
        ***********
    </pre>
    <br>
    <a href="check.php">Click here to check the error setting</a>
    <br/>
    <a href="fail.php">Click here to cause a traceback</a>
</body>
</html>
