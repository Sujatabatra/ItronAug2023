#!/bin/bash
pwd

echo creating main, main->first, first->boys,girls
mkdir main main/first main/first/boys main/first/girls

echo "change directory to main->first"
cd main/first

echo display current working directory
pwd 

echo "listing main->first"
ls

echo " changing directory to main"
cd ..

echo displaying current working directory
pwd

echo " changing directory to tmp"
cd ..

echo " listing content of directory tmp"
ls

echo trying to remove main directory
rmdir main

echo "trying to remove boys directory"
rmdir main/first/boys

echo "displaying content of first directory"
ls main/first


