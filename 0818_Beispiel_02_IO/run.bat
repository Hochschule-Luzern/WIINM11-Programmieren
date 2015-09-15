:: 0818_Beispiel_02_IO
:: http://de.wikibooks.org/wiki/Batch-Programmierung:_Batch-Befehle
:: Bei Beispiel_02_IO gibt es die Files IO_AL.java und IO_Allgemeint.java nicht mehr
:: dafür wird ein JAR-File (mit gezippten Klassen) zur Verfügung gestellt. 
:: Das Jar-File hat keine Pfade....schauen sie das mit dem "Decompiler" nach!

cd C:\wi\dev\eip32\0818_Beispiel_02_IO

:: javac Intro_mit_Input.java  => geht nicht so

javac -classpath .;C:\wi\dev\eip32\0818_Beispiel_02_IO\IO_Common_ohne_PackagePfad.jar Intro_mit_Input.java

java -classpath .;C:\wi\dev\eip32\0818_Beispiel_02_IO\IO_Common_ohne_PackagePfad.jar Intro_mit_Input