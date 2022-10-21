set -e
wc -c $1/*.txt > plos-size.txt
sort plos-size.txt