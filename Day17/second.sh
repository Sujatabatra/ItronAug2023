#!/bin/bash
pwd

echo creating main, main->first, first->boys,girls
mkdir main main/first main/first/boys main/first/girls

echo "change directory to main->first"
cd main/first

echo "displaying content of first directory"
ls
echo "======================"
ls -x
echo "======================"
ls -r
echo "======================="
ls -l
echo "===================="
ls -i