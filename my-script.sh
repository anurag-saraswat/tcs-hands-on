#!/bin/bash

if [ -z "$1" ]
then
      echo "Pass appropriate number of command line arguments"

elif [ ! -e "$1" ]
then
    echo "Input file does not exist"

elif [ -d "$1" ]
then
    echo "Input file is not an ordinary file"

elif [ ! -r "$1" ]
then
    echo "Input file does not have read permission"

else
	echo `grep -cvP '\S' $1`

fi