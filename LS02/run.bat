::cd C:\wi\dev\eip\LS02
::javac Bruch.java
::javac MainBruch.java
::java MainBruch

javac -cp .\lib\Lagerverwaltung02.jar;. ch\hslu\wi\stock\business\goods\Dimension.java
javac -cp .\lib\Lagerverwaltung02.jar;. ch\hslu\wi\stock\business\goods\Product.java
javac -cp .\lib\Lagerverwaltung02.jar;. ch\hslu\wi\stock\StockHandler.java 

java  -cp .\lib\Lagerverwaltung02.jar;. ch.hslu.wi.stock.Main
