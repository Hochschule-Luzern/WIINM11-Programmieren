:: 0817_Beispiel_01_IO
:: http://de.wikibooks.org/wiki/Batch-Programmierung:_Batch-Befehle

cd C:\wi\dev\eip32\0817_Beispiel_01_IO

:: javac Intro_mit_Input.java  => geht nicht so

javac -classpath .;C:\wi\dev\eip32\0817_Beispiel_01_IO\IO_Common_ohne_PackagePfad.jar Intro_mit_Input.java

java -classpath .;C:\wi\dev\eip32\0817_Beispiel_01_IO\IO_Common_ohne_PackagePfad.jar Intro_mit_Input