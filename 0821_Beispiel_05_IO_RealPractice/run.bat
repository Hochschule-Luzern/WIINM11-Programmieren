:: 0821_Beispiel_05_IO
:: http://de.wikibooks.org/wiki/Batch-Programmierung:_Batch-Befehle

:: bei diesem Beispiel soll das java-File Intro_mit_Input.java an einen für 
:: unseren Konzern sinnvollen Ort ( ch.hslu.iwi.inm11.hs2013.mae ) abgelegt werden. 
:: Dazu muss im File Intro_mit_Input.java  package ch.hslu.iwi.inm11.hs2013.mae; eingefügt werden!
 

cd C:\wi\dev\eip32\0821_Beispiel_05_IO_RealPractice

:: 1. Versuch: aus didaktischen Zwecken VOR dem Kompilieren im Vereichnis \bin alles löschen
:: Achtung \bin - Verzeichnis nicht löschen!
:: Beachten sie gut: Nach dem ersten kompilieren wird im "bin"-Verzeichnis
:: die ganze Verzeichisstruktur ch\hslu\iwi\inm11\hs2013\mae automatisch
:: aufgebaut!
:: wäre i.O. ....siehe aber unten!!!
:: javac -classpath .;C:\wi\dev\eip32\0821_Beispiel_05_IO_RealPractice\lib\IO_Common_mit_PackagePfad.jar -d .\bin src\Intro_mit_Input.java



:: 1. Versuch: => jetzt kann die Hauptklasse Intro_mit_Input konnte nicht gefunden oder geladen werden!! 
:: überlegen Sie sich warum...was müssen Sie machen?
:: folgendes wurde eingegeben und hat nicht funktioniert....:

:: java -classpath .;C:\wi\dev\eip32\0821_Beispiel_05_IO_RealPractice\IO_Common_mit_PackagePfad.jar;.\bin Intro_mit_Input

:: 2. Versuch:
:: IO_AL-Klsse wird offenbar nicht gefunden:   Exception in thread "main" java.lang.NoClassDefFoundError: ch/softwareexperts/utils/IO_AL
:: d.h. der ganze Pfad zum Haupt-Class-File (Intro_mit_Input.class)muss in "Punktnotation" hinzugefügt werden:

:: java -classpath .;C:\wi\dev\eip32\0821_Beispiel_05_IO_RealPractice\lib\IO_Common_mit_PackagePfad.jar;.\bin ch.hslu.iwi.inm11.hs2013.mae.Intro_mit_Input



:: ACHTUNG: HART-Verdrahteter Code (d.h. C:\...) "stinkt"!!!!! Darum besser so vorgehen: 

javac -classpath .;.\lib\IO_Common_mit_PackagePfad.jar -d .\bin src\Intro_mit_Input.java
java  -classpath .;.\lib\IO_Common_mit_PackagePfad.jar;.\bin ch.hslu.iwi.inm11.hs2013.mae.Intro_mit_Input

