:: 0820_Beispiel_04_IO
:: http://de.wikibooks.org/wiki/Batch-Programmierung:_Batch-Befehle

:: bei diesem Beispiel werden zus�tzlich die "normalen" Verzeichnisse 
:: bin, src, lib eingef�hrt  
:: d.h. bin f�r alle jar-Files; src f�r alle *.java-Files und bin f�r alle *.class-Files!

:: daraus folgt die notwendigkeit vom Einsatz von weiteren javac- und java-Opionen
:: 

cd C:\wi\dev\eip32\0820_Beispiel_04_IO_mit_Verzeichnis_in_JAR_mit_LIB_SRC_BIN

:: 1. Versuch: Hat den Nachteil, dass das *.class-File in das gleiche Verzeichnis wie das *.java-File gelegte wird!
:: Befehl unten ist darum auskommentiert!
:: javac -classpath .;C:\wi\dev\eip32\0820_Beispiel_04_IO_mit_Verzeichnis_in_JAR_mit_LIB_SRC_BIN\lib\IO_Common_mit_PackagePfad.jar  src\Intro_mit_Input.java

:: 2. Versuch:
javac -classpath .;C:\wi\dev\eip32\0820_Beispiel_04_IO_mit_Verzeichnis_in_JAR_mit_LIB_SRC_BIN\lib\IO_Common_mit_PackagePfad.jar -d .\bin src\Intro_mit_Input.java



:: f�r 1. Versuch ist folgender Befehl absolut in Ordnung!
:: java -classpath .;C:\wi\dev\eip32\0820_Beispiel_04_IO_mit_Verzeichnis_in_JAR_mit_LIB_SRC_BIN\lib\IO_Common_mit_PackagePfad.jar Intro_mit_Input

:: f�r 2. Versuch muss Befehl ge�ndert werden auf: 
:: d.h. der Sourcepfad muss um die Klasse Intro_mit_Input.class erweitert werden, sonst findet java diese Klasse nicht d.h. .\bin  ist NOTWENDIG!
java -classpath .;C:\wi\dev\eip32\0820_Beispiel_04_IO_mit_Verzeichnis_in_JAR_mit_LIB_SRC_BIN\lib\IO_Common_mit_PackagePfad.jar;.\bin Intro_mit_Input
