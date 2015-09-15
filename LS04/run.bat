::cd C:\wi\dev\eip\LS04

:: wechselt ins verzeichnis wo die batch datei ist
Pushd "%~dp0"

javac -cp .\lib\lagerverwaltung-v4.0.5.jar;. ch\hslu\wi\stock\StockHandler.java 

java  -cp .\lib\lagerverwaltung-v4.0.5.jar;. ch.hslu.wi.stock.Main
