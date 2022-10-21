set -e
grep "base pair" $1/*.txt > answer.txt
wc -l answer.txt