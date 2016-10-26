if [ ! -d "./build" ]; then
  mkdir ./build
fi

javac ./PG2NBF/Page.java -cp "./build" -d ./build
javac ./PG2NBF/LRU.java -cp "./build" -d ./build
javac ./PG2NBF/PG2NBF.java -cp "./build" -d ./build
cp ./PG2NBF/pageRefString.txt ./build/pageRefString.txt
