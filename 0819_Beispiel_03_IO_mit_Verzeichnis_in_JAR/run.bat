:: 0819_Beispiel_03_IO
:: http://de.wikibooks.org/wiki/Batch-Programmierung:_Batch-Befehle
:: Bei Beispiel_03_IO gibt es die Files IO_AL.java und IO_Allgemeint.java auch nicht mehr
:: dafür wird ein JAR-File (mit gezippten Klassen) zur Verfügung gestellt. 
:: Das Jar-File hat es NEU Package-Pfade drin!...schauen sie das mit dem "Decompiler" nach!
:: ...oder schauen sie in der beiliegenden Dokumentations dieses Projektes nach!





:: bei diesem Beispiel muss zwingend noch das "Package" im Java-File 
:: importiert werden:    
:: import ch.softwareexperts.utils.*;


cd C:\wi\dev\eip32\0819_Beispiel_03_IO_mit_Verzeichnis_in_JAR


javac -classpath .;C:\wi\dev\eip32\0819_Beispiel_03_IO_mit_Verzeichnis_in_JAR\IO_Common_mit_PackagePfad.jar Intro_mit_Input.java

java -classpath .;C:\wi\dev\eip32\0819_Beispiel_03_IO_mit_Verzeichnis_in_JAR\IO_Common_mit_PackagePfad.jar Intro_mit_Input